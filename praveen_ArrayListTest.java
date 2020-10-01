import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;
import java.util.Vector;


public class ArrayListTest {
	 public static void main(String argd[]){
		    ArrayList<String> arrayList = new ArrayList<String>();
		   System.out.println(arrayList.size() );
		   
		   arrayList.ensureCapacity(10);
		   System.out.println(arrayList.size() );
		    arrayList.add("ABC");
		    arrayList.add("2");
		    arrayList.add("DEF");
		    System.out.println(arrayList.size() );
		    Vector<String> v = new Vector<String>();
		    v.add("4");
		    v.add("5");
		    v.add("3");

		    // insert all elements of Vector to ArrayList at index 1
		    arrayList.addAll(1, v);
		    
		    for (Object str: arrayList)
		      System.out.println((String)str);
	
		    Vector<String> v1 = new Vector<String>();
		    v1.add("2");
		    v1.add("3");
		    v1.add("6");
		    arrayList.retainAll(v1);
	 
		    
		    
	 ListIterator<String> litr = arrayList.listIterator();
	    while (litr.hasNext()) {
	      String element = litr.next();
	      litr.set(element + "+");
	    }

	    // Now, display the list backwards.
	    System.out.print("Modified list backwards: ");
	    while (litr.hasPrevious()) {
	      String element = litr.previous();
	      System.out.print(element + " ");
	    }
	     
}
}











