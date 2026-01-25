package Models;

import Repositories.SalesExpRepo;
import java.io.FileNotFoundException;

/**
 * Representa uma venda associada a uma experiência, registando o tipo de cliente (adulto/crianca)
 * e o período (ano e mês) em que ocorreu.
 * A classe também disponibiliza métodos utilitários estáticos para calcular quantidades de vendas
 * por tipo de cliente para uma experiência específica.
 */
public class Sales {

    /** Identificador único da venda. */
    private String saleID;

    /** Identificador da experiência associada à venda. */
    private String experienceID;

    /** Tipo de cliente associado à venda (por exemplo: "adulto" ou "crianca"). */
    private String clientType;

    /** Ano em que a venda ocorreu. */
    private int year;

    /** Mês em que a venda ocorreu. */
    private int month;

    /**
     * Constrói uma instância de Sales com os dados da venda.
     *
     * @param saleID identificador único da venda.
     * @param experienceID identificador da experiência associada.
     * @param clientType tipo de cliente (adulto/crianca).
     * @param year ano da venda.
     * @param month mês da venda.
     */
    public Sales(String saleID, String experienceID, String clientType, int year, int month) {
        this.saleID = saleID;
        this.experienceID = experienceID;
        this.clientType = clientType;
        this.year = year;
        this.month = month;
    }

    /**
     * Devolve o identificador da venda.
     *
     * @return ID da venda.
     */
    public String getSaleID() {
        return saleID;
    }

    /**
     * Devolve o identificador da experiência associada à venda.
     *
     * @return ID da experiência.
     */
    public String getExperienceID() {
        return experienceID;
    }

    /**
     * Devolve o tipo de cliente associado à venda.
     *
     * @return tipo de cliente (adulto/crianca).
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * Devolve o ano em que a venda ocorreu.
     *
     * @return ano da venda.
     */
    public int getYear() {
        return year;
    }

    /**
     * Devolve o mês em que a venda ocorreu.
     *
     * @return mês da venda.
     */
    public int getMonth() {
        return month;
    }

    /**
     * Calcula a quantidade de vendas do tipo "adulto" para uma experiência específica.
     *
     * @param experienceID identificador da experiência a analisar.
     * @return número de vendas para adultos associadas à experiência.
     * @throws FileNotFoundException se algum ficheiro necessário para carregar o repositório de vendas não for encontrado.
     */
    public static int adultsQuant(String experienceID) throws FileNotFoundException {
        SalesExpRepo salerepo = SalesExpRepo.getInstance();
        int adult = 0;
        for (Sales sale : salerepo.getSalesArrayList()) {
            if (sale.getExperienceID().equals(experienceID) && sale.getClientType().equals("adulto")) {
                adult++;
            }
        }
        return adult;
    }

    /**
     * Calcula a quantidade de vendas do tipo "crianca" para uma experiência específica.
     *
     * @param experienceID identificador da experiência a analisar.
     * @return número de vendas para crianças associadas à experiência.
     * @throws FileNotFoundException se algum ficheiro necessário para carregar o repositório de vendas não for encontrado.
     */
    public static int childrenQuant(String experienceID) throws FileNotFoundException {
        SalesExpRepo salerepo = SalesExpRepo.getInstance();
        int child = 0;
        for (Sales sale : salerepo.getSalesArrayList()) {
            if (sale.getExperienceID().equals(experienceID) && sale.getClientType().equals("crianca")) {
                child++;
            }
        }
        return child;
    }
}
