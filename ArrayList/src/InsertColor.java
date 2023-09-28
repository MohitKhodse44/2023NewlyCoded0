import java.util.ArrayList;
import java.util.List;

public class InsertColor {
	public static void main(String[] args) {
		List<String> l2 = new ArrayList<String>();
	     l2.add("red");
	    l2.add("green");
	    l2.add("black");
	    l2.add("white");
	    l2.add("yellow");
	    
	    l2.add(0,"pink");
	    System.out.println(l2);//as arrayList is able to change the size,sosize gets inceraed
	    
	}

}
