package Repositories;

import Models.Experience;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Repositório responsável por gerir as experiências do sistema.
 * Carrega os dados a partir de ficheiro CSV e disponibiliza acesso à lista de experiências.
 */
public class ExperiencesRepo {

    /** Lista de experiências carregada a partir do ficheiro CSV. */
    private ArrayList<Experience> experienceArrayList;

    /** Instância singleton do repositório. */
    private static ExperiencesRepo instance;

    /**
     * Constrói o repositório e carrega as experiências a partir do ficheiro CSV.
     *
     * @throws FileNotFoundException se o ficheiro de experiências não for encontrado.
     */
    public ExperiencesRepo() throws FileNotFoundException {
        this.experienceArrayList = CSVFileReader.readExperiencesCsvFile("Files/experiencias.csv");
    }

    /**
     * Devolve a instância singleton de ExperiencesRepo.
     *
     * @return instância de ExperiencesRepo.
     * @throws FileNotFoundException se o ficheiro de experiências não for encontrado durante a inicialização.
     */
    public static ExperiencesRepo getInstance() throws FileNotFoundException {
        if (instance == null) {
            instance = new ExperiencesRepo();
        }
        return instance;
    }

    /**
     * Devolve a lista de experiências carregada no repositório.
     *
     * @return lista de experiências.
     */
    public ArrayList<Experience> getExperienceArrayList() {
        return experienceArrayList;
    }
}