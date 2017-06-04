package br.ufsc.ine5605.sisclaviculario2.controle;

import br.ufsc.ine5605.sisclaviculario2.entidade.Veiculo;
import br.ufsc.ine5605.sisclaviculario2.tela.TelaVeiculo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Allan
 */
public class ControladorVeiculo implements ActionListener {
    
    private ArrayList<Veiculo> listaVeiculos;
    private TelaVeiculo telaVeiculo ;
    
    public ControladorVeiculo(){
        this.listaVeiculos =  new ArrayList<>();
        this.telaVeiculo = new TelaVeiculo(this);
    }
    
    public void inicia(){
        telaVeiculo.setVisible(true);
    }
    
    public void incluiVeiculo(){
        
    }

    public void incluiVeiculo(String placa, String modelo, String marca, String ano, String quilometragem, String emprestado) {
       System.out.println("Placa: "+placa);
       System.out.println("Modelo: "+modelo);
       System.out.println("Marca: "+marca);
       System.out.println("Ano: "+ano);
       System.out.println("Quilometragem: "+quilometragem);
       System.out.println("Emprestado: "+emprestado);
       System.out.println("Modelo: "+modelo);
    }

//    public void iniciarInterface() {
//        telaVeiculo.iniciaVeiculo();
//    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        incluiVeiculo(telaVeiculo.getTfPlacaText(), telaVeiculo.getTfModeloText(), telaVeiculo.getTfMarcaText(), telaVeiculo.getTfAnoText(), telaVeiculo.getTfQuilometragemText(), telaVeiculo.getTfEmprestadoText());
    }

    
}
