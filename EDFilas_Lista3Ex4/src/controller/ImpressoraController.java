package controller;

import fatec.sp.gov.lib.filas.FilaGenerica;

public class ImpressoraController {

	public void insereDocumento(FilaGenerica<String> fila, String documento) {
		fila.insert(documento);
		System.out.println("Documento enfileirado: " + documento);
	}

	public void imprime(FilaGenerica<String> fila) throws Exception {
		if (fila.isEmpty()) {
			throw new Exception("A fila de impressão está vazia.");
		}

		while (!fila.isEmpty()) {
			String documento = fila.remove();
			String[] dados = documento.split(";");
			String idPC = dados[0];
			String nomeArquivo = dados[1];

			System.out.println("[#PC: " + idPC + " - Arquivo: " + nomeArquivo + "]");

			int tempoImpressao = (int) (1000 + Math.random() * 1000);
			Thread.sleep(tempoImpressao);

			System.out.println("Impressão concluída para: " + nomeArquivo);
		}
	}
}