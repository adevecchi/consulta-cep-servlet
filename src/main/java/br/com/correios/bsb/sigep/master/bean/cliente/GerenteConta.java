/**
 * GerenteConta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class GerenteConta  implements java.io.Serializable {
    private br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP[] clientesVisiveis;

    private java.util.Calendar dataAtualizacao;

    private java.util.Calendar dataInclusao;

    private java.util.Calendar dataSenha;

    private java.lang.String login;

    private java.lang.String matricula;

    private java.lang.String senha;

    private br.com.correios.bsb.sigep.master.bean.cliente.StatusGerente status;

    private br.com.correios.bsb.sigep.master.bean.cliente.TipoGerente tipoGerente;

    private br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao[] usuariosInstalacao;

    private java.lang.String validade;

    public GerenteConta() {
    }

    public GerenteConta(
           br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP[] clientesVisiveis,
           java.util.Calendar dataAtualizacao,
           java.util.Calendar dataInclusao,
           java.util.Calendar dataSenha,
           java.lang.String login,
           java.lang.String matricula,
           java.lang.String senha,
           br.com.correios.bsb.sigep.master.bean.cliente.StatusGerente status,
           br.com.correios.bsb.sigep.master.bean.cliente.TipoGerente tipoGerente,
           br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao[] usuariosInstalacao,
           java.lang.String validade) {
           this.clientesVisiveis = clientesVisiveis;
           this.dataAtualizacao = dataAtualizacao;
           this.dataInclusao = dataInclusao;
           this.dataSenha = dataSenha;
           this.login = login;
           this.matricula = matricula;
           this.senha = senha;
           this.status = status;
           this.tipoGerente = tipoGerente;
           this.usuariosInstalacao = usuariosInstalacao;
           this.validade = validade;
    }


    /**
     * Gets the clientesVisiveis value for this GerenteConta.
     * 
     * @return clientesVisiveis
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP[] getClientesVisiveis() {
        return clientesVisiveis;
    }


    /**
     * Sets the clientesVisiveis value for this GerenteConta.
     * 
     * @param clientesVisiveis
     */
    public void setClientesVisiveis(br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP[] clientesVisiveis) {
        this.clientesVisiveis = clientesVisiveis;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP getClientesVisiveis(int i) {
        return this.clientesVisiveis[i];
    }

    public void setClientesVisiveis(int i, br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP _value) {
        this.clientesVisiveis[i] = _value;
    }


    /**
     * Gets the dataAtualizacao value for this GerenteConta.
     * 
     * @return dataAtualizacao
     */
    public java.util.Calendar getDataAtualizacao() {
        return dataAtualizacao;
    }


    /**
     * Sets the dataAtualizacao value for this GerenteConta.
     * 
     * @param dataAtualizacao
     */
    public void setDataAtualizacao(java.util.Calendar dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }


    /**
     * Gets the dataInclusao value for this GerenteConta.
     * 
     * @return dataInclusao
     */
    public java.util.Calendar getDataInclusao() {
        return dataInclusao;
    }


    /**
     * Sets the dataInclusao value for this GerenteConta.
     * 
     * @param dataInclusao
     */
    public void setDataInclusao(java.util.Calendar dataInclusao) {
        this.dataInclusao = dataInclusao;
    }


    /**
     * Gets the dataSenha value for this GerenteConta.
     * 
     * @return dataSenha
     */
    public java.util.Calendar getDataSenha() {
        return dataSenha;
    }


    /**
     * Sets the dataSenha value for this GerenteConta.
     * 
     * @param dataSenha
     */
    public void setDataSenha(java.util.Calendar dataSenha) {
        this.dataSenha = dataSenha;
    }


    /**
     * Gets the login value for this GerenteConta.
     * 
     * @return login
     */
    public java.lang.String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this GerenteConta.
     * 
     * @param login
     */
    public void setLogin(java.lang.String login) {
        this.login = login;
    }


    /**
     * Gets the matricula value for this GerenteConta.
     * 
     * @return matricula
     */
    public java.lang.String getMatricula() {
        return matricula;
    }


    /**
     * Sets the matricula value for this GerenteConta.
     * 
     * @param matricula
     */
    public void setMatricula(java.lang.String matricula) {
        this.matricula = matricula;
    }


    /**
     * Gets the senha value for this GerenteConta.
     * 
     * @return senha
     */
    public java.lang.String getSenha() {
        return senha;
    }


    /**
     * Sets the senha value for this GerenteConta.
     * 
     * @param senha
     */
    public void setSenha(java.lang.String senha) {
        this.senha = senha;
    }


    /**
     * Gets the status value for this GerenteConta.
     * 
     * @return status
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.StatusGerente getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GerenteConta.
     * 
     * @param status
     */
    public void setStatus(br.com.correios.bsb.sigep.master.bean.cliente.StatusGerente status) {
        this.status = status;
    }


    /**
     * Gets the tipoGerente value for this GerenteConta.
     * 
     * @return tipoGerente
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.TipoGerente getTipoGerente() {
        return tipoGerente;
    }


    /**
     * Sets the tipoGerente value for this GerenteConta.
     * 
     * @param tipoGerente
     */
    public void setTipoGerente(br.com.correios.bsb.sigep.master.bean.cliente.TipoGerente tipoGerente) {
        this.tipoGerente = tipoGerente;
    }


    /**
     * Gets the usuariosInstalacao value for this GerenteConta.
     * 
     * @return usuariosInstalacao
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao[] getUsuariosInstalacao() {
        return usuariosInstalacao;
    }


    /**
     * Sets the usuariosInstalacao value for this GerenteConta.
     * 
     * @param usuariosInstalacao
     */
    public void setUsuariosInstalacao(br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao[] usuariosInstalacao) {
        this.usuariosInstalacao = usuariosInstalacao;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao getUsuariosInstalacao(int i) {
        return this.usuariosInstalacao[i];
    }

    public void setUsuariosInstalacao(int i, br.com.correios.bsb.sigep.master.bean.cliente.UsuarioInstalacao _value) {
        this.usuariosInstalacao[i] = _value;
    }


    /**
     * Gets the validade value for this GerenteConta.
     * 
     * @return validade
     */
    public java.lang.String getValidade() {
        return validade;
    }


    /**
     * Sets the validade value for this GerenteConta.
     * 
     * @param validade
     */
    public void setValidade(java.lang.String validade) {
        this.validade = validade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GerenteConta)) return false;
        GerenteConta other = (GerenteConta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientesVisiveis==null && other.getClientesVisiveis()==null) || 
             (this.clientesVisiveis!=null &&
              java.util.Arrays.equals(this.clientesVisiveis, other.getClientesVisiveis()))) &&
            ((this.dataAtualizacao==null && other.getDataAtualizacao()==null) || 
             (this.dataAtualizacao!=null &&
              this.dataAtualizacao.equals(other.getDataAtualizacao()))) &&
            ((this.dataInclusao==null && other.getDataInclusao()==null) || 
             (this.dataInclusao!=null &&
              this.dataInclusao.equals(other.getDataInclusao()))) &&
            ((this.dataSenha==null && other.getDataSenha()==null) || 
             (this.dataSenha!=null &&
              this.dataSenha.equals(other.getDataSenha()))) &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.matricula==null && other.getMatricula()==null) || 
             (this.matricula!=null &&
              this.matricula.equals(other.getMatricula()))) &&
            ((this.senha==null && other.getSenha()==null) || 
             (this.senha!=null &&
              this.senha.equals(other.getSenha()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.tipoGerente==null && other.getTipoGerente()==null) || 
             (this.tipoGerente!=null &&
              this.tipoGerente.equals(other.getTipoGerente()))) &&
            ((this.usuariosInstalacao==null && other.getUsuariosInstalacao()==null) || 
             (this.usuariosInstalacao!=null &&
              java.util.Arrays.equals(this.usuariosInstalacao, other.getUsuariosInstalacao()))) &&
            ((this.validade==null && other.getValidade()==null) || 
             (this.validade!=null &&
              this.validade.equals(other.getValidade())));
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
        if (getClientesVisiveis() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClientesVisiveis());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClientesVisiveis(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDataAtualizacao() != null) {
            _hashCode += getDataAtualizacao().hashCode();
        }
        if (getDataInclusao() != null) {
            _hashCode += getDataInclusao().hashCode();
        }
        if (getDataSenha() != null) {
            _hashCode += getDataSenha().hashCode();
        }
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getMatricula() != null) {
            _hashCode += getMatricula().hashCode();
        }
        if (getSenha() != null) {
            _hashCode += getSenha().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTipoGerente() != null) {
            _hashCode += getTipoGerente().hashCode();
        }
        if (getUsuariosInstalacao() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsuariosInstalacao());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsuariosInstalacao(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValidade() != null) {
            _hashCode += getValidade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GerenteConta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "gerenteConta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientesVisiveis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientesVisiveis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "clienteERP"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAtualizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataAtualizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInclusao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataInclusao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSenha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataSenha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("", "login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matricula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "statusGerente"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoGerente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoGerente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "tipoGerente"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuariosInstalacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuariosInstalacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "usuarioInstalacao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validade"));
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
