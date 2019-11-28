package MiniTest3;

public class EscolaDeLurker implements EscolaDeJogador {

	@Override
	public FuncaoDoCs criaJogador() {
		return new Lurker();
	}

} 
