/**
 * RetornoCancelamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class RetornoCancelamento  implements java.io.Serializable {
    private java.lang.String cod_erro;

    private java.lang.String codigo_administrativo;

    private java.lang.String data;

    private java.lang.String hora;

    private java.lang.String msg_erro;

    private br.com.correios.bsb.sigep.master.bean.cliente.ObjetoSimplificado objeto_postal;

    public RetornoCancelamento() {
    }

    public RetornoCancelamento(
           java.lang.String cod_erro,
           java.lang.String codigo_administrativo,
           java.lang.String data,
           java.lang.String hora,
           java.lang.String msg_erro,
           br.com.correios.bsb.sigep.master.bean.cliente.ObjetoSimplificado objeto_postal) {
           this.cod_erro = cod_erro;
           this.codigo_administrativo = codigo_administrativo;
           this.data = data;
           this.hora = hora;
           this.msg_erro = msg_erro;
           this.objeto_postal = objeto_postal;
    }


    /**
     * Gets the cod_erro value for this RetornoCancelamento.
     * 
     * @return cod_erro
     */
    public java.lang.String getCod_erro() {
        return cod_erro;
    }


    /**
     * Sets the cod_erro value for this RetornoCancelamento.
     * 
     * @param cod_erro
     */
    public void setCod_erro(java.lang.String cod_erro) {
        this.cod_erro = cod_erro;
    }


    /**
     * Gets the codigo_administrativo value for this RetornoCancelamento.
     * 
     * @return codigo_administrativo
     */
    public java.lang.String getCodigo_administrativo() {
        return codigo_administrativo;
    }


    /**
     * Sets the codigo_administrativo value for this RetornoCancelamento.
     * 
     * @param codigo_administrativo
     */
    public void setCodigo_administrativo(java.lang.String codigo_administrativo) {
        this.codigo_administrativo = codigo_administrativo;
    }


    /**
     * Gets the data value for this RetornoCancelamento.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this RetornoCancelamento.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }


    /**
     * Gets the hora value for this RetornoCancelamento.
     * 
     * @return hora
     */
    public java.lang.String getHora() {
        return hora;
    }


    /**
     * Sets the hora value for this RetornoCancelamento.
     * 
     * @param hora
     */
    public void setHora(java.lang.String hora) {
        this.hora = hora;
    }


    /**
     * Gets the msg_erro value for this RetornoCancelamento.
     * 
     * @return msg_erro
     */
    public java.lang.String getMsg_erro() {
        return msg_erro;
    }


    /**
     * Sets the msg_erro value for this RetornoCancelamento.
     * 
     * @param msg_erro
     */
    public void setMsg_erro(java.lang.String msg_erro) {
        this.msg_erro = msg_erro;
    }


    /**
     * Gets the objeto_postal value for this RetornoCancelamento.
     * 
     * @return objeto_postal
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ObjetoSimplificado getObjeto_postal() {
        return objeto_postal;
    }


    /**
     * Sets the objeto_postal value for this RetornoCancelamento.
     * 
     * @param objeto_postal
     */
    public void setObjeto_postal(br.com.correios.bsb.sigep.master.bean.cliente.ObjetoSimplificado objeto_postal) {
        this.objeto_postal = objeto_postal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetornoCancelamento)) return false;
        RetornoCancelamento other = (RetornoCancelamento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cod_erro==null && other.getCod_erro()==null) || 
             (this.cod_erro!=null &&
              this.cod_erro.equals(other.getCod_erro()))) &&
            ((this.codigo_administrativo==null && other.getCodigo_administrativo()==null) || 
             (this.codigo_administrativo!=null &&
              this.codigo_administrativo.equals(other.getCodigo_administrativo()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.hora==null && other.getHora()==null) || 
             (this.hora!=null &&
              this.hora.equals(other.getHora()))) &&
            ((this.msg_erro==null && other.getMsg_erro()==null) || 
             (this.msg_erro!=null &&
              this.msg_erro.equals(other.getMsg_erro()))) &&
            ((this.objeto_postal==null && other.getObjeto_postal()==null) || 
             (this.objeto_postal!=null &&
              this.objeto_postal.equals(other.getObjeto_postal())));
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
        if (getCod_erro() != null) {
            _hashCode += getCod_erro().hashCode();
        }
        if (getCodigo_administrativo() != null) {
            _hashCode += getCodigo_administrativo().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getHora() != null) {
            _hashCode += getHora().hashCode();
        }
        if (getMsg_erro() != null) {
            _hashCode += getMsg_erro().hashCode();
        }
        if (getObjeto_postal() != null) {
            _hashCode += getObjeto_postal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetornoCancelamento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "retornoCancelamento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cod_erro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cod_erro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo_administrativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo_administrativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msg_erro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msg_erro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objeto_postal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objeto_postal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "objetoSimplificado"));
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
