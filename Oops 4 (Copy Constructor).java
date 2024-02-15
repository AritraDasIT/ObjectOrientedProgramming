
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
    
    student(student s2)               //  Copy Constructor 
    {
        this.Name= s2.Name;
        this.age=s2.age;
        this.roll=s2.roll;
    }
    student(){
        
    }
}
public class Main
{
	public static void main(String[] args) {
	    
	    student s1 = new student();               //  create 1st object 
	    
	    s1.Name= "ad";
	    s1.age=12;
	    s1.roll=52;
	    
	    student s2 = new student(s1); 
	    
	    s2.info();       // call method
	    
	  
	    
	}
}
