package Controllers;

import Models.Experience;
import Models.Sales;
import Repositories.ExperiencesRepo;
import Repositories.GuidesExperienceRepo;
import java.io.FileNotFoundException;

/**
 * Controller responsável pelas funcionalidades do perfil de Guia de Experiências.
 * Permite consultar o histórico de vendas associado a um guia específico, com base
 * nas experiências registadas e nas vendas (adultos e crianças) de cada atividade.
 */
public class GuideExperienceController {

    /** Repositório de experiências do sistema. */
    private ExperiencesRepo experiencesRepo;

    /** Repositório de associação/gestão de experiências por guia. */
    private GuidesExperienceRepo guidesExperienceRepo;

    /**
     * Constrói uma instância de GuideExperienceController e inicializa os repositórios necessários.
     *
     * @throws FileNotFoundException se algum ficheiro necessário para inicializar os repositórios não for encontrado.
     */
    public GuideExperienceController() throws FileNotFoundException {
        this.experiencesRepo = ExperiencesRepo.getInstance();
        this.guidesExperienceRepo = GuidesExperienceRepo.getInstance();
    }

    /**
     * Apresenta o histórico de vendas das experiências associadas a um guia específico.
     * Para cada experiência do guia, calcula o número de adultos e crianças vendidos e o lucro
     * total dessa atividade. No final, apresenta o total acumulado de todas as atividades do guia.
     *
     * @param userGuide identificador (username/ID) do guia cujas experiências serão analisadas.
     * @throws FileNotFoundException se ocorrer falha ao aceder a ficheiros necessários ao cálculo.
     */
    public void experienceHistory(String userGuide) throws FileNotFoundException {
        int totalGeneral = 0;
        System.out.println("\n--- Histórico de Vendas do Guia: " + userGuide + " ---");
        for (Experience exp : experiencesRepo.getExperienceArrayList()) {
            if (exp.getGuiaID().equals(userGuide)) {
                System.out.println("\nExperiência: " + exp.getExperienceName());

                int numAdults = Sales.adultsQuant(exp.getExperienceID());
                int numChildren = Sales.childrenQuant(exp.getExperienceID());
                int total = (numAdults * exp.getAdultPrice()) + (numChildren * exp.getChildPrice());

                totalGeneral += total;
                System.out.println("Adultos: " + numAdults + " | Crianças: " + numChildren);
                System.out.println("Lucro Total desta Atividade: " + total + "€");
            }
        }
        System.out.println("\nTotal de todas as atividades: " + totalGeneral + "€");
    }
}