/**
 * CartaoPostagemERP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class CartaoPostagemERP  implements java.io.Serializable {
    private java.lang.String codigoAdministrativo;

    private br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP[] contratos;

    private java.util.Calendar dataAtualizacao;

    private java.util.Calendar dataVigenciaFim;

    private java.util.Calendar dataVigenciaInicio;

    private java.lang.Integer datajAtualizacao;

    private java.lang.Integer datajVigenciaFim;

    private java.lang.Integer datajVigenciaInicio;

    private java.lang.String descricaoStatusCartao;

    private java.lang.String descricaoUnidadePostagemGenerica;

    private java.lang.Integer horajAtualizacao;

    private java.lang.String numero;

    private br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP[] servicos;

    private java.lang.String statusCartaoPostagem;

    private java.lang.String statusCodigo;

    private java.lang.String unidadeGenerica;

    private br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP[] unidadesPostagem;

    public CartaoPostagemERP() {
    }

    public CartaoPostagemERP(
           java.lang.String codigoAdministrativo,
           br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP[] contratos,
           java.util.Calendar dataAtualizacao,
           java.util.Calendar dataVigenciaFim,
           java.util.Calendar dataVigenciaInicio,
           java.lang.Integer datajAtualizacao,
           java.lang.Integer datajVigenciaFim,
           java.lang.Integer datajVigenciaInicio,
           java.lang.String descricaoStatusCartao,
           java.lang.String descricaoUnidadePostagemGenerica,
           java.lang.Integer horajAtualizacao,
           java.lang.String numero,
           br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP[] servicos,
           java.lang.String statusCartaoPostagem,
           java.lang.String statusCodigo,
           java.lang.String unidadeGenerica,
           br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP[] unidadesPostagem) {
           this.codigoAdministrativo = codigoAdministrativo;
           this.contratos = contratos;
           this.dataAtualizacao = dataAtualizacao;
           this.dataVigenciaFim = dataVigenciaFim;
           this.dataVigenciaInicio = dataVigenciaInicio;
           this.datajAtualizacao = datajAtualizacao;
           this.datajVigenciaFim = datajVigenciaFim;
           this.datajVigenciaInicio = datajVigenciaInicio;
           this.descricaoStatusCartao = descricaoStatusCartao;
           this.descricaoUnidadePostagemGenerica = descricaoUnidadePostagemGenerica;
           this.horajAtualizacao = horajAtualizacao;
           this.numero = numero;
           this.servicos = servicos;
           this.statusCartaoPostagem = statusCartaoPostagem;
           this.statusCodigo = statusCodigo;
           this.unidadeGenerica = unidadeGenerica;
           this.unidadesPostagem = unidadesPostagem;
    }


    /**
     * Gets the codigoAdministrativo value for this CartaoPostagemERP.
     * 
     * @return codigoAdministrativo
     */
    public java.lang.String getCodigoAdministrativo() {
        return codigoAdministrativo;
    }


    /**
     * Sets the codigoAdministrativo value for this CartaoPostagemERP.
     * 
     * @param codigoAdministrativo
     */
    public void setCodigoAdministrativo(java.lang.String codigoAdministrativo) {
        this.codigoAdministrativo = codigoAdministrativo;
    }


    /**
     * Gets the contratos value for this CartaoPostagemERP.
     * 
     * @return contratos
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP[] getContratos() {
        return contratos;
    }


    /**
     * Sets the contratos value for this CartaoPostagemERP.
     * 
     * @param contratos
     */
    public void setContratos(br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP[] contratos) {
        this.contratos = contratos;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP getContratos(int i) {
        return this.contratos[i];
    }

    public void setContratos(int i, br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP _value) {
        this.contratos[i] = _value;
    }


    /**
     * Gets the dataAtualizacao value for this CartaoPostagemERP.
     * 
     * @return dataAtualizacao
     */
    public java.util.Calendar getDataAtualizacao() {
        return dataAtualizacao;
    }


    /**
     * Sets the dataAtualizacao value for this CartaoPostagemERP.
     * 
     * @param dataAtualizacao
     */
    public void setDataAtualizacao(java.util.Calendar dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }


    /**
     * Gets the dataVigenciaFim value for this CartaoPostagemERP.
     * 
     * @return dataVigenciaFim
     */
    public java.util.Calendar getDataVigenciaFim() {
        return dataVigenciaFim;
    }


    /**
     * Sets the dataVigenciaFim value for this CartaoPostagemERP.
     * 
     * @param dataVigenciaFim
     */
    public void setDataVigenciaFim(java.util.Calendar dataVigenciaFim) {
        this.dataVigenciaFim = dataVigenciaFim;
    }


    /**
     * Gets the dataVigenciaInicio value for this CartaoPostagemERP.
     * 
     * @return dataVigenciaInicio
     */
    public java.util.Calendar getDataVigenciaInicio() {
        return dataVigenciaInicio;
    }


    /**
     * Sets the dataVigenciaInicio value for this CartaoPostagemERP.
     * 
     * @param dataVigenciaInicio
     */
    public void setDataVigenciaInicio(java.util.Calendar dataVigenciaInicio) {
        this.dataVigenciaInicio = dataVigenciaInicio;
    }


    /**
     * Gets the datajAtualizacao value for this CartaoPostagemERP.
     * 
     * @return datajAtualizacao
     */
    public java.lang.Integer getDatajAtualizacao() {
        return datajAtualizacao;
    }


    /**
     * Sets the datajAtualizacao value for this CartaoPostagemERP.
     * 
     * @param datajAtualizacao
     */
    public void setDatajAtualizacao(java.lang.Integer datajAtualizacao) {
        this.datajAtualizacao = datajAtualizacao;
    }


    /**
     * Gets the datajVigenciaFim value for this CartaoPostagemERP.
     * 
     * @return datajVigenciaFim
     */
    public java.lang.Integer getDatajVigenciaFim() {
        return datajVigenciaFim;
    }


    /**
     * Sets the datajVigenciaFim value for this CartaoPostagemERP.
     * 
     * @param datajVigenciaFim
     */
    public void setDatajVigenciaFim(java.lang.Integer datajVigenciaFim) {
        this.datajVigenciaFim = datajVigenciaFim;
    }


    /**
     * Gets the datajVigenciaInicio value for this CartaoPostagemERP.
     * 
     * @return datajVigenciaInicio
     */
    public java.lang.Integer getDatajVigenciaInicio() {
        return datajVigenciaInicio;
    }


    /**
     * Sets the datajVigenciaInicio value for this CartaoPostagemERP.
     * 
     * @param datajVigenciaInicio
     */
    public void setDatajVigenciaInicio(java.lang.Integer datajVigenciaInicio) {
        this.datajVigenciaInicio = datajVigenciaInicio;
    }


    /**
     * Gets the descricaoStatusCartao value for this CartaoPostagemERP.
     * 
     * @return descricaoStatusCartao
     */
    public java.lang.String getDescricaoStatusCartao() {
        return descricaoStatusCartao;
    }


    /**
     * Sets the descricaoStatusCartao value for this CartaoPostagemERP.
     * 
     * @param descricaoStatusCartao
     */
    public void setDescricaoStatusCartao(java.lang.String descricaoStatusCartao) {
        this.descricaoStatusCartao = descricaoStatusCartao;
    }


    /**
     * Gets the descricaoUnidadePostagemGenerica value for this CartaoPostagemERP.
     * 
     * @return descricaoUnidadePostagemGenerica
     */
    public java.lang.String getDescricaoUnidadePostagemGenerica() {
        return descricaoUnidadePostagemGenerica;
    }


    /**
     * Sets the descricaoUnidadePostagemGenerica value for this CartaoPostagemERP.
     * 
     * @param descricaoUnidadePostagemGenerica
     */
    public void setDescricaoUnidadePostagemGenerica(java.lang.String descricaoUnidadePostagemGenerica) {
        this.descricaoUnidadePostagemGenerica = descricaoUnidadePostagemGenerica;
    }


    /**
     * Gets the horajAtualizacao value for this CartaoPostagemERP.
     * 
     * @return horajAtualizacao
     */
    public java.lang.Integer getHorajAtualizacao() {
        return horajAtualizacao;
    }


    /**
     * Sets the horajAtualizacao value for this CartaoPostagemERP.
     * 
     * @param horajAtualizacao
     */
    public void setHorajAtualizacao(java.lang.Integer horajAtualizacao) {
        this.horajAtualizacao = horajAtualizacao;
    }


    /**
     * Gets the numero value for this CartaoPostagemERP.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this CartaoPostagemERP.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the servicos value for this CartaoPostagemERP.
     * 
     * @return servicos
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP[] getServicos() {
        return servicos;
    }


    /**
     * Sets the servicos value for this CartaoPostagemERP.
     * 
     * @param servicos
     */
    public void setServicos(br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP[] servicos) {
        this.servicos = servicos;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP getServicos(int i) {
        return this.servicos[i];
    }

    public void setServicos(int i, br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP _value) {
        this.servicos[i] = _value;
    }


    /**
     * Gets the statusCartaoPostagem value for this CartaoPostagemERP.
     * 
     * @return statusCartaoPostagem
     */
    public java.lang.String getStatusCartaoPostagem() {
        return statusCartaoPostagem;
    }


    /**
     * Sets the statusCartaoPostagem value for this CartaoPostagemERP.
     * 
     * @param statusCartaoPostagem
     */
    public void setStatusCartaoPostagem(java.lang.String statusCartaoPostagem) {
        this.statusCartaoPostagem = statusCartaoPostagem;
    }


    /**
     * Gets the statusCodigo value for this CartaoPostagemERP.
     * 
     * @return statusCodigo
     */
    public java.lang.String getStatusCodigo() {
        return statusCodigo;
    }


    /**
     * Sets the statusCodigo value for this CartaoPostagemERP.
     * 
     * @param statusCodigo
     */
    public void setStatusCodigo(java.lang.String statusCodigo) {
        this.statusCodigo = statusCodigo;
    }


    /**
     * Gets the unidadeGenerica value for this CartaoPostagemERP.
     * 
     * @return unidadeGenerica
     */
    public java.lang.String getUnidadeGenerica() {
        return unidadeGenerica;
    }


    /**
     * Sets the unidadeGenerica value for this CartaoPostagemERP.
     * 
     * @param unidadeGenerica
     */
    public void setUnidadeGenerica(java.lang.String unidadeGenerica) {
        this.unidadeGenerica = unidadeGenerica;
    }


    /**
     * Gets the unidadesPostagem value for this CartaoPostagemERP.
     * 
     * @return unidadesPostagem
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP[] getUnidadesPostagem() {
        return unidadesPostagem;
    }


    /**
     * Sets the unidadesPostagem value for this CartaoPostagemERP.
     * 
     * @param unidadesPostagem
     */
    public void setUnidadesPostagem(br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP[] unidadesPostagem) {
        this.unidadesPostagem = unidadesPostagem;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP getUnidadesPostagem(int i) {
        return this.unidadesPostagem[i];
    }

    public void setUnidadesPostagem(int i, br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP _value) {
        this.unidadesPostagem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CartaoPostagemERP)) return false;
        CartaoPostagemERP other = (CartaoPostagemERP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoAdministrativo==null && other.getCodigoAdministrativo()==null) || 
             (this.codigoAdministrativo!=null &&
              this.codigoAdministrativo.equals(other.getCodigoAdministrativo()))) &&
            ((this.contratos==null && other.getContratos()==null) || 
             (this.contratos!=null &&
              java.util.Arrays.equals(this.contratos, other.getContratos()))) &&
            ((this.dataAtualizacao==null && other.getDataAtualizacao()==null) || 
             (this.dataAtualizacao!=null &&
              this.dataAtualizacao.equals(other.getDataAtualizacao()))) &&
            ((this.dataVigenciaFim==null && other.getDataVigenciaFim()==null) || 
             (this.dataVigenciaFim!=null &&
              this.dataVigenciaFim.equals(other.getDataVigenciaFim()))) &&
            ((this.dataVigenciaInicio==null && other.getDataVigenciaInicio()==null) || 
             (this.dataVigenciaInicio!=null &&
              this.dataVigenciaInicio.equals(other.getDataVigenciaInicio()))) &&
            ((this.datajAtualizacao==null && other.getDatajAtualizacao()==null) || 
             (this.datajAtualizacao!=null &&
              this.datajAtualizacao.equals(other.getDatajAtualizacao()))) &&
            ((this.datajVigenciaFim==null && other.getDatajVigenciaFim()==null) || 
             (this.datajVigenciaFim!=null &&
              this.datajVigenciaFim.equals(other.getDatajVigenciaFim()))) &&
            ((this.datajVigenciaInicio==null && other.getDatajVigenciaInicio()==null) || 
             (this.datajVigenciaInicio!=null &&
              this.datajVigenciaInicio.equals(other.getDatajVigenciaInicio()))) &&
            ((this.descricaoStatusCartao==null && other.getDescricaoStatusCartao()==null) || 
             (this.descricaoStatusCartao!=null &&
              this.descricaoStatusCartao.equals(other.getDescricaoStatusCartao()))) &&
            ((this.descricaoUnidadePostagemGenerica==null && other.getDescricaoUnidadePostagemGenerica()==null) || 
             (this.descricaoUnidadePostagemGenerica!=null &&
              this.descricaoUnidadePostagemGenerica.equals(other.getDescricaoUnidadePostagemGenerica()))) &&
            ((this.horajAtualizacao==null && other.getHorajAtualizacao()==null) || 
             (this.horajAtualizacao!=null &&
              this.horajAtualizacao.equals(other.getHorajAtualizacao()))) &&
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.servicos==null && other.getServicos()==null) || 
             (this.servicos!=null &&
              java.util.Arrays.equals(this.servicos, other.getServicos()))) &&
            ((this.statusCartaoPostagem==null && other.getStatusCartaoPostagem()==null) || 
             (this.statusCartaoPostagem!=null &&
              this.statusCartaoPostagem.equals(other.getStatusCartaoPostagem()))) &&
            ((this.statusCodigo==null && other.getStatusCodigo()==null) || 
             (this.statusCodigo!=null &&
              this.statusCodigo.equals(other.getStatusCodigo()))) &&
            ((this.unidadeGenerica==null && other.getUnidadeGenerica()==null) || 
             (this.unidadeGenerica!=null &&
              this.unidadeGenerica.equals(other.getUnidadeGenerica()))) &&
            ((this.unidadesPostagem==null && other.getUnidadesPostagem()==null) || 
             (this.unidadesPostagem!=null &&
              java.util.Arrays.equals(this.unidadesPostagem, other.getUnidadesPostagem())));
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
        if (getCodigoAdministrativo() != null) {
            _hashCode += getCodigoAdministrativo().hashCode();
        }
        if (getContratos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContratos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContratos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDataAtualizacao() != null) {
            _hashCode += getDataAtualizacao().hashCode();
        }
        if (getDataVigenciaFim() != null) {
            _hashCode += getDataVigenciaFim().hashCode();
        }
        if (getDataVigenciaInicio() != null) {
            _hashCode += getDataVigenciaInicio().hashCode();
        }
        if (getDatajAtualizacao() != null) {
            _hashCode += getDatajAtualizacao().hashCode();
        }
        if (getDatajVigenciaFim() != null) {
            _hashCode += getDatajVigenciaFim().hashCode();
        }
        if (getDatajVigenciaInicio() != null) {
            _hashCode += getDatajVigenciaInicio().hashCode();
        }
        if (getDescricaoStatusCartao() != null) {
            _hashCode += getDescricaoStatusCartao().hashCode();
        }
        if (getDescricaoUnidadePostagemGenerica() != null) {
            _hashCode += getDescricaoUnidadePostagemGenerica().hashCode();
        }
        if (getHorajAtualizacao() != null) {
            _hashCode += getHorajAtualizacao().hashCode();
        }
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getServicos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatusCartaoPostagem() != null) {
            _hashCode += getStatusCartaoPostagem().hashCode();
        }
        if (getStatusCodigo() != null) {
            _hashCode += getStatusCodigo().hashCode();
        }
        if (getUnidadeGenerica() != null) {
            _hashCode += getUnidadeGenerica().hashCode();
        }
        if (getUnidadesPostagem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnidadesPostagem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnidadesPostagem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CartaoPostagemERP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "cartaoPostagemERP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoAdministrativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoAdministrativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contratos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contratos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "contratoERP"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAtualizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataAtualizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataVigenciaFim");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataVigenciaFim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataVigenciaInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataVigenciaInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datajAtualizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datajAtualizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datajVigenciaFim");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datajVigenciaFim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datajVigenciaInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datajVigenciaInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoStatusCartao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricaoStatusCartao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoUnidadePostagemGenerica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricaoUnidadePostagemGenerica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horajAtualizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "horajAtualizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "servicoERP"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCartaoPostagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusCartaoPostagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCodigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusCodigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadeGenerica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unidadeGenerica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadesPostagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unidadesPostagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "unidadePostagemERP"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
