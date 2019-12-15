package testlocadora;

import java.util.Date;

import locacaofilmes.AluguelDeFilmes;
import locacaofilmes.Filme;
import locacaofilmes.LocadoraDeFilmes;
import locacaofilmes.Socio;

///Trabalho feito por Juciel e Rodolfo...

public class App {

	public static void main(String[] args) {
		
		Date data= new Date();

		Socio socio1 = new Socio("Juciel", "Rua A", 31313232, 112233, "111.111.111-22", data);
		Socio socio2 = new Socio("Rodolfo", "Rua B", 31313131, 112222, "111.111.111-33", data);
		Socio socio3 = new Socio("Diego", "Rua C", 31313333, 111333, "111.111.111-44", data);
		
		LocadoraDeFilmes lista1 = new LocadoraDeFilmes();
		
		//Cadastrar Sócio
		lista1.cadastrarSocio(socio1);
		lista1.cadastrarSocio(socio2);
		lista1.cadastrarSocio(socio3);
		//Imprime o Sócio Cadastrado
		System.out.print("\n______________________________________________________________________________________________________________________________________________________________________________________________________________\n");
		System.out.println("Sócio Cadastrado Com Sucesso");
		System.out.println(socio1);
		System.out.println(socio2);
		System.out.println(socio3);
		
		Filme filme1 = new Filme("Os Anjos", "1h 45m", 2007, "AVI", 3, 1);//Filme que serar cadastrado
		filme1.addAtores("\nTom Cruise" + "\nAna Jolie" + "\nBruce Lee");//Principais Atores do Filme
		Filme filme2 = new Filme("Os Pangares", "2h 55m", 2010, "AVI", 4, 1);//Filme que serar cadastrado
		filme2.addAtores("\nLula" + "\nDilma" + "\nMichel Temer");//Principais Atores do Filme
		Filme filme3 = new Filme("Os Bolsonista", "1h 59m", 2019, "AVI", 5, 1);//Filme que serar cadastrado
		filme3.addAtores("\nGalvão" + "\nAna Maria" + "\nFátima");//Principais Atores do Filme
		
		System.out.print("\n______________________________________________________________________________________________________________________________________________________________________________________________________________\n");
		System.out.println("\nFilme Cadastrado Com Sucesso\n");
		lista1.cadastrarFilme(filme1);//Cadastrar Filme
		System.out.println(filme1);//Imprime o Filme
		lista1.cadastrarFilme(filme2);//Cadastrar Filme
		System.out.println(filme2);//Imprime o Filme
		lista1.cadastrarFilme(filme3);//Cadastrar Filme
		System.out.println(filme3);//Imprime o Filme
		
						
		AluguelDeFilmes alugado1 = new AluguelDeFilmes(socio1, filme1);
		AluguelDeFilmes alugado2 = new AluguelDeFilmes(socio2, filme2);
		AluguelDeFilmes alugado3 = new AluguelDeFilmes(socio2, filme3);
		
		alugado1.listaAlugados();
		alugado2.listaAlugados();
		alugado3.listaAlugados();
        
	}

}

//Trabalho feito por Juciel e Rodolfo...
