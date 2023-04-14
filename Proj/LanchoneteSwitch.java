package PacoteJava;

import java.util.Scanner;

public class LanchoneteSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int quantid,codproduto;
		float vt;
		
		System.out.println("\nLanchonete Switch");
		System.out.println("\nMenu de Opções");
		System.out.println("\n1 - Cachorro Quente - R$5,00");
		System.out.println("\n2 - X-Salada - R$10,00");
		System.out.println("\n3 - X-Bacon - R$18,00");
		System.out.println("\n4 - Bauru - R$12,00");
		System.out.println("\n5 - Refrigerante - R$6,00");
		System.out.println("\n6 - Suco de laranja - R$8");
		System.out.println("\nEscolha o seu produto");
		
		codproduto = ler.nextInt();
		System.out.println("\nQual a quantidade?");
		quantid = ler.nextInt();
				
		switch(codproduto) {
		
		case 1:
			vt = 5 * quantid;
			System.out.println("\nCachorro Quente - Valor Total: R$" +vt);
			break;
		case 2:
			vt = 10 * quantid;
			System.out.println("\nX-Salada - Valor Total: R$" +vt);
			break;
		case 3:
			vt = 18 * quantid;
			System.out.println("\nX-Bacon - Valor Total: R$" +vt);
			break;
		case 4:
			vt = 12 * quantid;
			System.out.println("\nBauru - Valor Total: R$" +vt);
			break;
		case 5:
			vt = 6 * quantid;
			System.out.println("\nRefrigerante - Valor Total: R$" +vt);
			break;
		case 6:
			vt = 8 * quantid;
			System.out.println("\nSuco de Laranja - Valor Total: R$" +vt);
			break;
		default:
			System.out.println("\nCódigo Inválido");
					
		
		}
				
				
				
				
	}

}
