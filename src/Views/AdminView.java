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
            System.out.println("\n\n==============================================");
            System.out.println("          WALT DISNEY RESORT - Admin       ");
            System.out.println("==============================================");
            System.out.println("📊 1. Consultar Total de Reservas");
            System.out.println("💰 2. Consultar Total de Receitas");
            System.out.println("🗓️ 3. Consultar Reservas/Receitas Mensais");
            System.out.println("🛏️ 4. Tipologia de Quarto Mais Reservada");
            System.out.println("🎭 5. Experiência Mais Procurada (Adultos)");
            System.out.println("🧸 6. Experiência Mais Procurada (Crianças)");
            System.out.println("🏆 7. Experiência Mais Lucrativa");
            System.out.println("🪙 8. Experiência Menos Lucrativa");
            System.out.println("💎 9. Quarto com Melhor Preço/Semana");
            System.out.println("➕ 10. Adicionar Novo Login");
            System.out.println("🚪 0. Voltar");

            System.out.print("👉 Opção: ");

            if (!input.hasNextInt()) {
                System.out.println("❌ Erro: Por favor, insira apenas números!");
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
                    System.out.println("🎭 A calcular a experiência mais procurada por adultos...");
                    this.adminController.expMostPopAdult();
                    break;

                case 6:
                    System.out.println("🧸 A calcular a experiência mais procurada por crianças...");
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
                    System.out.println("👋✨ Até à próxima, Majestade!");
                    break;

                default:
                    System.out.println("⚠️ Opção inválida: " + opcao);
                    break;
            }

        } while (opcao != 0);
    }
}