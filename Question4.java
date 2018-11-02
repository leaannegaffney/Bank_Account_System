
/**
 * Write a description of class Question4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question4
{
    public static void main(String args[])
    {
       BankAccount accounts [] = new BankAccount[2];
        
       accounts[0] = new BankAccount("123456", "Ann Doyle");
       accounts[1] = new BankAccount("789465", "Betty Murphy");
       
       for(int i = 0; i < accounts.length; i++)
       {
           System.out.println("Account " + (i+1) +  " Details");
           System.out.println("Account Number is " + accounts[i].getAccountNumber());
           System.out.println("Account Name is " + accounts[i].getAccountName());
           System.out.println("Account Balance is " + accounts[i].getBalance());
           System.out.println();
        }
       
       for(int i = 0; i < accounts.length; i++)
       {
           System.out.print("How much do you want to deposit into account " + (i+1) + "?");
           double num = EasyScanner.nextDouble();
           accounts[i].deposit(num);
        }
        
       for(int i = 0; i < accounts.length; i++)
       {
           System.out.println("Account " + (i+1) +  " Details");
           System.out.println("Account Number is " + accounts[i].getAccountNumber());
           System.out.println("Account Name is " + accounts[i].getAccountName());
           System.out.println("Account Balance is " + accounts[i].getBalance());
           System.out.println();
        }
       
       for(int i = 0; i < accounts.length; i++)
       {
           System.out.print("How much do you want to withdraw from account " + (i+1) + "?");
           double num = EasyScanner.nextDouble();
           accounts[i].withdraw(num);
       }
        
       for(int i = 0; i < accounts.length; i++)
       {
           System.out.println("Account " + (i+1) +  " Details");
           System.out.println("Account Number is " + accounts[i].getAccountNumber());
           System.out.println("Account Name is " + accounts[i].getAccountName());
           System.out.println("Account Balance is " + accounts[i].getBalance());
           System.out.println();
        }
    }
}
