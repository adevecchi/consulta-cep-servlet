/**
 * ServicoAdicionalERP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class ServicoAdicionalERP  implements java.io.Serializable {
    private java.lang.String categoria;

    private java.lang.String codigo;

    private java.util.Calendar dataAtualizacao;

    private java.lang.Integer datajAtualizacao;

    private java.lang.String descricao;

    private java.lang.Integer horajAtualizacao;

    private java.lang.Integer id;

    private java.lang.String sigla;

    private br.com.correios.bsb.sigep.master.bean.cliente.ValorDeclarado valorDeclarado;

    public ServicoAdicionalERP() {
    }

    public ServicoAdicionalERP(
           java.lang.String categoria,
           java.lang.String codigo,
           java.util.Calendar dataAtualizacao,
           java.lang.Integer datajAtualizacao,
           java.lang.String descricao,
           java.lang.Integer horajAtualizacao,
           java.lang.Integer id,
           java.lang.String sigla,
           br.com.correios.bsb.sigep.master.bean.cliente.ValorDeclarado valorDeclarado) {
           this.categoria = categoria;
           this.codigo = codigo;
           this.dataAtualizacao = dataAtualizacao;
           this.datajAtualizacao = datajAtualizacao;
           this.descricao = descricao;
           this.horajAtualizacao = horajAtualizacao;
           this.id = id;
           this.sigla = sigla;
           this.valorDeclarado = valorDeclarado;
    }


    /**
     * Gets the categoria value for this ServicoAdicionalERP.
     * 
     * @return categoria
     */
    public java.lang.String getCategoria() {
        return categoria;
    }


    /**
     * Sets the categoria value for this ServicoAdicionalERP.
     * 
     * @param categoria
     */
    public void setCategoria(java.lang.String categoria) {
        this.categoria = categoria;
    }


    /**
     * Gets the codigo value for this ServicoAdicionalERP.
     * 
     * @return codigo
     */
    public java.lang.String getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this ServicoAdicionalERP.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.String codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the dataAtualizacao value for this ServicoAdicionalERP.
     * 
     * @return dataAtualizacao
     */
    public java.util.Calendar getDataAtualizacao() {
        return dataAtualizacao;
    }


    /**
     * Sets the dataAtualizacao value for this ServicoAdicionalERP.
     * 
     * @param dataAtualizacao
     */
    public void setDataAtualizacao(java.util.Calendar dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }


    /**
     * Gets the datajAtualizacao value for this ServicoAdicionalERP.
     * 
     * @return datajAtualizacao
     */
    public java.lang.Integer getDatajAtualizacao() {
        return datajAtualizacao;
    }


    /**
     * Sets the datajAtualizacao value for this ServicoAdicionalERP.
     * 
     * @param datajAtualizacao
     */
    public void setDatajAtualizacao(java.lang.Integer datajAtualizacao) {
        this.datajAtualizacao = datajAtualizacao;
    }


    /**
     * Gets the descricao value for this ServicoAdicionalERP.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this ServicoAdicionalERP.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the horajAtualizacao value for this ServicoAdicionalERP.
     * 
     * @return horajAtualizacao
     */
    public java.lang.Integer getHorajAtualizacao() {
        return horajAtualizacao;
    }


    /**
     * Sets the horajAtualizacao value for this ServicoAdicionalERP.
     * 
     * @param horajAtualizacao
     */
    public void setHorajAtualizacao(java.lang.Integer horajAtualizacao) {
        this.horajAtualizacao = horajAtualizacao;
    }


    /**
     * Gets the id value for this ServicoAdicionalERP.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this ServicoAdicionalERP.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the sigla value for this ServicoAdicionalERP.
     * 
     * @return sigla
     */
    public java.lang.String getSigla() {
        return sigla;
    }


    /**
     * Sets the sigla value for this ServicoAdicionalERP.
     * 
     * @param sigla
     */
    public void setSigla(java.lang.String sigla) {
        this.sigla = sigla;
    }


    /**
     * Gets the valorDeclarado value for this ServicoAdicionalERP.
     * 
     * @return valorDeclarado
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ValorDeclarado getValorDeclarado() {
        return valorDeclarado;
    }


    /**
     * Sets the valorDeclarado value for this ServicoAdicionalERP.
     * 
     * @param valorDeclarado
     */
    public void setValorDeclarado(br.com.correios.bsb.sigep.master.bean.cliente.ValorDeclarado valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServicoAdicionalERP)) return false;
        ServicoAdicionalERP other = (ServicoAdicionalERP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.categoria==null && other.getCategoria()==null) || 
             (this.categoria!=null &&
              this.categoria.equals(other.getCategoria()))) &&
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.dataAtualizacao==null && other.getDataAtualizacao()==null) || 
             (this.dataAtualizacao!=null &&
              this.dataAtualizacao.equals(other.getDataAtualizacao()))) &&
            ((this.datajAtualizacao==null && other.getDatajAtualizacao()==null) || 
             (this.datajAtualizacao!=null &&
              this.datajAtualizacao.equals(other.getDatajAtualizacao()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.horajAtualizacao==null && other.getHorajAtualizacao()==null) || 
             (this.horajAtualizacao!=null &&
              this.horajAtualizacao.equals(other.getHorajAtualizacao()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.sigla==null && other.getSigla()==null) || 
             (this.sigla!=null &&
              this.sigla.equals(other.getSigla()))) &&
            ((this.valorDeclarado==null && other.getValorDeclarado()==null) || 
             (this.valorDeclarado!=null &&
              this.valorDeclarado.equals(other.getValorDeclarado())));
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
        if (getCategoria() != null) {
            _hashCode += getCategoria().hashCode();
        }
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getDataAtualizacao() != null) {
            _hashCode += getDataAtualizacao().hashCode();
        }
        if (getDatajAtualizacao() != null) {
            _hashCode += getDatajAtualizacao().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getHorajAtualizacao() != null) {
            _hashCode += getHorajAtualizacao().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getSigla() != null) {
            _hashCode += getSigla().hashCode();
        }
        if (getValorDeclarado() != null) {
            _hashCode += getValorDeclarado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServicoAdicionalERP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "servicoAdicionalERP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAtualizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataAtualizacao"));
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
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricao"));
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
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sigla");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sigla"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorDeclarado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorDeclarado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "valorDeclarado"));
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
