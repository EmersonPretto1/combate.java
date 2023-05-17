package application;

import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Champion darius = new Champion();
		Champion fiora = new Champion();
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		darius.name = sc.nextLine();
		System.out.print("Vida inicial: ");
		darius.life = sc.nextInt();
		System.out.print("Ataque: ");
		darius.attack = sc.nextInt();
		System.out.print("Armadura: ");
		darius.armor = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		fiora.name = sc.nextLine();
		sc.nextLine();
		System.out.print("Vida inicial: ");
		fiora.life = sc.nextInt();
		System.out.print("Ataque: ");
		fiora.attack = sc.nextInt();
		System.out.print("Armadura: ");
		fiora.armor = sc.nextInt();
		
		System.out.println("Quantos turnos voçê deseja executar? ");
		int turn = sc.nextInt();
		
		for(int i = 1; i <= turn; i++) {
			System.out.println("Resultado do turno: " + i);
			darius.takeDamage(fiora);
			fiora.takeDamage(darius);
			System.out.println("Darius: " + darius.status());
			System.out.println("Fiora: " + fiora.status());
			
		}
		
		
		
		
	}

}
