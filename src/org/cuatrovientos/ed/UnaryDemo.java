package org.cuatrovientos.ed;

public class UnaryDemo {

	public static void main(String[] args) {
		int result = +1;
		System.out.println(result); // 1
		
		result--;
		System.out.println(result); // 0
		
		result++;
		System.out.println(result); // 1
		
		result = -result;
		System.out.println(result); // -1
		
		boolean success = false;
		System.out.println(success); // false
		System.out.println(!success); // true
	}

}
