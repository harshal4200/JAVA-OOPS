package Inheritance.Hirerchica;

public class A {
  public void One(){
    System.out.println("This is A class");
  }
  
}
 class B extends A{
  public void Two(){
    System.out.println("This is B class");
  }
}
class C extends A{
  public void Three(){
    System.out.println("This is C class");
  }
}
class D extends A{
  public void Four(){
    System.out.println("This is D class");
  }
}
class Test{
  public static void main(String[] args) {
    C run = new C();
    run.One();
    run.Three();
System.out.println();
    B run2 = new B();
    run2.One();
    run2.Two();
System.out.println();
    D run3 = new D();
    run3.One();
    run3.Four();
  }
}
