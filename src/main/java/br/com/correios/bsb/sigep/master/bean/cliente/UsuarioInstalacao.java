/**
 * UsuarioInstalacao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class UsuarioInstalacao  implements java.io.Serializable {
    private java.util.Calendar dataAtualizacao;

    private java.util.Calendar dataInclusao;

    private java.util.Calendar dataSenha;

    private br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta gerenteMaster;

    private java.lang.String hashSenha;

    private java.lang.Long id;

    private java.lang.String login;

    private java.lang.String nome;

    private br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster[] parametros;

    private java.lang.String senha;

    private br.com.correios.bsb.sigep.master.bean.cliente.StatusUsuario status;

    private java.lang.String validade;

    public UsuarioInstalacao() {
    }

    public UsuarioInstalacao(
           java.util.Calendar dataAtualizacao,
           java.util.Calendar dataInclusao,
           java.util.Calendar dataSenha,
           br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta gerenteMaster,
           java.lang.String hashSenha,
           java.lang.Long id,
           java.lang.String login,
           java.lang.String nome,
           br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster[] parametros,
           java.lang.String senha,
           br.com.correios.bsb.sigep.master.bean.cliente.StatusUsuario status,
           java.lang.String validade) {
           this.dataAtualizacao = dataAtualizacao;
           this.dataInclusao = dataInclusao;
           this.dataSenha = dataSenha;
           this.gerenteMaster = gerenteMaster;
           this.hashSenha = hashSenha;
           this.id = id;
           this.login = login;
           this.nome = nome;
           this.parametros = parametros;
           this.senha = senha;
           this.status = status;
           this.validade = validade;
    }


    /**
     * Gets the dataAtualizacao value for this UsuarioInstalacao.
     * 
     * @return dataAtualizacao
     */
    public java.util.Calendar getDataAtualizacao() {
        return dataAtualizacao;
    }


    /**
     * Sets the dataAtualizacao value for this UsuarioInstalacao.
     * 
     * @param dataAtualizacao
     */
    public void setDataAtualizacao(java.util.Calendar dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }


    /**
     * Gets the dataInclusao value for this UsuarioInstalacao.
     * 
     * @return dataInclusao
     */
    public java.util.Calendar getDataInclusao() {
        return dataInclusao;
    }


    /**
     * Sets the dataInclusao value for this UsuarioInstalacao.
     * 
     * @param dataInclusao
     */
    public void setDataInclusao(java.util.Calendar dataInclusao) {
        this.dataInclusao = dataInclusao;
    }


    /**
     * Gets the dataSenha value for this UsuarioInstalacao.
     * 
     * @return dataSenha
     */
    public java.util.Calendar getDataSenha() {
        return dataSenha;
    }


    /**
     * Sets the dataSenha value for this UsuarioInstalacao.
     * 
     * @param dataSenha
     */
    public void setDataSenha(java.util.Calendar dataSenha) {
        this.dataSenha = dataSenha;
    }


    /**
     * Gets the gerenteMaster value for this UsuarioInstalacao.
     * 
     * @return gerenteMaster
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta getGerenteMaster() {
        return gerenteMaster;
    }


    /**
     * Sets the gerenteMaster value for this UsuarioInstalacao.
     * 
     * @param gerenteMaster
     */
    public void setGerenteMaster(br.com.correios.bsb.sigep.master.bean.cliente.GerenteConta gerenteMaster) {
        this.gerenteMaster = gerenteMaster;
    }


    /**
     * Gets the hashSenha value for this UsuarioInstalacao.
     * 
     * @return hashSenha
     */
    public java.lang.String getHashSenha() {
        return hashSenha;
    }


    /**
     * Sets the hashSenha value for this UsuarioInstalacao.
     * 
     * @param hashSenha
     */
    public void setHashSenha(java.lang.String hashSenha) {
        this.hashSenha = hashSenha;
    }


    /**
     * Gets the id value for this UsuarioInstalacao.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this UsuarioInstalacao.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the login value for this UsuarioInstalacao.
     * 
     * @return login
     */
    public java.lang.String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this UsuarioInstalacao.
     * 
     * @param login
     */
    public void setLogin(java.lang.String login) {
        this.login = login;
    }


    /**
     * Gets the nome value for this UsuarioInstalacao.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this UsuarioInstalacao.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the parametros value for this UsuarioInstalacao.
     * 
     * @return parametros
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster[] getParametros() {
        return parametros;
    }


    /**
     * Sets the parametros value for this UsuarioInstalacao.
     * 
     * @param parametros
     */
    public void setParametros(br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster[] parametros) {
        this.parametros = parametros;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster getParametros(int i) {
        return this.parametros[i];
    }

    public void setParametros(int i, br.com.correios.bsb.sigep.master.bean.cliente.ParametroMaster _value) {
        this.parametros[i] = _value;
    }


    /**
     * Gets the senha value for this UsuarioInstalacao.
     * 
     * @return senha
     */
    public java.lang.String getSenha() {
        return senha;
    }


    /**
     * Sets the senha value for this UsuarioInstalacao.
     * 
     * @param senha
     */
    public void setSenha(java.lang.String senha) {
        this.senha = senha;
    }


    /**
     * Gets the status value for this UsuarioInstalacao.
     * 
     * @return status
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.StatusUsuario getStatus() {
        return status;
    }


    /**
     * Sets the status value for this UsuarioInstalacao.
     * 
     * @param status
     */
    public void setStatus(br.com.correios.bsb.sigep.master.bean.cliente.StatusUsuario status) {
        this.status = status;
    }


    /**
     * Gets the validade value for this UsuarioInstalacao.
     * 
     * @return validade
     */
    public java.lang.String getValidade() {
        return validade;
    }


    /**
     * Sets the validade value for this UsuarioInstalacao.
     * 
     * @param validade
     */
    public void setValidade(java.lang.String validade) {
        this.validade = validade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UsuarioInstalacao)) return false;
        UsuarioInstalacao other = (UsuarioInstalacao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataAtualizacao==null && other.getDataAtualizacao()==null) || 
             (this.dataAtualizacao!=null &&
              this.dataAtualizacao.equals(other.getDataAtualizacao()))) &&
            ((this.dataInclusao==null && other.getDataInclusao()==null) || 
             (this.dataInclusao!=null &&
              this.dataInclusao.equals(other.getDataInclusao()))) &&
            ((this.dataSenha==null && other.getDataSenha()==null) || 
             (this.dataSenha!=null &&
              this.dataSenha.equals(other.getDataSenha()))) &&
            ((this.gerenteMaster==null && other.getGerenteMaster()==null) || 
             (this.gerenteMaster!=null &&
              this.gerenteMaster.equals(other.getGerenteMaster()))) &&
            ((this.hashSenha==null && other.getHashSenha()==null) || 
             (this.hashSenha!=null &&
              this.hashSenha.equals(other.getHashSenha()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.parametros==null && other.getParametros()==null) || 
             (this.parametros!=null &&
              java.util.Arrays.equals(this.parametros, other.getParametros()))) &&
            ((this.senha==null && other.getSenha()==null) || 
             (this.senha!=null &&
              this.senha.equals(other.getSenha()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
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
        if (getDataAtualizacao() != null) {
            _hashCode += getDataAtualizacao().hashCode();
        }
        if (getDataInclusao() != null) {
            _hashCode += getDataInclusao().hashCode();
        }
        if (getDataSenha() != null) {
            _hashCode += getDataSenha().hashCode();
        }
        if (getGerenteMaster() != null) {
            _hashCode += getGerenteMaster().hashCode();
        }
        if (getHashSenha() != null) {
            _hashCode += getHashSenha().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getParametros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParametros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParametros(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSenha() != null) {
            _hashCode += getSenha().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getValidade() != null) {
            _hashCode += getValidade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsuarioInstalacao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "usuarioInstalacao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("gerenteMaster");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gerenteMaster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "gerenteConta"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hashSenha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hashSenha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parametros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "parametroMaster"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "statusUsuario"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
