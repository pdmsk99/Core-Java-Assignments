
import java.util.TreeSet;

class Person implements compare {
	   int Weight;
	   int Height;
	   



	 Person(int Weight,int Height)
	{  
	    this.Height=Height;
	    this.Weight=Weight;
	    
	         
	}
	public String toString()
	{
	    
	    return Height+" "+Weight;
	}    
	@Override
	public int compareTo(Object o) {
	   int Weight1=this.Weight;
	   int Height1=this.Height;
	        sorting p=(sorting)o;
	        int Weight2=p.Weight;
	        int Height2=p.Height;
	        if(Weight1<Weight2)
	        {
	            return -1;
	        }
	        else if(Weight1>Weight2)
	        {
	            return +1;
	        }
	        else
	        {
	            if(Height1<Height2)
	            {
	                
	                return -1;
	            }
	            else if(Height1>Height2)
	            {
	                return 1;
	            }
	            
	        }
	       return Height2;
	   
	   
	}
	}
class Framework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 sorting p1=new sorting(56, 4);
	       sorting p2=new sorting(65, 9);
	       sorting p3=new sorting(44, 5);
	       sorting p4=new sorting(47, 6);
	       sorting p5=new sorting(47,8);
	       
	       TreeSet t=new TreeSet();
	       t.add(p1);
	       t.add(p2);
	       t.add(p3);
	       t.add(p4);
	       t.add(p5);
	       System.out.println(t);
	       



	   }
	}


