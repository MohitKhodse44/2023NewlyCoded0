import java.util.ArrayList;
import java.util.List;

public class IterateThroughClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l2 = new ArrayList<String>();
	     l2.add("red");
	    l2.add("green");
	    l2.add("black");
	    l2.add("white");
	    l2.add("yellow");
//	    System.out.println(l2);
	    
	    for(String s1:l2)
	    {
	    	System.out.println(s1);
	    }
	}

}
