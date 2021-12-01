import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsLinked {
public static void main(String[] args) {
	Set s =new HashSet();
	System.out.println(s.add("10"));
	s.add("hello");
	s.add("cool");
	s.add("Cool");
	//s.add(null);
//	l.addFirst("first");
//	l.addLast("last");
	//List l =new  ArrayList(s);
	Set l= new TreeSet(s);
	System.out.println(l);
}
}
