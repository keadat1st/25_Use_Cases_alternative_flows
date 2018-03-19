public class Bank {

   public static void main(String[] args){
   
      Customer claus = new Customer();
      claus.setName("Claus Den Grusomme");
      claus.openAccount();
      
      String displaymessage =  claus.display();
     System.out.println(displaymessage);
   
   }

}