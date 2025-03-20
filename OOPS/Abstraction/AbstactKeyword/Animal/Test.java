package Abstraction.AbstactKeyword.Animal;

abstract class Dog{
  abstract void sound();
  abstract void eat();
  abstract void sleep();
  abstract void run();
  abstract void walk();
}
class Functions extends Dog{

  @Override
  void sound(){
    System.out.println("Dog bark");
  }

  @Override
  void eat(){
    System.out.println("Dog can eat");
  }

  @Override
  void sleep(){
    System.out.println("Dog can sleep");
  }

  @Override
   void run(){
    System.out.println("Dog can run");
  }

  @Override
   void walk(){
    System.out.println("Dog can walk");
  }
}
public class Test{
  public static void main(String[] args){
    Dog functionality = new Functions();
    functionality.sound();
    functionality.eat();
    functionality.sleep();
    functionality.run();
    functionality.walk();
  }
}


