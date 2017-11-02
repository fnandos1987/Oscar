package br.edu.unidavi.oscar.model;

public enum GeneroFilme {
	
	ACAO(1, "Ação"),
	DRAMA(2, "Drama"),
	COMEDIA(3, "Comédia"),
	ROMANCE(4, "Romance"),
	FANTASIA(5, "Fantasia"),
	SCIFI(6, "Sci-Fi");
	
	private Integer id;
	private String descricao;
	
	GeneroFilme(Integer cod, String desc) {
		this.id = cod;
		this.descricao = desc;
	}

	public Integer getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}
}