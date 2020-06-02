package projetosReais;

import java.util.HashSet;

import Colecoes.Usuario;

public class Hash {
	
	public static void main(String[] args) {
		
        HashSet<Usuario> usuarios = new HashSet<Usuario>();
        
        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Guilheme"));
        
        boolean resultado = usuarios.contains(new Usuario("Guilherme"));
        System.out.println(resultado);
	}

}
