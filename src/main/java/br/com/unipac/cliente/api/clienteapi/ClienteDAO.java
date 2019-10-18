package br.com.unipac.cliente.api.clienteapi;

import java.util.List;

public interface ClienteDAO {
	boolean salvar(Cliente cliente);

	boolean alterar(Long id, Cliente cliente);

	List<Cliente> listarTodos();

	boolean buscarPorId(Cliente cliente);

	boolean removerPorId(Cliente cliente);
}
