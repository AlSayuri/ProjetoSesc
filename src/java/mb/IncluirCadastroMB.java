/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mb;

import dao.TbPreCadastroDAO;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import model.TbPreCadastro;

/**
 *
 * @author Matheus Henrique
 */
@ManagedBean
@ViewScoped
public class IncluirCadastroMB {

    private TbPreCadastro cadastro;
    private List<TbPreCadastro> lista;
    
    public IncluirCadastroMB() {
        cadastro = new TbPreCadastro();
    }
    
    public void carregarTabela(){
        TbPreCadastroDAO dao = new TbPreCadastroDAO();
        setLista(dao.consultarTodos());
    }
    
    public void novo(){
        setCadastro(new TbPreCadastro());
    }
    
    public void incluir(){
        TbPreCadastroDAO dao = new TbPreCadastroDAO();
        getCadastro().setIdtPreCadastro(null);
        dao.incluir(getCadastro());
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, 
                "Resultado da inclusão", "Inclusão efetivada na base de dados.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        carregarTabela();
        novo();
    }

    /**
     * @return the cadastro
     */
    public TbPreCadastro getCadastro() {
        return cadastro;
    }

    /**
     * @param cadastro the cadastro to set
     */
    public void setCadastro(TbPreCadastro cadastro) {
        this.cadastro = cadastro;
    }

    /**
     * @return the lista
     */
    public List<TbPreCadastro> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<TbPreCadastro> lista) {
        this.lista = lista;
    }
}
