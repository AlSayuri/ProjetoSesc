package model;
// Generated 24/10/2017 08:37:48 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TbDependente generated by hbm2java
 */
@Entity
@Table(name="tb_dependente"
    ,catalog="bd_cadastro_sesc"
)
public class TbDependente  implements java.io.Serializable {


     private Integer idtCpfDependente;
     private TbPreCadastro tbPreCadastroByCodCpfUsu;
     private TbPreCadastro tbPreCadastroByCodPreCadastro;
     private String nome;
     private Date dtaNasc;
     private String sexo;
     private String estadoCivil;
     private String parentesco;
     private String cep;
     private String endComplemento;
     private String nmePai;
     private String nmeMae;
     private String rg;
     private String orgaoEmissor;
     private String naturalidade;
     private String nacionalidade;
     private String profissao;
     private long rendaMensal;
     private String grauInstrucao;
     private String telCel;
     private String telResidencial;
     private String telComercial;
     private String email;

    public TbDependente() {
    }

    public TbDependente(TbPreCadastro tbPreCadastroByCodCpfUsu, TbPreCadastro tbPreCadastroByCodPreCadastro, String nome, Date dtaNasc, String sexo, String estadoCivil, String parentesco, String cep, String endComplemento, String nmePai, String nmeMae, String rg, String orgaoEmissor, String naturalidade, String nacionalidade, String profissao, long rendaMensal, String grauInstrucao, String telCel, String telResidencial, String telComercial, String email) {
       this.tbPreCadastroByCodCpfUsu = tbPreCadastroByCodCpfUsu;
       this.tbPreCadastroByCodPreCadastro = tbPreCadastroByCodPreCadastro;
       this.nome = nome;
       this.dtaNasc = dtaNasc;
       this.sexo = sexo;
       this.estadoCivil = estadoCivil;
       this.parentesco = parentesco;
       this.cep = cep;
       this.endComplemento = endComplemento;
       this.nmePai = nmePai;
       this.nmeMae = nmeMae;
       this.rg = rg;
       this.orgaoEmissor = orgaoEmissor;
       this.naturalidade = naturalidade;
       this.nacionalidade = nacionalidade;
       this.profissao = profissao;
       this.rendaMensal = rendaMensal;
       this.grauInstrucao = grauInstrucao;
       this.telCel = telCel;
       this.telResidencial = telResidencial;
       this.telComercial = telComercial;
       this.email = email;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idt_cpf_dependente", unique=true, nullable=false)
    public Integer getIdtCpfDependente() {
        return this.idtCpfDependente;
    }
    
    public void setIdtCpfDependente(Integer idtCpfDependente) {
        this.idtCpfDependente = idtCpfDependente;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_cpf_usu", nullable=false)
    public TbPreCadastro getTbPreCadastroByCodCpfUsu() {
        return this.tbPreCadastroByCodCpfUsu;
    }
    
    public void setTbPreCadastroByCodCpfUsu(TbPreCadastro tbPreCadastroByCodCpfUsu) {
        this.tbPreCadastroByCodCpfUsu = tbPreCadastroByCodCpfUsu;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_pre_cadastro", nullable=false)
    public TbPreCadastro getTbPreCadastroByCodPreCadastro() {
        return this.tbPreCadastroByCodPreCadastro;
    }
    
    public void setTbPreCadastroByCodPreCadastro(TbPreCadastro tbPreCadastroByCodPreCadastro) {
        this.tbPreCadastroByCodPreCadastro = tbPreCadastroByCodPreCadastro;
    }

    
    @Column(name="nome", nullable=false, length=100)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dta_nasc", nullable=false, length=10)
    public Date getDtaNasc() {
        return this.dtaNasc;
    }
    
    public void setDtaNasc(Date dtaNasc) {
        this.dtaNasc = dtaNasc;
    }

    
    @Column(name="sexo", nullable=false, length=1)
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    @Column(name="estado_civil", nullable=false, length=2)
    public String getEstadoCivil() {
        return this.estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    
    @Column(name="parentesco", nullable=false, length=2)
    public String getParentesco() {
        return this.parentesco;
    }
    
    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    
    @Column(name="cep", nullable=false, length=20)
    public String getCep() {
        return this.cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }

    
    @Column(name="end_complemento", nullable=false, length=100)
    public String getEndComplemento() {
        return this.endComplemento;
    }
    
    public void setEndComplemento(String endComplemento) {
        this.endComplemento = endComplemento;
    }

    
    @Column(name="nme_pai", nullable=false, length=100)
    public String getNmePai() {
        return this.nmePai;
    }
    
    public void setNmePai(String nmePai) {
        this.nmePai = nmePai;
    }

    
    @Column(name="nme_mae", nullable=false, length=45)
    public String getNmeMae() {
        return this.nmeMae;
    }
    
    public void setNmeMae(String nmeMae) {
        this.nmeMae = nmeMae;
    }

    
    @Column(name="rg", nullable=false, length=45)
    public String getRg() {
        return this.rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }

    
    @Column(name="orgao_emissor", nullable=false, length=45)
    public String getOrgaoEmissor() {
        return this.orgaoEmissor;
    }
    
    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    
    @Column(name="naturalidade", nullable=false, length=45)
    public String getNaturalidade() {
        return this.naturalidade;
    }
    
    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    
    @Column(name="nacionalidade", nullable=false, length=45)
    public String getNacionalidade() {
        return this.nacionalidade;
    }
    
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    
    @Column(name="profissao", nullable=false, length=45)
    public String getProfissao() {
        return this.profissao;
    }
    
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    
    @Column(name="renda_mensal", nullable=false, precision=10, scale=0)
    public long getRendaMensal() {
        return this.rendaMensal;
    }
    
    public void setRendaMensal(long rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    
    @Column(name="grau_instrucao", nullable=false, length=2)
    public String getGrauInstrucao() {
        return this.grauInstrucao;
    }
    
    public void setGrauInstrucao(String grauInstrucao) {
        this.grauInstrucao = grauInstrucao;
    }

    
    @Column(name="tel_cel", nullable=false, length=45)
    public String getTelCel() {
        return this.telCel;
    }
    
    public void setTelCel(String telCel) {
        this.telCel = telCel;
    }

    
    @Column(name="tel_residencial", nullable=false, length=45)
    public String getTelResidencial() {
        return this.telResidencial;
    }
    
    public void setTelResidencial(String telResidencial) {
        this.telResidencial = telResidencial;
    }

    
    @Column(name="tel_comercial", nullable=false, length=45)
    public String getTelComercial() {
        return this.telComercial;
    }
    
    public void setTelComercial(String telComercial) {
        this.telComercial = telComercial;
    }

    
    @Column(name="email", nullable=false, length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }




}

