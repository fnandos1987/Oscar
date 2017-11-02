package br.edu.unidavi.oscar.model;

public enum TipoPessoa {

    ATORPRINCIPAL(1, "Ator Principal"),
    ATORCOADJUVANTE(2, "Ator Coadjuvante"),
    ATRIZPRINCIPAL(3, "Atriz Principal"),
    ATRIZCOADJUVANTE(4, "Atriz Coadjuvante"),
    DIRETOR(5, "Diretor");

    private Integer id;
    private String descricao;

    TipoPessoa(Integer cod, String desc) {
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
