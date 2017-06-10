/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.sisclaviculario2.controle;

import br.ufsc.ine5605.sisclaviculario2.tela.TelaPrincipal;
import br.ufsc.ine5605.sisclaviculario2.controle.ControladorFuncionario;

/**
 *
 * @author Allan
 */
public class ControladorPrincipal {
    
    private TelaPrincipal telaPrincipal;
    private static ControladorPrincipal INSTANCE;
    
    public ControladorPrincipal(){
        this.telaPrincipal = new TelaPrincipal(this);
    }
    
     public static ControladorPrincipal getINSTANCE() {
        if (INSTANCE == null) {
            return INSTANCE = new ControladorPrincipal();
        }
        return INSTANCE;
    }

    public void inicia() {
        telaPrincipal.exibeMenuPrincipal();
    }

    public void exibeTelaFuncionario() {
        ControladorFuncionario.getINSTANCE().exibeTelaFuncionario();
    }
    
    
    
}
