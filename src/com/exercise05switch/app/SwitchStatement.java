package com.exercise05switch.app;
import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) 
	{
		//declaracion de constantes
		//declaracion de variable
		int nMes=0;
		char answer='s';
		//declaracion de objetos
		Scanner input = new Scanner(System.in);
		do 
		{
			
				answer=0;
		//validacion de los datos de entrada
		while (nMes<=0)
		{
			System.out.println("Dame un numero de mes: ");
			nMes= input.nextInt();
			
			if (nMes<=0)
			{
			System.out.println("Numero no valido! ");
			}
		}
		// proceso
		switch (nMes)
		{
			case 1: 
				System.out.println("Enero");
				break;
		
			case 2: 
				System.out.println("Febrero");
				break;
			case 3: 
				System.out.println("Marzo");
				break;
			case 4: 
				System.out.println("Abril");
				break;
		
			case 5: 
				System.out.println("Mayo");
				break;
			case 6: 
				System.out.println("Junio");
				break;
			case 7: 
				System.out.println("Julio");
				break;
		
			case 8: 
				System.out.println("Agosto");
				break;
			case 9: 
				System.out.println("Septiembre");
				break;
			case 10: 
				System.out.println("Octubre");
				break;
		
			case 11: 
				System.out.println("Noviembre");
				break;
			case 12: 
				System.out.println("Diciembre");
				break;
			default: 
				System.out.println("Numero Invalido");
				break;
		}
		System.out.println("Quieres seguir preguntando");
		answer= input.next().charAt(0);
		}while(answer =='s');
		
		input.close();
	}

}
