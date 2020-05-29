/**
 * ContratoERP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.correios.bsb.sigep.master.bean.cliente;

public class ContratoERP  implements java.io.Serializable {
    private br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP[] cartoesPostagem;

    private br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP cliente;

    private long codigoCliente;

    private java.lang.String codigoDiretoria;

    private br.com.correios.bsb.sigep.master.bean.cliente.ContratoERPPK contratoPK;

    private java.util.Calendar dataAtualizacao;

    private java.lang.String dataAtualizacaoDDMMYYYY;

    private java.util.Calendar dataVigenciaFim;

    private java.lang.String dataVigenciaFimDDMMYYYY;

    private java.util.Calendar dataVigenciaInicio;

    private java.lang.String dataVigenciaInicioDDMMYYYY;

    private java.lang.Integer datajAtualizacao;

    private java.lang.Integer datajVigenciaFim;

    private java.lang.Integer datajVigenciaInicio;

    private java.lang.String descricaoDiretoriaRegional;

    private java.lang.String descricaoStatus;

    private br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP diretoriaRegional;

    private java.lang.Integer horajAtualizacao;

    private java.lang.String statusCodigo;

    public ContratoERP() {
    }

    public ContratoERP(
           br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP[] cartoesPostagem,
           br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP cliente,
           long codigoCliente,
           java.lang.String codigoDiretoria,
           br.com.correios.bsb.sigep.master.bean.cliente.ContratoERPPK contratoPK,
           java.util.Calendar dataAtualizacao,
           java.lang.String dataAtualizacaoDDMMYYYY,
           java.util.Calendar dataVigenciaFim,
           java.lang.String dataVigenciaFimDDMMYYYY,
           java.util.Calendar dataVigenciaInicio,
           java.lang.String dataVigenciaInicioDDMMYYYY,
           java.lang.Integer datajAtualizacao,
           java.lang.Integer datajVigenciaFim,
           java.lang.Integer datajVigenciaInicio,
           java.lang.String descricaoDiretoriaRegional,
           java.lang.String descricaoStatus,
           br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP diretoriaRegional,
           java.lang.Integer horajAtualizacao,
           java.lang.String statusCodigo) {
           this.cartoesPostagem = cartoesPostagem;
           this.cliente = cliente;
           this.codigoCliente = codigoCliente;
           this.codigoDiretoria = codigoDiretoria;
           this.contratoPK = contratoPK;
           this.dataAtualizacao = dataAtualizacao;
           this.dataAtualizacaoDDMMYYYY = dataAtualizacaoDDMMYYYY;
           this.dataVigenciaFim = dataVigenciaFim;
           this.dataVigenciaFimDDMMYYYY = dataVigenciaFimDDMMYYYY;
           this.dataVigenciaInicio = dataVigenciaInicio;
           this.dataVigenciaInicioDDMMYYYY = dataVigenciaInicioDDMMYYYY;
           this.datajAtualizacao = datajAtualizacao;
           this.datajVigenciaFim = datajVigenciaFim;
           this.datajVigenciaInicio = datajVigenciaInicio;
           this.descricaoDiretoriaRegional = descricaoDiretoriaRegional;
           this.descricaoStatus = descricaoStatus;
           this.diretoriaRegional = diretoriaRegional;
           this.horajAtualizacao = horajAtualizacao;
           this.statusCodigo = statusCodigo;
    }


    /**
     * Gets the cartoesPostagem value for this ContratoERP.
     * 
     * @return cartoesPostagem
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP[] getCartoesPostagem() {
        return cartoesPostagem;
    }


    /**
     * Sets the cartoesPostagem value for this ContratoERP.
     * 
     * @param cartoesPostagem
     */
    public void setCartoesPostagem(br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP[] cartoesPostagem) {
        this.cartoesPostagem = cartoesPostagem;
    }

    public br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP getCartoesPostagem(int i) {
        return this.cartoesPostagem[i];
    }

    public void setCartoesPostagem(int i, br.com.correios.bsb.sigep.master.bean.cliente.CartaoPostagemERP _value) {
        this.cartoesPostagem[i] = _value;
    }


    /**
     * Gets the cliente value for this ContratoERP.
     * 
     * @return cliente
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP getCliente() {
        return cliente;
    }


    /**
     * Sets the cliente value for this ContratoERP.
     * 
     * @param cliente
     */
    public void setCliente(br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP cliente) {
        this.cliente = cliente;
    }


    /**
     * Gets the codigoCliente value for this ContratoERP.
     * 
     * @return codigoCliente
     */
    public long getCodigoCliente() {
        return codigoCliente;
    }


    /**
     * Sets the codigoCliente value for this ContratoERP.
     * 
     * @param codigoCliente
     */
    public void setCodigoCliente(long codigoCliente) {
        this.codigoCliente = codigoCliente;
    }


    /**
     * Gets the codigoDiretoria value for this ContratoERP.
     * 
     * @return codigoDiretoria
     */
    public java.lang.String getCodigoDiretoria() {
        return codigoDiretoria;
    }


    /**
     * Sets the codigoDiretoria value for this ContratoERP.
     * 
     * @param codigoDiretoria
     */
    public void setCodigoDiretoria(java.lang.String codigoDiretoria) {
        this.codigoDiretoria = codigoDiretoria;
    }


    /**
     * Gets the contratoPK value for this ContratoERP.
     * 
     * @return contratoPK
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.ContratoERPPK getContratoPK() {
        return contratoPK;
    }


    /**
     * Sets the contratoPK value for this ContratoERP.
     * 
     * @param contratoPK
     */
    public void setContratoPK(br.com.correios.bsb.sigep.master.bean.cliente.ContratoERPPK contratoPK) {
        this.contratoPK = contratoPK;
    }


    /**
     * Gets the dataAtualizacao value for this ContratoERP.
     * 
     * @return dataAtualizacao
     */
    public java.util.Calendar getDataAtualizacao() {
        return dataAtualizacao;
    }


    /**
     * Sets the dataAtualizacao value for this ContratoERP.
     * 
     * @param dataAtualizacao
     */
    public void setDataAtualizacao(java.util.Calendar dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }


    /**
     * Gets the dataAtualizacaoDDMMYYYY value for this ContratoERP.
     * 
     * @return dataAtualizacaoDDMMYYYY
     */
    public java.lang.String getDataAtualizacaoDDMMYYYY() {
        return dataAtualizacaoDDMMYYYY;
    }


    /**
     * Sets the dataAtualizacaoDDMMYYYY value for this ContratoERP.
     * 
     * @param dataAtualizacaoDDMMYYYY
     */
    public void setDataAtualizacaoDDMMYYYY(java.lang.String dataAtualizacaoDDMMYYYY) {
        this.dataAtualizacaoDDMMYYYY = dataAtualizacaoDDMMYYYY;
    }


    /**
     * Gets the dataVigenciaFim value for this ContratoERP.
     * 
     * @return dataVigenciaFim
     */
    public java.util.Calendar getDataVigenciaFim() {
        return dataVigenciaFim;
    }


    /**
     * Sets the dataVigenciaFim value for this ContratoERP.
     * 
     * @param dataVigenciaFim
     */
    public void setDataVigenciaFim(java.util.Calendar dataVigenciaFim) {
        this.dataVigenciaFim = dataVigenciaFim;
    }


    /**
     * Gets the dataVigenciaFimDDMMYYYY value for this ContratoERP.
     * 
     * @return dataVigenciaFimDDMMYYYY
     */
    public java.lang.String getDataVigenciaFimDDMMYYYY() {
        return dataVigenciaFimDDMMYYYY;
    }


    /**
     * Sets the dataVigenciaFimDDMMYYYY value for this ContratoERP.
     * 
     * @param dataVigenciaFimDDMMYYYY
     */
    public void setDataVigenciaFimDDMMYYYY(java.lang.String dataVigenciaFimDDMMYYYY) {
        this.dataVigenciaFimDDMMYYYY = dataVigenciaFimDDMMYYYY;
    }


    /**
     * Gets the dataVigenciaInicio value for this ContratoERP.
     * 
     * @return dataVigenciaInicio
     */
    public java.util.Calendar getDataVigenciaInicio() {
        return dataVigenciaInicio;
    }


    /**
     * Sets the dataVigenciaInicio value for this ContratoERP.
     * 
     * @param dataVigenciaInicio
     */
    public void setDataVigenciaInicio(java.util.Calendar dataVigenciaInicio) {
        this.dataVigenciaInicio = dataVigenciaInicio;
    }


    /**
     * Gets the dataVigenciaInicioDDMMYYYY value for this ContratoERP.
     * 
     * @return dataVigenciaInicioDDMMYYYY
     */
    public java.lang.String getDataVigenciaInicioDDMMYYYY() {
        return dataVigenciaInicioDDMMYYYY;
    }


    /**
     * Sets the dataVigenciaInicioDDMMYYYY value for this ContratoERP.
     * 
     * @param dataVigenciaInicioDDMMYYYY
     */
    public void setDataVigenciaInicioDDMMYYYY(java.lang.String dataVigenciaInicioDDMMYYYY) {
        this.dataVigenciaInicioDDMMYYYY = dataVigenciaInicioDDMMYYYY;
    }


    /**
     * Gets the datajAtualizacao value for this ContratoERP.
     * 
     * @return datajAtualizacao
     */
    public java.lang.Integer getDatajAtualizacao() {
        return datajAtualizacao;
    }


    /**
     * Sets the datajAtualizacao value for this ContratoERP.
     * 
     * @param datajAtualizacao
     */
    public void setDatajAtualizacao(java.lang.Integer datajAtualizacao) {
        this.datajAtualizacao = datajAtualizacao;
    }


    /**
     * Gets the datajVigenciaFim value for this ContratoERP.
     * 
     * @return datajVigenciaFim
     */
    public java.lang.Integer getDatajVigenciaFim() {
        return datajVigenciaFim;
    }


    /**
     * Sets the datajVigenciaFim value for this ContratoERP.
     * 
     * @param datajVigenciaFim
     */
    public void setDatajVigenciaFim(java.lang.Integer datajVigenciaFim) {
        this.datajVigenciaFim = datajVigenciaFim;
    }


    /**
     * Gets the datajVigenciaInicio value for this ContratoERP.
     * 
     * @return datajVigenciaInicio
     */
    public java.lang.Integer getDatajVigenciaInicio() {
        return datajVigenciaInicio;
    }


    /**
     * Sets the datajVigenciaInicio value for this ContratoERP.
     * 
     * @param datajVigenciaInicio
     */
    public void setDatajVigenciaInicio(java.lang.Integer datajVigenciaInicio) {
        this.datajVigenciaInicio = datajVigenciaInicio;
    }


    /**
     * Gets the descricaoDiretoriaRegional value for this ContratoERP.
     * 
     * @return descricaoDiretoriaRegional
     */
    public java.lang.String getDescricaoDiretoriaRegional() {
        return descricaoDiretoriaRegional;
    }


    /**
     * Sets the descricaoDiretoriaRegional value for this ContratoERP.
     * 
     * @param descricaoDiretoriaRegional
     */
    public void setDescricaoDiretoriaRegional(java.lang.String descricaoDiretoriaRegional) {
        this.descricaoDiretoriaRegional = descricaoDiretoriaRegional;
    }


    /**
     * Gets the descricaoStatus value for this ContratoERP.
     * 
     * @return descricaoStatus
     */
    public java.lang.String getDescricaoStatus() {
        return descricaoStatus;
    }


    /**
     * Sets the descricaoStatus value for this ContratoERP.
     * 
     * @param descricaoStatus
     */
    public void setDescricaoStatus(java.lang.String descricaoStatus) {
        this.descricaoStatus = descricaoStatus;
    }


    /**
     * Gets the diretoriaRegional value for this ContratoERP.
     * 
     * @return diretoriaRegional
     */
    public br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP getDiretoriaRegional() {
        return diretoriaRegional;
    }


    /**
     * Sets the diretoriaRegional value for this ContratoERP.
     * 
     * @param diretoriaRegional
     */
    public void setDiretoriaRegional(br.com.correios.bsb.sigep.master.bean.cliente.UnidadePostagemERP diretoriaRegional) {
        this.diretoriaRegional = diretoriaRegional;
    }


    /**
     * Gets the horajAtualizacao value for this ContratoERP.
     * 
     * @return horajAtualizacao
     */
    public java.lang.Integer getHorajAtualizacao() {
        return horajAtualizacao;
    }


    /**
     * Sets the horajAtualizacao value for this ContratoERP.
     * 
     * @param horajAtualizacao
     */
    public void setHorajAtualizacao(java.lang.Integer horajAtualizacao) {
        this.horajAtualizacao = horajAtualizacao;
    }


    /**
     * Gets the statusCodigo value for this ContratoERP.
     * 
     * @return statusCodigo
     */
    public java.lang.String getStatusCodigo() {
        return statusCodigo;
    }


    /**
     * Sets the statusCodigo value for this ContratoERP.
     * 
     * @param statusCodigo
     */
    public void setStatusCodigo(java.lang.String statusCodigo) {
        this.statusCodigo = statusCodigo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContratoERP)) return false;
        ContratoERP other = (ContratoERP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cartoesPostagem==null && other.getCartoesPostagem()==null) || 
             (this.cartoesPostagem!=null &&
              java.util.Arrays.equals(this.cartoesPostagem, other.getCartoesPostagem()))) &&
            ((this.cliente==null && other.getCliente()==null) || 
             (this.cliente!=null &&
              this.cliente.equals(other.getCliente()))) &&
            this.codigoCliente == other.getCodigoCliente() &&
            ((this.codigoDiretoria==null && other.getCodigoDiretoria()==null) || 
             (this.codigoDiretoria!=null &&
              this.codigoDiretoria.equals(other.getCodigoDiretoria()))) &&
            ((this.contratoPK==null && other.getContratoPK()==null) || 
             (this.contratoPK!=null &&
              this.contratoPK.equals(other.getContratoPK()))) &&
            ((this.dataAtualizacao==null && other.getDataAtualizacao()==null) || 
             (this.dataAtualizacao!=null &&
              this.dataAtualizacao.equals(other.getDataAtualizacao()))) &&
            ((this.dataAtualizacaoDDMMYYYY==null && other.getDataAtualizacaoDDMMYYYY()==null) || 
             (this.dataAtualizacaoDDMMYYYY!=null &&
              this.dataAtualizacaoDDMMYYYY.equals(other.getDataAtualizacaoDDMMYYYY()))) &&
            ((this.dataVigenciaFim==null && other.getDataVigenciaFim()==null) || 
             (this.dataVigenciaFim!=null &&
              this.dataVigenciaFim.equals(other.getDataVigenciaFim()))) &&
            ((this.dataVigenciaFimDDMMYYYY==null && other.getDataVigenciaFimDDMMYYYY()==null) || 
             (this.dataVigenciaFimDDMMYYYY!=null &&
              this.dataVigenciaFimDDMMYYYY.equals(other.getDataVigenciaFimDDMMYYYY()))) &&
            ((this.dataVigenciaInicio==null && other.getDataVigenciaInicio()==null) || 
             (this.dataVigenciaInicio!=null &&
              this.dataVigenciaInicio.equals(other.getDataVigenciaInicio()))) &&
            ((this.dataVigenciaInicioDDMMYYYY==null && other.getDataVigenciaInicioDDMMYYYY()==null) || 
             (this.dataVigenciaInicioDDMMYYYY!=null &&
              this.dataVigenciaInicioDDMMYYYY.equals(other.getDataVigenciaInicioDDMMYYYY()))) &&
            ((this.datajAtualizacao==null && other.getDatajAtualizacao()==null) || 
             (this.datajAtualizacao!=null &&
              this.datajAtualizacao.equals(other.getDatajAtualizacao()))) &&
            ((this.datajVigenciaFim==null && other.getDatajVigenciaFim()==null) || 
             (this.datajVigenciaFim!=null &&
              this.datajVigenciaFim.equals(other.getDatajVigenciaFim()))) &&
            ((this.datajVigenciaInicio==null && other.getDatajVigenciaInicio()==null) || 
             (this.datajVigenciaInicio!=null &&
              this.datajVigenciaInicio.equals(other.getDatajVigenciaInicio()))) &&
            ((this.descricaoDiretoriaRegional==null && other.getDescricaoDiretoriaRegional()==null) || 
             (this.descricaoDiretoriaRegional!=null &&
              this.descricaoDiretoriaRegional.equals(other.getDescricaoDiretoriaRegional()))) &&
            ((this.descricaoStatus==null && other.getDescricaoStatus()==null) || 
             (this.descricaoStatus!=null &&
              this.descricaoStatus.equals(other.getDescricaoStatus()))) &&
            ((this.diretoriaRegional==null && other.getDiretoriaRegional()==null) || 
             (this.diretoriaRegional!=null &&
              this.diretoriaRegional.equals(other.getDiretoriaRegional()))) &&
            ((this.horajAtualizacao==null && other.getHorajAtualizacao()==null) || 
             (this.horajAtualizacao!=null &&
              this.horajAtualizacao.equals(other.getHorajAtualizacao()))) &&
            ((this.statusCodigo==null && other.getStatusCodigo()==null) || 
             (this.statusCodigo!=null &&
              this.statusCodigo.equals(other.getStatusCodigo())));
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
        if (getCartoesPostagem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCartoesPostagem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCartoesPostagem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCliente() != null) {
            _hashCode += getCliente().hashCode();
        }
        _hashCode += new Long(getCodigoCliente()).hashCode();
        if (getCodigoDiretoria() != null) {
            _hashCode += getCodigoDiretoria().hashCode();
        }
        if (getContratoPK() != null) {
            _hashCode += getContratoPK().hashCode();
        }
        if (getDataAtualizacao() != null) {
            _hashCode += getDataAtualizacao().hashCode();
        }
        if (getDataAtualizacaoDDMMYYYY() != null) {
            _hashCode += getDataAtualizacaoDDMMYYYY().hashCode();
        }
        if (getDataVigenciaFim() != null) {
            _hashCode += getDataVigenciaFim().hashCode();
        }
        if (getDataVigenciaFimDDMMYYYY() != null) {
            _hashCode += getDataVigenciaFimDDMMYYYY().hashCode();
        }
        if (getDataVigenciaInicio() != null) {
            _hashCode += getDataVigenciaInicio().hashCode();
        }
        if (getDataVigenciaInicioDDMMYYYY() != null) {
            _hashCode += getDataVigenciaInicioDDMMYYYY().hashCode();
        }
        if (getDatajAtualizacao() != null) {
            _hashCode += getDatajAtualizacao().hashCode();
        }
        if (getDatajVigenciaFim() != null) {
            _hashCode += getDatajVigenciaFim().hashCode();
        }
        if (getDatajVigenciaInicio() != null) {
            _hashCode += getDatajVigenciaInicio().hashCode();
        }
        if (getDescricaoDiretoriaRegional() != null) {
            _hashCode += getDescricaoDiretoriaRegional().hashCode();
        }
        if (getDescricaoStatus() != null) {
            _hashCode += getDescricaoStatus().hashCode();
        }
        if (getDiretoriaRegional() != null) {
            _hashCode += getDiretoriaRegional().hashCode();
        }
        if (getHorajAtualizacao() != null) {
            _hashCode += getHorajAtualizacao().hashCode();
        }
        if (getStatusCodigo() != null) {
            _hashCode += getStatusCodigo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContratoERP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "contratoERP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartoesPostagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cartoesPostagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "cartaoPostagemERP"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "clienteERP"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoDiretoria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoDiretoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contratoPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contratoPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "contratoERPPK"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAtualizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataAtualizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAtualizacaoDDMMYYYY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataAtualizacaoDDMMYYYY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataVigenciaFim");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataVigenciaFim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataVigenciaFimDDMMYYYY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataVigenciaFimDDMMYYYY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataVigenciaInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataVigenciaInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataVigenciaInicioDDMMYYYY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataVigenciaInicioDDMMYYYY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datajAtualizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datajAtualizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datajVigenciaFim");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datajVigenciaFim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datajVigenciaInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datajVigenciaInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoDiretoriaRegional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricaoDiretoriaRegional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descricaoStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diretoriaRegional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "diretoriaRegional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "unidadePostagemERP"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horajAtualizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "horajAtualizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCodigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusCodigo"));
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
