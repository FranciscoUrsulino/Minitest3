package MiniTest3;

public class EscolaDeCapitao implements EscolaDeJogador {

	@Override
	public FuncaoDoCs criaJogador() {
		return new Capitao();
	}

}  

