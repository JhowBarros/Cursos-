package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
	
		 // Offer e Add -> adiciona elementos na fila 
		// Diferen�a � o comportamento ocorre quando a fila est� cheia!
		fila.add("Ana"); // retorna fase
		fila.offer("Bia");// Lan�a uma exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Ele
		// Diferen�a � o comportamento ocorre
		// quando a fila esta vazia!
		System.out.println(fila.peek()); // retorna nulls
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lan�a uma exce��o
		
		//fila.size()
		//fila.clear()
		//fila.isEmpy()
		
		System.out.println(fila.poll());// retorna nulls
		System.out.println(fila.remove());// Lan�a uma exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		//fila.size();
		// fila.clear();
		//fila.isEmpty();
		//fila.contains(....);
	}

}
