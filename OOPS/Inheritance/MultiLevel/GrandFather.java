package Inheritance.MultiLevel;

class GrandFather {
  int age=89;
  String name="Rajesh";
  String surname="Kolhi";
  float height=6.2f;
  
}
class Father extends GrandFather{
    int age=45;
    String name="Vicky";

    public Father(String surname,float height){
      super();
      
    }
}

class Child extends Father{
  int age=18;
  String name="Vijay";

  public Child(String surname,float height){
    super(surname,height);
  }

}

class Test{
  public static void main(String[] args) {
    Child inherit = new Child("anything",8);
    System.out.println(inherit.age);
    System.out.println(inherit.height);
    System.out.println(inherit.name);
    System.out.println(inherit.surname);
  }
}
