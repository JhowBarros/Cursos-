package Classe;

public class ValorVsReferencia {
public static void main(String[] args) {
	

	double a = 2;
	double b = a; // atribuiçao por valor
	
	a++;
	b--;
	
	System.out.println(a + " " + b);
	
	Data d1 = new Data(1, 6, 2022);
	Data d2 = d1; // atribuição por referência (objeto)
	
	d1.dia = 31;
	d2.mes = 12;
	
	d1.ano = 2025;
	
	System.out.println(d1.obterDataFormatada());
	System.out.println(d2.obterDataFormatada());
	
	VoltarDataParaValorPadrao(d1);
	
	System.out.println(d1.obterDataFormatada());
	System.out.println(d2.obterDataFormatada());
	
	int c = 5;
	alterarPrimitivo(c);
	System.out.println(c);
}
static void vootarDataParaValorPadro(Data d) {
	d.dia = 1;
	d.mes = 1;
	d.ano = 1970;
}
static void alterasPrimitivo(int c) {
	c++;
}
private static void alterarPrimitivo(int c) {
	// TODO Auto-generated method stub
	
}

private static void VoltarDataParaValorPadrao(Data d1) {
	// TODO Auto-generated method stub
	
}
}
