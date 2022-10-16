package aulas.estrutura_dados.desafio.pilhas;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ConversaoDecimalBinario {
	
	public static Stack<Integer> q = new Stack<Integer>();
	public static ArrayList<Integer> r = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		converterDecimalBinario(insertNumeroConversao());
		mostrarConversao();
	}
	
	public static int insertNumeroConversao(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o n�mero que deseja converter para o binario abaixo ");
		int number = sc.nextInt();
		sc.close();
		return number;
		
	}
	
	public static void converterDecimalBinario(int number) {
		q.add(number);
		
		while(q.peek()>1) {
			
			r.add(q.peek()%2);
			q.add(q.peek()/2);
		}
	}
	
	public static void mostrarConversao() {
		
		String binary = "";
		for(int i = 0; i<r.size();i++) {
			binary += r.get(i);
		}
		
		System.out.println("Este numero em binario:");
		binary = new StringBuilder(binary+q.peek()).reverse().toString();
		System.out.println(binary);
	}
}
