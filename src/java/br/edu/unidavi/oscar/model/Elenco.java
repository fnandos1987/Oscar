package br.edu.unidavi.oscar.model;

import java.io.Serializable;

/**
 * Model class of elenco.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Elenco implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** pessoa. */
	private Pessoa pessoa;

	/** filme. */
	private Filme filme;

	/** categoria. */
	private Short categoria;

	/**
	 * Constructor.
	 */
	public Elenco() {
	}

	public Elenco(Pessoa pessoa, Filme filme, Short categoria) {
		super();
		this.pessoa = pessoa;
		this.filme = filme;
		this.categoria = categoria;
	}


	/**
	 * Set the pessoa.
	 * 
	 * @param pessoa
	 *            pessoa
	 */
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	/**
	 * Get the pessoa.
	 * 
	 * @return pessoa
	 */
	public Pessoa getPessoa() {
		return this.pessoa;
	}

	/**
	 * Set the filme.
	 * 
	 * @param filme
	 *            filme
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

	/**
	 * Set the categoria.
	 * 
	 * @param categoria
	 *            categoria
	 */
	public void setCategoria(Short categoria) {
		this.categoria = categoria;
	}

	/**
	 * Get the categoria.
	 * 
	 * @return categoria
	 */
	public Short getCategoria() {
		return this.categoria;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
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
		Elenco other = (Elenco) obj;
		if (pessoa == null) {
			if (other.pessoa != null) {
				return false;
			}
		} else if (!pessoa.equals(other.pessoa)) {
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
