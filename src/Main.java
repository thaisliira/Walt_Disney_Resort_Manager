import Assets.Audio;
import Views.LoginView;
import java.io.FileNotFoundException;

/**
 * Classe principal (entry point) da aplicação.
 * Responsável por iniciar a execução do programa, criando a LoginView
 * e apresentando o menu inicial.
 */
public class Main {

    /**
     * Método principal responsável por arrancar a aplicação.
     *
     * @param args argumentos de linha de comandos (não utilizados).
     * @throws FileNotFoundException se algum ficheiro necessário para inicialização não for encontrado.
     */
    public static void main(String[] args) throws FileNotFoundException {
        Audio.playMusic("AudioFiles/aberturadisney.wav");
        LoginView lv = new LoginView();
        lv.menu();
    }
}

