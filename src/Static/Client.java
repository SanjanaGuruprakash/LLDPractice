package Static;



public class Client {
    public static void main(String[] args) {
//        System.out.println(Student.univName);

        final int j;
        j=10;

           Student student=new Student();
           student.fun();

           FinalMethod finalMethod=new FinalMethod();
           finalMethod.fun();
        System.out.println("student.hashCode() = " + student.hashCode());
        student=null;
        System.gc();
        System.out.println("end of gc");

    }
//    public void finalize()
//        {
//            System.out.println("finalize executed");
//        }  //the gc calls internally

}
