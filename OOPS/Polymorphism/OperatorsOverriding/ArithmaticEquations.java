package Polymorphism.OperatorsOverriding;

public class ArithmaticEquations {
  
  int add(int a, int b){
    return a+b;
  }
}
class second extends ArithmaticEquations{

  @Override
  int add(int a,int b){
    return a+b;
  }
}
class third extends second{
  @Override
  int add(int a,int b){
    return a+b;
  }
}

class Test{
  public static void main(String[] args) {
    ArithmaticEquations ae = new ArithmaticEquations();
    System.out.println(ae.add(4, 5));
    ae = new second();
    System.out.println(ae.add(5, 64));
    ae=new third();
    System.out.println(ae.add(5, 8));
  }
}
