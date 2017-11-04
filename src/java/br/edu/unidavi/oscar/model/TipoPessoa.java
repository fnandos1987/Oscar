package br.edu.unidavi.oscar.model;

public enum TipoPessoa {

    ATORPRINCIPAL(1, "Ator Principal"),
    ATORCOADJUVANTE(2, "Ator Coadjuvante"),
    ATRIZPRINCIPAL(3, "Atriz Principal"),
    ATRIZCOADJUVANTE(4, "Atriz Coadjuvante"),
    DIRETOR(5, "Diretor"),
    UNKNOWN(0, "Desconhecido");

    private Integer id;
    private String descricao;

    TipoPessoa(Integer cod, String desc) {
        this.id = cod;
        this.descricao = desc;
    }
    
    public static TipoPessoa getById(Integer id) {
        for (TipoPessoa e : values()) {
            if (e.id.equals(id)) {
                return e;
            }
        }
        return UNKNOWN;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}