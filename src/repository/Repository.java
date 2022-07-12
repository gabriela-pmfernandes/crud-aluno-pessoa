package repository;

import java.util.List;

public interface Repository<T> {
	public List<T> buscarTodos();
	public T buscaPorId(int id);
	public void salvar(T objeto);
	public void atualizar(T objeto);
	public void excluir(int id);
}
