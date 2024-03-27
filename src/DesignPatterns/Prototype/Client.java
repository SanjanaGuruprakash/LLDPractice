package DesignPatterns.Prototype;

public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry){

        Student aprBeginnerBatchPrototype = new Student();
        aprBeginnerBatchPrototype.setBatchName("Apr23BeginnerBatch");
        aprBeginnerBatchPrototype.setAverageBatchPsp(90);

        studentRegistry.register("Apr23BeginnerBatch", aprBeginnerBatchPrototype);

        IntelligentStudent aprBatchIntelStudents = new IntelligentStudent();
        aprBatchIntelStudents.setBatchName("apr23BatchIntelStudents");
        aprBatchIntelStudents.setAverageBatchPsp(100);
        aprBatchIntelStudents.setIq(180);

        studentRegistry.register("apr23BatchIntelStudents",aprBatchIntelStudents);


    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry= new StudentRegistry();
        fillRegistry(studentRegistry);

        Student Sanjana= studentRegistry.get("Apr23BeginnerBatch").clone();
        Sanjana.setName("Sanjana");
        Sanjana.setAge(29);
        Sanjana.setPsp(99);

        Student Sanju = studentRegistry.get("apr23BatchIntelStudents").clone();
        Sanju.setPsp(100);
        Sanju.setName("Sanju");
        Sanju.setAge(30);

        System.out.println("Debug");


    }
}
