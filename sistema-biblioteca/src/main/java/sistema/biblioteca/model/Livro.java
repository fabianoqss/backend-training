package sistema.biblioteca.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Livro {
    private Integer idLivro;
    private String titulo;
    private Autor autor;
    private LocalDate ano;
    private String isbn;

}
