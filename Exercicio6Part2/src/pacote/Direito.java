package pacote;

public final class Direito extends Faculdade implements Oab, Eventos{
	
	private int tempoDuracao;

	public Direito(String nome, String nomeFaculdade, int bloco, int tempoDuracao) {
		super(nome, nomeFaculdade, bloco);
		this.tempoDuracao = tempoDuracao;
	}	
	
	public int getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(int tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}

	@Override
	public String toString() {
		return "Direito [tempoDuracao=" + tempoDuracao + "]";
	}
	
	@Override
	public String matrizCurricular() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fazerMatricula() {
		// TODO Auto-generated method stub
	}
	
	public String programacao() {
		return null;
	}

	@Override
	public void conteudoEventos() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public boolean realizarProva() {
		// TODO Auto-generated method stub
		return false;
	}	
	
}
