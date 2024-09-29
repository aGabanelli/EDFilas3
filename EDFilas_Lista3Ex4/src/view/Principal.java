package view;

import java.util.Scanner;

import controller.ImpressoraController;
import fatec.sp.gov.lib.filas.FilaGenerica;

public class Principal {
	public static void main(String[] args) throws Exception {
		ImpressoraController controller = new ImpressoraController();
		FilaGenerica<String> filaImpressao = new FilaGenerica<>();
		Scanner scanner = new Scanner(System.in);
		boolean continuar = true;

		while (continuar) {
			System.out.println("\nMenu:");
			System.out.println("1. Inserir Documento");
			System.out.println("2. Iniciar Impressão");
			System.out.println("3. Sair");
			System.out.print("Escolha uma opção: ");
			String opcao = scanner.nextLine();

			switch (opcao) {
			case "1":
				System.out.print("Digite o ID do PC: ");
				String idPC = scanner.nextLine();
				System.out.print("Digite o nome do arquivo: ");
				String nomeArquivo = scanner.nextLine();

				if (!idPC.isEmpty() && !nomeArquivo.isEmpty()) {
					String documento = idPC + ";" + nomeArquivo;
					controller.insereDocumento(filaImpressao, documento);
				} else {
					System.out.println("Documento inválido. Tente novamente.");
				}
				break;

			case "2":
				try {
					controller.imprime(filaImpressao);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case "3":
				continuar = false;
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opção inválida.");
			}
		}

		scanner.close();
	}
}
