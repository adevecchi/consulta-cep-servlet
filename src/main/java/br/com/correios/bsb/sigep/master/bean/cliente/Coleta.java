/**
 * Coleta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class Coleta  implements java.io.Serializable {
    private java.lang.String cklist;

    private java.lang.String descricao;

    private java.lang.String[] documento;

    private java.lang.String id_cliente;

    private br.com.correios.bsb.sigep.master.bean.cliente.Produto[] produto;

    private br.com.correios.bsb.sigep.master.bean.cliente.Remetente remetente;

    private java.lang.String tipo;

    private java.lang.String valor_declarado;

    public Coleta() {
    }

    public Coleta(
           java.lang.String cklist,
           java.lang.String descricao,
           java.lang.String[] documento,
           java.lang.String id_cliente,
           br.com.correios.bsb.sigep.master.bean.cliente.Produto[] produto,
           br.com.correios.bsb.sigep.master.bean.cliente.Remetente remetente,
           java.lang.String tipo,
           java.lang.String valor_declarado) {
           this.cklist = cklist;
           this.descricao = descricao;
           this.documento = documento;
           this.id_cliente = id_cliente;
           this.produto = produto;
           this.remetente = remetente;
           this.tipo = tipo;
           this.valor_declarado = valor_declarado;
    }


    /**
     * Gets the cklist value for this Coleta.
     * 
     * @return cklist
     */
    public java.lang.String getCklist() {
        return cklist;
    }


    /**
     * Sets the cklist value for this Coleta.
     * 
     * @param cklist
     */
    public void setCklist(java.lang.String cklist) {
        this.cklist = cklist;
    }


    /**
     * Gets the descricao value for this Coleta.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this Coleta.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the documento value for this Coleta.
     * 
     * @return documento
     */
    public java.lang.String[] getDocumento() {
        return documento;
    }


    /**
     * Sets the documento value for this Coleta.
     * 
     * @param documento
     */
    public void setDocumento(java.lang.String[] documento) {
        this.documento = documento;
    }

    public java.lang.String getDocumento(int i) {
        return this.documento[i];
    }

    public void setDocumento(int i, java.lang.String _value) {
        this.documento[i] = _value;
    }


    /**
     * Gets the id_cliente value for this Coleta.
     * 
     * @return id_cliente
     */
    public java.lang.String getId_cliente() {
        return id_cliente;
    }


    /**
     * Sets the id_cliente value for this Coleta.
     * 
     * @param id_cliente
     */
    public void setId_cliente(java.lang.String id_cliente) {
        this.id_cliente = id_cliente;
    }


    /**
     * Gets the produto value for this Coleta.
     * 
     * @return produto
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.Produto[] getProduto() {
        return produto;
    }


    /**
     * Sets the produto value for this Coleta.
     * 
     * @param produto
     */
    public void setProduto(br.com.correios.bsb.sigep.master.bean.cliente.Produto[] produto) {
        this.produto = produto;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.Produto getProduto(int i) {
        return this.produto[i];
    }

    public void setProduto(int i, br.com.correios.bsb.sigep.master.bean.cliente.Produto _value) {
        this.produto[i] = _value;
    }


    /**
     * Gets the remetente value for this Coleta.
     * 
     * @return remetente
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.Remetente getRemetente() {
        return remetente;
    }


    /**
     * Sets the remetente value for this Coleta.
     * 
     * @param remetente
     */
    public void setRemetente(br.com.correios.bsb.sigep.master.bean.cliente.Remetente remetente) {
        this.remetente = remetente;
    }


    /**
     * Gets the tipo value for this Coleta.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this Coleta.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the valor_declarado value for this Coleta.
     * 
     * @return valor_declarado
     */
    public java.lang.String getValor_declarado() {
        return valor_declarado;
    }


    /**
     * Sets the valor_declarado value for this Coleta.
     * 
     * @param valor_declarado
     */
    public void setValor_declarado(java.lang.String valor_declarado) {
        this.valor_declarado = valor_declarado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Coleta)) return false;
        Coleta other = (Coleta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cklist==null && other.getCklist()==null) || 
             (this.cklist!=null &&
              this.cklist.equals(other.getCklist()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.documento==null && other.getDocumento()==null) || 
             (this.documento!=null &&
              java.util.Arrays.equals(this.documento, other.getDocumento()))) &&
            ((this.id_cliente==null && other.getId_cliente()==null) || 
             (this.id_cliente!=null &&
              this.id_cliente.equals(other.getId_cliente()))) &&
            ((this.produto==null && other.getProduto()==null) || 
             (this.produto!=null &&
              java.util.Arrays.equals(this.produto, other.getProduto()))) &&
            ((this.remetente==null && other.getRemetente()==null) || 
             (this.remetente!=null &&
              this.remetente.equals(other.getRemetente()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.valor_declarado==null && other.getValor_declarado()==null) || 
             (this.valor_declarado!=null &&
              this.valor_declarado.equals(other.getValor_declarado())));
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
        if (getCklist() != null) {
            _hashCode += getCklist().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getDocumento() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumento());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumento(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId_cliente() != null) {
            _hashCode += getId_cliente().hashCode();
        }
        if (getProduto() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProduto());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProduto(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemetente() != null) {
            _hashCode += getRemetente().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getValor_declarado() != null) {
            _hashCode += getValor_declarado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Coleta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "coleta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cklist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cklist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("documento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_cliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_cliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("produto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "produto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "produto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remetente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remetente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "remetente"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor_declarado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valor_declarado"));
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
