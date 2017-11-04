package br.edu.unidavi.oscar.model;

import java.io.Serializable;
import java.util.Set;

/**
 * Model class of indicacao.
 *
 * @author fernando.schwambach
 */
public class Indicacao implements Serializable {

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * ano
     */
    private Short ano;

    /**
     * categoria.
     */
    private Categoria categoria;

    /**
     * filme.
     */
    private Filme filme;
    
    /**
     * pessoa
     */
    private Pessoa pessoa;

    /**
     * The set of vencedor.
     */
    private Set<Vencedor> vencedorSet;

    /**
     * Constructor.
     */
    public Indicacao() {

    }

    public Indicacao(Short ano, Categoria categoria, Filme filme, Pessoa pessoa) {
        this.ano = ano;
        this.categoria = categoria;
        this.filme = filme;
        this.pessoa = pessoa;
    }

    /**
     * Set the categoria.
     *
     * @param categoria categoria
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * Get the categoria.
     *
     * @return categoria
     */
    public Categoria getCategoria() {
        return this.categoria;
    }

    /**
     * Set the filme.
     *
     * @param filme filme
     */
    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    /**
     * Get the filme.
     *
     * @return filme
     */
    public Filme getFilme() {
        return this.filme;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }   
    

    /**
     * Set the set of the vencedor.
     *
     * @param vencedorSet The set of vencedor
     */
    public void setVencedorSet(Set<Vencedor> vencedorSet) {
        this.vencedorSet = vencedorSet;
    }

    /**
     * Add the vencedor.
     *
     * @param vencedor vencedor
     */
    public void addVencedor(Vencedor vencedor) {
        this.vencedorSet.add(vencedor);
    }

    /**
     * Get the set of the vencedor.
     *
     * @return The set of vencedor
     */
    public Set<Vencedor> getVencedorSet() {
        return this.vencedorSet;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
        result = prime * result + ((filme == null) ? 0 : filme.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Indicacao other = (Indicacao) obj;
        if (categoria == null) {
            if (other.categoria != null) {
                return false;
            }
        } else if (!categoria.equals(other.categoria)) {
            return false;
        }
        if (filme == null) {
            if (other.filme != null) {
                return false;
            }
        } else if (!filme.equals(other.filme)) {
            return false;
        }
        return true;
    }

}
