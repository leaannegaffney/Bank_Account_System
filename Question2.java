
/**
 * Write a description of class Question2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question2
{
   public static void main(String args[])
   {
     
       System.out.print("Please enter account number for the first account: ");
       String num1 = EasyScanner.nextString();
       System.out.print("Please enter account name for the first account: ");
       String name1 = EasyScanner.nextString();
       System.out.println();
       
       System.out.print("Please enter account number for the second account: ");
       String num2 = EasyScanner.nextString();
       System.out.print("Please enter account name for the second account: ");
       String name2 = EasyScanner.nextString();
       System.out.println();
       
       System.out.print("Please enter account number for the third account: ");
       String num3 = EasyScanner.nextString();
       System.out.print("Please enter account name for the third account: ");
       String name3 = EasyScanner.nextString();
       System.out.println();
       
       BankAccount acc1 = new BankAccount(num1, name1);
       BankAccount acc2 = new BankAccount(num2, name2);
       BankAccount acc3 = new BankAccount(num3, name3);
       
       System.out.println("Account 1 Details");
       System.out.println("Account Number is " + acc1.getAccountNumber());
       System.out.println("Account Name is " + acc1.getAccountName());
       System.out.println("Account Balance is " + acc1.getBalance());
       System.out.println();
       
       System.out.println("Account 2 Details");
       System.out.println("Account Number is " + acc2.getAccountNumber());
       System.out.println("Account Name is " + acc2.getAccountName());
       System.out.println("Account Balance is " + acc2.getBalance());
       System.out.println();
       
       System.out.println("Account 3 Details");
       System.out.println("Account Number is " + acc3.getAccountNumber());
       System.out.println("Account Name is " + acc3.getAccountName());
       System.out.println("Account Balance is " + acc3.getBalance());
       System.out.println();
       
       acc1.deposit(10);
       acc2.deposit(20);
       acc3.deposit(30);
       
       System.out.println("Account 1 Details");
       System.out.println("Account Number is " + acc1.getAccountNumber());
       System.out.println("Account Name is " + acc1.getAccountName());
       System.out.println("Account Balance is " + acc1.getBalance());
       System.out.println();
       
       System.out.println("Account 2 Details");
       System.out.println("Account Number is " + acc2.getAccountNumber());
       System.out.println("Account Name is " + acc2.getAccountName());
       System.out.println("Account Balance is " + acc2.getBalance());
       System.out.println();
       
       System.out.println("Account 3 Details");
       System.out.println("Account Number is " + acc3.getAccountNumber());
       System.out.println("Account Name is " + acc3.getAccountName());
       System.out.println("Account Balance is " + acc3.getBalance());
       System.out.println();
       
       acc1.withdraw(5);
       acc2.withdraw(15);
       acc3.withdraw(40);
       
       System.out.println("Account 1 Details");
       System.out.println("Account Number is " + acc1.getAccountNumber());
       System.out.println("Account Name is " + acc1.getAccountName());
       System.out.println("Account Balance is " + acc1.getBalance());
       System.out.println();
       
       System.out.println("Account 2 Details");
       System.out.println("Account Number is " + acc2.getAccountNumber());
       System.out.println("Account Name is " + acc2.getAccountName());
       System.out.println("Account Balance is " + acc2.getBalance());
       System.out.println();
       
       System.out.println("Account 3 Details");
       System.out.println("Account Number is " + acc3.getAccountNumber());
       System.out.println("Account Name is " + acc3.getAccountName());
       System.out.println("Account Balance is " + acc3.getBalance());
       System.out.println();
       
       
       
       
       
        
   }
}
