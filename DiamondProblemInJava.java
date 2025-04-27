package java8;

interface A{
    default void show(){
        System.out.println("Default method of A interface");
    }
}
interface B{
    default void show(){
        System.out.println("Default method of B interface");
    }
}
//public class DiamondProblemInJava implements A,B {
//
//    @Override
//    public void show() {
//        A.super.show();
//        B.super.show();  //we can use either A or B also
//
//}
class demo{

    public static void main(String[] args) {
//        DiamondProblemInJava obj=new DiamondProblemInJava();
//        obj.show(); //un comment and then check simple type to override and creating object and accessing method.
        A obj = new A() {
            @Override
            public void show() {
                A.super.show();
               // B.super.show();
            }
        };
        obj.show();
    }
}