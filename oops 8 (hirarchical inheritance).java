class A{                                      // parent class
    
    public void display()
    {
        System.out.print("Display area of  ");
    }
}
    
class Rectangle  extends  A{                         // child class of A 
    
    public void area(int a , int b )
    {
        System.out.println("Rectangle: "+ a*b);
    }
}
class circle extends A{                        // child class of A
    
    public void area(int a )
    {
        System.out.println("circle: " + 3.14*a*a);
    }
}

public class Main
{
	public static void main(String[] args) {
	    
	    Rectangle rec = new Rectangle();
	    circle c = new circle();
	    
	    rec.display();
	    rec.area(2,3);
	    
	    c.display();
	    c.area(5);
	    
	}	
	
}
