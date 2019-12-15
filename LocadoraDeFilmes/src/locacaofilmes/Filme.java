package locacaofilmes;

import java.util.ArrayList;

public class Filme {
	//O modificador private deixar� vis�vel o atributo apenas para a classe em que este atributo se encontra.
		private String tituloFilme;
		private String duracao;
		private int anoDeLancamento;
		private String formato;
		private int qtdCopias;
		private int numeroDaCopia;
		
		ArrayList<String> atoresPrincipais = new ArrayList<>();
		
		//Construtor da classe Filme com argumentos
		public Filme(String tituloFilme, String duracao, int anoDeLancamento, String formato, int qtdCopias, int numeroDaCopia)
		{
			this.tituloFilme = tituloFilme;
			this.duracao = duracao;
			this.anoDeLancamento = anoDeLancamento;
			this.formato = formato;
			this.qtdCopias = qtdCopias;
			this.numeroDaCopia = numeroDaCopia;
		}
		
		//M�todos gets e seters
		public String getTituloFilme() {
			return tituloFilme;
		}

		public void setTituloFilme(String tituloFilme) {
			this.tituloFilme = tituloFilme;
		}

		public String getDuracao() {
			return duracao;
		}

		public void setDuracao(String duracao) {
			this.duracao = duracao;
		}

		public int getAnoDeLancamento() {
			return anoDeLancamento;
		}

		public void setAnoDeLancamento(int anoDeLancamento) {
			this.anoDeLancamento = anoDeLancamento;
		}

		public String getFormato() {
			return formato;
		}

		public void setFormato(String formato) {
			this.formato = formato;
		}

		public int getQtdCopias() {
			return qtdCopias;
		}

		public void setQtdCopias(int qtdCopias) {
			this.qtdCopias = qtdCopias;
		}
		
		public int getNumeroDaCopia() {
			return numeroDaCopia;
		}

		public void setNumeroDaCopia(int numeroDaCopia) {
			this.numeroDaCopia = numeroDaCopia;
		}
		
		//M�todo para adicionar Atores
		
		public void addAtores(String ator)
		{
			this.atoresPrincipais.add(ator);
		}
		
		//M�todo para Mostrar Atores	
		public void mostrarAtores()
		{

			System.out.println(atoresPrincipais.toString());

		}
		
		//Feito o override do m�todo toString na classe Filme, cujo retorno agora ser� uma string composta pelas informa��es referentes ao
		//N�mero de C�pias, T�tulo, Dura��o, Ano de Lan�amento, Formato e Quantidade de C�pias.
		public String toString() {
			return 	"\nC�pia de N�mero: " + numeroDaCopia +
					"\nT�tulo: " + tituloFilme +
					"\nDura��o: " + duracao +
					"\nAno de Lan�amento: " + anoDeLancamento +
					"\nFormato: " + formato +
					"\nQuantidade de C�pias: " + qtdCopias +
					"\nAtores Principais: " + atoresPrincipais;
		}

}
