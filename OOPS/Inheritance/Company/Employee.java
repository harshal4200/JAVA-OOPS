package Inheritance.Company;

public class Employee {

  int benifit=6000;
  
}

class Engineer extends Employee{

  int salary=50000;
}

class Test{
  public static void main(String[] args) {
    Engineer avg = new Engineer();
    System.out.println("Salary of engineer: "+avg.salary);
    System.out.println("Benifit of Engineer: "+avg.benifit);
  }
}