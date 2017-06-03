package br.ufsc.ine5605.sisclaviculario2.tela;

import br.ufsc.ine5605.sisclaviculario2.controle.ControladorVeiculo;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;

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
    private JLabel jlCargo;
    private JLabel jlEmprestado;

    private TextField tfPlaca;
    private TextField tfModelo;
    private TextField tfMarca;
    private TextField tfAno;
    private TextField tfQuilometragem;
    private TextField tfCargo;
    private TextField tfEmprestado;

    public TelaVeiculo(ControladorVeiculo owner) {
        this.ctrlV = owner;
    }

    private void iniciaVeiculo() {

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.setLayout(new GridBagLayout());
        GridBagConstraints configPosicao = new GridBagConstraints();

        // PLACA -----------------------------
        jlPlaca = new JLabel();
        jlPlaca.setText("Digite a placa: "); // texto do campo
        configPosicao.gridx = 0; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (0,0)
        configPosicao.gridy = 0;
        container.add(jlPlaca, configPosicao);

        tfPlaca = new TextField();
        tfPlaca.setText(" ");
        configPosicao.gridx = 1; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (1,0)
        configPosicao.gridy = 0;
        tfPlaca.setPreferredSize(new Dimension(100, 20));
        container.add(tfPlaca, configPosicao);

        // MODELO ----------------------------
        jlModelo = new JLabel();
        jlModelo.setText("Digite o modelo: "); // texto do campo
        configPosicao.gridx = 0; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (0,0)
        configPosicao.gridy = 0;
        container.add(jlModelo, configPosicao);

        tfModelo = new TextField();
        tfModelo.setText(" ");
        configPosicao.gridx = 1; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (1,0)
        configPosicao.gridy = 0;
        tfModelo.setPreferredSize(new Dimension(100, 20));
        container.add(tfModelo, configPosicao);

        // MARCA ---------------------------
        jlMarca = new JLabel();
        jlMarca.setText("Digite a marca: "); // texto do campo
        configPosicao.gridx = 0; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (0,0)
        configPosicao.gridy = 0;
        container.add(jlModelo, configPosicao);

        tfMarca = new TextField();
        tfMarca.setText(" ");
        configPosicao.gridx = 1; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (1,0)
        configPosicao.gridy = 0;
        tfMarca.setPreferredSize(new Dimension(100, 20));
        container.add(tfMarca, configPosicao);

        // ANO ---------------------------
        jlAno = new JLabel();
        jlAno.setText("Digite a marca: "); // texto do campo
        configPosicao.gridx = 0; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (0,0)
        configPosicao.gridy = 0;
        container.add(jlAno, configPosicao);

        tfAno = new TextField();
        tfAno.setText(" ");
        configPosicao.gridx = 1; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (1,0)
        configPosicao.gridy = 0;
        tfAno.setPreferredSize(new Dimension(100, 20));
        container.add(tfAno, configPosicao);
    }

}
