/**
 * ChancelaMaster.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class ChancelaMaster  implements java.io.Serializable {
    private br.com.correios.bsb.sigep.master.bean.cliente.SimNao ativo;

    private byte[] chancela;

    private java.util.Calendar dataAtualizacao;

    private java.lang.String descricao;

    private java.lang.Long id;

    private br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep[] servicosSigep;

    public ChancelaMaster() {
    }

    public ChancelaMaster(
           br.com.correios.bsb.sigep.master.bean.cliente.SimNao ativo,
           byte[] chancela,
           java.util.Calendar dataAtualizacao,
           java.lang.String descricao,
           java.lang.Long id,
           br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep[] servicosSigep) {
           this.ativo = ativo;
           this.chancela = chancela;
           this.dataAtualizacao = dataAtualizacao;
           this.descricao = descricao;
           this.id = id;
           this.servicosSigep = servicosSigep;
    }


    /**
     * Gets the ativo value for this ChancelaMaster.
     * 
     * @return ativo
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SimNao getAtivo() {
        return ativo;
    }


    /**
     * Sets the ativo value for this ChancelaMaster.
     * 
     * @param ativo
     */
    public void setAtivo(br.com.correios.bsb.sigep.master.bean.cliente.SimNao ativo) {
        this.ativo = ativo;
    }


    /**
     * Gets the chancela value for this ChancelaMaster.
     * 
     * @return chancela
     */
    public byte[] getChancela() {
        return chancela;
    }


    /**
     * Sets the chancela value for this ChancelaMaster.
     * 
     * @param chancela
     */
    public void setChancela(byte[] chancela) {
        this.chancela = chancela;
    }


    /**
     * Gets the dataAtualizacao value for this ChancelaMaster.
     * 
     * @return dataAtualizacao
     */
    public java.util.Calendar getDataAtualizacao() {
        return dataAtualizacao;
    }


    /**
     * Sets the dataAtualizacao value for this ChancelaMaster.
     * 
     * @param dataAtualizacao
     */
    public void setDataAtualizacao(java.util.Calendar dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }


    /**
     * Gets the descricao value for this ChancelaMaster.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this ChancelaMaster.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the id value for this ChancelaMaster.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ChancelaMaster.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the servicosSigep value for this ChancelaMaster.
     * 
     * @return servicosSigep
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep[] getServicosSigep() {
        return servicosSigep;
    }


    /**
     * Sets the servicosSigep value for this ChancelaMaster.
     * 
     * @param servicosSigep
     */
    public void setServicosSigep(br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep[] servicosSigep) {
        this.servicosSigep = servicosSigep;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep getServicosSigep(int i) {
        return this.servicosSigep[i];
    }

    public void setServicosSigep(int i, br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep _value) {
        this.servicosSigep[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChancelaMaster)) return false;
        ChancelaMaster other = (ChancelaMaster) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ativo==null && other.getAtivo()==null) || 
             (this.ativo!=null &&
              this.ativo.equals(other.getAtivo()))) &&
            ((this.chancela==null && other.getChancela()==null) || 
             (this.chancela!=null &&
              java.util.Arrays.equals(this.chancela, other.getChancela()))) &&
            ((this.dataAtualizacao==null && other.getDataAtualizacao()==null) || 
             (this.dataAtualizacao!=null &&
              this.dataAtualizacao.equals(other.getDataAtualizacao()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.servicosSigep==null && other.getServicosSigep()==null) || 
             (this.servicosSigep!=null &&
              java.util.Arrays.equals(this.servicosSigep, other.getServicosSigep())));
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
        if (getAtivo() != null) {
            _hashCode += getAtivo().hashCode();
        }
        if (getChancela() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChancela());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChancela(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDataAtualizacao() != null) {
            _hashCode += getDataAtualizacao().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getServicosSigep() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicosSigep());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicosSigep(), i);
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
        new org.apache.axis.description.TypeDesc(ChancelaMaster.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "chancelaMaster"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "simNao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chancela");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chancela"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicosSigep");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicosSigep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "servicoSigep"));
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
