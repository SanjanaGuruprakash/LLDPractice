package DesignPatterns.Builder;

public class Student {
    private int age;
    private String name;
    private String univName;
    private double psp;
    private Gender gender;
    private String phoneNumber;

    private Student(Builder builder) {
        this.age = builder.getAge();
        this.name = builder.getName();
        this.psp = builder.getPsp();
        this.phoneNumber = builder.getPhoneNumber();
        this.univName = builder.getUnivName();
        this.gender = builder.getGender();
    }

    public static Builder createBuilder() {
        return new Builder();
    }

    public static class Builder {
        private int age;
        private String name;
        private String univName;
        private double psp;
        private Gender gender;
        private String phoneNumber;

        public int getAge() {
            return age;
        }
        // all setters should return builder
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getUnivName() {
            return univName;
        }

        public Builder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Gender getGender() {
            return gender;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        //here builder should be responsible for building student
        private boolean validate() {
            if (phoneNumber.length() != 10) {
                return false;
            }
            return true;
        }

        public Student build() throws Exception {
            //validations can be done here
            if (!validate()) {
                throw new Exception(); //here we should vreate custom exception like invalid phone number
            }
            return new Student(this);
        }
    }
}

