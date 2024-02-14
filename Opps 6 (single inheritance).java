
class shape{                  // parent class
    
    public void area()
    {
        System.out.println("Display area: ");
    }
}

class Triangle extends shape{                 // child class
    
    public void area(int l , int h)
    {
        System.out.println(0.5*l*h);
    }
}

public class Main
{
	public static void main(String[] args) {
		Triangle t = new Triangle();
		
		t.area();
		t.area(10,2);
	}
}
