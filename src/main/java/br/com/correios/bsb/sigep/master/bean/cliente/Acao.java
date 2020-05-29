/**
 * Acao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class Acao implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Acao(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DEVOLVIDO_AO_REMETENTE = "DEVOLVIDO_AO_REMETENTE";
    public static final java.lang.String _ENCAMINHADO_PARA_REFUGO = "ENCAMINHADO_PARA_REFUGO";
    public static final java.lang.String _REINTEGRADO_E_DEVOLVIDO_AO_REMETENTE = "REINTEGRADO_E_DEVOLVIDO_AO_REMETENTE";
    public static final java.lang.String _DESBLOQUEADO = "DESBLOQUEADO";
    public static final Acao DEVOLVIDO_AO_REMETENTE = new Acao(_DEVOLVIDO_AO_REMETENTE);
    public static final Acao ENCAMINHADO_PARA_REFUGO = new Acao(_ENCAMINHADO_PARA_REFUGO);
    public static final Acao REINTEGRADO_E_DEVOLVIDO_AO_REMETENTE = new Acao(_REINTEGRADO_E_DEVOLVIDO_AO_REMETENTE);
    public static final Acao DESBLOQUEADO = new Acao(_DESBLOQUEADO);
    public java.lang.String getValue() { return _value_;}
    public static Acao fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Acao enumeration = (Acao)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Acao fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Acao.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "acao"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
