/**
 * MedidaTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class MedidaTO  implements java.io.Serializable {
    private java.math.BigDecimal maximo;

    private java.math.BigDecimal minimo;

    public MedidaTO() {
    }

    public MedidaTO(
           java.math.BigDecimal maximo,
           java.math.BigDecimal minimo) {
           this.maximo = maximo;
           this.minimo = minimo;
    }


    /**
     * Gets the maximo value for this MedidaTO.
     * 
     * @return maximo
     */
    public java.math.BigDecimal getMaximo() {
        return maximo;
    }


    /**
     * Sets the maximo value for this MedidaTO.
     * 
     * @param maximo
     */
    public void setMaximo(java.math.BigDecimal maximo) {
        this.maximo = maximo;
    }


    /**
     * Gets the minimo value for this MedidaTO.
     * 
     * @return minimo
     */
    public java.math.BigDecimal getMinimo() {
        return minimo;
    }


    /**
     * Sets the minimo value for this MedidaTO.
     * 
     * @param minimo
     */
    public void setMinimo(java.math.BigDecimal minimo) {
        this.minimo = minimo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MedidaTO)) return false;
        MedidaTO other = (MedidaTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maximo==null && other.getMaximo()==null) || 
             (this.maximo!=null &&
              this.maximo.equals(other.getMaximo()))) &&
            ((this.minimo==null && other.getMinimo()==null) || 
             (this.minimo!=null &&
              this.minimo.equals(other.getMinimo())));
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
        if (getMaximo() != null) {
            _hashCode += getMaximo().hashCode();
        }
        if (getMinimo() != null) {
            _hashCode += getMinimo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MedidaTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "medidaTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maximo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
