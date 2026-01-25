package Views;

import Controllers.AdminController;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * View responsável por apresentar o menu do perfil Admin e encaminhar as opções selecionadas
 * para o respetivo AdminController.
 */
public class AdminView {

    /** Controller responsável pelas operações e consultas disponíveis ao perfil Admin. */
    private AdminController adminController;

    /**
     * Constrói uma instância de AdminView e inicializa o AdminController.
     *
     * @throws FileNotFoundException se algum ficheiro necessário para inicialização do controller não for encontrado.
     */
    public AdminView() throws FileNotFoundException {
        this.adminController = new AdminController();
    }

    /**
     * Apresenta o menu do Admin e executa a operação correspondente à opção escolhida.
     * O menu é repetido até o utilizador selecionar a opção 0.
     *
     * @throws FileNotFoundException se alguma operação invocada depender de ficheiros inexistentes.
     */
    public void menu() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao = -1;

        do {

            System.out.println("\n\n***** Bem-vind@ Admin *****");
            System.out.println("1. Consultar Total de Reservas");
            System.out.println("2. Consultar total de receitas");
            System.out.println("3. Consultar Reservas/Receitas Mensais");
            System.out.println("4. Consultar Tipologia de Quartos mais Reservada");
            System.out.println("5. Consultar Experiência mais Procurada - Adultos");
            System.out.println("6. Consultar Experiência mais Procurada - Crianças");
            System.out.println("7. Consultar Experiência mais Lucrativa");
            System.out.println("8. Consultar Experiência menos Lucrativa");
            System.out.println("9. Consultar Quarto com melhor Preço/Semana");
            System.out.println("10. Adicionar Novo Login");
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
                    this.adminController.optionNotAvailable();
                    break;

                case 2:
                    this.adminController.optionNotAvailable();
                    break;

                case 3:
                    this.adminController.optionNotAvailable();
                    break;

                case 4:
                    this.adminController.optionNotAvailable();
                    break;

                case 5:
                    this.adminController.expMostPopAdult();
                    break;

                case 6:
                    this.adminController.expMostPopChild();
                    break;

                case 7:
                    this.adminController.optionNotAvailable();
                    break;

                case 8:
                    this.adminController.optionNotAvailable();
                    break;

                case 9:
                    this.adminController.optionNotAvailable();
                    break;

                case 10:
                    this.adminController.optionNotAvailable();
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