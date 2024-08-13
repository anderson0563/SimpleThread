package av2;

public class Fibonacci extends Thread {
	private int numero;

	public Fibonacci(int n) {
		this.numero = n;
	}

	public int calcularFibonacci(int entrada) {
		if (entrada == 0) {
			return 0;
		} else if(entrada == 1) {
			return 1;
		} else {
			return calcularFibonacci(entrada - 1) + calcularFibonacci(entrada - 2);	
		}
	}

	@Override
	public void run() {
		calcularFibonacci(numero);
		System.out.println("Fibonacci = " + calcularFibonacci(numero));
	}
}