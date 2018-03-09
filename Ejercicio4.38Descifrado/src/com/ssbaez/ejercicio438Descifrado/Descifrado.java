package com.ssbaez.ejercicio438Descifrado;

import java.util.Scanner;

public class Descifrado {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Programa que descifra un entero de cuatro digitos");
		System.out.println("Ingrese el numero a descifrar");
		System.out.print("----> ");
		int y = input.nextInt();
		
		while(true) {
			
			if(y > 999 && y < 10000) {
				
				int dos 	= y % 10;
				int uno 	= (y / 10) % 10;
				int cuatro 	= (y / 100) % 10;
				int tres 	= (y / 1000) % 10;
				
				tres += 10;
				if(tres > 16) {
					tres -= 10;
				}
				
				cuatro += 10;
				if(cuatro > 16) {
					cuatro -= 10;
				}
				
				uno += 10;
				if(uno > 16) {
					uno -= 10;
				}
				
				dos += 10;
				if(dos > 16) {
					dos -= 10;
				}
				
				System.out.printf("El numero descifrado es: %d%d%d%d", uno - 7,
																	   dos - 7,
																	   tres - 7,
																	   cuatro -7);
				
				break;
				
			}
			else {
				
				System.out.println("NUMERO INVALIDO. Vuelva a introducir el numero");
				System.out.print("----> ");
				y = input.nextInt();
				
			}
			
		}
		
	}

}
