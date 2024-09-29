package controller;

import fatec.sp.gov.lib.filas.FilaGenerica;
import model.Cliente;

public class ParqueController {

    public void brinquedo(FilaGenerica<Cliente> fila) throws Exception {
        while (!fila.isEmpty()) {
            Cliente cliente = fila.remove();

            if (cliente.getIdade() > 16 && cliente.getAltura() > 1.60) {
                System.out.println(cliente.getNome() + " pode entrar no brinquedo.");
            } else {
                String razao = cliente.getIdade() <= 16 ? "idade insuficiente" : "altura insuficiente";
                System.out.println(cliente.getNome() + " não pode entrar no brinquedo. Motivo: " + razao);
            }
        }
    }
}