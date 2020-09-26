package FactoryPessoa;

import geral.Homem;
import geral.Mulher;
import geral.SemGenere;

public class Pessoa {

	public Pessoa getPessoa(String nome, String sexo) {
			if (sexo.equals("M"))
				return new Homem(nome);
			else if (sexo.equals("F"))
				return new Mulher (nome);
			else if (sexo.equals("S"))
				return new SemGenere;
		}

}
