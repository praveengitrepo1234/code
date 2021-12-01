import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collectionsexp1 {
public static void main(String[] args) {
	List l= new ArrayList();
	l.add(new Employee(11,"First"));
	Employee e=new Employee(22,"second");
	l.add(e);
	Employee e1=new Employee(44, "third");
	Employee e2=new Employee(33, "Fourth");
	l.add(e1);
	l.add(e2);
	
	
	Comparator cp=new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			
			return e1.getEmpId()-e2.getEmpId();
		}
	};
	Collections.sort(l);
	System.out.println(l);
	
}
}
