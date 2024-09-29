package model;

public class Processo {
	private String nome;
    private int qntRetorno;

    public Processo(String nome, int qntRetorno) {
        this.nome = nome;
        this.qntRetorno = qntRetorno;
    }

    public String getNome() {
        return nome;
    }

    public int getQntRetorno() {
        return qntRetorno;
    }

    public void decrementarRetorno() {
        if (qntRetorno > 0) {
            qntRetorno--;
        }
    }

    @Override
    public String toString() {
        return nome + "; " + qntRetorno;
    }
}
