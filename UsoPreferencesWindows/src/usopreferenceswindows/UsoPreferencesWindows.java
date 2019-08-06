/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usopreferenceswindows;

/**
 *
 * @author Christian
 */
public class UsoPreferencesWindows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadastroEmpresa tela = new CadastroEmpresa();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null); // Abre a tela no meio do monitor
    }
    
}
