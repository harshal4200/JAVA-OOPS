package Inheritance.SingleLevel_Inheritance;

public class Animal {

  public void eat(){
    System.out.println("Can eat food");
  }
  public void run(){
    System.out.println("Can run fast.");
  }
  
}
class Lion extends Animal{

  public void drink(){
    System.out.println("Can drink");
  }
}

class Test{
  public static void main(String[] args) {
    Lion properties = new Lion();
    properties.eat();
    properties.drink();
    properties.run();
  }
}