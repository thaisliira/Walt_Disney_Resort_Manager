package Controllers;

import Assets.FileTools;
import Models.*;
import Repositories.*;
import Views.ClientView;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Controller responsável pelas funcionalidades disponíveis para o perfil de Cliente.
 * Disponibiliza operações de consulta de informação do resort, recorrendo aos repositórios
 * de quartos, tipologias, reservas e experiências.
 */
public class ClientController {

    /** Repositório de quartos do sistema. */
    private RoomsRepo roomsRepo;

    /** Repositório de experiências do sistema. */
    private ExperiencesRepo experiencesRepo;

    /** Repositório de reservas (bookings) do sistema. */
    private BookingRepo bookingRepo;

    /** Repositório de tipologias (tipos de quarto) do sistema. */
    private TipologyRepo tipologyRepo;

    /**
     * Constrói uma instância de ClientController e inicializa os repositórios necessários.
     *
     * @throws FileNotFoundException se algum ficheiro necessário para inicializar os repositórios não for encontrado.
     */
    public ClientController() throws FileNotFoundException {
        this.roomsRepo = RoomsRepo.getInstance();
        this.experiencesRepo = ExperiencesRepo.getInstance();
        this.bookingRepo = BookingRepo.getInstance();
        this.tipologyRepo = TipologyRepo.getInstance();
    }

    /**
     * Apresenta o catálogo de quartos do resort, incluindo número do quarto, tipologia e preço por semana.
     *
     * @throws FileNotFoundException se ocorrer falha ao aceder a ficheiros necessários aos repositórios utilizados.
     */
    public void quartosDisponiveis() throws FileNotFoundException {
        System.out.println("\n====================================================");
        System.out.println("          CATÁLOGO DE QUARTOS DO CESAE RESORT             ");
        System.out.println("====================================================");
        System.out.println("Nº Quarto | Tipologia | Preço/Semana");
        System.out.println("----------------------------------------------------");

        TipologyRepo tipRepo = TipologyRepo.getInstance();

        for (Room roomatual : roomsRepo.getRoomsArrayList()) {
            Tipology tip = tipRepo.getTipologyById(roomatual.getTypologyID());
            if (tip != null) {
                System.out.println(
                        roomatual.getNumQuarto() + " | " +
                                tip.getDescription() + " | " +
                                tip.getTypologyPrice() + "€"
                );
            }
        }
        System.out.println("====================================================\n");
    }

    public void showAvailableExperiences() throws FileNotFoundException {
        System.out.println("\n====================================================");
        System.out.println("          CATÁLOGO DE EXPERIÊNCIAS             ");
        System.out.println("====================================================");
        System.out.println("Experiência | Guia Responsável |Preço-Adulto | Preço-Criança");
        System.out.println("----------------------------------------------------");

        GuidesExperienceRepo guideRepo = GuidesExperienceRepo.getInstance();

        for (Experience exp : experiencesRepo.getExperienceArrayList()) {
            GuideExperience guide = guideRepo.getGuideById(exp.getGuiaID());

            String guideName = "Guia não encontrado";
            if (guide != null) {
                guideName = guide.getGuideName();
            }

            System.out.println(
                    exp.getExperienceName() + " | " +
                            guideName + " | " +
                            exp.getAdultPrice() + "€ | " +
                            exp.getChildPrice() + "€"
            );
        }
    }

    public void topSeller() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("\n🏆✨ TOP-SELLERS ✨🏆");
            System.out.println("Qual top-seller deseja saber?");
            System.out.println("🧑‍🦱 1. Adulto");
            System.out.println("🧒  2. Criança");
            System.out.println("🚪  0. Voltar");

            System.out.print("Opção: ");

            if (!input.hasNextInt()) {
                System.out.println("❌ Entrada inválida. Digita um número (1, 2 ou 0).");
                input.nextLine();
                continue;
            }

            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    topSellerAdultos();
                    break;

                case 2:
                    topSellerCriancas();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("⚠️ Opção inválida: " + opcao + " — tenta novamente!");
                    break;
            }

        } while (opcao != 0);
    }

    public void topSellerAdultos() throws FileNotFoundException {
        Experience bestSale = null;
        int max = -1;

        for (Experience exp : experiencesRepo.getExperienceArrayList()) {
            int qtd = Sales.adultsQuant(exp.getExperienceID());
            if (qtd > max) {
                max = qtd;
                bestSale = exp;
            }
        }

        if (bestSale == null) {
            System.out.println("⚠️ Ainda não existem vendas (adultos).");
            return;
        }

        System.out.println("TOP-SELLER (ADULTOS)");
        System.out.println(bestSale.getExperienceName());
        System.out.println("Vendas: " + max);
        FileTools.printFile("ArteAscii/" + bestSale.getExperienceID() + ".txt");
    }

    public void topSellerCriancas() throws FileNotFoundException {
        Experience bestSale = null;
        int max = -1;

        for (Experience exp : experiencesRepo.getExperienceArrayList()) {
            int qtd = Sales.childrenQuant(exp.getExperienceID());
            if (qtd > max) {
                max = qtd;
                bestSale = exp;
            }
        }

        if (bestSale == null) {
            System.out.println("⚠️ Ainda não existem vendas (crianças).");
            return;
        }

        System.out.println("TOP-SELLER (CRIANÇAS)");
        System.out.println(bestSale.getExperienceName());
        System.out.println("Vendas: " + max);
        FileTools.printFile("ArteAscii/" + bestSale.getExperienceID() + ".txt");
    }



    /**
     * Apresenta uma mensagem indicando que a funcionalidade selecionada não está disponível.
     * Utilizado como feedback visual para opções em construção no menu de cliente.
     */
    public void optionNotAvailable() {
        System.out.println("""
　　　　　　　　　　      r@
        ニニニニヽ　　　/ /|｜
　　　　　 ∥.　    / /  |｜
        0( ｡дﾟ) ∥ 　/ /   |｜
        ]( つ¶つ¶　 / / 　 r―､
        ﾄ┳ヽ厂￣`/ /　　  |   |
      ｢￣￣￣L/_/　　　　jjjjj　　　
      （◎￣◎)三)=)三)
      
      Lamentamos o inconveniente, estamos em construção!
    """);
    }
}
