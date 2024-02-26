class vehicle{                 //parent class
    void run()                   //method
    {
        System.out.println("vehicle running");
    }
}

class Bike extends vehicle{             //child class
    void run()
    {
        System.out.println("Bike running");
    }
}
public class Main
{
	public static void main(String[] args) {
		Bike B = new Bike();
		
		B.run();
	}
}
