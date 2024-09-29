package view;

import java.util.Scanner;

import controller.EscalonadorController;
import fatec.sp.gov.lib.filas.FilaGenerica;
import model.Processo;

public class Principal {
	 public static void main(String[] args) throws Exception {
		        FilaGenerica<Processo> filaProcessos = new FilaGenerica<>();

		        filaProcessos.insert(new Processo("notepad.exe", 14));
		        filaProcessos.insert(new Processo("write.exe", 35));
		        filaProcessos.insert(new Processo("chrome.exe", 27));
		        filaProcessos.insert(new Processo("acrobat.exe", 52));
		        filaProcessos.insert(new Processo("firefox.exe", 18));
		        filaProcessos.insert(new Processo("word.exe", 25));

		        EscalonadorController escalonador = new EscalonadorController();
		        escalonador.escalonador(filaProcessos); 
	 }
}
