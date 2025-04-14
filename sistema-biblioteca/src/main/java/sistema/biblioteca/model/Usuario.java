package sistema.biblioteca.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {
    private Integer idAluno;
    private String nome;
    private String email;
    private int matriculaFuncional;
    private List<Livro> livrosEmprestados = new ArrayList<>();
}
