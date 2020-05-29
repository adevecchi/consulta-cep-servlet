/**
 * DimensaoTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class DimensaoTO  implements java.io.Serializable {
    private br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO altura;

    private br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO comprimento;

    private br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO diametro;

    private br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO largura;

    private br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO peso;

    private br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO soma;

    public DimensaoTO() {
    }

    public DimensaoTO(
           br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO altura,
           br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO comprimento,
           br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO diametro,
           br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO largura,
           br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO peso,
           br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO soma) {
           this.altura = altura;
           this.comprimento = comprimento;
           this.diametro = diametro;
           this.largura = largura;
           this.peso = peso;
           this.soma = soma;
    }


    /**
     * Gets the altura value for this DimensaoTO.
     * 
     * @return altura
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO getAltura() {
        return altura;
    }


    /**
     * Sets the altura value for this DimensaoTO.
     * 
     * @param altura
     */
    public void setAltura(br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO altura) {
        this.altura = altura;
    }


    /**
     * Gets the comprimento value for this DimensaoTO.
     * 
     * @return comprimento
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO getComprimento() {
        return comprimento;
    }


    /**
     * Sets the comprimento value for this DimensaoTO.
     * 
     * @param comprimento
     */
    public void setComprimento(br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO comprimento) {
        this.comprimento = comprimento;
    }


    /**
     * Gets the diametro value for this DimensaoTO.
     * 
     * @return diametro
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO getDiametro() {
        return diametro;
    }


    /**
     * Sets the diametro value for this DimensaoTO.
     * 
     * @param diametro
     */
    public void setDiametro(br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO diametro) {
        this.diametro = diametro;
    }


    /**
     * Gets the largura value for this DimensaoTO.
     * 
     * @return largura
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO getLargura() {
        return largura;
    }


    /**
     * Sets the largura value for this DimensaoTO.
     * 
     * @param largura
     */
    public void setLargura(br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO largura) {
        this.largura = largura;
    }


    /**
     * Gets the peso value for this DimensaoTO.
     * 
     * @return peso
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO getPeso() {
        return peso;
    }


    /**
     * Sets the peso value for this DimensaoTO.
     * 
     * @param peso
     */
    public void setPeso(br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO peso) {
        this.peso = peso;
    }


    /**
     * Gets the soma value for this DimensaoTO.
     * 
     * @return soma
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO getSoma() {
        return soma;
    }


    /**
     * Sets the soma value for this DimensaoTO.
     * 
     * @param soma
     */
    public void setSoma(br.com.correios.bsb.sigep.master.bean.cliente.MedidaTO soma) {
        this.soma = soma;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DimensaoTO)) return false;
        DimensaoTO other = (DimensaoTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.altura==null && other.getAltura()==null) || 
             (this.altura!=null &&
              this.altura.equals(other.getAltura()))) &&
            ((this.comprimento==null && other.getComprimento()==null) || 
             (this.comprimento!=null &&
              this.comprimento.equals(other.getComprimento()))) &&
            ((this.diametro==null && other.getDiametro()==null) || 
             (this.diametro!=null &&
              this.diametro.equals(other.getDiametro()))) &&
            ((this.largura==null && other.getLargura()==null) || 
             (this.largura!=null &&
              this.largura.equals(other.getLargura()))) &&
            ((this.peso==null && other.getPeso()==null) || 
             (this.peso!=null &&
              this.peso.equals(other.getPeso()))) &&
            ((this.soma==null && other.getSoma()==null) || 
             (this.soma!=null &&
              this.soma.equals(other.getSoma())));
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
        if (getAltura() != null) {
            _hashCode += getAltura().hashCode();
        }
        if (getComprimento() != null) {
            _hashCode += getComprimento().hashCode();
        }
        if (getDiametro() != null) {
            _hashCode += getDiametro().hashCode();
        }
        if (getLargura() != null) {
            _hashCode += getLargura().hashCode();
        }
        if (getPeso() != null) {
            _hashCode += getPeso().hashCode();
        }
        if (getSoma() != null) {
            _hashCode += getSoma().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DimensaoTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "dimensaoTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "altura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "medidaTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comprimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comprimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "medidaTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diametro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "diametro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "medidaTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("largura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "largura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "medidaTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "peso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "medidaTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soma");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "medidaTO"));
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
