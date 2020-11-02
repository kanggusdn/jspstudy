package test;

class Person2 {
	String name = "홍길동";

	void sleep() {
		System.out.println("SLEEP");
	}
}

class Student2 extends Person2 {
	void sleep() {
		System.out.println("Good Night");
	}
}

public class InheritanceEx2 {
	public static void main(String[] args) {
		Student2 std = new Student2();
		System.out.println(std.name);
		std.sleep();
	}
}
