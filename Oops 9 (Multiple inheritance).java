// interface 1

interface charecter{
    
    void attack();      // Default method
}

// interface 2

interface weapon{
    
    void use();       //Default method
}

class warior implements charecter,weapon{
     
     public void attack() {  
        System.out.println("Warrior attacks with a sword.");  
    }  
  
    public void use() {  
        System.out.println("Warrior uses a sword.");  
    }  
}  



public class Main
{
	public static void main(String[] args) {
		
		warior w = new warior();
		
		w.use();
		w.attack();
	}
}


/* output:
Warrior uses a sword.
Warrior attacks with a sword
*/
