package Polymorphism.OperatorsOverloading;

public class ArithmaticEquations {
  
  static int addition(int a,int b){
    return a+b;
  }

  static double subtration(double a,double b){
    return a-b;
  }

  static float multiplication(float a,float b,float c){
    return a*b*c;
  }
  
  static long division(long a,long b){
    return a/b;
  }
  
  static int mod(int a, int b){
    return a%b;
  }
}

class Test{
  
  
    public static void main(String[] args) {
      System.out.println(ArithmaticEquations.addition(3,5));
    System.out.println(ArithmaticEquations.subtration(3433d,3443d));
    System.out.println(ArithmaticEquations.multiplication(4.3f,5.2f,4.2f));
    System.out.println(ArithmaticEquations.division(34L,45L));
    System.out.println(ArithmaticEquations.mod(4,6));
}
}