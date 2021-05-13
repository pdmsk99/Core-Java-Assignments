
class main
{
    public static void main(String args[])
    {
       
        Ston x = Ston.getInstance();
  
        
        Ston y = Ston.getInstance();
  
        
        Ston z = Ston.getInstance();
  
        
        x.s = (x.s).toUpperCase();
  
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
  
        
        z.s = (z.s).toLowerCase();
  
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}
class Ston
{
    
    private static Ston single_instance = null;
  
    
    public String s;
  
   
    private Ston()
    {
        s = "Hello I am a string part of Ston class";
    }
  
    
    public static Ston getInstance()
    {
        if (single_instance == null)
            single_instance = new Ston();
  
        return single_instance;
    }
}