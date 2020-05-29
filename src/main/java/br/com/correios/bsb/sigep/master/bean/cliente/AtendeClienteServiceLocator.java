/**
 * AtendeClienteServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class AtendeClienteServiceLocator extends org.apache.axis.client.Service implements br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteService {

    public AtendeClienteServiceLocator() {
    }


    public AtendeClienteServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AtendeClienteServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AtendeClientePort
    private java.lang.String AtendeClientePort_address = "https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente";

    public java.lang.String getAtendeClientePortAddress() {
        return AtendeClientePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AtendeClientePortWSDDServiceName = "AtendeClientePort";

    public java.lang.String getAtendeClientePortWSDDServiceName() {
        return AtendeClientePortWSDDServiceName;
    }

    public void setAtendeClientePortWSDDServiceName(java.lang.String name) {
        AtendeClientePortWSDDServiceName = name;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente getAtendeClientePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AtendeClientePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAtendeClientePort(endpoint);
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente getAtendeClientePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteServiceSoapBindingStub _stub = new br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAtendeClientePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAtendeClientePortEndpointAddress(java.lang.String address) {
        AtendeClientePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteServiceSoapBindingStub _stub = new br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteServiceSoapBindingStub(new java.net.URL(AtendeClientePort_address), this);
                _stub.setPortName(getAtendeClientePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AtendeClientePort".equals(inputPortName)) {
            return getAtendeClientePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AtendeClienteService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AtendeClientePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AtendeClientePort".equals(portName)) {
            setAtendeClientePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
