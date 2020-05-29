package br.com.correios.bsb.sigep.master.bean.cliente;

public class AtendeClienteProxy implements br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente {
  private String _endpoint = null;
  private br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente atendeCliente = null;
  
  public AtendeClienteProxy() {
    _initAtendeClienteProxy();
  }
  
  public AtendeClienteProxy(String endpoint) {
    _endpoint = endpoint;
    _initAtendeClienteProxy();
  }
  
  private void _initAtendeClienteProxy() {
    try {
      atendeCliente = (new br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteServiceLocator()).getAtendeClientePort();
      if (atendeCliente != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)atendeCliente)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)atendeCliente)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (atendeCliente != null)
      ((javax.xml.rpc.Stub)atendeCliente)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente getAtendeCliente() {
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente;
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalXML[] buscaServicosAdicionaisAtivos(java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SQLException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.buscaServicosAdicionaisAtivos(usuario, senha);
  }
  
  public java.lang.Long fechaPlp(java.lang.String xml, java.lang.Long idPlpCliente, java.lang.String cartaoPostagem, java.lang.String faixaEtiquetas, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.fechaPlp(xml, idPlpCliente, cartaoPostagem, faixaEtiquetas, usuario, senha);
  }
  
  public java.lang.String calculaTarifaServico(java.lang.String codAdministrativo, java.lang.String usuario, java.lang.String senha, java.lang.String codServico, java.lang.String cepOrigem, java.lang.String cepDestino, java.lang.String peso, java.lang.Integer codFormato, java.lang.Double comprimento, java.lang.Double altura, java.lang.Double largura, java.lang.Double diametro, java.lang.String codMaoPropria, java.lang.Double valorDeclarado, java.lang.String codAvisoRecebimento) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException, br.com.correios.bsb.sigep.master.bean.cliente.Exception{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.calculaTarifaServico(codAdministrativo, usuario, senha, codServico, cepOrigem, cepDestino, peso, codFormato, comprimento, altura, largura, diametro, codMaoPropria, valorDeclarado, codAvisoRecebimento);
  }
  
  public boolean validaPlp(long cliente, java.lang.String numero, long diretoria, java.lang.String cartao, java.lang.String unidadePostagem, java.lang.Long servico, java.lang.String[] servicosAdicionais, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.validaPlp(cliente, numero, diretoria, cartao, unidadePostagem, servico, servicosAdicionais, usuario, senha);
  }
  
  public boolean verificaSeTodosObjetosCancelados(br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[] arg0) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.verificaSeTodosObjetosCancelados(arg0);
  }
  
  public java.lang.Boolean cancelarObjeto(java.lang.Long idPlp, java.lang.String numeroEtiqueta, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException, br.com.correios.bsb.sigep.master.bean.cliente.Exception{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.cancelarObjeto(idPlp, numeroEtiqueta, usuario, senha);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO pesquisarParametrosPorDescricao(java.lang.String prefix) throws java.rmi.RemoteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.pesquisarParametrosPorDescricao(prefix);
  }
  
  public java.lang.String atualizaPagamentoNaEntrega(java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SQLException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.atualizaPagamentoNaEntrega(usuario, senha);
  }
  
  public java.util.Calendar obterClienteAtualizacao(java.lang.String cnpjCliente, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.obterClienteAtualizacao(cnpjCliente, usuario, senha);
  }
  
  public java.lang.String verificaDisponibilidadeServico(java.lang.Integer codAdministrativo, java.lang.String numeroServico, java.lang.String cepOrigem, java.lang.String cepDestino, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.verificaDisponibilidadeServico(codAdministrativo, numeroServico, cepOrigem, cepDestino, usuario, senha);
  }
  
  public java.lang.Long fechaPlpVariosServicos(java.lang.String xml, java.lang.Long idPlpCliente, java.lang.String cartaoPostagem, java.lang.String[] listaEtiquetas, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.fechaPlpVariosServicos(xml, idPlpCliente, cartaoPostagem, listaEtiquetas, usuario, senha);
  }
  
  public int[] geraDigitoVerificadorEtiquetas(java.lang.String[] etiquetas, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.geraDigitoVerificadorEtiquetas(etiquetas, usuario, senha);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.EmbalagemLRSMaster[] obterEmbalagemLRS() throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.obterEmbalagemLRS();
  }
  
  public boolean validaEtiquetaPLP(java.lang.String numeroEtiqueta, java.lang.Long idPlp, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.validaEtiquetaPLP(numeroEtiqueta, idPlp, usuario, senha);
  }
  
  public java.lang.String[] buscaServicosValorDeclarado(java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SQLException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.buscaServicosValorDeclarado(usuario, senha);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP consultaCEP(java.lang.String cep) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SQLException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.consultaCEP(cep);
  }
  
  public java.lang.Boolean integrarUsuarioScol(java.lang.Integer codAdministrativo, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.integrarUsuarioScol(codAdministrativo, usuario, senha);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.DimensaoTO pesquisarDimensoesServico(java.lang.String codigo, java.lang.String embalagem) throws java.rmi.RemoteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.pesquisarDimensoesServico(codigo, embalagem);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.TipoEmbalagem[] pesquisarEmbalagensPorServico(java.lang.String codigo) throws java.rmi.RemoteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.pesquisarEmbalagensPorServico(codigo);
  }
  
  public java.lang.String atualizaRemessaAgrupada(java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SQLException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.atualizaRemessaAgrupada(usuario, senha);
  }
  
  public java.lang.String solicitaPLP(java.lang.Long idPlpMaster, java.lang.String numEtiqueta, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.solicitaPLP(idPlpMaster, numEtiqueta, usuario, senha);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.StatusCartao getStatusCartaoPostagem(java.lang.String numeroCartaoPostagem, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.getStatusCartaoPostagem(numeroCartaoPostagem, usuario, senha);
  }
  
  public java.lang.String verificaModalTransporte(java.lang.String codigoServico, java.lang.String cepOrigem, java.lang.String cepDestino, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.verificaModalTransporte(codigoServico, cepOrigem, cepDestino, usuario, senha);
  }
  
  public java.util.Calendar buscaDataAtual() throws java.rmi.RemoteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.buscaDataAtual();
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.ValePostal buscaTarifaVale(java.lang.String codAdministrativo, java.lang.String usuario, java.lang.String senha, java.lang.String codServico, java.lang.String cepOrigem, java.lang.String cepDestino, java.lang.String peso, java.lang.Integer codFormato, java.lang.Double comprimento, java.lang.Double altura, java.lang.Double largura, java.lang.Double valorDeclarado, java.lang.String servicoAdicional) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException, br.com.correios.bsb.sigep.master.bean.cliente.Exception{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.buscaTarifaVale(codAdministrativo, usuario, senha, codServico, cepOrigem, cepDestino, peso, codFormato, comprimento, altura, largura, valorDeclarado, servicoAdicional);
  }
  
  public java.lang.Boolean validarPostagemSimultanea(java.lang.Integer codAdministrativo, java.lang.Integer codigoServico, java.lang.String idCartaoPostagem, java.lang.String cepDestinatario, br.com.correios.bsb.sigep.master.bean.cliente.ColetaSimultanea coleta, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.validarPostagemSimultanea(codAdministrativo, codigoServico, idCartaoPostagem, cepDestinatario, coleta, usuario, senha);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.StatusPlp getStatusPLP(br.com.correios.bsb.sigep.master.bean.cliente.ObjetoPostal[] arg0, java.lang.String arg1) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.getStatusPLP(arg0, arg1);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.ServicoAdicionalTO[] pesquisarServicosAdicionais(java.lang.String codigo) throws java.rmi.RemoteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.pesquisarServicosAdicionais(codigo);
  }
  
  public java.lang.String[] buscaServicosXServicosAdicionais(java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SQLException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.buscaServicosXServicosAdicionais(usuario, senha);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.RetornoCancelamento cancelarPedidoScol(java.lang.String codAdministrativo, java.lang.String idPostagem, java.lang.String tipo, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.cancelarPedidoScol(codAdministrativo, idPostagem, tipo, usuario, senha);
  }
  
  public java.lang.String bloquearObjeto(java.lang.String numeroEtiqueta, java.lang.Long idPlp, br.com.correios.bsb.sigep.master.bean.cliente.TipoBloqueio tipoBloqueio, br.com.correios.bsb.sigep.master.bean.cliente.Acao acao, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.bloquearObjeto(numeroEtiqueta, idPlp, tipoBloqueio, acao, usuario, senha);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.ContratoERP buscaContrato(java.lang.String numero, long diretoria, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.buscaContrato(numero, diretoria, usuario, senha);
  }
  
  public java.lang.String solicitaEtiquetas(java.lang.String tipoDestinatario, java.lang.String identificador, java.lang.Long idServico, java.lang.Integer qtdEtiquetas, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.solicitaEtiquetas(tipoDestinatario, identificador, idServico, qtdEtiquetas, usuario, senha);
  }
  
  public java.lang.String solicitaXmlPlp(java.lang.Long idPlpMaster, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.solicitaXmlPlp(idPlpMaster, usuario, senha);
  }
  
  public java.lang.Boolean validarPostagemReversa(java.lang.String codAdministrativo, java.lang.String codigoServico, java.lang.String cepDestinatario, java.lang.String idCartaoPostagem, br.com.correios.bsb.sigep.master.bean.cliente.ColetaReversa coleta, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.validarPostagemReversa(codAdministrativo, codigoServico, cepDestinatario, idCartaoPostagem, coleta, usuario, senha);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.ClienteERP buscaCliente(java.lang.String idContrato, java.lang.String idCartaoPostagem, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.buscaCliente(idContrato, idCartaoPostagem, usuario, senha);
  }
  
  public java.lang.String buscaPagamentoEntrega(java.lang.String usuario, java.lang.String senha, java.lang.String contrato, java.lang.String dataInicio, java.lang.String dataFim, java.lang.String etiqueta) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.ErroMontagemRelatorio, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.buscaPagamentoEntrega(usuario, senha, contrato, dataInicio, dataFim, etiqueta);
  }
  
  public java.lang.String solicitarPostagemScol(java.lang.Integer codAdministrativo, java.lang.String xml, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.solicitarPostagemScol(codAdministrativo, xml, usuario, senha);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.ServicoERP[] buscaServicos(java.lang.String idContrato, java.lang.String idCartaoPostagem, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.AutenticacaoException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.buscaServicos(idContrato, idCartaoPostagem, usuario, senha);
  }
  
  public br.com.correios.bsb.sigep.master.bean.cliente.MensagemParametrizadaTO obterMensagemParametrizada(java.lang.Short id) throws java.rmi.RemoteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.obterMensagemParametrizada(id);
  }
  
  public java.lang.String buscaOpcoes(java.lang.String[] listaObjetos, java.lang.String tipoResultado, java.lang.String usuario, java.lang.String senha) throws java.rmi.RemoteException, br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException{
    if (atendeCliente == null)
      _initAtendeClienteProxy();
    return atendeCliente.buscaOpcoes(listaObjetos, tipoResultado, usuario, senha);
  }
  
  
}