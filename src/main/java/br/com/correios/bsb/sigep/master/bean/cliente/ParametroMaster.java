/**
 * ParametroMaster.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class ParametroMaster  implements java.io.Serializable {
    private long prmCoParametro;

    private java.lang.String prmTxParametro;

    private java.lang.String prmTxValor;

    public ParametroMaster() {
    }

    public ParametroMaster(
           long prmCoParametro,
           java.lang.String prmTxParametro,
           java.lang.String prmTxValor) {
           this.prmCoParametro = prmCoParametro;
           this.prmTxParametro = prmTxParametro;
           this.prmTxValor = prmTxValor;
    }


    /**
     * Gets the prmCoParametro value for this ParametroMaster.
     * 
     * @return prmCoParametro
     */
    public long getPrmCoParametro() {
        return prmCoParametro;
    }


    /**
     * Sets the prmCoParametro value for this ParametroMaster.
     * 
     * @param prmCoParametro
     */
    public void setPrmCoParametro(long prmCoParametro) {
        this.prmCoParametro = prmCoParametro;
    }


    /**
     * Gets the prmTxParametro value for this ParametroMaster.
     * 
     * @return prmTxParametro
     */
    public java.lang.String getPrmTxParametro() {
        return prmTxParametro;
    }


    /**
     * Sets the prmTxParametro value for this ParametroMaster.
     * 
     * @param prmTxParametro
     */
    public void setPrmTxParametro(java.lang.String prmTxParametro) {
        this.prmTxParametro = prmTxParametro;
    }


    /**
     * Gets the prmTxValor value for this ParametroMaster.
     * 
     * @return prmTxValor
     */
    public java.lang.String getPrmTxValor() {
        return prmTxValor;
    }


    /**
     * Sets the prmTxValor value for this ParametroMaster.
     * 
     * @param prmTxValor
     */
    public void setPrmTxValor(java.lang.String prmTxValor) {
        this.prmTxValor = prmTxValor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametroMaster)) return false;
        ParametroMaster other = (ParametroMaster) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.prmCoParametro == other.getPrmCoParametro() &&
            ((this.prmTxParametro==null && other.getPrmTxParametro()==null) || 
             (this.prmTxParametro!=null &&
              this.prmTxParametro.equals(other.getPrmTxParametro()))) &&
            ((this.prmTxValor==null && other.getPrmTxValor()==null) || 
             (this.prmTxValor!=null &&
              this.prmTxValor.equals(other.getPrmTxValor())));
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
        _hashCode += new Long(getPrmCoParametro()).hashCode();
        if (getPrmTxParametro() != null) {
            _hashCode += getPrmTxParametro().hashCode();
        }
        if (getPrmTxValor() != null) {
            _hashCode += getPrmTxValor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParametroMaster.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "parametroMaster"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prmCoParametro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prmCoParametro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prmTxParametro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prmTxParametro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prmTxValor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prmTxValor"));
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
