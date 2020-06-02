package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
	
		 // Offer e Add -> adiciona elementos na fila 
		// Diferença é o comportamento ocorre quando a fila está cheia!
		fila.add("Ana"); // retorna fase
		fila.offer("Bia");// Lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Ele
		// Diferença é o comportamento ocorre
		// quando a fila esta vazia!
		System.out.println(fila.peek()); // retorna nulls
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança uma exceção
		
		//fila.size()
		//fila.clear()
		//fila.isEmpy()
		
		System.out.println(fila.poll());// retorna nulls
		System.out.println(fila.remove());// Lança uma exceção
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
