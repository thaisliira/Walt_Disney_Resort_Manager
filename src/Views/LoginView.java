package Views;

import Controllers.LoginController;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * View responsável por apresentar o menu inicial da aplicação (Cliente/Staff/Sair)
 * e encaminhar a navegação para as views correspondentes.
 * Também disponibiliza o menu de autenticação para utilizadores internos (staff),
 * delegando a validação de credenciais no LoginController.
 */
public class LoginView {

    /**
     * Controller responsável pela validação de credenciais e definição do tipo de acesso do utilizador interno.
     */
    private LoginController loginController;

    /**
     * Constrói uma instância de LoginView e inicializa o LoginController.
     *
     * @throws FileNotFoundException se algum ficheiro necessário para inicialização não for encontrado.
     */
    public LoginView() throws FileNotFoundException {
        this.loginController = new LoginController();
    }

    /**
     * Apresenta o menu principal da aplicação e trata a navegação entre Cliente, Staff e Sair.
     * O menu é repetido até o utilizador selecionar a opção 0.
     *
     * @throws FileNotFoundException se alguma das views invocadas depender de ficheiros inexistentes.
     */
    public void menu() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("\n\n***** BEM-VINDO AO CESAE RESORT *****");
            System.out.println("1. Cliente");
            System.out.println("2. Staff");
            System.out.println("0. Sair");

            System.out.print("Opção: ");

            if (!input.hasNextInt()) {
                System.out.println("Entrada inválida. Tente um número.");
                input.nextLine();
                continue;
            }

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    new ClientView().menu();
                    break;

                case 2:
                    menuLogin();
                    break;

                case 0:
                    System.out.println("A encerrar.");
                    break;

                default:
                    System.out.println("Opção inválida: " + opcao);
                    break;
            }
        } while (opcao != 0);
    }

    /**
     * Apresenta o menu de autenticação para utilizadores internos (staff), recolhe credenciais
     * e valida o acesso através do LoginController. Em caso de sucesso, encaminha para a view
     * correspondente ao perfil devolvido (ADMIN, GESTAO ou GUIA). Em caso de falha, apresenta erro.
     *
     * @throws FileNotFoundException se alguma das views internas invocadas depender de ficheiros inexistentes.
     */
    public void menuLogin() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        String username;
        String password;

        System.out.println("\n\n***** INTERNO *****");
        System.out.print("Username: ");
        username = input.next();
        System.out.print("Password: ");
        password = input.next();

        String accessType = this.loginController.validateLogin(username, password);

        switch (accessType) {
            case "ADMIN":
                AdminView av = new AdminView();
                av.menu();
                break;

            case "GESTAO":
                RecepcionistView rp = new RecepcionistView();
                rp.menu();
                break;

            case "GUIA":
                GuideExperienceView gv = new GuideExperienceView();
                gv.menu(username);
                break;

            default:
                System.out.println("Credenciais inválidas.");
                break;
        }
    }
}