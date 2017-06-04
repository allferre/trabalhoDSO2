package br.ufsc.ine5605.sisclaviculario2.tela;

import br.ufsc.ine5605.sisclaviculario2.controle.ControladorFuncionario;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Allan
 */
public class TelaFuncionario extends JFrame {

    ControladorFuncionario ctrlF;
    private GerenciadorBotoes btManagerF;

    private JButton jbOk;

    private JLabel jlMatricula;
    private JLabel jlNome;
    private JLabel jlDataNascimento;
    private JLabel jlTelefone;
    private JLabel jlCargo;

    private TextField tfMatricula;
    private TextField tfNome;
    private TextField tfDataNascimento;
    private TextField tfTelefone;
    private TextField tfCargo;

    private JFormattedTextField campoNome;

    public TelaFuncionario(ControladorFuncionario owner) {
        this.btManagerF = new GerenciadorBotoes();
        this.ctrlF = owner;
    }

    private void iniciaFuncionario() {

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.setLayout(new GridBagLayout());
        GridBagConstraints configPosicao = new GridBagConstraints();

        // MATRÍCULA -----------------------------------------------------------
        jlMatricula = new JLabel("Digite a matrícula: ");
        configPosicao.gridx = 0; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (0,0)
        configPosicao.gridy = 0; // x -> coluna e y -> linha
        container.add(jlMatricula, configPosicao);

        tfMatricula = new TextField();
        tfMatricula.setText(" ");
        configPosicao.gridx = 1; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (1,0)
        configPosicao.gridy = 0; // x -> coluna e y -> linha
        tfMatricula.setPreferredSize(new Dimension(130, 20));
        container.add(tfMatricula, configPosicao);

        // NOME ----------------------------------------------------------------
        jlNome = new JLabel("Digite o nome: ");
        configPosicao.gridx = 0; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (0,1)
        configPosicao.gridy = 1; // x -> coluna e y -> linha
        container.add(jlNome, configPosicao);

        tfNome = new TextField();
        tfNome.setText(" ");
        configPosicao.gridx = 1; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (1,1)
        configPosicao.gridy = 1; // x -> coluna e y -> linha
        tfNome.setPreferredSize(new Dimension(130, 20));
        container.add(tfNome, configPosicao);

        // DATA DE NASCIMENTO --------------------------------------------------
        jlDataNascimento = new JLabel("Digite a data de nascimento: ");
        configPosicao.gridx = 0; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (0,1)
        configPosicao.gridy = 1; // x -> coluna e y -> linha
        container.add(jlDataNascimento, configPosicao);

        tfDataNascimento = new TextField();
        tfDataNascimento.setText(" ");
        configPosicao.gridx = 1; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (1,1)
        configPosicao.gridy = 1; // x -> coluna e y -> linha
        tfDataNascimento.setPreferredSize(new Dimension(130, 20));
        container.add(tfDataNascimento, configPosicao);

        // TELEFONE ------------------------------------------------------------
        jlTelefone = new JLabel("Digite a matrícula: ");
        configPosicao.gridx = 0; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (0,0)
        configPosicao.gridy = 0; // x -> coluna e y -> linha
        container.add(jlTelefone, configPosicao);

        tfTelefone = new TextField();
        tfTelefone.setText(" ");
        configPosicao.gridx = 1; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (1,0)
        configPosicao.gridy = 0; // x -> coluna e y -> linha
        tfTelefone.setPreferredSize(new Dimension(130, 20));
        container.add(tfTelefone, configPosicao);

        // Cargo ---------------------------------------------------------------
        jlCargo = new JLabel("Digite a matrícula: ");
        configPosicao.gridx = 0; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (0,0)
        configPosicao.gridy = 0; // x -> coluna e y -> linha
        container.add(jlCargo, configPosicao);

        tfCargo = new TextField();
        tfCargo.setText(" ");
        configPosicao.gridx = 1; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (1,0)
        configPosicao.gridy = 0; // x -> coluna e y -> linha
        tfCargo.setPreferredSize(new Dimension(130, 20));
        container.add(tfCargo, configPosicao);

        // BOTAO OK ------------------------------------------------------------
        jbOk = new JButton();
        jbOk.setActionCommand("INCLUIR");
        jbOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ctrlF.incluiFuncionario(tfMatricula.getText(), tfNome.getText(), tfDataNascimento.getText(), tfTelefone.getText(), tfCargo.getText());
            }
        });

        jbOk.setText("OK");
        configPosicao.gridx = 1;
        configPosicao.gridy = 6;
        container.add(jbOk, configPosicao);

        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    public ControladorFuncionario getCtrlF() {
        return ctrlF;
    }

    public void setCtrlV(ControladorFuncionario ctrlF) {
        this.ctrlF = ctrlF;
    }

    public String getTfMatriculaText() {
        return tfMatricula.getText();
    }

    public String getTfNomeText() {
        return tfNome.getText();
    }

    public String getTfDataNascimentoText() {
        return tfDataNascimento.getText();
    }

    public String getTfTelefoneText() {
        return tfTelefone.getText();
    }

    public String getTfCargoText() {
        return tfCargo.getText();
    }

    private class GerenciadorBotoes implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) { // como ela implementa a classe ActionListener ela obrigatoriamente precisa do metodo ActionPerformed
            if (e.getActionCommand().equals("INCLUIR")) {
                ctrlF.incluiFuncionario(tfMatricula.getText(), tfNome.getText(), tfDataNascimento.getText(), tfTelefone.getText(), tfCargo.getText());
            }
        }
    }
}
