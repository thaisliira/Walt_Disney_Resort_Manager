package Views;

import Controllers.ClientController;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * View responsável por apresentar o menu do perfil Cliente e encaminhar as opções selecionadas
 * para o respetivo ClientController.
 */
public class ClientView {

    /** Controller responsável pelas operações disponíveis ao perfil Cliente. */
    private ClientController clientController;

    /**
     * Constrói uma instância de ClientView e inicializa o ClientController.
     *
     * @throws FileNotFoundException se algum ficheiro necessário para inicialização do controller não for encontrado.
     */
    public ClientView() throws FileNotFoundException {
        this.clientController = new ClientController();
    }

    /**
     * Apresenta o menu do Cliente e executa a operação correspondente à opção escolhida.
     * O menu é repetido até o utilizador selecionar a opção 0.
     *
     * @throws FileNotFoundException se alguma operação invocada depender de ficheiros inexistentes.
     */
    public void menu() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao = -1;

        do {

            System.out.println("\n\n==============================================");
            System.out.println("          WALT DISNEY RESORT - VISITANTE       ");
            System.out.println("==============================================");
            System.out.println("🛏️ 1. Consultar Quartos Disponiveis");
            System.out.println("🎭 2. Consultar Experiencias Disponiveis");
            System.out.println("💖 3. Consultar Experiencia Favorita");
            System.out.println("🔥 4. Consultar Experiencia Top-Seller");
            System.out.println("⭐ 5. Avaliar uma Experiencia");
            System.out.println("🚪 0. Voltar");
            System.out.println("----------------------------------------------");

            System.out.print("Opcao: ");

            if (!input.hasNextInt()) {
                System.out.println("Erro: Por favor, insira apenas numeros.");
                input.nextLine();
                continue;
            }

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    this.clientController.quartosDisponiveis();
                    break;

                case 2:
                    this.clientController.showAvailableExperiences();
                    break;

                case 3:
                    this.clientController.optionNotAvailable();
                    break;

                case 4:
                    this.clientController.topSeller();
                    break;

                case 5:
                    this.clientController.optionNotAvailable();
                    break;

                case 0:
                    System.out.println("👋✨ Ate a proxima! A magia continua!");
                    break;

                default:
                    System.out.println("⚠️ Opcao invalida: " + opcao);
                    break;
            }

        } while (opcao != 0);
    }
}