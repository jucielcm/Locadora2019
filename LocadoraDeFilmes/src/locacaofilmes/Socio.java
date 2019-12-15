package locacaofilmes;

import java.util.Date;

public class Socio {
	//O modificador private deixará visível o atributo apenas para a classe em que este atributo se encontra.
		private String nome;
		private String endereco;
		private int telefone;
		private int rg;
		private String cpf;
		private Date dataDeAdesao;
		
		//O Construtor da classe Sócio com argumentos
		public Socio(String nome, String endereco, int telefone, int rg, String cpf, Date dataDeAdesao)
		{
			this.nome = nome;
			this.endereco = endereco;
			this.telefone = telefone;
			this.rg = rg;
			this.cpf = cpf;
			this.dataDeAdesao = dataDeAdesao;
		}
		
		//Os métodos gets e seters

		public String getNome()
		{
			return nome;
		}

		public void setNome(String nome)
		{
			this.nome = nome;
		}

		public String getEndereco()
		{
			return endereco;
		}

		public void setEndereco(String endereco)
		{
			this.endereco = endereco;
		}

		public int getTelefone()
		{
			return telefone;
		}

		public void setTelefone(int telefone)
		{
			this.telefone = telefone;
		}

		public int getRg()
		{
			return rg;
		}

		public void setRg(int rg)
		{
			this.rg = rg;
		}

		public String getCpf()
		{
			return cpf;
		}

		public void setCpf(String cpf)
		{
			this.cpf = cpf;
		}

		public Date getDataDeAdesao()
		{
			return dataDeAdesao;
		}

		public void setDataDeAdesao(Date dataDeAdesao)
		{
			this.dataDeAdesao = dataDeAdesao;
		}
		
		//Feito o override do método toString na classe Sócio, cujo retorno agora será uma string composta pelas informações referentes ao
		//Nome, Endereço, Telefone, RG, CPF e Data de Adesão.
		
		public String toString()
		{
			return "\nNome: " + nome +
					"\nEndereço: " + endereco +
					"\nTelefone: " + telefone +
					"\nRG: " + rg +
					"\nCPF: " + cpf +
					"\nData de Adesão: " + dataDeAdesao;
		}
}
