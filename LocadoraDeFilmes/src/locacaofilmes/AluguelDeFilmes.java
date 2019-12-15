package locacaofilmes;

import java.util.ArrayList;

public class AluguelDeFilmes {
	Socio socio;
	ArrayList<Filme> filmesAlugados = new ArrayList<>();
	
	//O Construtor de AluguelDeFilmes rebendo como argumentos da classe Socio e objeto socio, classe Filme e objeto filme
	public AluguelDeFilmes(Socio socio, Filme filme)
	{
		this.socio = socio;
		this.filmesAlugados.add(filme);
	}
	
	//Os métodos gets e seters
	public String getNome()
	{
		return this.socio.getNome();
	}
	
	public String getCpf()
	{
		return this.socio.getCpf();
	}
	
	public Socio getSocio()
	{
		return socio;
	}
	
	public void setSocio(Socio socio)
	{
		this.socio = socio;
	}
	
	public ArrayList<Filme> getFilme()
	{
		return this.filmesAlugados;
	}
	
	//Método para adicionar Filme
	public void adicionaFilme(Filme filme)
	{
		this.filmesAlugados.add(filme);
	}
	
	//Método para Listar e Imprimir o Filme Alugado
	public void listaAlugados()
	{
		System.out.println("\n___________________Filme Alugado_______________________________________________________________________________________________________________________________________________________________________________");
		for(Filme filme : filmesAlugados)
		{
			System.out.print("\nTítulo: " + filme.getTituloFilme() + 
								" - Número da Cópia: " + filme.getNumeroDaCopia() + 
								"\nAlugado por: " + socio.getNome() + "\n");
		}
	}

}
