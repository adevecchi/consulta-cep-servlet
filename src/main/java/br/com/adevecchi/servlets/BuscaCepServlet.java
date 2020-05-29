package br.com.adevecchi.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.RemoteException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.correios.bsb.sigep.master.bean.cliente.*;

import com.google.gson.Gson;

@WebServlet("/consultar-cep")
public class BuscaCepServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		AtendeClienteProxy cliente = new AtendeClienteProxy();
		
		try {
			EnderecoERP endereco = cliente.consultaCEP(req.getParameter("cep"));
			
			String enderecoJsonString = new Gson().toJson(endereco);
			
			PrintWriter out = res.getWriter();
			
			res.setContentType("application/json");
			res.setCharacterEncoding("utf-8");
			out.print(enderecoJsonString);
			out.flush();
		}
		catch (SQLException e) {
			throw new ServletException(e.getMessage());
		}
	    catch (SigepClienteException e) {
			throw new ServletException(e.getMessage());
		}
	    catch (RemoteException e) {
			throw new ServletException(e.getMessage());
		}
		
	}

}
