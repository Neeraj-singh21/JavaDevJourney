public class Object{
	public static void main (String  Args[]) {
		
		Person p1= new Person();
		p1.age=24;
		p1.name ="sundar";
		p1.sex = "male";
		Person p2 = new Person();
		p2.age =32;
		p2.name="shyam";
		p1.Walk();
		p1.walk(4);
		System.out.println(p1.age + " " + p1.name);  
		System.out.println(Person.count);
		Person p3 = new Person( 12, "Mukesh");
		
		System.out.println(p3.age + "helo");
	}
}
class Person{
	String name;
	int age;
	String sex;
	static int count;
	public Person(int age, String name) {
		this();
		name = name;
		age = age;
		
	}
	public Person() {
		count++;
		System.out.println("creatring construcvtor");
	}
	void Walk() {
		System.out.println(name + " is walinking." );
	}
	void walk(int step) {
		System.out.println(name + "walk" + step);
	}
}