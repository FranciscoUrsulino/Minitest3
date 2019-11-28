package MiniTest3;


public class EscolaDeAwp implements EscolaDeJogador {

	@Override
	public FuncaoDoCs criaJogador() {
		return new Awp();
	}

} 
