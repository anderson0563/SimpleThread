package av2;

public class Fatorial extends Thread {
	private int numero;
	int fat = 1;
	
	public Fatorial(int n) {
		this.numero = n;
	}
	
	public void calcularFatorial (int n){
		
		 for(int i=1; i <= n; i++){
             fat = fat * i;
         }
		 
		 System.out.println(n + "!"+ " = " + fat);
	}

	@Override
	public void run() {
		calcularFatorial(numero);
	}
}
