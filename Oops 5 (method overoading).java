class A{
    
    public void add()
    {
        int a , b;
        
        a=10;
        b=15;
        
        System.out.println("sum = " + (a+b));
        
    }
    
    public void add(int a , int b)
    {
        System.out.println("sum = " + (a+b));
    }
    
    public void add(int a , double c)
    {
        System.out.println("sum = " + (a+c));
        
    }
}

public class MethodOverloading{
    public static void main(String[] args)
    {
        A obj = new A();
        
        obj.add();
        obj.add(2,5);
        obj.add(25,3.2);
        
    }
}
