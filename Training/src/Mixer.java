
//public class Class{
//	
//	public static void main(String[] args) { 
//		 String s1 = "abc"; 
//		 String s2 = s1; 
//		 s1 += "d"; 
//		 System.out.println(s1 + " " + s2 + " " + (s1==s2)); 
//		 StringBuffer sb1 = new StringBuffer("abc"); 
//		 StringBuffer sb2 = sb1; 
//		 sb1.append("d"); 
//		 System.out.println(sb1 + " " + sb2 + " " + (sb1==sb2)); 
//		 } 
//
//}
 public class Mixer { 
Mixer() { }
Mixer(Mixer m) {
 m1 = m;
 }
 Mixer m1;
 public static void main(String[] args) {
 Mixer m2 = new Mixer();
 Mixer m3 = new Mixer(m2);
 m3.go();
 Mixer m4 = m3.m1;
 m4.go();
 Mixer m5 = m2.m1;
 m5.go();
 } 
void go() {
 System.out.print("hi ");
 }
 }



