package by.academy.lesson2;

public class CastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 128; // max -2^31..(2^31)-1
		byte b = 22; // -128..127

		b = (byte) i;
		System.out.println(b);
		int maxInt = Integer.MAX_VALUE;
		maxInt = maxInt + 1;
		System.out.println(maxInt);

		i = b;
		System.out.println(i);

		double d = 15.8;
		int i1 = (int) d;
		System.out.println(i1);
		System.out.println(Math.ceil(d));
		System.out.println(Math.floor(d));
		System.out.println(Math.round(d));

		System.out.println(b + d);
		System.out.println(b + i);
		System.out.println(i1 + d);
	}

}
