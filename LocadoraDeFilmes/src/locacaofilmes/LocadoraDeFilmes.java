package locacaofilmes;

import java.util.ArrayList;

public class LocadoraDeFilmes {
	ArrayList<Socio> listaSocios = new ArrayList<>();
	ArrayList<Filme> listaFilmes = new ArrayList<>();
	
	//M�todo para Cadastrar S�cio
	
	public void cadastrarSocio(Socio socio)
	{
		//listaSocios.add(socio);//Adicionar S�cio
		listaSocios.add(socio);//Adicionar S�cio
	}
	//M�todo para busca de S�cio
	public Socio buscarSocio(String cpf)
	{
		for(Socio socio : listaSocios)
		{
			if(socio.getCpf().equals(cpf))//� atrav�s deste m�todo que s�o feitas as verifica��es de igualdade entre os objetos
			{
				System.out.print("\n______________________________________________________________________________________________________________________________________________________________________________________________________________\n");
				System.out.print("\nS�cio Encontrado..." + "\n" + socio);
				return socio;
			}
		}
		System.out.print("\n______________________________________________________________________________________________________________________________________________________________________________________________________________\n");
		System.out.println("\nS�cio N�o Cadastrado...");
		return null;
	}
	
	//M�todo para Cadastrar Filme
	public void cadastrarFilme(Filme filme)
	{
		listaFilmes.add(filme);//Adicionar Filme
	}
	
	//M�todo para encontrar Filme
	public Filme buscarFilme(String tituloFilme)
	{
		for(Filme filme : listaFilmes)
		{
			if(filme.getTituloFilme().equals(tituloFilme))//� atrav�s deste m�todo que s�o feitas as verifica��es de igualdade entre os objetos
			{
				System.out.print("\n______________________________________________________________________________________________________________________________________________________________________________________________________________\n");
				System.out.print("\nFilme Encontrado..." + "\n" + filme);
				System.out.print("\n______________________________________________________________________________________________________________________________________________________________________________________________________________\n");
				System.out.println("\nC�pias Dispon�veis: " + filme.getQtdCopias());
				System.out.print("\n______________________________________________________________________________________________________________________________________________________________________________________________________________\n");
				return filme;
			}
		}
		System.out.print("\n______________________________________________________________________________________________________________________________________________________________________________________________________________\n");
		System.out.println("\nFilme N�o Consta Na Lista...");
		return null;
	}


}
