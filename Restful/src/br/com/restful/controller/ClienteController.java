package br.com.restful.controller;

import java.util.ArrayList;

import br.com.restful.dao.ClienteDAO;
import br.com.restful.model.Cliente;

/**
 * 
 * Classe responsável por ser o controlador entre o resource e a camada DAO
 *
 * @author Moisés AUgusto

 */
public class ClienteController {
	
	public ArrayList<Cliente> listarTodos(){
		System.out.println("Enviando para o GIT");
		return ClienteDAO.getInstance().listarTodos();
	}
	
}
