package br.ufsc.ine5605.sisclaviculario2.tela;

import br.ufsc.ine5605.sisclaviculario2.controle.ControladorVeiculo;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Allan
 */
public class TelaVeiculo extends JFrame {

    private ControladorVeiculo ctrlV;

    private JLabel jlPlaca;
    private JLabel jlModelo;
    private JLabel jlMarca;
    private JLabel jlAno;
    private JLabel jlQuilometragem;
    private JLabel jlEmprestado;
    private JButton jbOk;
    

    private TextField tfPlaca;
    private TextField tfModelo;
    private TextField tfMarca;
    private TextField tfAno;
    private TextField tfQuilometragem;
    private TextField tfEmprestado;

    public TelaVeiculo(ControladorVeiculo owner) {
        this.ctrlV = owner;
    }

    private void iniciaVeiculo() {

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.setLayout(new GridBagLayout());
        GridBagConstraints configPosicao = new GridBagConstraints();

        // PLACA ---------------------------------------------------------------
        jlPlaca = new JLabel();
        jlPlaca.setText("Digite a placa: "); 
        configPosicao.gridx = 0; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (0,0)
        configPosicao.gridy = 0;
        container.add(jlPlaca, configPosicao);

        tfPlaca = new TextField();
        tfPlaca.setText(" ");
        configPosicao.gridx = 1; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (1,0)
        configPosicao.gridy = 0;
        tfPlaca.setPreferredSize(new Dimension(100, 20));
        container.add(tfPlaca, configPosicao);

        // MODELO --------------------------------------------------------------
        jlModelo = new JLabel();
        jlModelo.setText("Digite o modelo: "); 
        configPosicao.gridx = 0; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (0,1)
        configPosicao.gridy = 1;
        container.add(jlModelo, configPosicao);

        tfModelo = new TextField();
        tfModelo.setText(" ");
        configPosicao.gridx = 1; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (1,1)
        configPosicao.gridy = 1;
        tfModelo.setPreferredSize(new Dimension(100, 20));
        container.add(tfModelo, configPosicao);

        // MARCA ---------------------------------------------------------------
        jlMarca = new JLabel();
        jlMarca.setText("Digite a marca: "); 
        configPosicao.gridx = 1; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (1,2)
        configPosicao.gridy = 2;
        container.add(jlModelo, configPosicao);

        tfMarca = new TextField();
        tfMarca.setText(" ");
        configPosicao.gridx = 2; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (2,1)
        configPosicao.gridy = 1;
        tfMarca.setPreferredSize(new Dimension(100, 20));
        container.add(tfMarca, configPosicao);

        // ANO -----------------------------------------------------------------
        jlAno = new JLabel();
        jlAno.setText("Digite o ano: "); 
        configPosicao.gridx = 2; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (2,2)
        configPosicao.gridy = 2;
        container.add(jlAno, configPosicao);

        tfAno = new TextField();
        tfAno.setText(" ");
        configPosicao.gridx = 2; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (2,3)
        configPosicao.gridy = 3;
        tfAno.setPreferredSize(new Dimension(100, 20));
        container.add(tfAno, configPosicao);
        
        // QUILOMETRAGEM -------------------------------------------------------
        jlQuilometragem = new JLabel();
        jlQuilometragem.setText("Digite a quilometragem: "); 
        configPosicao.gridx = 3; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (3,2)
        configPosicao.gridy = 2;
        container.add(jlAno, configPosicao);

        tfQuilometragem = new TextField();
        tfQuilometragem.setText(" ");
        configPosicao.gridx = 3; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (3,3)
        configPosicao.gridy = 3;
        tfQuilometragem.setPreferredSize(new Dimension(100, 20));
        container.add(tfQuilometragem, configPosicao);
        
        // Emprestado ----------------------------------------------------------
        jlEmprestado = new JLabel();
        jlEmprestado.setText("Digite a quilometragem: "); 
        configPosicao.gridx = 3; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (3,4)
        configPosicao.gridy = 4;
        container.add(jlEmprestado, configPosicao);

        tfEmprestado = new TextField();
        tfEmprestado.setText(" ");
        configPosicao.gridx = 4; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (4,3)
        configPosicao.gridy = 3;
        tfEmprestado.setPreferredSize(new Dimension(100, 20));
        container.add(tfEmprestado, configPosicao);
        
        // BOTAO OK ------------------------------------------------------------
        jbOk = new JButton();
        jbOk.setActionCommand("INCLUIR");
        jbOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                ctrlV.incluiVeiculo(tfPlaca.getText(), tfFone.getText());
            }
        } );
        
        jbOk.setText("OK");
        configPosicao.gridx = 4;
        configPosicao.gridy = 4;
        container.add(jbOk, configPosicao);
        
    }

}
