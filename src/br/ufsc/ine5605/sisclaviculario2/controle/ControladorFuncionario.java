/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.sisclaviculario2.controle;

import br.ufsc.ine5605.sisclaviculario2.entidade.Funcionario;
import br.ufsc.ine5605.sisclaviculario2.tela.TelaFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Allan
 */
public class ControladorFuncionario implements ActionListener {
    
    private ArrayList<Funcionario> listaFuncionarios;
    private TelaFuncionario telaFuncionario ;
    
    public ControladorFuncionario(){
        this.listaFuncionarios =  new ArrayList<>();
        this.telaFuncionario = new TelaFuncionario(this);
    }

    public void incluiFuncionario(String matricula, String nome, String dataNascimento, String telefone, String cargo) {
       System.out.println("Matrícula: "+matricula);
       System.out.println("Nome: "+nome);
       System.out.println("Data de nascimento: "+dataNascimento);
       System.out.println("Telefone: "+telefone);
       System.out.println("Cargo: "+cargo);
       
    }
    
     @Override
    public void actionPerformed(ActionEvent ae) {
        incluiFuncionario(telaFuncionario.getTfMatriculaText(), telaFuncionario.getTfNomeText(), telaFuncionario.getTfDataNascimentoText(), telaFuncionario.getTfTelefoneText(), telaFuncionario.getTfCargoText());
    }
    
}
