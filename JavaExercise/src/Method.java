class  Abecus{
public void Letscalculate() {
	System.out.println("to chaliye shuru karte hai.");
}
public int add(int a,int b) {
	return  a+b; 
}
public int sub(int a,int b) {
	return  a-b; 
}
public int div(int a,int b) {
	return  a/b; 
}

}
public class Method {

public static void main(String a[]) {
	
	Abecus obj = new Abecus();
	
	int ans = obj.add(4, 5);
	int and = obj.div(4, 5);
	int anf = obj.sub(4, 5);
	System.out.println(ans);
	System.out.println(and);
	System.out.println(anf);

	
}
}
