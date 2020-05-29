/**
 * ClienteERP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class ClienteERP  implements java.io.Serializable {
    private java.lang.String cnpj;

    private br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP[] contratos;

    private java.util.Calendar dataAtualizacao;

    private java.lang.Integer datajAtualizacao;

    private java.lang.String descricaoStatusCliente;

    private br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta[] gerenteConta;

    private java.lang.Long horajAtualizacao;

    private long id;

    private java.lang.String inscricaoEstadual;

    private java.lang.String nome;

    private java.lang.String statusCodigo;

    public ClienteERP() {
    }

    public ClienteERP(
           java.lang.String cnpj,
           br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP[] contratos,
           java.util.Calendar dataAtualizacao,
           java.lang.Integer datajAtualizacao,
           java.lang.String descricaoStatusCliente,
           br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta[] gerenteConta,
           java.lang.Long horajAtualizacao,
           long id,
           java.lang.String inscricaoEstadual,
           java.lang.String nome,
           java.lang.String statusCodigo) {
           this.cnpj = cnpj;
           this.contratos = contratos;
           this.dataAtualizacao = dataAtualizacao;
           this.datajAtualizacao = datajAtualizacao;
           this.descricaoStatusCliente = descricaoStatusCliente;
           this.gerenteConta = gerenteConta;
           this.horajAtualizacao = horajAtualizacao;
           this.id = id;
           this.inscricaoEstadual = inscricaoEstadual;
           this.nome = nome;
           this.statusCodigo = statusCodigo;
    }


    /**
     * Gets the cnpj value for this ClienteERP.
     * 
     * @return cnpj
     */
    public java.lang.String getCnpj() {
        return cnpj;
    }


    /**
     * Sets the cnpj value for this ClienteERP.
     * 
     * @param cnpj
     */
    public void setCnpj(java.lang.String cnpj) {
        this.cnpj = cnpj;
    }


    /**
     * Gets the contratos value for this ClienteERP.
     * 
     * @return contratos
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP[] getContratos() {
        return contratos;
    }


    /**
     * Sets the contratos value for this ClienteERP.
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
     * Gets the dataAtualizacao value for this ClienteERP.
     * 
     * @return dataAtualizacao
     */
    public java.util.Calendar getDataAtualizacao() {
        return dataAtualizacao;
    }


    /**
     * Sets the dataAtualizacao value for this ClienteERP.
     * 
     * @param dataAtualizacao
     */
    public void setDataAtualizacao(java.util.Calendar dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }


    /**
     * Gets the datajAtualizacao value for this ClienteERP.
     * 
     * @return datajAtualizacao
     */
    public java.lang.Integer getDatajAtualizacao() {
        return datajAtualizacao;
    }


    /**
     * Sets the datajAtualizacao value for this ClienteERP.
     * 
     * @param datajAtualizacao
     */
    public void setDatajAtualizacao(java.lang.Integer datajAtualizacao) {
        this.datajAtualizacao = datajAtualizacao;
    }


    /**
     * Gets the descricaoStatusCliente value for this ClienteERP.
     * 
     * @return descricaoStatusCliente
     */
    public java.lang.String getDescricaoStatusCliente() {
        return descricaoStatusCliente;
    }


    /**
     * Sets the descricaoStatusCliente value for this ClienteERP.
     * 
     * @param descricaoStatusCliente
     */
    public void setDescricaoStatusCliente(java.lang.String descricaoStatusCliente) {
        this.descricaoStatusCliente = descricaoStatusCliente;
    }


    /**
     * Gets the gerenteConta value for this ClienteERP.
     * 
     * @return gerenteConta
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta[] getGerenteConta() {
        return gerenteConta;
    }


    /**
     * Sets the gerenteConta value for this ClienteERP.
     * 
     * @param gerenteConta
     */
    public void setGerenteConta(br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta[] gerenteConta) {
        this.gerenteConta = gerenteConta;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta getGerenteConta(int i) {
        return this.gerenteConta[i];
    }

    public void setGerenteConta(int i, br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta _value) {
        this.gerenteConta[i] = _value;
    }


    /**
     * Gets the horajAtualizacao value for this ClienteERP.
     * 
     * @return horajAtualizacao
     */
    public java.lang.Long getHorajAtualizacao() {
        return horajAtualizacao;
    }


    /**
     * Sets the horajAtualizacao value for this ClienteERP.
     * 
     * @param horajAtualizacao
     */
    public void setHorajAtualizacao(java.lang.Long horajAtualizacao) {
        this.horajAtualizacao = horajAtualizacao;
    }


    /**
     * Gets the id value for this ClienteERP.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this ClienteERP.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the inscricaoEstadual value for this ClienteERP.
     * 
     * @return inscricaoEstadual
     */
    public java.lang.String getInscricaoEstadual() {
        return inscricaoEstadual;
    }


    /**
     * Sets the inscricaoEstadual value for this ClienteERP.
     * 
     * @param inscricaoEstadual
     */
    public void setInscricaoEstadual(java.lang.String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }


    /**
     * Gets the nome value for this ClienteERP.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this ClienteERP.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the statusCodigo value for this ClienteERP.
     * 
     * @return statusCodigo
     */
    public java.lang.String getStatusCodigo() {
        return statusCodigo;
    }


    /**
     * Sets the statusCodigo value for this ClienteERP.
     * 
     * @param statusCodigo
     */
    public void setStatusCodigo(java.lang.String statusCodigo) {
        this.statusCodigo = statusCodigo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClienteERP)) return false;
        ClienteERP other = (ClienteERP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cnpj==null && other.getCnpj()==null) || 
             (this.cnpj!=null &&
              this.cnpj.equals(other.getCnpj()))) &&
            ((this.contratos==null && other.getContratos()==null) || 
             (this.contratos!=null &&
              java.util.Arrays.equals(this.contratos, other.getContratos()))) &&
            ((this.dataAtualizacao==null && other.getDataAtualizacao()==null) || 
             (this.dataAtualizacao!=null &&
              this.dataAtualizacao.equals(other.getDataAtualizacao()))) &&
            ((this.datajAtualizacao==null && other.getDatajAtualizacao()==null) || 
             (this.datajAtualizacao!=null &&
              this.datajAtualizacao.equals(other.getDatajAtualizacao()))) &&
            ((this.descricaoStatusCliente==null && other.getDescricaoStatusCliente()==null) || 
             (this.descricaoStatusCliente!=null &&
              this.descricaoStatusCliente.equals(other.getDescricaoStatusCliente()))) &&
            ((this.gerenteConta==null && other.getGerenteConta()==null) || 
             (this.gerenteConta!=null &&
              java.util.Arrays.equals(this.gerenteConta, other.getGerenteConta()))) &&
            ((this.horajAtualizacao==null && other.getHorajAtualizacao()==null) || 
             (this.horajAtualizacao!=null &&
              this.horajAtualizacao.equals(other.getHorajAtualizacao()))) &&
            this.id == other.getId() &&
            ((this.inscricaoEstadual==null && other.getInscricaoEstadual()==null) || 
             (this.inscricaoEstadual!=null &&
              this.inscricaoEstadual.equals(other.getInscricaoEstadual()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.statusCodigo==null && other.getStatusCodigo()==null) || 
             (this.statusCodigo!=null &&
              this.statusCodigo.equals(other.getStatusCodigo())));
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
        if (getCnpj() != null) {
            _hashCode += getCnpj().hashCode();
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
        if (getDatajAtualizacao() != null) {
            _hashCode += getDatajAtualizacao().hashCode();
        }
        if (getDescricaoStatusCliente() != null) {
            _hashCode += getDescricaoStatusCliente().hashCode();
        }
        if (getGerenteConta() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGerenteConta());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGerenteConta(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHorajAtualizacao() != null) {
            _hashCode += getHorajAtualizacao().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        if (getInscricaoEstadual() != null) {
            _hashCode += getInscricaoEstadual().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getStatusCodigo() != null) {
            _hashCode += getStatusCodigo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClienteERP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "clienteERP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cnpj"));
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
        elemField.setFieldName("datajAtualizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datajAtualizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoStatusCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricaoStatusCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gerenteConta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gerenteConta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "gerenteConta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horajAtualizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "horajAtualizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inscricaoEstadual");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inscricaoEstadual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
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
