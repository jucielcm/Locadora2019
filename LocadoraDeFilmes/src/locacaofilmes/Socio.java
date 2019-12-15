package locacaofilmes;

import java.util.Date;

public class Socio {
	//O modificador private deixar� vis�vel o atributo apenas para a classe em que este atributo se encontra.
		private String nome;
		private String endereco;
		private int telefone;
		private int rg;
		private String cpf;
		private Date dataDeAdesao;
		
		//O Construtor da classe S�cio com argumentos
		public Socio(String nome, String endereco, int telefone, int rg, String cpf, Date dataDeAdesao)
		{
			this.nome = nome;
			this.endereco = endereco;
			this.telefone = telefone;
			this.rg = rg;
			this.cpf = cpf;
			this.dataDeAdesao = dataDeAdesao;
		}
		
		//Os m�todos gets e seters

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
		
		//Feito o override do m�todo toString na classe S�cio, cujo retorno agora ser� uma string composta pelas informa��es referentes ao
		//Nome, Endere�o, Telefone, RG, CPF e Data de Ades�o.
		
		public String toString()
		{
			return "\nNome: " + nome +
					"\nEndere�o: " + endereco +
					"\nTelefone: " + telefone +
					"\nRG: " + rg +
					"\nCPF: " + cpf +
					"\nData de Ades�o: " + dataDeAdesao;
		}
}
