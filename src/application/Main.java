package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import entities.Alvo;
import entities.AlvoBranco;
import entities.AlvoPreto;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static List<Alvo> alvos = new ArrayList<>();

	public static void main(String[] args) {
		iniciarJogo();
		atira();
	}
	
	public static void iniciarJogo() {
		Set<String> posicoesOcupadas = new HashSet<>();
		Random rand = new Random();
		
		while (alvos.size() < 15) {
			int x = rand.nextInt(5) + 1;
			int y = rand.nextInt(5) + 1;
			String chave = x + "," + y;
			
			if(!posicoesOcupadas.contains(chave)) {
				posicoesOcupadas.add(chave);
				
				if (alvos.size() < 3) {
					alvos.add(new AlvoBranco(x, y));
				} else {
					alvos.add(new AlvoPreto(x, y));
				}
			}
		}
		
		System.out.println("Jogo iniciado com 15 alvos!");
	}
	
	public static void atira() {
		int tiros = 10;
		
		while (tiros > 0 && Alvo.getQuantADestruir() > 0) {
			System.out.println("\nVocê tem " + tiros + " tiro(s) restante(s).");
			System.out.println("Digite a posição X (1-5): ");
			int x = sc.nextInt();
			
			System.out.println("Digite a posição Y (1-5): ");
			int y = sc.nextInt();
			
			boolean acertou = false;
			
			for (int i=0; i< alvos.size(); i++) {
				Alvo alvo = alvos.get(i);
				
				if(alvo.acerta(x, y)) {
					acertou = true;
					
					if(alvo instanceof AlvoPreto) {
						System.out.println("Você acertou um Alvo Preto!");
						alvos.remove(i);
					} else if (alvo instanceof AlvoBranco) {
						System.err.println("Você acertou um Alvo Branco!");
						alvos.set(i, new AlvoPreto(x, y));
					}
					
					break;
				}
			}
			
			if(!acertou) {
				System.err.println("Você não acertou nenhum alvo.");
			}
			
			tiros--;
		}
		
		if(Alvo.getQuantADestruir() <= 0) {
			System.out.println("\nVocê venceu!");
		} else {
			System.out.println("\nGame Over.");
		}
	}

}
