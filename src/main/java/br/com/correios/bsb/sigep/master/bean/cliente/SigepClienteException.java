/**
 * SigepClienteException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class SigepClienteException extends org.apache.axis.AxisFault {
    public java.lang.String sigepClienteException;
    public java.lang.String getSigepClienteException() {
        return this.sigepClienteException;
    }

    public SigepClienteException() {
    }

    public SigepClienteException(java.lang.Exception target) {
        super(target);
    }

    public SigepClienteException(java.lang.String message, java.lang.Throwable t) {
        super(message, t);
    }

      public SigepClienteException(java.lang.String sigepClienteException) {
        this.sigepClienteException = sigepClienteException;
    }

    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, sigepClienteException);
    }
}
