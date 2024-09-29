package controller;

import fatec.sp.gov.lib.filas.FilaGenerica;
import model.Processo;

public class EscalonadorController {

    public void escalonador(FilaGenerica<Processo> filaProcessos) throws Exception {
        while (!filaProcessos.isEmpty()) {
            Processo processo = filaProcessos.remove();
            System.out.println("Executando: " + processo.getNome() + " - Retornos restantes: " + processo.getQntRetorno());
            
            processo.decrementarRetorno();
    
            if (processo.getQntRetorno() > 0) {
                filaProcessos.insert(processo);
            }
        }
        System.out.println("Todos os processos foram concluídos.");
    }
}
