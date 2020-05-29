/**
 * ObjetoPostal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class ObjetoPostal  implements java.io.Serializable {
    private java.lang.String codigoEtiqueta;

    private java.util.Calendar dataAtualizacaoCliente;

    private java.util.Calendar dataBloqueioObjeto;

    private java.util.Calendar dataCancelamentoEtiqueta;

    private java.util.Calendar dataInclusao;

    private br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostalPK objetoPostalPK;

    private java.lang.Long plpNu;

    private br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem preListaPostagem;

    private br.com.correios.bsb.sigep.master.bean.cliente.SimNao restricaoAerea;

    private java.lang.String statusBloqueio;

    private br.com.correios.bsb.sigep.master.bean.cliente.StatusObjetoPostal statusEtiqueta;

    public ObjetoPostal() {
    }

    public ObjetoPostal(
           java.lang.String codigoEtiqueta,
           java.util.Calendar dataAtualizacaoCliente,
           java.util.Calendar dataBloqueioObjeto,
           java.util.Calendar dataCancelamentoEtiqueta,
           java.util.Calendar dataInclusao,
           br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostalPK objetoPostalPK,
           java.lang.Long plpNu,
           br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem preListaPostagem,
           br.com.correios.bsb.sigep.master.bean.cliente.SimNao restricaoAerea,
           java.lang.String statusBloqueio,
           br.com.correios.bsb.sigep.master.bean.cliente.StatusObjetoPostal statusEtiqueta) {
           this.codigoEtiqueta = codigoEtiqueta;
           this.dataAtualizacaoCliente = dataAtualizacaoCliente;
           this.dataBloqueioObjeto = dataBloqueioObjeto;
           this.dataCancelamentoEtiqueta = dataCancelamentoEtiqueta;
           this.dataInclusao = dataInclusao;
           this.objetoPostalPK = objetoPostalPK;
           this.plpNu = plpNu;
           this.preListaPostagem = preListaPostagem;
           this.restricaoAerea = restricaoAerea;
           this.statusBloqueio = statusBloqueio;
           this.statusEtiqueta = statusEtiqueta;
    }


    /**
     * Gets the codigoEtiqueta value for this ObjetoPostal.
     * 
     * @return codigoEtiqueta
     */
    public java.lang.String getCodigoEtiqueta() {
        return codigoEtiqueta;
    }


    /**
     * Sets the codigoEtiqueta value for this ObjetoPostal.
     * 
     * @param codigoEtiqueta
     */
    public void setCodigoEtiqueta(java.lang.String codigoEtiqueta) {
        this.codigoEtiqueta = codigoEtiqueta;
    }


    /**
     * Gets the dataAtualizacaoCliente value for this ObjetoPostal.
     * 
     * @return dataAtualizacaoCliente
     */
    public java.util.Calendar getDataAtualizacaoCliente() {
        return dataAtualizacaoCliente;
    }


    /**
     * Sets the dataAtualizacaoCliente value for this ObjetoPostal.
     * 
     * @param dataAtualizacaoCliente
     */
    public void setDataAtualizacaoCliente(java.util.Calendar dataAtualizacaoCliente) {
        this.dataAtualizacaoCliente = dataAtualizacaoCliente;
    }


    /**
     * Gets the dataBloqueioObjeto value for this ObjetoPostal.
     * 
     * @return dataBloqueioObjeto
     */
    public java.util.Calendar getDataBloqueioObjeto() {
        return dataBloqueioObjeto;
    }


    /**
     * Sets the dataBloqueioObjeto value for this ObjetoPostal.
     * 
     * @param dataBloqueioObjeto
     */
    public void setDataBloqueioObjeto(java.util.Calendar dataBloqueioObjeto) {
        this.dataBloqueioObjeto = dataBloqueioObjeto;
    }


    /**
     * Gets the dataCancelamentoEtiqueta value for this ObjetoPostal.
     * 
     * @return dataCancelamentoEtiqueta
     */
    public java.util.Calendar getDataCancelamentoEtiqueta() {
        return dataCancelamentoEtiqueta;
    }


    /**
     * Sets the dataCancelamentoEtiqueta value for this ObjetoPostal.
     * 
     * @param dataCancelamentoEtiqueta
     */
    public void setDataCancelamentoEtiqueta(java.util.Calendar dataCancelamentoEtiqueta) {
        this.dataCancelamentoEtiqueta = dataCancelamentoEtiqueta;
    }


    /**
     * Gets the dataInclusao value for this ObjetoPostal.
     * 
     * @return dataInclusao
     */
    public java.util.Calendar getDataInclusao() {
        return dataInclusao;
    }


    /**
     * Sets the dataInclusao value for this ObjetoPostal.
     * 
     * @param dataInclusao
     */
    public void setDataInclusao(java.util.Calendar dataInclusao) {
        this.dataInclusao = dataInclusao;
    }


    /**
     * Gets the objetoPostalPK value for this ObjetoPostal.
     * 
     * @return objetoPostalPK
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostalPK getObjetoPostalPK() {
        return objetoPostalPK;
    }


    /**
     * Sets the objetoPostalPK value for this ObjetoPostal.
     * 
     * @param objetoPostalPK
     */
    public void setObjetoPostalPK(br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostalPK objetoPostalPK) {
        this.objetoPostalPK = objetoPostalPK;
    }


    /**
     * Gets the plpNu value for this ObjetoPostal.
     * 
     * @return plpNu
     */
    public java.lang.Long getPlpNu() {
        return plpNu;
    }


    /**
     * Sets the plpNu value for this ObjetoPostal.
     * 
     * @param plpNu
     */
    public void setPlpNu(java.lang.Long plpNu) {
        this.plpNu = plpNu;
    }


    /**
     * Gets the preListaPostagem value for this ObjetoPostal.
     * 
     * @return preListaPostagem
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem getPreListaPostagem() {
        return preListaPostagem;
    }


    /**
     * Sets the preListaPostagem value for this ObjetoPostal.
     * 
     * @param preListaPostagem
     */
    public void setPreListaPostagem(br.com.correios.bsb.sigep.master.bean.cliente.PreListaPostagem preListaPostagem) {
        this.preListaPostagem = preListaPostagem;
    }


    /**
     * Gets the restricaoAerea value for this ObjetoPostal.
     * 
     * @return restricaoAerea
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SimNao getRestricaoAerea() {
        return restricaoAerea;
    }


    /**
     * Sets the restricaoAerea value for this ObjetoPostal.
     * 
     * @param restricaoAerea
     */
    public void setRestricaoAerea(br.com.correios.bsb.sigep.master.bean.cliente.SimNao restricaoAerea) {
        this.restricaoAerea = restricaoAerea;
    }


    /**
     * Gets the statusBloqueio value for this ObjetoPostal.
     * 
     * @return statusBloqueio
     */
    public java.lang.String getStatusBloqueio() {
        return statusBloqueio;
    }


    /**
     * Sets the statusBloqueio value for this ObjetoPostal.
     * 
     * @param statusBloqueio
     */
    public void setStatusBloqueio(java.lang.String statusBloqueio) {
        this.statusBloqueio = statusBloqueio;
    }


    /**
     * Gets the statusEtiqueta value for this ObjetoPostal.
     * 
     * @return statusEtiqueta
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.StatusObjetoPostal getStatusEtiqueta() {
        return statusEtiqueta;
    }


    /**
     * Sets the statusEtiqueta value for this ObjetoPostal.
     * 
     * @param statusEtiqueta
     */
    public void setStatusEtiqueta(br.com.correios.bsb.sigep.master.bean.cliente.StatusObjetoPostal statusEtiqueta) {
        this.statusEtiqueta = statusEtiqueta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjetoPostal)) return false;
        ObjetoPostal other = (ObjetoPostal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoEtiqueta==null && other.getCodigoEtiqueta()==null) || 
             (this.codigoEtiqueta!=null &&
              this.codigoEtiqueta.equals(other.getCodigoEtiqueta()))) &&
            ((this.dataAtualizacaoCliente==null && other.getDataAtualizacaoCliente()==null) || 
             (this.dataAtualizacaoCliente!=null &&
              this.dataAtualizacaoCliente.equals(other.getDataAtualizacaoCliente()))) &&
            ((this.dataBloqueioObjeto==null && other.getDataBloqueioObjeto()==null) || 
             (this.dataBloqueioObjeto!=null &&
              this.dataBloqueioObjeto.equals(other.getDataBloqueioObjeto()))) &&
            ((this.dataCancelamentoEtiqueta==null && other.getDataCancelamentoEtiqueta()==null) || 
             (this.dataCancelamentoEtiqueta!=null &&
              this.dataCancelamentoEtiqueta.equals(other.getDataCancelamentoEtiqueta()))) &&
            ((this.dataInclusao==null && other.getDataInclusao()==null) || 
             (this.dataInclusao!=null &&
              this.dataInclusao.equals(other.getDataInclusao()))) &&
            ((this.objetoPostalPK==null && other.getObjetoPostalPK()==null) || 
             (this.objetoPostalPK!=null &&
              this.objetoPostalPK.equals(other.getObjetoPostalPK()))) &&
            ((this.plpNu==null && other.getPlpNu()==null) || 
             (this.plpNu!=null &&
              this.plpNu.equals(other.getPlpNu()))) &&
            ((this.preListaPostagem==null && other.getPreListaPostagem()==null) || 
             (this.preListaPostagem!=null &&
              this.preListaPostagem.equals(other.getPreListaPostagem()))) &&
            ((this.restricaoAerea==null && other.getRestricaoAerea()==null) || 
             (this.restricaoAerea!=null &&
              this.restricaoAerea.equals(other.getRestricaoAerea()))) &&
            ((this.statusBloqueio==null && other.getStatusBloqueio()==null) || 
             (this.statusBloqueio!=null &&
              this.statusBloqueio.equals(other.getStatusBloqueio()))) &&
            ((this.statusEtiqueta==null && other.getStatusEtiqueta()==null) || 
             (this.statusEtiqueta!=null &&
              this.statusEtiqueta.equals(other.getStatusEtiqueta())));
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
        if (getCodigoEtiqueta() != null) {
            _hashCode += getCodigoEtiqueta().hashCode();
        }
        if (getDataAtualizacaoCliente() != null) {
            _hashCode += getDataAtualizacaoCliente().hashCode();
        }
        if (getDataBloqueioObjeto() != null) {
            _hashCode += getDataBloqueioObjeto().hashCode();
        }
        if (getDataCancelamentoEtiqueta() != null) {
            _hashCode += getDataCancelamentoEtiqueta().hashCode();
        }
        if (getDataInclusao() != null) {
            _hashCode += getDataInclusao().hashCode();
        }
        if (getObjetoPostalPK() != null) {
            _hashCode += getObjetoPostalPK().hashCode();
        }
        if (getPlpNu() != null) {
            _hashCode += getPlpNu().hashCode();
        }
        if (getPreListaPostagem() != null) {
            _hashCode += getPreListaPostagem().hashCode();
        }
        if (getRestricaoAerea() != null) {
            _hashCode += getRestricaoAerea().hashCode();
        }
        if (getStatusBloqueio() != null) {
            _hashCode += getStatusBloqueio().hashCode();
        }
        if (getStatusEtiqueta() != null) {
            _hashCode += getStatusEtiqueta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjetoPostal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "objetoPostal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEtiqueta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoEtiqueta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAtualizacaoCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataAtualizacaoCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataBloqueioObjeto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataBloqueioObjeto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCancelamentoEtiqueta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataCancelamentoEtiqueta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInclusao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataInclusao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objetoPostalPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objetoPostalPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "objetoPostalPK"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plpNu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "plpNu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preListaPostagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preListaPostagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "preListaPostagem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restricaoAerea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "restricaoAerea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "simNao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusBloqueio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusBloqueio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusEtiqueta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusEtiqueta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "statusObjetoPostal"));
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
