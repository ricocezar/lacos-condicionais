package PacoteJava;

import java.util.Scanner;

public class Ativ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		String p1,p2,p3;
		
		System.out.println("\nPrimeira palavra: ");
		p1 = ler.nextLine();
		System.out.println("\nSegunda palavra: ");
		p2 = ler.nextLine();
		System.out.println("\nTerceira palavra: ");
		p3 = ler.nextLine();
		
		if(p1.equalsIgnoreCase("vertebrados")) {
			if(p2.equalsIgnoreCase("ave")) {
				if(p3.equalsIgnoreCase("carnívoro")) {
					System.out.println("\nÉ uma águia");
				}else {
					System.out.println("\nÉ uma pomba");
				}}
				else {
					if(p3.equalsIgnoreCase("Onívoro")) {
					System.out.println("\nÉ um ser humano");
					}
					else {
						System.out.println("\nÉ uma Vaca");
					}
				}
					
			}else {
				if(p2.equalsIgnoreCase("Inseto")) {
					if(p3.equalsIgnoreCase("Hematófago")) {
						System.out.println("\nÉ uma pulga");
					}else {
						System.out.println("\nÉ uma lagarta");	
					}
				}else {
					if(p3.equalsIgnoreCase("Hematófago")) {
						System.out.println("\nÉ um sanguessuga");
					}else {
						System.out.println("\nÉ uma minhoca");	
					}
					
				}
			}
		}
		
				
		

	}


