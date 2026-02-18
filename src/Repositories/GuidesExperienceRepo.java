package Repositories;

import Models.GuideExperience;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Repositório responsável por gerir os guias de experiências do sistema.
 * Carrega os dados a partir de ficheiro CSV e disponibiliza acesso à lista de guias.
 */
public class GuidesExperienceRepo {

    /** Lista de guias carregada a partir do ficheiro CSV. */
    private ArrayList<GuideExperience> guidesArrayList;

    /** Instância singleton do repositório. */
    private static GuidesExperienceRepo instance;

    /**
     * Constrói o repositório e carrega os guias a partir do ficheiro CSV.
     *
     * @throws FileNotFoundException se o ficheiro de guias não for encontrado.
     */
    public GuidesExperienceRepo() throws FileNotFoundException {
        this.guidesArrayList = CSVFileReader.readGuidesCsvFile("Files/guias_experiencias.csv");
    }

    /**
     * Devolve a instância singleton de GuidesExperienceRepo.
     *
     * @return instância de GuidesExperienceRepo.
     * @throws FileNotFoundException se o ficheiro de guias não for encontrado durante a inicialização.
     */
    public static GuidesExperienceRepo getInstance() throws FileNotFoundException {
        if (instance == null) {
            instance = new GuidesExperienceRepo();
        }
        return instance;
    }

    /**
     * Devolve a lista de guias carregada no repositório.
     *
     * @return lista de guias.
     */
    public ArrayList<GuideExperience> getGuidesArrayList() {
        return guidesArrayList;
    }

    /**
     * Procura e devolve um guia pelo seu identificador.
     *
     * @param guideId identificador do guia.
     * @return guia correspondente ao ID fornecido, ou null se não existir.
     */
    public GuideExperience getGuideById(String guideId) {
        for (GuideExperience guide : guidesArrayList) {
            if (guide.getGuideID().equals(guideId)) {
                return guide;
            }
        }
        return null;
    }
}