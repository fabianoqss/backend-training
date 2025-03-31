package application;

import model.entities.Agenda;
import model.entities.ContatoPessoal;
import model.entities.ContatoProfissional;
import model.enums.TipoContato;
import model.persistence.PersistenciaJson;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static Scanner sc = new Scanner(System.in);
    private static Agenda agenda = new Agenda();
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int opcao;
        do {
            exibeMenu();

            opcao = sc.nextInt();
            switch (opcao) {
                case 1 -> adicionarContato();
                case 2 -> removerContato();
                case 3 -> editarContato();
                case 4 -> buscarContato();
                case 5 -> listarContatos();
                case 6 -> persistenciaDados();
                case 0 -> System.out.println("Saindo do programa...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }while(opcao != 0);
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
        System.out.print("---> ");
    }

    public static void adicionarContato(){
        sc.nextLine();
        System.out.println("Digite o nome do Contato: ");
        String name = sc.nextLine();

        System.out.println("Digite o telefone do Contato: ");
        String telefone = sc.nextLine();

        System.out.println("Digite o email do Contato: ");
        String email = sc.nextLine();

        TipoContato tipoContato = null;

        while(tipoContato == null){
            try{
                System.out.println("Digite o tipo Contato (PESSOAL ou PROFESSIONAL)");
                tipoContato = TipoContato.valueOf(sc.nextLine().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Tipo Inválido! Tente novamente");
            }
        }

        System.out.println("Digite a data de Nascimento do Contato: (dd/MM/yyyy) ");
        LocalDate data = LocalDate.parse(sc.nextLine(), formatter);
        

        System.out.println("Digite o endereço do Contato: ");
        String endereco = sc.nextLine();

        if(tipoContato == TipoContato.PROFESSIONAL){
            System.out.println("Digite a  Empresa: ");
            String empresa = sc.nextLine();
            System.out.println("Digite o Cargo: ");
            String cargo = sc.nextLine();
            System.out.println("Digite o departamento: ");
            String departamento = sc.nextLine();
            agenda.addContatos(name, new ContatoProfissional(name, telefone, email, tipoContato, data, endereco, empresa, cargo, departamento));
        }else if(tipoContato == TipoContato.PESSOAL) {
            System.out.println("Digite a Relação: (Primo/Irmaõ/Pai/Mãe)");
            String relacao = sc.nextLine();
            agenda.addContatos(name, new ContatoPessoal(name, telefone, email, tipoContato, data, endereco, relacao));
        }
    }

    public static void removerContato(){
        sc.nextLine();
        System.out.println("Digite o nome do contato a ser removido: ");
        agenda.removeContatos(sc.nextLine());
    }

    public static void editarContato(){

    }

    public static void buscarContato(){
        sc.nextLine();
        System.out.println("Digite o nome do contato a ser buscado: ");
        agenda.buscarContato(sc.nextLine());
    }

    public static void listarContatos(){
        System.out.println("Listando os contatos: ");
        agenda.listarContato();
    }

    public static void persistenciaDados(){
        System.out.println("Passe o caminho do arquivo que deseja salvar: ");
        String path = sc.nextLine();
        PersistenciaJson.salvarDados(agenda, path);
    }
}
