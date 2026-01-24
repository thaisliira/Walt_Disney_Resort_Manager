package Controllers;

import Models.Experience;
import Models.Sales;
import Repositories.ExperiencesRepo;
import Repositories.GuidesExperienceRepo;
import Repositories.SalesExpRepo;

import java.io.FileNotFoundException;

public class GuideExperienceController {

    private ExperiencesRepo experiencesRepo;
    private GuidesExperienceRepo guidesExperienceRepo;

    public GuideExperienceController() throws FileNotFoundException {
        this.experiencesRepo = ExperiencesRepo.getInstance();
        this.guidesExperienceRepo = GuidesExperienceRepo.getInstance();
    }

    public void experienceHistory (String userGuide) throws FileNotFoundException {
        int totalGeneral = 0;
        System.out.println("--- Histórico de Vendas do Guia: " + userGuide + " ---");
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
        System.out.println("\nTotal de todas as atividades: " + totalGeneral);
    }


}
