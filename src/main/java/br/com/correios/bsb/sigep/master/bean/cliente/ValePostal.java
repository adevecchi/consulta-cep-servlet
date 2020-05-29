/**
 * ValePostal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class ValePostal  implements java.io.Serializable {
    private java.lang.String cidNoCidade;

    private java.lang.String ctcCoAadministrativo;

    private java.lang.Long ctcNuContrato;

    private java.lang.Long ctcNuContratoEct;

    private java.lang.String cvpEdBairro;

    private java.lang.String cvpEdCliente;

    private java.lang.String cvpEdComplemento;

    private java.lang.String cvpEdNumero;

    private java.lang.String cvpNoCliente;

    private java.lang.Long cvpNuCep;

    private java.lang.String descricaoErro;

    private java.lang.String estSgEstado;

    private int monVarTarifaAdicional;

    private int monVarTarifaServico;

    private int monVarValorDescontos;

    private int monVarValorImposto;

    private java.lang.Long prsCoProdutoServico;

    private java.lang.Long pveNu;

    private java.lang.Long pveOrgNuAgencia;

    private java.lang.Long pveOrgNuAgenciaDes;

    private java.lang.Long pveOrgNuAgenciaOri;

    private int retornaCodErro;

    private java.lang.String sitNoSituacao;

    private java.lang.String tlgTxDescricao;

    private java.util.Calendar vapDhTransacao;

    private java.lang.String vapNuEtiquetaEncomenda;

    private java.lang.Double vapVrCobradoEct;

    private java.lang.Double vapVrNominal;

    public ValePostal() {
    }

    public ValePostal(
           java.lang.String cidNoCidade,
           java.lang.String ctcCoAadministrativo,
           java.lang.Long ctcNuContrato,
           java.lang.Long ctcNuContratoEct,
           java.lang.String cvpEdBairro,
           java.lang.String cvpEdCliente,
           java.lang.String cvpEdComplemento,
           java.lang.String cvpEdNumero,
           java.lang.String cvpNoCliente,
           java.lang.Long cvpNuCep,
           java.lang.String descricaoErro,
           java.lang.String estSgEstado,
           int monVarTarifaAdicional,
           int monVarTarifaServico,
           int monVarValorDescontos,
           int monVarValorImposto,
           java.lang.Long prsCoProdutoServico,
           java.lang.Long pveNu,
           java.lang.Long pveOrgNuAgencia,
           java.lang.Long pveOrgNuAgenciaDes,
           java.lang.Long pveOrgNuAgenciaOri,
           int retornaCodErro,
           java.lang.String sitNoSituacao,
           java.lang.String tlgTxDescricao,
           java.util.Calendar vapDhTransacao,
           java.lang.String vapNuEtiquetaEncomenda,
           java.lang.Double vapVrCobradoEct,
           java.lang.Double vapVrNominal) {
           this.cidNoCidade = cidNoCidade;
           this.ctcCoAadministrativo = ctcCoAadministrativo;
           this.ctcNuContrato = ctcNuContrato;
           this.ctcNuContratoEct = ctcNuContratoEct;
           this.cvpEdBairro = cvpEdBairro;
           this.cvpEdCliente = cvpEdCliente;
           this.cvpEdComplemento = cvpEdComplemento;
           this.cvpEdNumero = cvpEdNumero;
           this.cvpNoCliente = cvpNoCliente;
           this.cvpNuCep = cvpNuCep;
           this.descricaoErro = descricaoErro;
           this.estSgEstado = estSgEstado;
           this.monVarTarifaAdicional = monVarTarifaAdicional;
           this.monVarTarifaServico = monVarTarifaServico;
           this.monVarValorDescontos = monVarValorDescontos;
           this.monVarValorImposto = monVarValorImposto;
           this.prsCoProdutoServico = prsCoProdutoServico;
           this.pveNu = pveNu;
           this.pveOrgNuAgencia = pveOrgNuAgencia;
           this.pveOrgNuAgenciaDes = pveOrgNuAgenciaDes;
           this.pveOrgNuAgenciaOri = pveOrgNuAgenciaOri;
           this.retornaCodErro = retornaCodErro;
           this.sitNoSituacao = sitNoSituacao;
           this.tlgTxDescricao = tlgTxDescricao;
           this.vapDhTransacao = vapDhTransacao;
           this.vapNuEtiquetaEncomenda = vapNuEtiquetaEncomenda;
           this.vapVrCobradoEct = vapVrCobradoEct;
           this.vapVrNominal = vapVrNominal;
    }


    /**
     * Gets the cidNoCidade value for this ValePostal.
     * 
     * @return cidNoCidade
     */
    public java.lang.String getCidNoCidade() {
        return cidNoCidade;
    }


    /**
     * Sets the cidNoCidade value for this ValePostal.
     * 
     * @param cidNoCidade
     */
    public void setCidNoCidade(java.lang.String cidNoCidade) {
        this.cidNoCidade = cidNoCidade;
    }


    /**
     * Gets the ctcCoAadministrativo value for this ValePostal.
     * 
     * @return ctcCoAadministrativo
     */
    public java.lang.String getCtcCoAadministrativo() {
        return ctcCoAadministrativo;
    }


    /**
     * Sets the ctcCoAadministrativo value for this ValePostal.
     * 
     * @param ctcCoAadministrativo
     */
    public void setCtcCoAadministrativo(java.lang.String ctcCoAadministrativo) {
        this.ctcCoAadministrativo = ctcCoAadministrativo;
    }


    /**
     * Gets the ctcNuContrato value for this ValePostal.
     * 
     * @return ctcNuContrato
     */
    public java.lang.Long getCtcNuContrato() {
        return ctcNuContrato;
    }


    /**
     * Sets the ctcNuContrato value for this ValePostal.
     * 
     * @param ctcNuContrato
     */
    public void setCtcNuContrato(java.lang.Long ctcNuContrato) {
        this.ctcNuContrato = ctcNuContrato;
    }


    /**
     * Gets the ctcNuContratoEct value for this ValePostal.
     * 
     * @return ctcNuContratoEct
     */
    public java.lang.Long getCtcNuContratoEct() {
        return ctcNuContratoEct;
    }


    /**
     * Sets the ctcNuContratoEct value for this ValePostal.
     * 
     * @param ctcNuContratoEct
     */
    public void setCtcNuContratoEct(java.lang.Long ctcNuContratoEct) {
        this.ctcNuContratoEct = ctcNuContratoEct;
    }


    /**
     * Gets the cvpEdBairro value for this ValePostal.
     * 
     * @return cvpEdBairro
     */
    public java.lang.String getCvpEdBairro() {
        return cvpEdBairro;
    }


    /**
     * Sets the cvpEdBairro value for this ValePostal.
     * 
     * @param cvpEdBairro
     */
    public void setCvpEdBairro(java.lang.String cvpEdBairro) {
        this.cvpEdBairro = cvpEdBairro;
    }


    /**
     * Gets the cvpEdCliente value for this ValePostal.
     * 
     * @return cvpEdCliente
     */
    public java.lang.String getCvpEdCliente() {
        return cvpEdCliente;
    }


    /**
     * Sets the cvpEdCliente value for this ValePostal.
     * 
     * @param cvpEdCliente
     */
    public void setCvpEdCliente(java.lang.String cvpEdCliente) {
        this.cvpEdCliente = cvpEdCliente;
    }


    /**
     * Gets the cvpEdComplemento value for this ValePostal.
     * 
     * @return cvpEdComplemento
     */
    public java.lang.String getCvpEdComplemento() {
        return cvpEdComplemento;
    }


    /**
     * Sets the cvpEdComplemento value for this ValePostal.
     * 
     * @param cvpEdComplemento
     */
    public void setCvpEdComplemento(java.lang.String cvpEdComplemento) {
        this.cvpEdComplemento = cvpEdComplemento;
    }


    /**
     * Gets the cvpEdNumero value for this ValePostal.
     * 
     * @return cvpEdNumero
     */
    public java.lang.String getCvpEdNumero() {
        return cvpEdNumero;
    }


    /**
     * Sets the cvpEdNumero value for this ValePostal.
     * 
     * @param cvpEdNumero
     */
    public void setCvpEdNumero(java.lang.String cvpEdNumero) {
        this.cvpEdNumero = cvpEdNumero;
    }


    /**
     * Gets the cvpNoCliente value for this ValePostal.
     * 
     * @return cvpNoCliente
     */
    public java.lang.String getCvpNoCliente() {
        return cvpNoCliente;
    }


    /**
     * Sets the cvpNoCliente value for this ValePostal.
     * 
     * @param cvpNoCliente
     */
    public void setCvpNoCliente(java.lang.String cvpNoCliente) {
        this.cvpNoCliente = cvpNoCliente;
    }


    /**
     * Gets the cvpNuCep value for this ValePostal.
     * 
     * @return cvpNuCep
     */
    public java.lang.Long getCvpNuCep() {
        return cvpNuCep;
    }


    /**
     * Sets the cvpNuCep value for this ValePostal.
     * 
     * @param cvpNuCep
     */
    public void setCvpNuCep(java.lang.Long cvpNuCep) {
        this.cvpNuCep = cvpNuCep;
    }


    /**
     * Gets the descricaoErro value for this ValePostal.
     * 
     * @return descricaoErro
     */
    public java.lang.String getDescricaoErro() {
        return descricaoErro;
    }


    /**
     * Sets the descricaoErro value for this ValePostal.
     * 
     * @param descricaoErro
     */
    public void setDescricaoErro(java.lang.String descricaoErro) {
        this.descricaoErro = descricaoErro;
    }


    /**
     * Gets the estSgEstado value for this ValePostal.
     * 
     * @return estSgEstado
     */
    public java.lang.String getEstSgEstado() {
        return estSgEstado;
    }


    /**
     * Sets the estSgEstado value for this ValePostal.
     * 
     * @param estSgEstado
     */
    public void setEstSgEstado(java.lang.String estSgEstado) {
        this.estSgEstado = estSgEstado;
    }


    /**
     * Gets the monVarTarifaAdicional value for this ValePostal.
     * 
     * @return monVarTarifaAdicional
     */
    public int getMonVarTarifaAdicional() {
        return monVarTarifaAdicional;
    }


    /**
     * Sets the monVarTarifaAdicional value for this ValePostal.
     * 
     * @param monVarTarifaAdicional
     */
    public void setMonVarTarifaAdicional(int monVarTarifaAdicional) {
        this.monVarTarifaAdicional = monVarTarifaAdicional;
    }


    /**
     * Gets the monVarTarifaServico value for this ValePostal.
     * 
     * @return monVarTarifaServico
     */
    public int getMonVarTarifaServico() {
        return monVarTarifaServico;
    }


    /**
     * Sets the monVarTarifaServico value for this ValePostal.
     * 
     * @param monVarTarifaServico
     */
    public void setMonVarTarifaServico(int monVarTarifaServico) {
        this.monVarTarifaServico = monVarTarifaServico;
    }


    /**
     * Gets the monVarValorDescontos value for this ValePostal.
     * 
     * @return monVarValorDescontos
     */
    public int getMonVarValorDescontos() {
        return monVarValorDescontos;
    }


    /**
     * Sets the monVarValorDescontos value for this ValePostal.
     * 
     * @param monVarValorDescontos
     */
    public void setMonVarValorDescontos(int monVarValorDescontos) {
        this.monVarValorDescontos = monVarValorDescontos;
    }


    /**
     * Gets the monVarValorImposto value for this ValePostal.
     * 
     * @return monVarValorImposto
     */
    public int getMonVarValorImposto() {
        return monVarValorImposto;
    }


    /**
     * Sets the monVarValorImposto value for this ValePostal.
     * 
     * @param monVarValorImposto
     */
    public void setMonVarValorImposto(int monVarValorImposto) {
        this.monVarValorImposto = monVarValorImposto;
    }


    /**
     * Gets the prsCoProdutoServico value for this ValePostal.
     * 
     * @return prsCoProdutoServico
     */
    public java.lang.Long getPrsCoProdutoServico() {
        return prsCoProdutoServico;
    }


    /**
     * Sets the prsCoProdutoServico value for this ValePostal.
     * 
     * @param prsCoProdutoServico
     */
    public void setPrsCoProdutoServico(java.lang.Long prsCoProdutoServico) {
        this.prsCoProdutoServico = prsCoProdutoServico;
    }


    /**
     * Gets the pveNu value for this ValePostal.
     * 
     * @return pveNu
     */
    public java.lang.Long getPveNu() {
        return pveNu;
    }


    /**
     * Sets the pveNu value for this ValePostal.
     * 
     * @param pveNu
     */
    public void setPveNu(java.lang.Long pveNu) {
        this.pveNu = pveNu;
    }


    /**
     * Gets the pveOrgNuAgencia value for this ValePostal.
     * 
     * @return pveOrgNuAgencia
     */
    public java.lang.Long getPveOrgNuAgencia() {
        return pveOrgNuAgencia;
    }


    /**
     * Sets the pveOrgNuAgencia value for this ValePostal.
     * 
     * @param pveOrgNuAgencia
     */
    public void setPveOrgNuAgencia(java.lang.Long pveOrgNuAgencia) {
        this.pveOrgNuAgencia = pveOrgNuAgencia;
    }


    /**
     * Gets the pveOrgNuAgenciaDes value for this ValePostal.
     * 
     * @return pveOrgNuAgenciaDes
     */
    public java.lang.Long getPveOrgNuAgenciaDes() {
        return pveOrgNuAgenciaDes;
    }


    /**
     * Sets the pveOrgNuAgenciaDes value for this ValePostal.
     * 
     * @param pveOrgNuAgenciaDes
     */
    public void setPveOrgNuAgenciaDes(java.lang.Long pveOrgNuAgenciaDes) {
        this.pveOrgNuAgenciaDes = pveOrgNuAgenciaDes;
    }


    /**
     * Gets the pveOrgNuAgenciaOri value for this ValePostal.
     * 
     * @return pveOrgNuAgenciaOri
     */
    public java.lang.Long getPveOrgNuAgenciaOri() {
        return pveOrgNuAgenciaOri;
    }


    /**
     * Sets the pveOrgNuAgenciaOri value for this ValePostal.
     * 
     * @param pveOrgNuAgenciaOri
     */
    public void setPveOrgNuAgenciaOri(java.lang.Long pveOrgNuAgenciaOri) {
        this.pveOrgNuAgenciaOri = pveOrgNuAgenciaOri;
    }


    /**
     * Gets the retornaCodErro value for this ValePostal.
     * 
     * @return retornaCodErro
     */
    public int getRetornaCodErro() {
        return retornaCodErro;
    }


    /**
     * Sets the retornaCodErro value for this ValePostal.
     * 
     * @param retornaCodErro
     */
    public void setRetornaCodErro(int retornaCodErro) {
        this.retornaCodErro = retornaCodErro;
    }


    /**
     * Gets the sitNoSituacao value for this ValePostal.
     * 
     * @return sitNoSituacao
     */
    public java.lang.String getSitNoSituacao() {
        return sitNoSituacao;
    }


    /**
     * Sets the sitNoSituacao value for this ValePostal.
     * 
     * @param sitNoSituacao
     */
    public void setSitNoSituacao(java.lang.String sitNoSituacao) {
        this.sitNoSituacao = sitNoSituacao;
    }


    /**
     * Gets the tlgTxDescricao value for this ValePostal.
     * 
     * @return tlgTxDescricao
     */
    public java.lang.String getTlgTxDescricao() {
        return tlgTxDescricao;
    }


    /**
     * Sets the tlgTxDescricao value for this ValePostal.
     * 
     * @param tlgTxDescricao
     */
    public void setTlgTxDescricao(java.lang.String tlgTxDescricao) {
        this.tlgTxDescricao = tlgTxDescricao;
    }


    /**
     * Gets the vapDhTransacao value for this ValePostal.
     * 
     * @return vapDhTransacao
     */
    public java.util.Calendar getVapDhTransacao() {
        return vapDhTransacao;
    }


    /**
     * Sets the vapDhTransacao value for this ValePostal.
     * 
     * @param vapDhTransacao
     */
    public void setVapDhTransacao(java.util.Calendar vapDhTransacao) {
        this.vapDhTransacao = vapDhTransacao;
    }


    /**
     * Gets the vapNuEtiquetaEncomenda value for this ValePostal.
     * 
     * @return vapNuEtiquetaEncomenda
     */
    public java.lang.String getVapNuEtiquetaEncomenda() {
        return vapNuEtiquetaEncomenda;
    }


    /**
     * Sets the vapNuEtiquetaEncomenda value for this ValePostal.
     * 
     * @param vapNuEtiquetaEncomenda
     */
    public void setVapNuEtiquetaEncomenda(java.lang.String vapNuEtiquetaEncomenda) {
        this.vapNuEtiquetaEncomenda = vapNuEtiquetaEncomenda;
    }


    /**
     * Gets the vapVrCobradoEct value for this ValePostal.
     * 
     * @return vapVrCobradoEct
     */
    public java.lang.Double getVapVrCobradoEct() {
        return vapVrCobradoEct;
    }


    /**
     * Sets the vapVrCobradoEct value for this ValePostal.
     * 
     * @param vapVrCobradoEct
     */
    public void setVapVrCobradoEct(java.lang.Double vapVrCobradoEct) {
        this.vapVrCobradoEct = vapVrCobradoEct;
    }


    /**
     * Gets the vapVrNominal value for this ValePostal.
     * 
     * @return vapVrNominal
     */
    public java.lang.Double getVapVrNominal() {
        return vapVrNominal;
    }


    /**
     * Sets the vapVrNominal value for this ValePostal.
     * 
     * @param vapVrNominal
     */
    public void setVapVrNominal(java.lang.Double vapVrNominal) {
        this.vapVrNominal = vapVrNominal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValePostal)) return false;
        ValePostal other = (ValePostal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cidNoCidade==null && other.getCidNoCidade()==null) || 
             (this.cidNoCidade!=null &&
              this.cidNoCidade.equals(other.getCidNoCidade()))) &&
            ((this.ctcCoAadministrativo==null && other.getCtcCoAadministrativo()==null) || 
             (this.ctcCoAadministrativo!=null &&
              this.ctcCoAadministrativo.equals(other.getCtcCoAadministrativo()))) &&
            ((this.ctcNuContrato==null && other.getCtcNuContrato()==null) || 
             (this.ctcNuContrato!=null &&
              this.ctcNuContrato.equals(other.getCtcNuContrato()))) &&
            ((this.ctcNuContratoEct==null && other.getCtcNuContratoEct()==null) || 
             (this.ctcNuContratoEct!=null &&
              this.ctcNuContratoEct.equals(other.getCtcNuContratoEct()))) &&
            ((this.cvpEdBairro==null && other.getCvpEdBairro()==null) || 
             (this.cvpEdBairro!=null &&
              this.cvpEdBairro.equals(other.getCvpEdBairro()))) &&
            ((this.cvpEdCliente==null && other.getCvpEdCliente()==null) || 
             (this.cvpEdCliente!=null &&
              this.cvpEdCliente.equals(other.getCvpEdCliente()))) &&
            ((this.cvpEdComplemento==null && other.getCvpEdComplemento()==null) || 
             (this.cvpEdComplemento!=null &&
              this.cvpEdComplemento.equals(other.getCvpEdComplemento()))) &&
            ((this.cvpEdNumero==null && other.getCvpEdNumero()==null) || 
             (this.cvpEdNumero!=null &&
              this.cvpEdNumero.equals(other.getCvpEdNumero()))) &&
            ((this.cvpNoCliente==null && other.getCvpNoCliente()==null) || 
             (this.cvpNoCliente!=null &&
              this.cvpNoCliente.equals(other.getCvpNoCliente()))) &&
            ((this.cvpNuCep==null && other.getCvpNuCep()==null) || 
             (this.cvpNuCep!=null &&
              this.cvpNuCep.equals(other.getCvpNuCep()))) &&
            ((this.descricaoErro==null && other.getDescricaoErro()==null) || 
             (this.descricaoErro!=null &&
              this.descricaoErro.equals(other.getDescricaoErro()))) &&
            ((this.estSgEstado==null && other.getEstSgEstado()==null) || 
             (this.estSgEstado!=null &&
              this.estSgEstado.equals(other.getEstSgEstado()))) &&
            this.monVarTarifaAdicional == other.getMonVarTarifaAdicional() &&
            this.monVarTarifaServico == other.getMonVarTarifaServico() &&
            this.monVarValorDescontos == other.getMonVarValorDescontos() &&
            this.monVarValorImposto == other.getMonVarValorImposto() &&
            ((this.prsCoProdutoServico==null && other.getPrsCoProdutoServico()==null) || 
             (this.prsCoProdutoServico!=null &&
              this.prsCoProdutoServico.equals(other.getPrsCoProdutoServico()))) &&
            ((this.pveNu==null && other.getPveNu()==null) || 
             (this.pveNu!=null &&
              this.pveNu.equals(other.getPveNu()))) &&
            ((this.pveOrgNuAgencia==null && other.getPveOrgNuAgencia()==null) || 
             (this.pveOrgNuAgencia!=null &&
              this.pveOrgNuAgencia.equals(other.getPveOrgNuAgencia()))) &&
            ((this.pveOrgNuAgenciaDes==null && other.getPveOrgNuAgenciaDes()==null) || 
             (this.pveOrgNuAgenciaDes!=null &&
              this.pveOrgNuAgenciaDes.equals(other.getPveOrgNuAgenciaDes()))) &&
            ((this.pveOrgNuAgenciaOri==null && other.getPveOrgNuAgenciaOri()==null) || 
             (this.pveOrgNuAgenciaOri!=null &&
              this.pveOrgNuAgenciaOri.equals(other.getPveOrgNuAgenciaOri()))) &&
            this.retornaCodErro == other.getRetornaCodErro() &&
            ((this.sitNoSituacao==null && other.getSitNoSituacao()==null) || 
             (this.sitNoSituacao!=null &&
              this.sitNoSituacao.equals(other.getSitNoSituacao()))) &&
            ((this.tlgTxDescricao==null && other.getTlgTxDescricao()==null) || 
             (this.tlgTxDescricao!=null &&
              this.tlgTxDescricao.equals(other.getTlgTxDescricao()))) &&
            ((this.vapDhTransacao==null && other.getVapDhTransacao()==null) || 
             (this.vapDhTransacao!=null &&
              this.vapDhTransacao.equals(other.getVapDhTransacao()))) &&
            ((this.vapNuEtiquetaEncomenda==null && other.getVapNuEtiquetaEncomenda()==null) || 
             (this.vapNuEtiquetaEncomenda!=null &&
              this.vapNuEtiquetaEncomenda.equals(other.getVapNuEtiquetaEncomenda()))) &&
            ((this.vapVrCobradoEct==null && other.getVapVrCobradoEct()==null) || 
             (this.vapVrCobradoEct!=null &&
              this.vapVrCobradoEct.equals(other.getVapVrCobradoEct()))) &&
            ((this.vapVrNominal==null && other.getVapVrNominal()==null) || 
             (this.vapVrNominal!=null &&
              this.vapVrNominal.equals(other.getVapVrNominal())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCidNoCidade() != null) {
            _hashCode += getCidNoCidade().hashCode();
        }
        if (getCtcCoAadministrativo() != null) {
            _hashCode += getCtcCoAadministrativo().hashCode();
        }
        if (getCtcNuContrato() != null) {
            _hashCode += getCtcNuContrato().hashCode();
        }
        if (getCtcNuContratoEct() != null) {
            _hashCode += getCtcNuContratoEct().hashCode();
        }
        if (getCvpEdBairro() != null) {
            _hashCode += getCvpEdBairro().hashCode();
        }
        if (getCvpEdCliente() != null) {
            _hashCode += getCvpEdCliente().hashCode();
        }
        if (getCvpEdComplemento() != null) {
            _hashCode += getCvpEdComplemento().hashCode();
        }
        if (getCvpEdNumero() != null) {
            _hashCode += getCvpEdNumero().hashCode();
        }
        if (getCvpNoCliente() != null) {
            _hashCode += getCvpNoCliente().hashCode();
        }
        if (getCvpNuCep() != null) {
            _hashCode += getCvpNuCep().hashCode();
        }
        if (getDescricaoErro() != null) {
            _hashCode += getDescricaoErro().hashCode();
        }
        if (getEstSgEstado() != null) {
            _hashCode += getEstSgEstado().hashCode();
        }
        _hashCode += getMonVarTarifaAdicional();
        _hashCode += getMonVarTarifaServico();
        _hashCode += getMonVarValorDescontos();
        _hashCode += getMonVarValorImposto();
        if (getPrsCoProdutoServico() != null) {
            _hashCode += getPrsCoProdutoServico().hashCode();
        }
        if (getPveNu() != null) {
            _hashCode += getPveNu().hashCode();
        }
        if (getPveOrgNuAgencia() != null) {
            _hashCode += getPveOrgNuAgencia().hashCode();
        }
        if (getPveOrgNuAgenciaDes() != null) {
            _hashCode += getPveOrgNuAgenciaDes().hashCode();
        }
        if (getPveOrgNuAgenciaOri() != null) {
            _hashCode += getPveOrgNuAgenciaOri().hashCode();
        }
        _hashCode += getRetornaCodErro();
        if (getSitNoSituacao() != null) {
            _hashCode += getSitNoSituacao().hashCode();
        }
        if (getTlgTxDescricao() != null) {
            _hashCode += getTlgTxDescricao().hashCode();
        }
        if (getVapDhTransacao() != null) {
            _hashCode += getVapDhTransacao().hashCode();
        }
        if (getVapNuEtiquetaEncomenda() != null) {
            _hashCode += getVapNuEtiquetaEncomenda().hashCode();
        }
        if (getVapVrCobradoEct() != null) {
            _hashCode += getVapVrCobradoEct().hashCode();
        }
        if (getVapVrNominal() != null) {
            _hashCode += getVapVrNominal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValePostal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "valePostal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidNoCidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cidNoCidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctcCoAadministrativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ctcCoAadministrativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctcNuContrato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ctcNuContrato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctcNuContratoEct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ctcNuContratoEct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvpEdBairro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvpEdBairro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvpEdCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvpEdCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvpEdComplemento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvpEdComplemento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvpEdNumero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvpEdNumero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvpNoCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvpNoCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvpNuCep");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvpNuCep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoErro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricaoErro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estSgEstado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estSgEstado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monVarTarifaAdicional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monVarTarifaAdicional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monVarTarifaServico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monVarTarifaServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monVarValorDescontos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monVarValorDescontos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monVarValorImposto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monVarValorImposto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prsCoProdutoServico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prsCoProdutoServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pveNu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pveNu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pveOrgNuAgencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pveOrgNuAgencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pveOrgNuAgenciaDes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pveOrgNuAgenciaDes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pveOrgNuAgenciaOri");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pveOrgNuAgenciaOri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornaCodErro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retornaCodErro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitNoSituacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sitNoSituacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tlgTxDescricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tlgTxDescricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vapDhTransacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vapDhTransacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vapNuEtiquetaEncomenda");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vapNuEtiquetaEncomenda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vapVrCobradoEct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vapVrCobradoEct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vapVrNominal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vapVrNominal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
