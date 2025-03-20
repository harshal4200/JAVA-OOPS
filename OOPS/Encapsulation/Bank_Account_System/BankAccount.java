package Encapsulation.Bank_Account_System;

public class BankAccount {

  private long accountNumber;
  private double balance;
  private String accountHolderName;

  BankAccount(long accountNumber, String accountHolderName){
    this.accountNumber=accountNumber;
    this.accountHolderName=accountHolderName;
    this.balance=0.0;
  }

  
  public double getBalance(){
     return balance;
     
  }

  public void deposite(double amount){
    if(amount > 0){
      balance = balance + amount;
      System.out.println("Money Deposited: "+amount+" rs");
      System.out.println("Total Balance: "+balance+" rs");
    }else{
      System.out.println("Enter amount.");
    }
  }

  public void withdraw(double amount){
    if(amount > 0 && amount <= balance){
      balance = balance - amount;
      System.out.println("Withdraw Money: "+amount+" rs");
      
    }else if(amount > balance){
      System.out.println("Inefficient balance.");
    }
    else{
      System.out.println("Enter withdrawal amount: ");
    }
  }
  public void displayInfo(){
    System.out.println("Account Number: "+accountNumber);
    System.out.println("Account Holder Name: "+accountHolderName);
    System.out.println("Current Balance: "+balance);
  }
  
}

class Test{
  public static void main(String[] args) {
    BankAccount account = new BankAccount(11200045588L, "Harshal Ingle");
    account.deposite(5000);
    
    
    account.displayInfo();
  }
}
