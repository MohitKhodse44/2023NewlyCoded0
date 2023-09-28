import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class updateValue {
	
	public static void main(String[] args) {
		List<String> l2 = new ArrayList<String>();
	     l2.add("red");
	    l2.add("green");
	    l2.add("black");
	    l2.add("white");
	    l2.add("yellow");
	    l2.set(0, "mohit");
	    System.out.println(l2);
	    
	    //to remove Element use l2.remove(index);
	    l2.remove(2);
//	    System.out.println(l2);
	    
	    //Search an element in a array list
	   // System.out.println(l2.contains("green"));
	    
	    //  Sort a given array list
	    
	    Collections.sort(l2);
	   // System.out.println(l2);  //[green, mohit, white, yellow]
	    
	    List<String> List2 = new ArrayList<String>();
	    List2.add("A");
	    List2.add("B");
	    List2.add("C");
	    List2.add("D");
//	    Collections.copy(l2, List2);
//	    System.out.println(l2);
	    
	    //java program to print all the elements of an ArrayList using the elements' position.
	    int no_of_elements=l2.size();
	    for (int index = 0; index < no_of_elements; index++)
	    	   System.out.println(l2.get(index));
	    
	    
	    
	    
	    
	    
	    
	}

}
