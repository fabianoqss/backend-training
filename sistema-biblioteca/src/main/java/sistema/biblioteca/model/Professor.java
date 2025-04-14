package sistema.biblioteca.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Professor extends Usuario{
    private String departamento;
    private String titulacao;

}
