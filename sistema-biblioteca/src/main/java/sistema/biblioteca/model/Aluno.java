package sistema.biblioteca.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sistema.biblioteca.enums.EnumSituacaoAluno;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Aluno extends Usuario{
    private String curso;
    private Integer periodo;
    private EnumSituacaoAluno situacaoAluno;

}
