class Account {
   public String name;
   protected String email;
   private String password;        // private
   
   
   // Access private class, methd etc using set and get
   public String getPassword()
   {
       return this.password;                      // using get
   }

   public void setPassword(String password) {      // using set
       this.password = password;
   }
}
public class Sample {
   public static void main(String args[]) {
       Account a1 = new Account();
       a1.name = "Apna College";
       a1.setPassword("abcd");                   
       a1.email = "hello@apnacollege.com";
       
       System.out.println(a1.getPassword());
   }
}


