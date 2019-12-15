package locacaofilmes;

import java.util.ArrayList;

public class Filme {
	//O modificador private deixará visível o atributo apenas para a classe em que este atributo se encontra.
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
		
		//Métodos gets e seters
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
		
		//Método para adicionar Atores
		
		public void addAtores(String ator)
		{
			this.atoresPrincipais.add(ator);
		}
		
		//Método para Mostrar Atores	
		public void mostrarAtores()
		{

			System.out.println(atoresPrincipais.toString());

		}
		
		//Feito o override do método toString na classe Filme, cujo retorno agora será uma string composta pelas informações referentes ao
		//Número de Cópias, Título, Duração, Ano de Lançamento, Formato e Quantidade de Cópias.
		public String toString() {
			return 	"\nCópia de Número: " + numeroDaCopia +
					"\nTítulo: " + tituloFilme +
					"\nDuração: " + duracao +
					"\nAno de Lançamento: " + anoDeLancamento +
					"\nFormato: " + formato +
					"\nQuantidade de Cópias: " + qtdCopias +
					"\nAtores Principais: " + atoresPrincipais;
		}

}
