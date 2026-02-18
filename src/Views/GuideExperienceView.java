package Views;

import Controllers.GuideExperienceController;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * View responsável por apresentar o menu do perfil de Guia de Experiências e encaminhar
 * as opções selecionadas para o respetivo GuideExperienceController.
 */
public class GuideExperienceView {

    /** Controller responsável pelas operações disponíveis ao perfil de guia. */
    private GuideExperienceController guideExperienceController;

    /**
     * Constrói uma instância de GuideExperienceView e inicializa o GuideExperienceController.
     *
     * @throws FileNotFoundException se algum ficheiro necessário para inicialização do controller não for encontrado.
     */
    public GuideExperienceView() throws FileNotFoundException {
        this.guideExperienceController = new GuideExperienceController();
    }

    /**
     * Apresenta o menu do Guia de Experiências e executa a operação correspondente à opção escolhida.
     * O menu é repetido até o utilizador selecionar a opção 0.
     *
     * @param userGuide identificador (username/ID) do guia autenticado, usado para filtrar e apresentar informação.
     * @throws FileNotFoundException se alguma operação invocada depender de ficheiros inexistentes.
     */
    public void menu(String userGuide) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcao = -1;

        do {

            System.out.println("\n\n==============================================");
            System.out.println("          WALT DISNEY RESORT - Guia       ");
            System.out.println("==============================================");
            System.out.println("🎭✨ ***** BEM-VIND@, " + userGuide + " ***** ✨🎭");
            System.out.println("📜 1. Consultar Histórico de Experiências");
            System.out.println("🚪 0. Voltar");
            System.out.print("👉 Opção: ");

            if (!input.hasNextInt()) {
                System.out.println("❌ Erro! Por favor, insira apenas números.");
                input.nextLine();
                continue;
            }

            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("🗺️ Abrindo o teu histórico de experiências...");
                    this.guideExperienceController.experienceHistory(userGuide);
                    break;

                case 0:
                    System.out.println("👋✨ Até à próxima!");
                    break;

                default:
                    System.out.println("⚠️ Opção inválida: " + opcao);
                    break;
            }
        } while (opcao != 0);
    }
}