
/**
 * Write a description of class Question1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question1
{
    public static void main(String args[])
    {
        BankAccount acc1 = new BankAccount("123456", "Sean Murphy");
        BankAccount acc2 = new BankAccount("987654", "Tom Doyle");
        
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
        
        acc1.deposit(100);
        acc2.deposit(200);
        
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
        
        acc1.withdraw(50);
        acc2.withdraw(250);
        
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
        
        
    }
}
