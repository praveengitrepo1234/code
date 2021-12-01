
public class Exception {
void test1()  {
	System.out.println("test1");
	test2();
}
void test2() {
	System.out.println("test2");
	test3();
}

void test3(){
	int i=0;
	int j=100/0;
	System.out.println("test3");
}

public static void main(String[] args) {
	Exception t=new Exception();
}
}
