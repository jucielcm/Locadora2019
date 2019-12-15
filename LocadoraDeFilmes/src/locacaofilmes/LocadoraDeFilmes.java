package locacaofilmes;

import java.util.ArrayList;

public class LocadoraDeFilmes {
	ArrayList<Socio> listaSocios = new ArrayList<>();
	ArrayList<Filme> listaFilmes = new ArrayList<>();
	
	//Método para Cadastrar Sócio
	
	public void cadastrarSocio(Socio socio)
	{
		//listaSocios.add(socio);//Adicionar Sócio
		listaSocios.add(socio);//Adicionar Sócio
	}
	//Método para busca de Sócio
	public Socio buscarSocio(String cpf)
	{
		for(Socio socio : listaSocios)
		{
			if(socio.getCpf().equals(cpf))//É através deste método que são feitas as verificações de igualdade entre os objetos
			{
				System.out.print("\n______________________________________________________________________________________________________________________________________________________________________________________________________________\n");
				System.out.print("\nSócio Encontrado..." + "\n" + socio);
				return socio;
			}
		}
		System.out.print("\n______________________________________________________________________________________________________________________________________________________________________________________________________________\n");
		System.out.println("\nSócio Não Cadastrado...");
		return null;
	}
	
	//Método para Cadastrar Filme
	public void cadastrarFilme(Filme filme)
	{
		listaFilmes.add(filme);//Adicionar Filme
	}
	
	//Método para encontrar Filme
	public Filme buscarFilme(String tituloFilme)
	{
		for(Filme filme : listaFilmes)
		{
			if(filme.getTituloFilme().equals(tituloFilme))//É através deste método que são feitas as verificações de igualdade entre os objetos
			{
				System.out.print("\n______________________________________________________________________________________________________________________________________________________________________________________________________________\n");
				System.out.print("\nFilme Encontrado..." + "\n" + filme);
				System.out.print("\n______________________________________________________________________________________________________________________________________________________________________________________________________________\n");
				System.out.println("\nCópias Disponíveis: " + filme.getQtdCopias());
				System.out.print("\n______________________________________________________________________________________________________________________________________________________________________________________________________________\n");
				return filme;
			}
		}
		System.out.print("\n______________________________________________________________________________________________________________________________________________________________________________________________________________\n");
		System.out.println("\nFilme Não Consta Na Lista...");
		return null;
	}


}
