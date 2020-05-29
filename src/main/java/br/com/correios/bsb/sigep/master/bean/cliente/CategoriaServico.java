/**
 * CategoriaServico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class CategoriaServico implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CategoriaServico(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SEM_CATEGORIA = "SEM_CATEGORIA";
    public static final java.lang.String _PAC = "PAC";
    public static final java.lang.String _SEDEX = "SEDEX";
    public static final java.lang.String _CARTA = "CARTA";
    public static final java.lang.String _GRANDES_FORMATOS = "GRANDES_FORMATOS";
    public static final java.lang.String _REVERSO = "REVERSO";
    public static final CategoriaServico SEM_CATEGORIA = new CategoriaServico(_SEM_CATEGORIA);
    public static final CategoriaServico PAC = new CategoriaServico(_PAC);
    public static final CategoriaServico SEDEX = new CategoriaServico(_SEDEX);
    public static final CategoriaServico CARTA = new CategoriaServico(_CARTA);
    public static final CategoriaServico GRANDES_FORMATOS = new CategoriaServico(_GRANDES_FORMATOS);
    public static final CategoriaServico REVERSO = new CategoriaServico(_REVERSO);
    public java.lang.String getValue() { return _value_;}
    public static CategoriaServico fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CategoriaServico enumeration = (CategoriaServico)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CategoriaServico fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CategoriaServico.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "categoriaServico"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
