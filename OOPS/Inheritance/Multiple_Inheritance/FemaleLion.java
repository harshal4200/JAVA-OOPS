package Inheritance.Multiple_Inheritance;

interface FemaleLion {

  public default void run(){
      System.out.println("Can run very fast.");
    }
  
}
interface MaleLion{
  default void strongest(){
    System.out.println("Strongest animal.");
  }
}

class ChildLion implements FemaleLion,MaleLion{
  public void rore(){
    System.out.println("Can rore so loud");
  }
}

class Test{
  public static void main(String[] args) {
    ChildLion cl = new ChildLion();
    cl.run();
    cl.strongest();
    cl.rore();
  }
}

