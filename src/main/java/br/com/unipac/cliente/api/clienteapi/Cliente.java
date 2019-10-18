package br.com.unipac.cliente.api.clienteapi;

public class Cliente {
	
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Cliente(long id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void update(Long id2, Cliente cliente) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
