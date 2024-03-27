//package DesignPatterns.Builder;
//
//public class Builder {
//    private int age;
//    private String name;
//    private  String univName;
//    private double psp;
//    private  Gender gender;
//    private String phoneNumber;
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getUnivName() {
//        return univName;
//    }
//
//    public void setUnivName(String univName) {
//        this.univName = univName;
//    }
//
//    public double getPsp() {
//        return psp;
//    }
//
//    public void setPsp(double psp) {
//        this.psp = psp;
//    }
//
//    public Gender getGender() {
//        return gender;
//    }
//
//    public void setGender(Gender gender) {
//        this.gender = gender;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    //here builder should be responsible for building student
//        private boolean validate(){
//        if(phoneNumber.length()!=10){
//            return false;
//        }
//        return true;
//        }
//    public Student build() throws Exception {
//        //validations can be done here
//        if(!validate()){
//            throw new Exception(); //here we should vreate custom exception like invalid phone number
//        }
//        return new Student(this);
//    }
//}
