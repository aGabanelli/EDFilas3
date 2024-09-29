package view;

import java.util.Scanner;

import controller.TelefoneController;
import fatec.sp.gov.lib.filas.FilaGenerica;

public class Principal {
	 public static void main(String[] args) {
	        TelefoneController controller = new TelefoneController();
	        FilaGenerica<String> filaLigacoes = new FilaGenerica<>();
	        Scanner scanner = new Scanner(System.in);
	        int opcao = 0;
	        String numero = "";
	        
	        while (opcao != 3) {
	        	System.out.println("Menu -------------------");
	            System.out.println("1. Inserir Ligação");
	            System.out.println("2. Consultar Ligações");
	            System.out.println("3. Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();
	            
	            switch (opcao) {
	            case 1:
	            	try {
	            		System.out.println("Digite o número da ligação: ");
	                    numero = scanner.nextLine();	
	            		controller.insereLigacao(filaLigacoes, numero);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        controller.consultaLigacoes(filaLigacoes);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
	            }
	        }
	    }
}
