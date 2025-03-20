package Abstraction.AbstactKeyword.Practice;

abstract class Demo {
  abstract void car();
   
  void carModle(){
    System.out.println("This is Volvo Latest Modle.");
  }
}

class Test extends Demo{

  @Override
  void car(){
    System.out.println("This is the brand new version.");
  }
}

class Main{
  public static void main(String[] args) {
    Test brand = new Test() ;
    
      brand.car();
      brand.carModle();
    }
  
}
