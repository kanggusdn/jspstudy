package test;

public class LibraryEx2 {
	public static void main(String[] args) {
		String text = "Hello PASS World";
		String concat, upperCase, lowerCase, replace, subString;
		System.out.println("기본 String : " + text);
		System.out.println("기본 String 길이 : " + text.length());

		concat = text.concat(": YOUNGJIN.COM");
		upperCase = concat.toUpperCase();
		lowerCase = concat.toLowerCase();
		replace = upperCase.replace(':', '!');
		subString = replace.substring(6, 10);

		System.out.println("Concat String : " + concat);
		System.out.println("UpperCase String : " + upperCase);
		System.out.println("LowerCase String : " + lowerCase);
		System.out.println("Replace String : " + replace);
		System.out.println("SubString String : " + subString);
	}
}
