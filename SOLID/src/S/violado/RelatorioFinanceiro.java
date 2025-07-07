package S.violado;


/**
 * Nesse Caso , Vamos que viola o SRP , pois se tem muitas responsabilidades nessa Classe:
 * Cálculo Financeiro
 * Formatação/Exportação do relatório
 * Envio por Email.
 */
public class RelatorioFinanceiro {
    public double calcularLucro(double receita, double custo) {
        return receita - custo;
    }

    public String gerarRelatorioPDF(String conteudo) {
        // lógica de formatação e exportação para PDF
        return "PDF: " + conteudo;
    }

    public void enviarPorEmail(String destinatario, String relatorio) {
        // lógica de envio por e-mail
        System.out.println("Enviando e-mail para: " + destinatario);
    }
}
