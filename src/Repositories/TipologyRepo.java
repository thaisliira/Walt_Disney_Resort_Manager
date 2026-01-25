package Repositories;

import Models.Tipology;
import Tools.CSVFileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Repositório responsável por gerir as tipologias de quarto do sistema.
 * Carrega os dados a partir de ficheiro CSV e disponibiliza acesso à lista de tipologias,
 * bem como operações de pesquisa por identificador.
 */
public class TipologyRepo {

    /** Lista de tipologias carregada a partir do ficheiro CSV. */
    private ArrayList<Tipology> tipologyArrayList;

    /** Instância singleton do repositório. */
    private static TipologyRepo instance;

    /**
     * Constrói o repositório e carrega as tipologias a partir do ficheiro CSV.
     *
     * @throws FileNotFoundException se o ficheiro de tipologias não for encontrado.
     */
    private TipologyRepo() throws FileNotFoundException {
        this.tipologyArrayList = CSVFileReader.readTipologiesCsvFile("Files/tipologia.csv");
    }

    /**
     * Devolve a instância singleton de TipologyRepo.
     *
     * @return instância de TipologyRepo.
     * @throws FileNotFoundException se o ficheiro de tipologias não for encontrado durante a inicialização.
     */
    public static TipologyRepo getInstance() throws FileNotFoundException {
        if (instance == null) {
            instance = new TipologyRepo();
        }
        return instance;
    }

    /**
     * Devolve a lista de tipologias carregada no repositório.
     *
     * @return lista de tipologias.
     */
    public ArrayList<Tipology> getTipologyArrayList() {
        return tipologyArrayList;
    }

    /**
     * Procura e devolve uma tipologia pelo seu identificador.
     *
     * @param typologyId identificador da tipologia.
     * @return tipologia correspondente ao ID fornecido, ou null se não existir correspondência.
     */
    public Tipology getTipologyById(int typologyId) {
        for (Tipology tip : tipologyArrayList) {
            if (tip.getTypologyID() == typologyId) {
                return tip;
            }
        }
        return null;
    }
}