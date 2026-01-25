package Repositories;

import Models.Sales;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Repositório responsável por gerir as vendas de experiências do sistema.
 * Carrega os dados a partir de ficheiro CSV e disponibiliza acesso à lista de vendas.
 */
public class SalesExpRepo {

    /** Lista de vendas de experiências carregada a partir do ficheiro CSV. */
    private ArrayList<Sales> salesArrayList;

    /** Instância singleton do repositório. */
    private static SalesExpRepo instance;

    /**
     * Constrói o repositório e carrega as vendas de experiências a partir do ficheiro CSV.
     *
     * @throws FileNotFoundException se o ficheiro de vendas não for encontrado.
     */
    private SalesExpRepo() throws FileNotFoundException {
        this.salesArrayList = CSVFileReader.readSalesCsvFile("Files/vendas_experiencias.csv");
    }

    /**
     * Devolve a instância singleton de SalesExpRepo.
     *
     * @return instância de SalesExpRepo.
     * @throws FileNotFoundException se o ficheiro de vendas não for encontrado durante a inicialização.
     */
    public static SalesExpRepo getInstance() throws FileNotFoundException {
        if (instance == null) {
            instance = new SalesExpRepo();
        }
        return instance;
    }

    /**
     * Devolve a lista de vendas de experiências carregada no repositório.
     *
     * @return lista de vendas de experiências.
     */
    public ArrayList<Sales> getSalesArrayList() {
        return salesArrayList;
    }

    /**
     * Procura e devolve um registo de venda associado a um determinado identificador de experiência.
     *
     * @param experienceId identificador da experiência.
     * @return um registo de venda associado à experiência, ou null se não existir correspondência.
     */
    public Sales getExperienceById(String experienceId) {
        for (Sales sale : salesArrayList) {
            if (sale.getExperienceID().equals(experienceId)) {
                return sale;
            }
        }
        return null;
    }
}
