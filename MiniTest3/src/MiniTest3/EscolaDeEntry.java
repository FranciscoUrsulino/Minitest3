package MiniTest3;

public class EscolaDeEntry implements EscolaDeJogador {

	@Override
	public FuncaoDoCs criaJogador() {
		return new Entry();
	}

}
