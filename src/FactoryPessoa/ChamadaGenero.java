package FactoryPessoa;

import geral.pessoa;

public class ChamadaGenero {

	public static void main(String[] args) {
		pessoa factorypessoa = new pessoa();
		String nome = "Veihmeyer";
		String sexo = "M";
		factorypessoa.getpessoa(nome, sexo);

	}

}
