package Encapsulation.Student_Details;

public class Student {

  private String stuName;
  private int stuAge;
  private int stuRollno;

  public String getName(){
    return stuName;
  }
  public void setName(String stuName){
    this.stuName=stuName;
  }

  public int getAge(){
    return stuAge;
  }
  public void setAge(int stuAge){
    this.stuAge=stuAge;
  }

  public int getRoll(){
    return stuRollno;
  }
  public void setRoll(int stuRollno){
    this.stuRollno=stuRollno;
  }
  
}

class Test{
  public static void main(String[] args){
    Student student = new Student();
    student.setAge(21);
    student.setName("Harshal");
    student.setRoll(14);
    System.out.println("Age of student is: "+student.getAge());
    System.out.println("Name of student is: "+student.getName());
    System.out.println("Roll no. of student is: "+student.getRoll());
  }
}