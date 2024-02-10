
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
}
public class Main
{
	public static void main(String[] args) {
	    
	    student s1 = new student();               //  create 1st object 
	    
	    s1.Name = "Aritra";
	    s1.age = 22;
	    s1.roll= 10;
	    
	    s1.info();       // call method
	    
	    student s2 = new student();           //create 2nd objcet 
	    
	    s2.Name= "Raya";
	    s2.age= 21;
	    s2.roll=12;
	    
	    s2.info();
	    
	}
}
