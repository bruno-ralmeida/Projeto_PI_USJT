package model.bean;

import java.sql.Date;

/**
 *
 * @author Bruno Rocha
 */
public class Contas {

    private int idContas;
    private Date data;
    private float valor;
    private String descricao;
    private Date mesRef;
    private float adiantamento;
    private String status;
    private Funcionario funcionario;
    private CategoriaDespesa catDespesa;

    public Contas() {
    }

    public Contas(int idContas, Date data, float valor, String descricao, Date mesRef, float adiantamento, String status, Funcionario funcionario, CategoriaDespesa catDespesa) {
        this.idContas = idContas;
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
        this.mesRef = mesRef;
        this.adiantamento = adiantamento;
        this.status = status;
        this.funcionario = funcionario;
        this.catDespesa = catDespesa;
    }

    public int getIdContas() {
        return idContas;
    }

    public void setIdContas(int idContas) {
        this.idContas = idContas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getMesRef() {
        return mesRef;
    }

    public void setMesRef(Date mesRef) {
        this.mesRef = mesRef;
    }

    public float getAdiantamento() {
        return adiantamento;
    }

    public void setAdiantamento(float adiantamento) {
        this.adiantamento = adiantamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public CategoriaDespesa getCatDespesa() {
        return catDespesa;
    }

    public void setCatDespesa(CategoriaDespesa catDespesa) {
        this.catDespesa = catDespesa;
    }

}
