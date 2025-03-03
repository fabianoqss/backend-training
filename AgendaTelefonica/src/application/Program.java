package application;

import model.entities.Agenda;
import model.enums.TipoContato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    private static Scanner sc = new Scanner(System.in);
    private static Agenda agenda = new Agenda();
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String resposta;

        do {
            exibeMenu();

            System.out.println("Deseja continuar? (SIM/NAO)");
            resposta = sc.nextLine().toUpperCase();
        }while(resposta.equals("SIM"));

    }


    public static void exibeMenu(){
        System.out.println("Selecione uma opção na Agenda Telefônica: ");
        System.out.println("1 - Adicionar Contato!");
        System.out.println("2 - Remover Contato!");
        System.out.println("3 - Editar Contato!");
        System.out.println("4 - Buscar Contato!");
        System.out.println("5 - Listar Contatos!");
        System.out.println("6 - Fazer a persistência dos Contatos em um arquivo JSON ou TXT.");
        System.out.println("0 - Finalizar o programa.");
    }

    public static void adicaoDeContato(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do Contato: ");
        String name = sc.nextLine();

        System.out.println("Digite o telefone do Contato: ");
        String telefone = sc.nextLine();

        System.out.println("Digite o email do Contato: ");
        String email = sc.nextLine();

        System.out.println("Digite o tipo do Contato: ");
        TipoContato tipoContato = TipoContato.valueOf(sc.nextLine());

        System.out.println("Digite a data de Nascimento do Contato: ");
        LocalDate data = LocalDate.parse(sc.next(), formatter);

        System.out.println("Digite o endereço do Contato: ");
        String endereco = sc.nextLine();

        if(tipoContato == TipoContato.PROFESSIONAL){
            System.out.println("Digite a  Empresa: ");
            String empresa = sc.nextLine();
            System.out.println("Digite o Cargo: ");
            String cargo = sc.nextLine();
            System.out.println("Digite o departamento: ");
            String departamento = sc.nextLine();

        }else if(tipoContato == TipoContato.PESSOAL)
            System.out.println("Digite a Relação");
            String relação = sc.nextLine();
    }

}
