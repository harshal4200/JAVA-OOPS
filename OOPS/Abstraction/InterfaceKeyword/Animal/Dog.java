package Abstraction.InterfaceKeyword.Animal;

interface Dog {

  void sound();
  void run();
  void eat();
  
} 
class Functions implements Dog{

 public void sound(){
    System.out.println("Dog bark");
  }
  public void run(){
    System.out.println("Dog can run");
  }
  public void eat(){
    System.out.println("Dog can eat");
  }
}

class Main{
  public static void main(String[] args) {
    Functions test = new Functions();
    test.eat();
    test.run();
    test.sound();
  }
}
