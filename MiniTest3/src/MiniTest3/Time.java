package MiniTest3;


public class Time {
	public static void main(String[] args) {
		EscolaDeJogador jogador = new EscolaDeEntry();
		FuncaoDoCs funcao = jogador.criaJogador();
		funcao.exibirInfo();
		System.out.println();

		jogador = new EscolaDeCapitao();
		funcao = jogador.criaJogador();
		funcao.exibirInfo();
		System.out.println();

		jogador = new EscolaDeLurker();
		funcao = jogador.criaJogador();
		funcao.exibirInfo();
		System.out.println();

		jogador = new EscolaDeAwp();
		funcao = jogador.criaJogador();
		funcao.exibirInfo();
	}
}