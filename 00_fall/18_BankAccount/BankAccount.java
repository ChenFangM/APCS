/*
Team Holister {Brianna, Pepe, Fang, Cat, Nicole, Duck}
APCS
HW18 -- CPA-One
2021-10-18
*/

public class BankAccount {

  public String accountName = "No Name";
  private String password = "No Password";
  private int pin = 0000;
  private int accountNumber = 000000000;
  private double accountBalance = 0;

  private BankAccount(int accNumber) {
    accountNumber = accNumber;
  }

  public void setNumber(int number) {
    accountNumber = number;
  }
  public void setName(String name) {
    accountName = name;
  }
  private void setPassword(String newPass) { 
    password = newPass;
  }
  private void setPin(int newPin) {
    pin = newPin;
  }
  private void withdraw(double amount) {
    accountBalance = accountBalance - amount;
  }
  private void deposit(double amount) {
    accountBalance = accountBalance + amount;
  }
  private String allInfo() {
    String information = ("Account Number: " + String.format("%09d", accountNumber) + "\n" + "Account Name: " + accountName + "\n" + "Password: " + password + "\n" + "Pin: " + String.format("%04d", pin) + "\n" + "Current Balance: " + accountBalance);
    return information;
  }

  public static void main(String[] args) {
    BankAccount Pepe = new BankAccount(000000001);    
    System.out.println(Pepe.allInfo() + "\n" + "----");
    Pepe.setNumber(123456789);
    Pepe.setName("Pepe");
    Pepe.setPassword("PepeisGod");
    Pepe.setPin(1234);
    Pepe.deposit(2000.00);
    Pepe.withdraw(499.99);
    System.out.println(Pepe.allInfo());

  }

}

/*
DISCOVERIES
- The application of learned skills.

QCC
- None

Team Hollister's Latest and Greatest Q2 Response:
We know that Java provides a constructor because  all variables already have default/initialized values, thus there exists a default constructor.

Team Hollister's Latest and Greatest Q3 Response:
We can use System.out.println(Name.toString()) (with Name representing the name of the object), to output the string representation of the object.
*/