package controller;

import fatec.sp.gov.lib.filas.FilaGenerica;

public class TelefoneController {
    public void insereLigacao(FilaGenerica<String> fila, String numeroTelefone) {
        fila.insert(numeroTelefone);
    }

    public void consultaLigacoes(FilaGenerica<String> fila) throws Exception {
        if (fila.isEmpty()) {
            throw new Exception("Não há ligações perdidas.");
        }
        while (!fila.isEmpty()) {
            System.out.println("Ligação de: " + fila.remove());
        }
    }
}
