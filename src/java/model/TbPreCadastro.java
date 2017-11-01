package model;
// Generated 24/10/2017 08:37:48 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TbPreCadastro generated by hbm2java
 */
@Entity
@Table(name="tb_pre_cadastro"
    ,catalog="bd_cadastro_sesc"
)
public class TbPreCadastro  implements java.io.Serializable {


     private Integer idtPreCadastro;
     private TbCadastroGeral tbCadastroGeral;
     private String dtaNasc;
     private String sexo;
     private String estadoCivil;
     private String cep;
     private String endComplemento;
     private String habilitacao;
     private String nmePai;
     private String nmeMae;
     private String rg;
     private String orgaoEmissor;
     private String naturalidade;
     private String nacionalidade;
     private String numCarteiraProf;
     private String profissao;
     private long rendaMensal;
     private String grauInstrucao;
     private String telCelular;
     private String telResidencial;
     private String telComercial;
     private String tipoAssociacao;
     private Set<TbDependente> tbDependentesForCodCpfUsu = new HashSet<TbDependente>(0);
     private Set<TbDependente> tbDependentesForCodPreCadastro = new HashSet<TbDependente>(0);

    public TbPreCadastro() {
    }

	
    public TbPreCadastro(TbCadastroGeral tbCadastroGeral, String dtaNasc, String sexo, String estadoCivil, String cep, String endComplemento, String habilitacao, String nmePai, String nmeMae, String rg, String orgaoEmissor, String naturalidade, String nacionalidade, String numCarteiraProf, String profissao, long rendaMensal, String grauInstrucao, String telCelular, String telResidencial, String telComercial, String tipoAssociacao) {
        this.tbCadastroGeral = tbCadastroGeral;
        this.dtaNasc = dtaNasc;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.cep = cep;
        this.endComplemento = endComplemento;
        this.habilitacao = habilitacao;
        this.nmePai = nmePai;
        this.nmeMae = nmeMae;
        this.rg = rg;
        this.orgaoEmissor = orgaoEmissor;
        this.naturalidade = naturalidade;
        this.nacionalidade = nacionalidade;
        this.numCarteiraProf = numCarteiraProf;
        this.profissao = profissao;
        this.rendaMensal = rendaMensal;
        this.grauInstrucao = grauInstrucao;
        this.telCelular = telCelular;
        this.telResidencial = telResidencial;
        this.telComercial = telComercial;
        this.tipoAssociacao = tipoAssociacao;
    }
    public TbPreCadastro(TbCadastroGeral tbCadastroGeral, String dtaNasc, String sexo, String estadoCivil, String cep, String endComplemento, String habilitacao, String nmePai, String nmeMae, String rg, String orgaoEmissor, String naturalidade, String nacionalidade, String numCarteiraProf, String profissao, long rendaMensal, String grauInstrucao, String telCelular, String telResidencial, String telComercial, String tipoAssociacao, Set<TbDependente> tbDependentesForCodCpfUsu, Set<TbDependente> tbDependentesForCodPreCadastro) {
       this.tbCadastroGeral = tbCadastroGeral;
       this.dtaNasc = dtaNasc;
       this.sexo = sexo;
       this.estadoCivil = estadoCivil;
       this.cep = cep;
       this.endComplemento = endComplemento;
       this.habilitacao = habilitacao;
       this.nmePai = nmePai;
       this.nmeMae = nmeMae;
       this.rg = rg;
       this.orgaoEmissor = orgaoEmissor;
       this.naturalidade = naturalidade;
       this.nacionalidade = nacionalidade;
       this.numCarteiraProf = numCarteiraProf;
       this.profissao = profissao;
       this.rendaMensal = rendaMensal;
       this.grauInstrucao = grauInstrucao;
       this.telCelular = telCelular;
       this.telResidencial = telResidencial;
       this.telComercial = telComercial;
       this.tipoAssociacao = tipoAssociacao;
       this.tbDependentesForCodCpfUsu = tbDependentesForCodCpfUsu;
       this.tbDependentesForCodPreCadastro = tbDependentesForCodPreCadastro;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idt_pre_cadastro", unique=true, nullable=false)
    public Integer getIdtPreCadastro() {
        return this.idtPreCadastro;
    }
    
    public void setIdtPreCadastro(Integer idtPreCadastro) {
        this.idtPreCadastro = idtPreCadastro;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_cpf", nullable=false)
    public TbCadastroGeral getTbCadastroGeral() {
        return this.tbCadastroGeral;
    }
    
    public void setTbCadastroGeral(TbCadastroGeral tbCadastroGeral) {
        this.tbCadastroGeral = tbCadastroGeral;
    }

    
    @Column(name="dta_nasc", nullable=false, length=10)
    public String getDtaNasc() {
        return this.dtaNasc;
    }
    
    public void setDtaNasc(String dtaNasc) {
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

    
    @Column(name="habilitacao", nullable=false, length=2)
    public String getHabilitacao() {
        return this.habilitacao;
    }
    
    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    
    @Column(name="nme_pai", nullable=false, length=50)
    public String getNmePai() {
        return this.nmePai;
    }
    
    public void setNmePai(String nmePai) {
        this.nmePai = nmePai;
    }

    
    @Column(name="nme_mae", nullable=false, length=50)
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

    
    @Column(name="num_carteira_prof", nullable=false, length=45)
    public String getNumCarteiraProf() {
        return this.numCarteiraProf;
    }
    
    public void setNumCarteiraProf(String numCarteiraProf) {
        this.numCarteiraProf = numCarteiraProf;
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

    
    @Column(name="tel_celular", nullable=false, length=45)
    public String getTelCelular() {
        return this.telCelular;
    }
    
    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
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

    
    @Column(name="tipo_associacao", nullable=false, length=2)
    public String getTipoAssociacao() {
        return this.tipoAssociacao;
    }
    
    public void setTipoAssociacao(String tipoAssociacao) {
        this.tipoAssociacao = tipoAssociacao;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbPreCadastroByCodCpfUsu")
    public Set<TbDependente> getTbDependentesForCodCpfUsu() {
        return this.tbDependentesForCodCpfUsu;
    }
    
    public void setTbDependentesForCodCpfUsu(Set<TbDependente> tbDependentesForCodCpfUsu) {
        this.tbDependentesForCodCpfUsu = tbDependentesForCodCpfUsu;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbPreCadastroByCodPreCadastro")
    public Set<TbDependente> getTbDependentesForCodPreCadastro() {
        return this.tbDependentesForCodPreCadastro;
    }
    
    public void setTbDependentesForCodPreCadastro(Set<TbDependente> tbDependentesForCodPreCadastro) {
        this.tbDependentesForCodPreCadastro = tbDependentesForCodPreCadastro;
    }




}

