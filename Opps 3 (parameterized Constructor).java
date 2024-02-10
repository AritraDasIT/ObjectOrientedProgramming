
class student          // class
{
    String Name ;
    int age ;
    int roll;
    
    public void info()          // method
    {
        System.out.println("The Name of the student is : " + this.Name);
        System.out.println("The Age of the student is : " + this.age);
        System.out.println("The Roll of the student is : " + this.roll);


    }
    
    student(String NAME , int AGE , int ROLL)               //  parameterized Constructor
    {
        this.Name=NAME;
        this.age=AGE;
        this.roll=ROLL;
    }
}
public class Main
{
	public static void main(String[] args) {
	    
	    student s1 = new student("ARITRA", 10 , 22 );               //  create 1st object 
	    
	    
	    
	    s1.info();       // call method
	    
	  
	    
	}
}
