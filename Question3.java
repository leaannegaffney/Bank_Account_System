
/**
 * Write a description of class Question3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question3
{
    public static void main(String args[])
    {
        char response;
        
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
        
        BankAccount acc1 = new BankAccount(num1,name1);
        BankAccount acc2 = new BankAccount(num2,name2);
        
        do
        {
          System.out.println("Bank Details");
          System.out.println();
       
          System.out.print("Which bank account would you like to update? ");
          int num = EasyScanner.nextInt();
          System.out.println();
       
          System.out.println("Would you like to deposit or withdraw from account " + num + "?");
          System.out.print("Enter w/W for withdraw or d/D for deposit: ");
          char letter = EasyScanner.nextChar();
          System.out.println();
       
          System.out.print("Enter the amount to withdraw from account " + num + ":");
          double amount = EasyScanner.nextDouble();
          System.out.println();
          
          if(num == 1)
          {
              if(letter == 'w' || letter == 'W')
              {
                  acc1.withdraw(amount);
              }
              else
              {
                 acc1.deposit(amount); 
              }
          }
          else
          {
              if(letter == 'w' || letter == 'W')
              {
                  acc2.withdraw(amount);
              }
              else
              {
                 acc2.deposit(amount); 
              }
              
          }
          if(num == 1)
          {
              System.out.println("Account details after transaction");
              System.out.println();
              
              displayAccount1(acc1);
              
          }
          else
          {
              System.out.println("Account details after transaction");
              System.out.println();
              
              displayAccount2(acc2);
          }

          System.out.print("Would you like to edit any more accounts? y/n ");
          response = EasyScanner.nextChar();  
          System.out.println();
        }
        while(response == 'y');
        
        System.out.println("All accounts after transaction complete");
        System.out.println();
        
        displayAccount1(acc1);
        displayAccount2(acc2);
        
    }
    
    private static void displayAccount1(BankAccount acc1)
    {
        System.out.println("Account Number: " + acc1.getAccountNumber());
        System.out.println("Account Name: " + acc1.getAccountName());
        System.out.println("Account Balance: " + acc1.getBalance());
        System.out.println();
        
      
    }
    
    private static void displayAccount2(BankAccount acc2)
    {
        System.out.println("Account Number: " + acc2.getAccountNumber());
        System.out.println("Account Name: " + acc2.getAccountName());
        System.out.println("Account Balance: " + acc2.getBalance());
        System.out.println();
        
      
    }
}
