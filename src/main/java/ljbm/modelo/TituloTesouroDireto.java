package ljbm.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Titulo Tesouro Direto entity
 * 
 * @author ljbm
 * @since 11/10/2016
 * 
 * 
 */
@Entity
@Table(name = "TituloTesouroDireto", uniqueConstraints = @UniqueConstraint(columnNames = "nome"))
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TituloTesouroDireto implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3103724308106479608L;

//	public enum Tipo {
//
//		IndexadoIPCA, Prefixado, IndexadoTaxaSELIC, IndexadosIGPM
//	}

	private Long id;
	private Integer version;
	private String nome;
	private String tipo;

	public TituloTesouroDireto() {
		// The no-arg constructor required by JPA
	}

//	public TituloTesouroDireto(String nome, Tipo tipo) {
//		this.nome = nome;
//		this.tipo = tipo.ordinal();
//	}

	@Id
//	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "IDE", nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Version
	@Column(name = "versaoregistro")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "nome", nullable = false, length = 70)
	@NotNull
	@Size(min = 15, max = 70)
//	@Pattern(regexp = "[A-Za-z0-9 ]*", message = "deve conter letras numeros e espaços")
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "tipo", nullable = false)
	@NotNull
//	public Tipo getTipo() {
	public String getTipo() {		
//		return Tipo.values()[Integer.parseInt(this.tipo)];
		return this.tipo;
	}

//	public void setTipo(Tipo tipo) {
//		this.tipo = String.valueOf(tipo.ordinal());
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
//	@Override
//	public String toString() {
//		return "TituloTesouroDireto \n\t[id=" + id + ", \n\tnome=" + nome + ", \n\tipo=" + tipo + ", \n\tversion="
//				+ version + "]";
//	}

}
