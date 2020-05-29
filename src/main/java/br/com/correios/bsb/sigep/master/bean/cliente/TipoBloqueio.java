/**
 * TipoBloqueio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class TipoBloqueio implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TipoBloqueio(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FRAUDE_BLOQUEIO = "FRAUDE_BLOQUEIO";
    public static final java.lang.String _EXTRAVIO_VAREJO_PRE_INDENIZADO = "EXTRAVIO_VAREJO_PRE_INDENIZADO";
    public static final java.lang.String _EXTRAVIO_VAREJO_POS_INDENIZADO = "EXTRAVIO_VAREJO_POS_INDENIZADO";
    public static final java.lang.String _EXTRAVIO_CORPORATIVO = "EXTRAVIO_CORPORATIVO";
    public static final java.lang.String _INTERNACIONAL_LDI = "INTERNACIONAL_LDI";
    public static final TipoBloqueio FRAUDE_BLOQUEIO = new TipoBloqueio(_FRAUDE_BLOQUEIO);
    public static final TipoBloqueio EXTRAVIO_VAREJO_PRE_INDENIZADO = new TipoBloqueio(_EXTRAVIO_VAREJO_PRE_INDENIZADO);
    public static final TipoBloqueio EXTRAVIO_VAREJO_POS_INDENIZADO = new TipoBloqueio(_EXTRAVIO_VAREJO_POS_INDENIZADO);
    public static final TipoBloqueio EXTRAVIO_CORPORATIVO = new TipoBloqueio(_EXTRAVIO_CORPORATIVO);
    public static final TipoBloqueio INTERNACIONAL_LDI = new TipoBloqueio(_INTERNACIONAL_LDI);
    public java.lang.String getValue() { return _value_;}
    public static TipoBloqueio fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TipoBloqueio enumeration = (TipoBloqueio)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TipoBloqueio fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TipoBloqueio.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "tipoBloqueio"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
