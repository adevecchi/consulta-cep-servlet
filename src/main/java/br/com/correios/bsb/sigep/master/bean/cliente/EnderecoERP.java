/**
 * EnderecoERP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class EnderecoERP  implements java.io.Serializable {
    private java.lang.String bairro;

    private java.lang.String cep;

    private java.lang.String cidade;

    private java.lang.String complemento2;

    private java.lang.String end;

    private java.lang.String uf;

    private br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP[] unidadesPostagem;

    public EnderecoERP() {
    }

    public EnderecoERP(
           java.lang.String bairro,
           java.lang.String cep,
           java.lang.String cidade,
           java.lang.String complemento2,
           java.lang.String end,
           java.lang.String uf,
           br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP[] unidadesPostagem) {
           this.bairro = bairro;
           this.cep = cep;
           this.cidade = cidade;
           this.complemento2 = complemento2;
           this.end = end;
           this.uf = uf;
           this.unidadesPostagem = unidadesPostagem;
    }


    /**
     * Gets the bairro value for this EnderecoERP.
     * 
     * @return bairro
     */
    public java.lang.String getBairro() {
        return bairro;
    }


    /**
     * Sets the bairro value for this EnderecoERP.
     * 
     * @param bairro
     */
    public void setBairro(java.lang.String bairro) {
        this.bairro = bairro;
    }


    /**
     * Gets the cep value for this EnderecoERP.
     * 
     * @return cep
     */
    public java.lang.String getCep() {
        return cep;
    }


    /**
     * Sets the cep value for this EnderecoERP.
     * 
     * @param cep
     */
    public void setCep(java.lang.String cep) {
        this.cep = cep;
    }


    /**
     * Gets the cidade value for this EnderecoERP.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this EnderecoERP.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the complemento2 value for this EnderecoERP.
     * 
     * @return complemento2
     */
    public java.lang.String getComplemento2() {
        return complemento2;
    }


    /**
     * Sets the complemento2 value for this EnderecoERP.
     * 
     * @param complemento2
     */
    public void setComplemento2(java.lang.String complemento2) {
        this.complemento2 = complemento2;
    }


    /**
     * Gets the end value for this EnderecoERP.
     * 
     * @return end
     */
    public java.lang.String getEnd() {
        return end;
    }


    /**
     * Sets the end value for this EnderecoERP.
     * 
     * @param end
     */
    public void setEnd(java.lang.String end) {
        this.end = end;
    }


    /**
     * Gets the uf value for this EnderecoERP.
     * 
     * @return uf
     */
    public java.lang.String getUf() {
        return uf;
    }


    /**
     * Sets the uf value for this EnderecoERP.
     * 
     * @param uf
     */
    public void setUf(java.lang.String uf) {
        this.uf = uf;
    }


    /**
     * Gets the unidadesPostagem value for this EnderecoERP.
     * 
     * @return unidadesPostagem
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP[] getUnidadesPostagem() {
        return unidadesPostagem;
    }


    /**
     * Sets the unidadesPostagem value for this EnderecoERP.
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
        if (!(obj instanceof EnderecoERP)) return false;
        EnderecoERP other = (EnderecoERP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bairro==null && other.getBairro()==null) || 
             (this.bairro!=null &&
              this.bairro.equals(other.getBairro()))) &&
            ((this.cep==null && other.getCep()==null) || 
             (this.cep!=null &&
              this.cep.equals(other.getCep()))) &&
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.complemento2==null && other.getComplemento2()==null) || 
             (this.complemento2!=null &&
              this.complemento2.equals(other.getComplemento2()))) &&
            ((this.end==null && other.getEnd()==null) || 
             (this.end!=null &&
              this.end.equals(other.getEnd()))) &&
            ((this.uf==null && other.getUf()==null) || 
             (this.uf!=null &&
              this.uf.equals(other.getUf()))) &&
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
        if (getBairro() != null) {
            _hashCode += getBairro().hashCode();
        }
        if (getCep() != null) {
            _hashCode += getCep().hashCode();
        }
        if (getCidade() != null) {
            _hashCode += getCidade().hashCode();
        }
        if (getComplemento2() != null) {
            _hashCode += getComplemento2().hashCode();
        }
        if (getEnd() != null) {
            _hashCode += getEnd().hashCode();
        }
        if (getUf() != null) {
            _hashCode += getUf().hashCode();
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
        new org.apache.axis.description.TypeDesc(EnderecoERP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "enderecoERP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bairro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bairro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cep");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complemento2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "complemento2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end");
        elemField.setXmlName(new javax.xml.namespace.QName("", "end"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uf"));
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
