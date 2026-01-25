package Views;

import Controllers.RecepcionistController;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * View responsável por apresentar o menu do perfil de Staff/Receção e encaminhar as opções
 * selecionadas para o respetivo RecepcionistController.
 */
public class RecepcionistView {

    /** Controller responsável pelas operações disponíveis ao perfil de rececionista/staff. */
    private RecepcionistController recepcionistController;

    /**
     * Constrói uma instância de RecepcionistView e inicializa o RecepcionistController.
     *
     * @throws FileNotFoundException se algum ficheiro necessário para inicialização do controller não for encontrado.
     */
    public RecepcionistView() throws FileNotFoundException {
        this.recepcionistController = new RecepcionistController();
    }

    /**
     * Apresenta o menu do Staff e executa a operação correspondente à opção escolhida.
     * O menu é repetido até o utilizador selecionar a opção 0.
     *
     * @throws FileNotFoundException se alguma operação invocada depender de ficheiros inexistentes.
     */
    public void menu() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao = -1;

        do {

            System.out.println("\n\n***** Bem-vind@ Staff *****");
            System.out.println("1. Consultar Quartos Disponíveis");
            System.out.println("2. Consultar Quartos Reservados");
            System.out.println("3. Consultar Reservas Atuais");
            System.out.println("4. Efetuar uma Reserva");
            System.out.println("5. Reservar uma Experiência");
            System.out.println("0. Voltar");

            System.out.print("Opção: ");

            if (!input.hasNextInt()) {
                System.out.println("Erro: Por favor, insira apenas números.");
                input.nextLine();
                continue;
            }

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    this.recepcionistController.freeRoomsWeek2();
                    break;

                case 2:
                    this.recepcionistController.optionNotAvailable();
                    break;

                case 3:
                    this.recepcionistController.optionNotAvailable();
                    break;

                case 4:
                    this.recepcionistController.optionNotAvailable();
                    break;

                case 5:
                    this.recepcionistController.optionNotAvailable();
                    break;

                case 0:
                    System.out.println("Até à proxima ⍈");
                    break;

                default:
                    System.out.println("Opção inválida: " + opcao);
                    break;
            }

        } while (opcao != 0);
    }
}