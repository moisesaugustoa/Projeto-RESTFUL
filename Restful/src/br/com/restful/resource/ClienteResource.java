package br.com.restful.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.restful.controller.ClienteController;
import br.com.restful.model.Cliente;

import com.google.gson.Gson;

/**
 * 
 * Classe responsável por conter os metodos REST de acesso ao webservice
 *
 * @author Moisés Augusto
 * @since 28/07/2018
 * @version 1.0
 */
@Path("/cliente")
public class ClienteResource {

	/**
	 * 
	 * Método responsável por fazer chamada ao controller
	 *
	 * @return ArrayList<Cliente> 
	
	 */
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<Cliente> listarTodos(){
		return new ClienteController().listarTodos();
	}
}
