package practice;


import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	
	BigInteger number = inputNumber();
	print(factorial(number));
	
	
	
	
	
	
}


public static void print(BigInteger number) {
	System.out.println(number);
}
public static BigInteger inputNumber() {
	System.out.println("Enter the number:");
	Scanner sc = new Scanner(System.in);
	BigInteger num = sc.nextBigInteger();
	sc.close();
	return num;
	
}

public static BigInteger factorial(BigInteger num) {
	BigInteger numOne = new BigInteger("1");
	int compareToOne = num.compareTo(numOne); 
	
	if(compareToOne < 1) {
		return num;
	}else
		{return (num.multiply(factorial(num.subtract(BigInteger.valueOf(1)))) );
	}
	
	
	
}
}
