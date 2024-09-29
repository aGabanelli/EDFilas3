package view;

import controller.ParqueController;
import fatec.sp.gov.lib.filas.FilaGenerica;
import model.Cliente;

public class Principal {
	public static void main(String[] args) throws Exception {
		FilaGenerica<Cliente> filaClientes = new FilaGenerica<>();
		ParqueController controller = new ParqueController();

		for (int i = 1; i <= 30; i++) {
			String nome = "Pessoa" + i;
			int idade = (int) (10 + Math.random() * 31);
			double altura = 1.35 + Math.random() * 0.65;

			Cliente cliente = new Cliente(nome, idade, altura);
			filaClientes.insert(cliente);
		}

		controller.brinquedo(filaClientes);
	}
}
