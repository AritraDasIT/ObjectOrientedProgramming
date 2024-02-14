class A{                                      // parent class
    
    public void display()
    {
        System.out.println("I");
    }
}
    
class B extends  A{                         // single inheritance 
    
    public void display1()
    {
        System.out.println("Am");
    }
}
class C extends B{                        // Multilevele inheritance
    
    public void display2()
    {
        System.out.println("Aritra");
    }
}

public class Main
{
	public static void main(String[] args) {
	    
	    C obj = new C();
	    
	    obj.display();
	    obj.display1();
	    obj.display2();
	    
	}	
	
}
