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

public class LivroDigital extends Livro{
    private Integer numeroAcessos;
    private LocalDate tempoLicenca;
}
