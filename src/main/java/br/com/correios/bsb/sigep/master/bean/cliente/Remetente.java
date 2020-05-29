/**
 * Remetente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class Remetente  extends br.com.correios.bsb.sigep.master.bean.cliente.Pessoa  implements java.io.Serializable {
    private java.lang.String celular;

    private java.lang.String ddd_celular;

    private java.lang.String identificacao;

    private java.lang.String sms;

    public Remetente() {
    }

    public Remetente(
           java.lang.String bairro,
           java.lang.String cep,
           java.lang.String cidade,
           java.lang.String complemento,
           java.lang.String ddd,
           java.lang.String email,
           java.lang.String logradouro,
           java.lang.String nome,
           java.lang.String numero,
           java.lang.String referencia,
           java.lang.String telefone,
           java.lang.String uf,
           java.lang.String celular,
           java.lang.String ddd_celular,
           java.lang.String identificacao,
           java.lang.String sms) {
        super(
            bairro,
            cep,
            cidade,
            complemento,
            ddd,
            email,
            logradouro,
            nome,
            numero,
            referencia,
            telefone,
            uf);
        this.celular = celular;
        this.ddd_celular = ddd_celular;
        this.identificacao = identificacao;
        this.sms = sms;
    }


    /**
     * Gets the celular value for this Remetente.
     * 
     * @return celular
     */
    public java.lang.String getCelular() {
        return celular;
    }


    /**
     * Sets the celular value for this Remetente.
     * 
     * @param celular
     */
    public void setCelular(java.lang.String celular) {
        this.celular = celular;
    }


    /**
     * Gets the ddd_celular value for this Remetente.
     * 
     * @return ddd_celular
     */
    public java.lang.String getDdd_celular() {
        return ddd_celular;
    }


    /**
     * Sets the ddd_celular value for this Remetente.
     * 
     * @param ddd_celular
     */
    public void setDdd_celular(java.lang.String ddd_celular) {
        this.ddd_celular = ddd_celular;
    }


    /**
     * Gets the identificacao value for this Remetente.
     * 
     * @return identificacao
     */
    public java.lang.String getIdentificacao() {
        return identificacao;
    }


    /**
     * Sets the identificacao value for this Remetente.
     * 
     * @param identificacao
     */
    public void setIdentificacao(java.lang.String identificacao) {
        this.identificacao = identificacao;
    }


    /**
     * Gets the sms value for this Remetente.
     * 
     * @return sms
     */
    public java.lang.String getSms() {
        return sms;
    }


    /**
     * Sets the sms value for this Remetente.
     * 
     * @param sms
     */
    public void setSms(java.lang.String sms) {
        this.sms = sms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Remetente)) return false;
        Remetente other = (Remetente) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.celular==null && other.getCelular()==null) || 
             (this.celular!=null &&
              this.celular.equals(other.getCelular()))) &&
            ((this.ddd_celular==null && other.getDdd_celular()==null) || 
             (this.ddd_celular!=null &&
              this.ddd_celular.equals(other.getDdd_celular()))) &&
            ((this.identificacao==null && other.getIdentificacao()==null) || 
             (this.identificacao!=null &&
              this.identificacao.equals(other.getIdentificacao()))) &&
            ((this.sms==null && other.getSms()==null) || 
             (this.sms!=null &&
              this.sms.equals(other.getSms())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCelular() != null) {
            _hashCode += getCelular().hashCode();
        }
        if (getDdd_celular() != null) {
            _hashCode += getDdd_celular().hashCode();
        }
        if (getIdentificacao() != null) {
            _hashCode += getIdentificacao().hashCode();
        }
        if (getSms() != null) {
            _hashCode += getSms().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Remetente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "remetente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("celular");
        elemField.setXmlName(new javax.xml.namespace.QName("", "celular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ddd_celular");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ddd_celular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sms"));
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
