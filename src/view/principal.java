package view;
import Controller.bilheteria;
public class principal {
	public static void main(String[] args) {
		for(int i  = 1; i<=300;i++) {
			int qtd = (int)((Math.random()*4)+1);
			bilheteria sistem = new bilheteria(qtd,i);
			 sistem.start();
		}
	}

}