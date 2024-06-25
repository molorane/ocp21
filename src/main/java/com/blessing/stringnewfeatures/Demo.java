package com.blessing.stringnewfeatures;

public class Demo {

    public static void main(String[] args) {
        String s = "Hello\nWorld";
        //transform(s);
    }

    // Any surrogate pairs encountered in the sequence are not combined
    public static void chars(String s) {
        s.chars().forEach(x -> System.out.println(x));
    }

    // Any surrogate pairs encountered in the sequence are combined
    // e.g \ud800\udc00
    public static void codePoints(String s) {
        s.codePoints().forEach(x -> System.out.println(x));
    }
	
	/*// repeat
	public static void repeat(String s) {
		System.out.println(s.repeat(3));
	}
	
	// strip
	public static void strip(String s) {
		System.out.println(s.strip());
	}
	
	// lines
	public static void lines(String s) {
		s.lines().forEach(System.out::println);
	}
	
	// indent
	public static void indent(String s) {
			System.out.println(s.indent(4));
	}*/
	
	/*// transform
	public static void transform(String s) {
		int res = s.transform(x -> x.length());
		System.out.println(res);
	}*/

}
