/**
 * ServicoERP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class ServicoERP  implements java.io.Serializable {
    private java.lang.String codigo;

    private java.util.Calendar dataAtualizacao;

    private java.lang.Integer datajAtualizacao;

    private java.lang.String descricao;

    private java.lang.Integer horajAtualizacao;

    private long id;

    private br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep servicoSigep;

    private br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP[] servicosAdicionais;

    private java.lang.String tipo1Codigo;

    private java.lang.String tipo1Descricao;

    private java.lang.String tipo2Codigo;

    private java.lang.String tipo2Descricao;

    private br.com.correios.bsb.sigep.master.bean.cliente.VigenciaERP vigencia;

    public ServicoERP() {
    }

    public ServicoERP(
           java.lang.String codigo,
           java.util.Calendar dataAtualizacao,
           java.lang.Integer datajAtualizacao,
           java.lang.String descricao,
           java.lang.Integer horajAtualizacao,
           long id,
           br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep servicoSigep,
           br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP[] servicosAdicionais,
           java.lang.String tipo1Codigo,
           java.lang.String tipo1Descricao,
           java.lang.String tipo2Codigo,
           java.lang.String tipo2Descricao,
           br.com.correios.bsb.sigep.master.bean.cliente.VigenciaERP vigencia) {
           this.codigo = codigo;
           this.dataAtualizacao = dataAtualizacao;
           this.datajAtualizacao = datajAtualizacao;
           this.descricao = descricao;
           this.horajAtualizacao = horajAtualizacao;
           this.id = id;
           this.servicoSigep = servicoSigep;
           this.servicosAdicionais = servicosAdicionais;
           this.tipo1Codigo = tipo1Codigo;
           this.tipo1Descricao = tipo1Descricao;
           this.tipo2Codigo = tipo2Codigo;
           this.tipo2Descricao = tipo2Descricao;
           this.vigencia = vigencia;
    }


    /**
     * Gets the codigo value for this ServicoERP.
     * 
     * @return codigo
     */
    public java.lang.String getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this ServicoERP.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.String codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the dataAtualizacao value for this ServicoERP.
     * 
     * @return dataAtualizacao
     */
    public java.util.Calendar getDataAtualizacao() {
        return dataAtualizacao;
    }


    /**
     * Sets the dataAtualizacao value for this ServicoERP.
     * 
     * @param dataAtualizacao
     */
    public void setDataAtualizacao(java.util.Calendar dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }


    /**
     * Gets the datajAtualizacao value for this ServicoERP.
     * 
     * @return datajAtualizacao
     */
    public java.lang.Integer getDatajAtualizacao() {
        return datajAtualizacao;
    }


    /**
     * Sets the datajAtualizacao value for this ServicoERP.
     * 
     * @param datajAtualizacao
     */
    public void setDatajAtualizacao(java.lang.Integer datajAtualizacao) {
        this.datajAtualizacao = datajAtualizacao;
    }


    /**
     * Gets the descricao value for this ServicoERP.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this ServicoERP.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the horajAtualizacao value for this ServicoERP.
     * 
     * @return horajAtualizacao
     */
    public java.lang.Integer getHorajAtualizacao() {
        return horajAtualizacao;
    }


    /**
     * Sets the horajAtualizacao value for this ServicoERP.
     * 
     * @param horajAtualizacao
     */
    public void setHorajAtualizacao(java.lang.Integer horajAtualizacao) {
        this.horajAtualizacao = horajAtualizacao;
    }


    /**
     * Gets the id value for this ServicoERP.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this ServicoERP.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the servicoSigep value for this ServicoERP.
     * 
     * @return servicoSigep
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep getServicoSigep() {
        return servicoSigep;
    }


    /**
     * Sets the servicoSigep value for this ServicoERP.
     * 
     * @param servicoSigep
     */
    public void setServicoSigep(br.com.correios.bsb.sigep.master.bean.cliente.ServicoSigep servicoSigep) {
        this.servicoSigep = servicoSigep;
    }


    /**
     * Gets the servicosAdicionais value for this ServicoERP.
     * 
     * @return servicosAdicionais
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP[] getServicosAdicionais() {
        return servicosAdicionais;
    }


    /**
     * Sets the servicosAdicionais value for this ServicoERP.
     * 
     * @param servicosAdicionais
     */
    public void setServicosAdicionais(br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP[] servicosAdicionais) {
        this.servicosAdicionais = servicosAdicionais;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP getServicosAdicionais(int i) {
        return this.servicosAdicionais[i];
    }

    public void setServicosAdicionais(int i, br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalERP _value) {
        this.servicosAdicionais[i] = _value;
    }


    /**
     * Gets the tipo1Codigo value for this ServicoERP.
     * 
     * @return tipo1Codigo
     */
    public java.lang.String getTipo1Codigo() {
        return tipo1Codigo;
    }


    /**
     * Sets the tipo1Codigo value for this ServicoERP.
     * 
     * @param tipo1Codigo
     */
    public void setTipo1Codigo(java.lang.String tipo1Codigo) {
        this.tipo1Codigo = tipo1Codigo;
    }


    /**
     * Gets the tipo1Descricao value for this ServicoERP.
     * 
     * @return tipo1Descricao
     */
    public java.lang.String getTipo1Descricao() {
        return tipo1Descricao;
    }


    /**
     * Sets the tipo1Descricao value for this ServicoERP.
     * 
     * @param tipo1Descricao
     */
    public void setTipo1Descricao(java.lang.String tipo1Descricao) {
        this.tipo1Descricao = tipo1Descricao;
    }


    /**
     * Gets the tipo2Codigo value for this ServicoERP.
     * 
     * @return tipo2Codigo
     */
    public java.lang.String getTipo2Codigo() {
        return tipo2Codigo;
    }


    /**
     * Sets the tipo2Codigo value for this ServicoERP.
     * 
     * @param tipo2Codigo
     */
    public void setTipo2Codigo(java.lang.String tipo2Codigo) {
        this.tipo2Codigo = tipo2Codigo;
    }


    /**
     * Gets the tipo2Descricao value for this ServicoERP.
     * 
     * @return tipo2Descricao
     */
    public java.lang.String getTipo2Descricao() {
        return tipo2Descricao;
    }


    /**
     * Sets the tipo2Descricao value for this ServicoERP.
     * 
     * @param tipo2Descricao
     */
    public void setTipo2Descricao(java.lang.String tipo2Descricao) {
        this.tipo2Descricao = tipo2Descricao;
    }


    /**
     * Gets the vigencia value for this ServicoERP.
     * 
     * @return vigencia
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.VigenciaERP getVigencia() {
        return vigencia;
    }


    /**
     * Sets the vigencia value for this ServicoERP.
     * 
     * @param vigencia
     */
    public void setVigencia(br.com.correios.bsb.sigep.master.bean.cliente.VigenciaERP vigencia) {
        this.vigencia = vigencia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServicoERP)) return false;
        ServicoERP other = (ServicoERP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
            this.id == other.getId() &&
            ((this.servicoSigep==null && other.getServicoSigep()==null) || 
             (this.servicoSigep!=null &&
              this.servicoSigep.equals(other.getServicoSigep()))) &&
            ((this.servicosAdicionais==null && other.getServicosAdicionais()==null) || 
             (this.servicosAdicionais!=null &&
              java.util.Arrays.equals(this.servicosAdicionais, other.getServicosAdicionais()))) &&
            ((this.tipo1Codigo==null && other.getTipo1Codigo()==null) || 
             (this.tipo1Codigo!=null &&
              this.tipo1Codigo.equals(other.getTipo1Codigo()))) &&
            ((this.tipo1Descricao==null && other.getTipo1Descricao()==null) || 
             (this.tipo1Descricao!=null &&
              this.tipo1Descricao.equals(other.getTipo1Descricao()))) &&
            ((this.tipo2Codigo==null && other.getTipo2Codigo()==null) || 
             (this.tipo2Codigo!=null &&
              this.tipo2Codigo.equals(other.getTipo2Codigo()))) &&
            ((this.tipo2Descricao==null && other.getTipo2Descricao()==null) || 
             (this.tipo2Descricao!=null &&
              this.tipo2Descricao.equals(other.getTipo2Descricao()))) &&
            ((this.vigencia==null && other.getVigencia()==null) || 
             (this.vigencia!=null &&
              this.vigencia.equals(other.getVigencia())));
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
        _hashCode += new Long(getId()).hashCode();
        if (getServicoSigep() != null) {
            _hashCode += getServicoSigep().hashCode();
        }
        if (getServicosAdicionais() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicosAdicionais());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicosAdicionais(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTipo1Codigo() != null) {
            _hashCode += getTipo1Codigo().hashCode();
        }
        if (getTipo1Descricao() != null) {
            _hashCode += getTipo1Descricao().hashCode();
        }
        if (getTipo2Codigo() != null) {
            _hashCode += getTipo2Codigo().hashCode();
        }
        if (getTipo2Descricao() != null) {
            _hashCode += getTipo2Descricao().hashCode();
        }
        if (getVigencia() != null) {
            _hashCode += getVigencia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServicoERP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "servicoERP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicoSigep");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicoSigep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "servicoSigep"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicosAdicionais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicosAdicionais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "servicoAdicionalERP"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo1Codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo1Codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo1Descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo1Descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo2Codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo2Codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo2Descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo2Descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vigencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vigencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "vigenciaERP"));
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
