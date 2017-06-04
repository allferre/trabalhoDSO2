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
public class TelaVeiculo extends JFrame {

    private ControladorVeiculo ctrlV;
    private GerenciadorBotoes btManager;
    private JFormattedTextField campoPlaca;

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
        this.btManager = new GerenciadorBotoes();
        iniciaVeiculo();
    }

    private void iniciaVeiculo() {

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.setLayout(new GridBagLayout());
        GridBagConstraints configPosicao = new GridBagConstraints();
        
        try {
        jlPlaca = new JLabel();
        jlPlaca.setText("Digite a placa: ");
        configPosicao.gridx = 0; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (0,0)
        configPosicao.gridy = 0; // x -> coluna e y -> linha
        container.add(jlPlaca, configPosicao);
        
       
        MaskFormatter mascaraPlaca = new MaskFormatter("???-####");
        mascaraPlaca.setPlaceholderCharacter('_');
        JFormattedTextField campoPlaca = new JFormattedTextField(mascaraPlaca);
        mascaraPlaca.install(campoPlaca);

        configPosicao.gridx = 1; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (1,0)
        configPosicao.gridy = 0; // x -> coluna e y -> linha
        campoPlaca.setVisible(true);
        container.add(campoPlaca, configPosicao);
        
        } catch(Exception ex) {}
        

        // PLACA ---------------------------------------------------------------
     /* jlPlaca = new JLabel();
        jlPlaca.setText("Digite a placa: ");
        configPosicao.gridx = 0; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (0,0)
        configPosicao.gridy = 0; // x -> coluna e y -> linha
        container.add(jlPlaca, configPosicao);

        tfPlaca = new TextField();
        tfPlaca.setText(" ");
        configPosicao.gridx = 1; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (1,0)
        configPosicao.gridy = 0; // x -> coluna e y -> linha
        tfPlaca.setPreferredSize(new Dimension(200, 20));
        container.add(tfPlaca, configPosicao); */

        // MODELO --------------------------------------------------------------
        jlModelo = new JLabel();
        jlModelo.setText("Digite o modelo: ");
        configPosicao.gridx = 0; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (0,1)
        configPosicao.gridy = 1; // x -> coluna e y -> linha
        container.add(jlModelo, configPosicao);

        tfModelo = new TextField();
        tfModelo.setText(" ");
        configPosicao.gridx = 1; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (1,1)
        configPosicao.gridy = 1; // x -> coluna e y -> linha
        tfModelo.setPreferredSize(new Dimension(130, 20));
        container.add(tfModelo, configPosicao);

        // MARCA ---------------------------------------------------------------
        jlMarca = new JLabel();
        jlMarca.setText("Digite a marca: ");
        configPosicao.gridx = 0; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (1,2)
        configPosicao.gridy = 2; // x -> coluna e y -> linha
        container.add(jlMarca, configPosicao);

        tfMarca = new TextField();
        tfMarca.setText(" ");
        configPosicao.gridx = 1; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (2,1)
        configPosicao.gridy = 2; // x -> coluna e y -> linha
        tfMarca.setPreferredSize(new Dimension(130, 20));
        container.add(tfMarca, configPosicao);

        // ANO -----------------------------------------------------------------
        jlAno = new JLabel();
        jlAno.setText("Digite o ano: ");
        configPosicao.gridx = 0; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (2,2)
        configPosicao.gridy = 3; // x -> coluna e y -> linha
        container.add(jlAno, configPosicao);

        tfAno = new TextField();
        tfAno.setText(" ");
        configPosicao.gridx = 1; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (2,3)
        configPosicao.gridy = 3; // x -> coluna e y -> linha
        tfAno.setPreferredSize(new Dimension(130, 20));
        container.add(tfAno, configPosicao);

        // QUILOMETRAGEM -------------------------------------------------------
        jlQuilometragem = new JLabel();
        jlQuilometragem.setText("Digite a quilometragem: ");
        configPosicao.gridx = 0; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (3,2)
        configPosicao.gridy = 4; // x -> coluna e y -> linha
        container.add(jlQuilometragem, configPosicao);

        tfQuilometragem = new TextField();
        tfQuilometragem.setText(" ");
        configPosicao.gridx = 1; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (3,3)
        configPosicao.gridy = 4; // x -> coluna e y -> linha
        tfQuilometragem.setPreferredSize(new Dimension(130, 20));
        container.add(tfQuilometragem, configPosicao);

        // Emprestado ----------------------------------------------------------
        jlEmprestado = new JLabel();
        jlEmprestado.setText("Digite o Status do veiculo: ");
        configPosicao.gridx = 0; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (3,4)
        configPosicao.gridy = 5; // x -> coluna e y -> linha
        container.add(jlEmprestado, configPosicao);

        tfEmprestado = new TextField();
        tfEmprestado.setText(" ");
        configPosicao.gridx = 1; // gridx e gridy usado pra posicionar(no caso) esse JLabel lbNome na posição (4,3)
        configPosicao.gridy = 5; // x -> coluna e y -> linha
        tfEmprestado.setPreferredSize(new Dimension(130, 20));
        container.add(tfEmprestado, configPosicao);

        // BOTAO OK ------------------------------------------------------------
        jbOk = new JButton();
        jbOk.setActionCommand("INCLUIR");
        jbOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ctrlV.incluiVeiculo(campoPlaca.getValue().toString(), tfModelo.getText(), tfMarca.getText(), tfAno.getText(), tfQuilometragem.getText(), tfEmprestado.getText());
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

    public ControladorVeiculo getCtrlV() {
        return ctrlV;
    }

    public void setCtrlV(ControladorVeiculo ctrlV) {
        this.ctrlV = ctrlV;
    }

    public String getTfPlacaText() {
        return campoPlaca.getValue().toString();
    }

    public String getTfModeloText() {
        return tfModelo.getText();
    }
    
    public String getTfMarcaText() {
        return tfMarca.getText();
    }

    public String getTfAnoText() {
        return tfAno.getText();
    }
    
    public String getTfQuilometragemText() {
        return tfQuilometragem.getText();
    }

    public String getTfEmprestadoText() {
        return tfEmprestado.getText();
    }

    private class GerenciadorBotoes implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) { // como ela implemente a classe ActionListener ela obrigatoriamente precisa do metodo ActionPerformed
            if (e.getActionCommand().equals("INCLUIR")) {
                ctrlV.incluiVeiculo(campoPlaca.getText(), tfModelo.getText(), tfMarca.getText(), tfAno.getText(), tfQuilometragem.getText(), tfEmprestado.getText());
            }
        }
    }

}
