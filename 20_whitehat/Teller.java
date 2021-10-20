/*
Hollister - Brianna, Pepe, Fang, Cat, Nicole, Duck
APCS
HW20 - External Audit
2021-10-19
*/

/*
DISCO
0: The withdraw() method is without any specific bounds and allows you to withdraw more than you have, giving the user a negative bank balance instead of printing an error.
1: The written checkAuth() method takes the pin and account password instead of the account number and password.

QCC
0: Is there a method to test BankAccount.java from the terminal rather than using the main method? 
1: How do we write a loop function which would enable us to test numerous values of the instance variables at once?
*/

public class Teller {

  public static void main(String[] args) {
    Bankaccount ba = new Bankaccount();

    short pin = 2345;

    //testing "set" functions
    ba.setName("ThunderRedStar");
    ba.setPasswd("SecurePassw0rd");
    ba.setPin(pin);
    ba.setAcctNum(123456789);
    ba.setBalance(1.00);
    ba.deposit(5.00);
    ba.withdraw(2.00);
    System.out.println(ba.toString() + "\n");

    short invalidPin = 9999;
    //testing invalid inputs for the "set functions"
    ba.setPin(invalidPin);
    ba.setAcctNum(000000000);
    System.out.println(ba.toString() + "\n");
    //testing invalid inputs for the withdraw method
    ba.deposit(5.00);
    //breaking the code - withdraw method allows us to take out more money than we have, yielding a negative balance
    ba.withdraw(100.00);
    System.out.println(ba.toString() + "\n");
    //testing authenciate methods
    System.out.println(ba.checkAuth((short)6666));
    System.out.println(ba.checkAuth("UnsecurePassw0rd"));
   }
}
