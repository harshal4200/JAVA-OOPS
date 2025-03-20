import java.util.*;

class Employee {
  private Integer empId;
  private String empName;
  private Double empSalary;
  
  
  // Getter and Setter for empId
  public int getEmpId() {
    return empId;
  }
  public void setEmpId(int empId) {
    this.empId = empId;
  }

  // Getter and Setter for empName
  public String getEmpName() {
    return empName;
  }
  public void setEmpName(String empName) {
    this.empName = empName;
  }

  // Getter and Setter for empSalary
  public double getEmpSalary() {
    return empSalary;
  }
  public void setEmpSalary(double empSalary) {
    this.empSalary = empSalary;
  }
}

public class Test {
  public static void main(String[] args){
    Employee emp = new Employee();
    emp.setEmpId(101);
    emp.setEmpName("John");
    emp.setEmpSalary(50000.000);

    System.out.println("Employee ID: " + emp.getEmpId());
    System.out.println("Employee Name: " + emp.getEmpName());
    System.out.println("Employee Salary: " + emp.getEmpSalary());
  }
}