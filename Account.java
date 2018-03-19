public class Account {

   private int accountNumber = 123456789;
   private double balance;
   
   
   public void deposit(){
      
      // Kalder metode getBalance();
      getBalance();
   }
   
   public void withdraw(double amount){
      
      if(balance > amount+10){
          balance -= 10;
          balance -= amount;
      } else {
         System.out.println("Nej");
         System.out.println("Vil du hæve et andet beløb (Y/N)");
      }  
      
   }
   
   public double getBalance(){
   
      return 0;
   }
   
   public int getAccountNumber(){
      return accountNumber;
   }

}