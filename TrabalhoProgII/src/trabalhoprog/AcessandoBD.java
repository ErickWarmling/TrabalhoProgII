package trabalhoprog;

import trabalhoprog2.view.FrameCadastroAeronave;
import trabalhoprog2.view.FrameCadastroAeroporto;
import trabalhoprog2.view.FrameCadastroPassageiro;
import trabalhoprog2.view.FrameCadastroPiloto;
import trabalhoprog2.view.FrameMenu;

public class AcessandoBD {

    public static void main(String[] args) {
       menu();
    }  
    
    static void menu(){
        new FrameMenu().setVisible(true);
    }
    

}
