package projetosReais;

public class SwitchSemBreak {
	public static void main(String[] args) {
	String faixa = "marrom";
	switch (faixa.toLowerCase()) {
	case "marrom":
		System.out.println("Sei o Tekki Shodow");
	case "roxa":
		System.out.println("Sei o heian Godan");
	case "verde":
		System.out.println("Sei o heian Yodan");
	case "laranja":
		System.out.println("Sei o heian Sandan");
	case "Vermelha":
		System.out.println("Sei o heian Nidan");
	case "amarela":
		System.out.println("Sei o heian Shodan");
	}
	System.out.println("Fim....");
	
	int idade = 2;
	switch (idade){
		case 3:
    System.out.println("Sabe programa");
		case 2:
	System.out.println("Sabe Falar");
		case 1:
	System.out.println("Sabe respirar");
	}
	
	
	
	}

}
