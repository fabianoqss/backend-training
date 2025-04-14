package sistema.biblioteca.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sistema.biblioteca.enums.EnumCondicaoLivro;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class LivroFisico extends Livro{
    private Integer quantidadeEstoque;
    private EnumCondicaoLivro condicaoLivro;
}
