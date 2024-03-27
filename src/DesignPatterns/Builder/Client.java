package DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) throws Exception {
        //V1
//    Builder builder = new Builder();
//
//    builder.setName("Alok");
//    builder.setAge(26);
//    builder.setGender(Gender.MALE);
//    builder.setPsp(99);
//    builder.setPhoneNumber("0123456789");
//    builder.setUnivName("Scaler");
//
//    Student student = new Student(builder);

    //V2
//    Builder builder1 = Student.createBuilder();
//        builder1.setName("Alok");
//        builder1.setAge(26);
//        builder1.setGender(Gender.MALE);
//        builder1.setPsp(99);
//        builder1.setPhoneNumber("0123456789");
//        builder1.setUnivName("Scaler");
    // here in reality the builder should build, but here the student is building which violates SRP

    //Student student1 = builder1.build();
    // now client can easily copy the student by making a copy so making the constructor can help
    // but now since builder is a seperate class it cannot access student class, so copying builder class to student

        //V3
        Student student=Student.createBuilder()
                .setAge(26)
                .setName("Alok")
                .setGender(Gender.MALE)
                .setPsp(90)
                .setPhoneNumber("1234567890")
                .setUnivName("Scaler")
                .build();

        // here in create builder it is returning a builder, on this we need to set everything,
        // so all the set methods in builder class are made to return the same builder
        // so using this we can set the parameters, build method return new student
        // once validations are done

        // Hence builder itself is creating the student


    }
}
