package Encapsulation.Bank_Details;

public class Account {

  private long accountNumber;
  private String customerName;
  private String customerEmail;
  private long customerPhoneNumber;
  private float balance;
  
  public long getAccountNumber(){
    return accountNumber;
  }
  public void setAccountNumber(long accountNumber){
    this.accountNumber=accountNumber;
  }

  public String getCustomerName(){
    return customerName;
  }
  public void setCustomerName(String customerName){
    this.customerName=customerName;
  }

  public String getCustomerEmail(){
    return customerEmail;
  }
  public void setCustomerEmail(String customerEmail){
    this.customerEmail=customerEmail;
  }

  public long getCustomerPhoneNumber(){
    return customerPhoneNumber;
  }
  public void setCustomerPhoneNumber(long customerPhoneNumber){
    this.customerPhoneNumber=customerPhoneNumber;
  }

  public float getBalance(){
    return balance;
  }
  public void setBalance(float balance){
    this.balance=balance;
  }
}

class Test{
  public static void main(String[] args) {
    Account account = new Account();
    account.setAccountNumber(11005566991L);
    account.setCustomerName("Harshal Ingle");
    account.setBalance(2500000.0f);
    account.setCustomerEmail("harshalingle795@gmail.com");
    account.setCustomerPhoneNumber(7709674714L);

    System.out.println("Name of Customer: "+account.getCustomerName());
    System.out.println("Balance of Customer: "+account.getBalance());
    System.out.println("Email of Customer: "+account.getCustomerEmail());
    System.out.println("Phone Number of Customer: "+account.getCustomerPhoneNumber());
    System.out.println("Account Number of Customer: "+account.getAccountNumber());
  }
}
