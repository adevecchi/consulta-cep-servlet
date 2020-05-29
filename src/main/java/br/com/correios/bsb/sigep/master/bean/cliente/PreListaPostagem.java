/**
 * PreListaPostagem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class PreListaPostagem  implements java.io.Serializable {
    private br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP cartaoPostagem;

    private br.com.correios.bsb.sigep.master.bean.cliente.SimNao conteudoProibido;

    private java.util.Calendar dataAtualizacaoCliente;

    private java.util.Calendar dataAtualizacaoSara;

    private java.util.Calendar dataFechamento;

    private java.util.Calendar dataPostagem;

    private java.util.Calendar dataPostagemSara;

    private br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[] objetosPostais;

    private long plpCliente;

    private long plpNu;

    private org.apache.axis.types.UnsignedShort[] plpXml;

    private org.apache.axis.types.UnsignedShort[] plpXmlRetorno;

    private br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp status;

    public PreListaPostagem() {
    }

    public PreListaPostagem(
           br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP cartaoPostagem,
           br.com.correios.bsb.sigep.master.bean.cliente.SimNao conteudoProibido,
           java.util.Calendar dataAtualizacaoCliente,
           java.util.Calendar dataAtualizacaoSara,
           java.util.Calendar dataFechamento,
           java.util.Calendar dataPostagem,
           java.util.Calendar dataPostagemSara,
           br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[] objetosPostais,
           long plpCliente,
           long plpNu,
           org.apache.axis.types.UnsignedShort[] plpXml,
           org.apache.axis.types.UnsignedShort[] plpXmlRetorno,
           br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp status) {
           this.cartaoPostagem = cartaoPostagem;
           this.conteudoProibido = conteudoProibido;
           this.dataAtualizacaoCliente = dataAtualizacaoCliente;
           this.dataAtualizacaoSara = dataAtualizacaoSara;
           this.dataFechamento = dataFechamento;
           this.dataPostagem = dataPostagem;
           this.dataPostagemSara = dataPostagemSara;
           this.objetosPostais = objetosPostais;
           this.plpCliente = plpCliente;
           this.plpNu = plpNu;
           this.plpXml = plpXml;
           this.plpXmlRetorno = plpXmlRetorno;
           this.status = status;
    }


    /**
     * Gets the cartaoPostagem value for this PreListaPostagem.
     * 
     * @return cartaoPostagem
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP getCartaoPostagem() {
        return cartaoPostagem;
    }


    /**
     * Sets the cartaoPostagem value for this PreListaPostagem.
     * 
     * @param cartaoPostagem
     */
    public void setCartaoPostagem(br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP cartaoPostagem) {
        this.cartaoPostagem = cartaoPostagem;
    }


    /**
     * Gets the conteudoProibido value for this PreListaPostagem.
     * 
     * @return conteudoProibido
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.SimNao getConteudoProibido() {
        return conteudoProibido;
    }


    /**
     * Sets the conteudoProibido value for this PreListaPostagem.
     * 
     * @param conteudoProibido
     */
    public void setConteudoProibido(br.com.correios.bsb.sigep.master.bean.cliente.SimNao conteudoProibido) {
        this.conteudoProibido = conteudoProibido;
    }


    /**
     * Gets the dataAtualizacaoCliente value for this PreListaPostagem.
     * 
     * @return dataAtualizacaoCliente
     */
    public java.util.Calendar getDataAtualizacaoCliente() {
        return dataAtualizacaoCliente;
    }


    /**
     * Sets the dataAtualizacaoCliente value for this PreListaPostagem.
     * 
     * @param dataAtualizacaoCliente
     */
    public void setDataAtualizacaoCliente(java.util.Calendar dataAtualizacaoCliente) {
        this.dataAtualizacaoCliente = dataAtualizacaoCliente;
    }


    /**
     * Gets the dataAtualizacaoSara value for this PreListaPostagem.
     * 
     * @return dataAtualizacaoSara
     */
    public java.util.Calendar getDataAtualizacaoSara() {
        return dataAtualizacaoSara;
    }


    /**
     * Sets the dataAtualizacaoSara value for this PreListaPostagem.
     * 
     * @param dataAtualizacaoSara
     */
    public void setDataAtualizacaoSara(java.util.Calendar dataAtualizacaoSara) {
        this.dataAtualizacaoSara = dataAtualizacaoSara;
    }


    /**
     * Gets the dataFechamento value for this PreListaPostagem.
     * 
     * @return dataFechamento
     */
    public java.util.Calendar getDataFechamento() {
        return dataFechamento;
    }


    /**
     * Sets the dataFechamento value for this PreListaPostagem.
     * 
     * @param dataFechamento
     */
    public void setDataFechamento(java.util.Calendar dataFechamento) {
        this.dataFechamento = dataFechamento;
    }


    /**
     * Gets the dataPostagem value for this PreListaPostagem.
     * 
     * @return dataPostagem
     */
    public java.util.Calendar getDataPostagem() {
        return dataPostagem;
    }


    /**
     * Sets the dataPostagem value for this PreListaPostagem.
     * 
     * @param dataPostagem
     */
    public void setDataPostagem(java.util.Calendar dataPostagem) {
        this.dataPostagem = dataPostagem;
    }


    /**
     * Gets the dataPostagemSara value for this PreListaPostagem.
     * 
     * @return dataPostagemSara
     */
    public java.util.Calendar getDataPostagemSara() {
        return dataPostagemSara;
    }


    /**
     * Sets the dataPostagemSara value for this PreListaPostagem.
     * 
     * @param dataPostagemSara
     */
    public void setDataPostagemSara(java.util.Calendar dataPostagemSara) {
        this.dataPostagemSara = dataPostagemSara;
    }


    /**
     * Gets the objetosPostais value for this PreListaPostagem.
     * 
     * @return objetosPostais
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[] getObjetosPostais() {
        return objetosPostais;
    }


    /**
     * Sets the objetosPostais value for this PreListaPostagem.
     * 
     * @param objetosPostais
     */
    public void setObjetosPostais(br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[] objetosPostais) {
        this.objetosPostais = objetosPostais;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal getObjetosPostais(int i) {
        return this.objetosPostais[i];
    }

    public void setObjetosPostais(int i, br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal _value) {
        this.objetosPostais[i] = _value;
    }


    /**
     * Gets the plpCliente value for this PreListaPostagem.
     * 
     * @return plpCliente
     */
    public long getPlpCliente() {
        return plpCliente;
    }


    /**
     * Sets the plpCliente value for this PreListaPostagem.
     * 
     * @param plpCliente
     */
    public void setPlpCliente(long plpCliente) {
        this.plpCliente = plpCliente;
    }


    /**
     * Gets the plpNu value for this PreListaPostagem.
     * 
     * @return plpNu
     */
    public long getPlpNu() {
        return plpNu;
    }


    /**
     * Sets the plpNu value for this PreListaPostagem.
     * 
     * @param plpNu
     */
    public void setPlpNu(long plpNu) {
        this.plpNu = plpNu;
    }


    /**
     * Gets the plpXml value for this PreListaPostagem.
     * 
     * @return plpXml
     */
    public org.apache.axis.types.UnsignedShort[] getPlpXml() {
        return plpXml;
    }


    /**
     * Sets the plpXml value for this PreListaPostagem.
     * 
     * @param plpXml
     */
    public void setPlpXml(org.apache.axis.types.UnsignedShort[] plpXml) {
        this.plpXml = plpXml;
    }

    public org.apache.axis.types.UnsignedShort getPlpXml(int i) {
        return this.plpXml[i];
    }

    public void setPlpXml(int i, org.apache.axis.types.UnsignedShort _value) {
        this.plpXml[i] = _value;
    }


    /**
     * Gets the plpXmlRetorno value for this PreListaPostagem.
     * 
     * @return plpXmlRetorno
     */
    public org.apache.axis.types.UnsignedShort[] getPlpXmlRetorno() {
        return plpXmlRetorno;
    }


    /**
     * Sets the plpXmlRetorno value for this PreListaPostagem.
     * 
     * @param plpXmlRetorno
     */
    public void setPlpXmlRetorno(org.apache.axis.types.UnsignedShort[] plpXmlRetorno) {
        this.plpXmlRetorno = plpXmlRetorno;
    }

    public org.apache.axis.types.UnsignedShort getPlpXmlRetorno(int i) {
        return this.plpXmlRetorno[i];
    }

    public void setPlpXmlRetorno(int i, org.apache.axis.types.UnsignedShort _value) {
        this.plpXmlRetorno[i] = _value;
    }


    /**
     * Gets the status value for this PreListaPostagem.
     * 
     * @return status
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PreListaPostagem.
     * 
     * @param status
     */
    public void setStatus(br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PreListaPostagem)) return false;
        PreListaPostagem other = (PreListaPostagem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cartaoPostagem==null && other.getCartaoPostagem()==null) || 
             (this.cartaoPostagem!=null &&
              this.cartaoPostagem.equals(other.getCartaoPostagem()))) &&
            ((this.conteudoProibido==null && other.getConteudoProibido()==null) || 
             (this.conteudoProibido!=null &&
              this.conteudoProibido.equals(other.getConteudoProibido()))) &&
            ((this.dataAtualizacaoCliente==null && other.getDataAtualizacaoCliente()==null) || 
             (this.dataAtualizacaoCliente!=null &&
              this.dataAtualizacaoCliente.equals(other.getDataAtualizacaoCliente()))) &&
            ((this.dataAtualizacaoSara==null && other.getDataAtualizacaoSara()==null) || 
             (this.dataAtualizacaoSara!=null &&
              this.dataAtualizacaoSara.equals(other.getDataAtualizacaoSara()))) &&
            ((this.dataFechamento==null && other.getDataFechamento()==null) || 
             (this.dataFechamento!=null &&
              this.dataFechamento.equals(other.getDataFechamento()))) &&
            ((this.dataPostagem==null && other.getDataPostagem()==null) || 
             (this.dataPostagem!=null &&
              this.dataPostagem.equals(other.getDataPostagem()))) &&
            ((this.dataPostagemSara==null && other.getDataPostagemSara()==null) || 
             (this.dataPostagemSara!=null &&
              this.dataPostagemSara.equals(other.getDataPostagemSara()))) &&
            ((this.objetosPostais==null && other.getObjetosPostais()==null) || 
             (this.objetosPostais!=null &&
              java.util.Arrays.equals(this.objetosPostais, other.getObjetosPostais()))) &&
            this.plpCliente == other.getPlpCliente() &&
            this.plpNu == other.getPlpNu() &&
            ((this.plpXml==null && other.getPlpXml()==null) || 
             (this.plpXml!=null &&
              java.util.Arrays.equals(this.plpXml, other.getPlpXml()))) &&
            ((this.plpXmlRetorno==null && other.getPlpXmlRetorno()==null) || 
             (this.plpXmlRetorno!=null &&
              java.util.Arrays.equals(this.plpXmlRetorno, other.getPlpXmlRetorno()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getCartaoPostagem() != null) {
            _hashCode += getCartaoPostagem().hashCode();
        }
        if (getConteudoProibido() != null) {
            _hashCode += getConteudoProibido().hashCode();
        }
        if (getDataAtualizacaoCliente() != null) {
            _hashCode += getDataAtualizacaoCliente().hashCode();
        }
        if (getDataAtualizacaoSara() != null) {
            _hashCode += getDataAtualizacaoSara().hashCode();
        }
        if (getDataFechamento() != null) {
            _hashCode += getDataFechamento().hashCode();
        }
        if (getDataPostagem() != null) {
            _hashCode += getDataPostagem().hashCode();
        }
        if (getDataPostagemSara() != null) {
            _hashCode += getDataPostagemSara().hashCode();
        }
        if (getObjetosPostais() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObjetosPostais());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObjetosPostais(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getPlpCliente()).hashCode();
        _hashCode += new Long(getPlpNu()).hashCode();
        if (getPlpXml() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlpXml());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlpXml(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPlpXmlRetorno() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlpXmlRetorno());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlpXmlRetorno(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PreListaPostagem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "preListaPostagem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartaoPostagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cartaoPostagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "cartaoPostagemERP"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conteudoProibido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conteudoProibido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "simNao"));
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
        elemField.setFieldName("dataAtualizacaoSara");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataAtualizacaoSara"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFechamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataFechamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPostagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataPostagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPostagemSara");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataPostagemSara"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objetosPostais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objetosPostais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "objetoPostal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plpCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "plpCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plpNu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "plpNu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plpXml");
        elemField.setXmlName(new javax.xml.namespace.QName("", "plpXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plpXmlRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "plpXmlRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "statusPlp"));
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
