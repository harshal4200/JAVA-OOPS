package Inheritance.Multiple_Inheritance;

interface Father {

  public void skinColor();
  
}
interface Mother{
  public void height();
  
}

class Child implements Father,Mother{
  
  public void skinColor(){
    System.out.println("Child have white color.");
  }

  @Override
  public void height(){
    System.out.println("Child have same height as mother.");
  }
}

class Test{
  public static void main(String[] args) {
    Child test = new Child();
    test.height();
    test.skinColor();
    
  }
}