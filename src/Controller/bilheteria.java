package Controller;
public class bilheteria extends Thread {
	private int quantidade;
	private int cliente;
	private static int Ingressos = 100;
	private int confirm = 0;
		public bilheteria(int quantidade, int cliente) {
		this.quantidade = quantidade;
		this.cliente = cliente;
	}
	
	
	public void start() {
		login();
		if(confirm == 0) {
			comprar();
			validacao();
		}
	}
	private void login() {
		int login = (int)((Math.random()*1951)+50);
		try {
			sleep(login);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	private void comprar() {
		int Compra = (int)((Math.random()*2000)+1000);
		try {
			sleep(Compra);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		if(Compra > 2500) {
			System.err.println(cliente+" Excedeu as tentativas de compra! ");
			cliente = 1;
		}
	}
	private void validacao() {
		if(Ingressos >= quantidade) {
			Ingressos -= quantidade;
			System.out.println(cliente+" conseguiu comprar " +quantidade+ " ingressos");
			System.out.println("Restam " +Ingressos+ " ingressos");
		}else {
			System.err.println(cliente+ "não conseguiu comprar ingressos");
		}
	}
	
}