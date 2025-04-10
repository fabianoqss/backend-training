package sistema.biblioteca.interfaces;

import sistema.biblioteca.model.Livro;
import sistema.biblioteca.model.Usuario;

public interface Emprestavel {
    void realizarEmprestimo(Usuario usuario, Livro livro);
    void registrarDevolucao(Usuario usuario, Livro livro);
}
