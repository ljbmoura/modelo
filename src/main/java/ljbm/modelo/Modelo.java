package ljbm.modelo;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "ProtocoloCompraTD")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Modelo implements java.io.Serializable {

	private static final long serialVersionUID = 3658706407652333732L;

	@Id
	@Column(nullable = false)
	@XmlElement
	private Long numero;

	@Column(nullable = false, length = 40)
	@NotNull
	@Size(min = 5, max = 40)
	@XmlElement
	private String agente;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	// @NotNull
	@XmlElement
	private Calendar dataRealizacao;

	@Column(nullable = true)
	@Temporal(TemporalType.TIMESTAMP)
	@XmlElement
	private Calendar dataLiquidacao;

	@Column(nullable = false, length = 50)
	// @NotNull
	@XmlElement
	@Size(min = 10, max = 50)
	private String titulo;

	@Column(nullable = false)
	@XmlElement
	private Integer quantidade;

	@Column(nullable = false, precision = 19, scale = 2)
	// @NotNull
	@XmlElement
	private BigDecimal valorUnitario; // (R$)

	@Column(nullable = false, precision = 8, scale = 2)
	// @NotNull
	@XmlElement
	private BigDecimal taxaJurosPactuada; // (% ao ano)

	@Column(nullable = false, precision = 19, scale = 2)
	// @NotNull
	@XmlElement
	private BigDecimal taxaBMFBOVESPA; // (R$)

	@Column(nullable = false, precision = 19, scale = 2)
	// @NotNull
	@XmlElement
	private BigDecimal taxaCustodia; // (R$)

	public Modelo(Long numero, String agente, Calendar dataRealizacao, Calendar dataLiquidacao, String titulo,
			Integer quantidade, BigDecimal valorUnitario, BigDecimal taxaJurosPactuada, BigDecimal taxaBMFBOVESPA,
			BigDecimal taxaCustodia, BigDecimal valorTotal) {
		super();
		this.numero = numero;
		this.agente = agente;
		this.dataRealizacao = dataRealizacao;
		this.dataLiquidacao = dataLiquidacao;
		this.titulo = titulo;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.taxaJurosPactuada = taxaJurosPactuada;
		this.taxaBMFBOVESPA = taxaBMFBOVESPA;
		this.taxaCustodia = taxaCustodia;
	}

	public Modelo() {
		// construtor sem argumentos exigido pela JPA
	}

	public Long getNumero() {
		return numero;
	}

	public String getAgente() {
		return agente;
	}

	public Calendar getDataRealizacao() {
		return dataRealizacao;
	}

	public Calendar getDataLiquidacao() {
		return dataLiquidacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public BigDecimal getTaxaJurosPactuada() {
		return taxaJurosPactuada;
	}

	public BigDecimal getTaxaBMFBOVESPA() {
		return taxaBMFBOVESPA;
	}

	public BigDecimal getTaxaCustodia() {
		return taxaCustodia;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public void setAgente(String agente) {
		this.agente = agente;
	}

	public void setDataRealizacao(Calendar dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}

	public void setDataLiquidacao(Calendar dataLiquidacao) {
		this.dataLiquidacao = dataLiquidacao;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public void setTaxaJurosPactuada(BigDecimal taxaJurosPactuada) {
		this.taxaJurosPactuada = taxaJurosPactuada;
	}

	public void setTaxaBMFBOVESPA(BigDecimal taxaBMFBOVESPA) {
		this.taxaBMFBOVESPA = taxaBMFBOVESPA;
	}

	public void setTaxaCustodia(BigDecimal taxaCustodia) {
		this.taxaCustodia = taxaCustodia;
	}

	// @Transient
	// public BigDecimal getValorTotal() {
	//
	// return
	// this.valorUnitario.add(this.taxaCustodia).add(this.taxaBMFBOVESPA);
	// }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agente == null) ? 0 : agente.hashCode());
		result = prime * result + ((dataLiquidacao == null) ? 0 : dataLiquidacao.hashCode());
		result = prime * result + ((dataRealizacao == null) ? 0 : dataRealizacao.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((quantidade == null) ? 0 : quantidade.hashCode());
		result = prime * result + ((taxaBMFBOVESPA == null) ? 0 : taxaBMFBOVESPA.hashCode());
		result = prime * result + ((taxaCustodia == null) ? 0 : taxaCustodia.hashCode());
		result = prime * result + ((taxaJurosPactuada == null) ? 0 : taxaJurosPactuada.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result + ((valorUnitario == null) ? 0 : valorUnitario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Modelo other = (Modelo) obj;
		if (agente == null) {
			if (other.agente != null)
				return false;
		} else if (!agente.equals(other.agente))
			return false;
		if (dataLiquidacao == null) {
			if (other.dataLiquidacao != null)
				return false;
		} else if (!dataLiquidacao.equals(other.dataLiquidacao))
			return false;
		if (dataRealizacao == null) {
			if (other.dataRealizacao != null)
				return false;
		} else if (!dataRealizacao.equals(other.dataRealizacao))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		if (taxaBMFBOVESPA == null) {
			if (other.taxaBMFBOVESPA != null)
				return false;
		} else if (!taxaBMFBOVESPA.equals(other.taxaBMFBOVESPA))
			return false;
		if (taxaCustodia == null) {
			if (other.taxaCustodia != null)
				return false;
		} else if (!taxaCustodia.equals(other.taxaCustodia))
			return false;
		if (taxaJurosPactuada == null) {
			if (other.taxaJurosPactuada != null)
				return false;
		} else if (!taxaJurosPactuada.equals(other.taxaJurosPactuada))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		if (valorUnitario == null) {
			if (other.valorUnitario != null)
				return false;
		} else if (!valorUnitario.equals(other.valorUnitario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Modelo [numero=" + numero + ", agente=" + agente + ", dataRealizacao=" + dataRealizacao
				+ ", dataLiquidacao=" + dataLiquidacao + ", titulo=" + titulo + ", quantidade=" + quantidade
				+ ", valorUnitario=" + valorUnitario + ", taxaJurosPactuada=" + taxaJurosPactuada + ", taxaBMFBOVESPA="
				+ taxaBMFBOVESPA + ", taxaCustodia=" + taxaCustodia + "]";
	}

	public static Modelo vazio() {
		return new Modelo();
	}

}
