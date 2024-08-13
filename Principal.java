package av2;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		int num;
		
        System.out.print("Entre com um numero:");
        
        Scanner sc = new Scanner(System.in);
        
        num = sc.nextInt();
        (new Fibonacci(num)).start(); 
        (new Fatorial(num)).start();
        
        sc.close();
	}
}