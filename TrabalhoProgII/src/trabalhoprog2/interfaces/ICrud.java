package trabalhoprog2.interfaces;

import java.util.List;

public interface ICrud<T> {
    public void salvar(T t);
    public List<T> consultarTodos();
    public T consultarPorId (int id);
    public void excluir(int id);
    public void update(T t);
    
    
}
