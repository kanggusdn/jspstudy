package test;

class Person3 {
	String name = "홍길동";

	void sleep() {
		System.out.println("SLEEP");
	}
}

class Student3 extends Person3 {
	void sleep() {
		System.out.println("Good Night");
	}
}

public class InheritanceEx3 {
	public static void main(String[] args) {
		Student3 std = new Student3();
		System.out.println(std.name);
		std.sleep();
	}
}
