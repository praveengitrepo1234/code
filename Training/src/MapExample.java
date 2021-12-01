import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args) {
		
	//Map <String, String> m= new LinkedHashMap();
		//Map m= new Hashtable();
		TreeMap <String,String> m = new TreeMap<String, String>();
		
	m.put("one", "1");
	//m.put(null, "2");
	m.put("three", "3");
	//m.put(null, "4");
	m.put("six", null);
	m.put("seven", null);
	TreeMap mm= new TreeMap(m.descendingMap());
System.out.println(mm);
	//System.out.println(m);
	//System.out.println(m.get(null));
//	for(Entry<String, String> mp: m.entrySet()) {
//		System.out.println(m);
//	}
}
}