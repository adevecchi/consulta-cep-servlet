/**
 * ObjetoSimplificado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class ObjetoSimplificado  implements java.io.Serializable {
    private java.lang.String datahora_cancelamento;

    private java.lang.Integer numero_pedido;

    private java.lang.String status_pedido;

    public ObjetoSimplificado() {
    }

    public ObjetoSimplificado(
           java.lang.String datahora_cancelamento,
           java.lang.Integer numero_pedido,
           java.lang.String status_pedido) {
           this.datahora_cancelamento = datahora_cancelamento;
           this.numero_pedido = numero_pedido;
           this.status_pedido = status_pedido;
    }


    /**
     * Gets the datahora_cancelamento value for this ObjetoSimplificado.
     * 
     * @return datahora_cancelamento
     */
    public java.lang.String getDatahora_cancelamento() {
        return datahora_cancelamento;
    }


    /**
     * Sets the datahora_cancelamento value for this ObjetoSimplificado.
     * 
     * @param datahora_cancelamento
     */
    public void setDatahora_cancelamento(java.lang.String datahora_cancelamento) {
        this.datahora_cancelamento = datahora_cancelamento;
    }


    /**
     * Gets the numero_pedido value for this ObjetoSimplificado.
     * 
     * @return numero_pedido
     */
    public java.lang.Integer getNumero_pedido() {
        return numero_pedido;
    }


    /**
     * Sets the numero_pedido value for this ObjetoSimplificado.
     * 
     * @param numero_pedido
     */
    public void setNumero_pedido(java.lang.Integer numero_pedido) {
        this.numero_pedido = numero_pedido;
    }


    /**
     * Gets the status_pedido value for this ObjetoSimplificado.
     * 
     * @return status_pedido
     */
    public java.lang.String getStatus_pedido() {
        return status_pedido;
    }


    /**
     * Sets the status_pedido value for this ObjetoSimplificado.
     * 
     * @param status_pedido
     */
    public void setStatus_pedido(java.lang.String status_pedido) {
        this.status_pedido = status_pedido;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjetoSimplificado)) return false;
        ObjetoSimplificado other = (ObjetoSimplificado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datahora_cancelamento==null && other.getDatahora_cancelamento()==null) || 
             (this.datahora_cancelamento!=null &&
              this.datahora_cancelamento.equals(other.getDatahora_cancelamento()))) &&
            ((this.numero_pedido==null && other.getNumero_pedido()==null) || 
             (this.numero_pedido!=null &&
              this.numero_pedido.equals(other.getNumero_pedido()))) &&
            ((this.status_pedido==null && other.getStatus_pedido()==null) || 
             (this.status_pedido!=null &&
              this.status_pedido.equals(other.getStatus_pedido())));
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
        if (getDatahora_cancelamento() != null) {
            _hashCode += getDatahora_cancelamento().hashCode();
        }
        if (getNumero_pedido() != null) {
            _hashCode += getNumero_pedido().hashCode();
        }
        if (getStatus_pedido() != null) {
            _hashCode += getStatus_pedido().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjetoSimplificado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "objetoSimplificado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datahora_cancelamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datahora_cancelamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero_pedido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numero_pedido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status_pedido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status_pedido"));
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
