
class person{
    
    // Encapsulating the name and age
    // only approachable and used using  methods defined
    
    private String Name;
    private int age ;
    
    public String getName()             // getter
    {
        return Name;
    }
    public void setName(String Name)    // setter
    {
        this.Name=Name;
    }
    
    public int getage()          //getter
    {
        return age; 
    }
    
    public void setage(int age)    //setter
    {
        this.age=age;
    }
    
}
public class Main
{
	public static void main(String[] args) {
	    
	    person p1 = new person();
	    
	    p1.setName("Aritra");
	    p1.setage(20);
	    // Using methods to get the values from the  variables
	   
	    System.out.println("Name: " + p1.getName());
	    System.out.println("Age: "+ p1.getage());
	
	}
}
