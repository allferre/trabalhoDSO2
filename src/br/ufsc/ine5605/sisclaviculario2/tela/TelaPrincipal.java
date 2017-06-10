package br.ufsc.ine5605.sisclaviculario2.tela;

import br.ufsc.ine5605.sisclaviculario2.controle.ControladorPrincipal;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Allan
 */
public class TelaPrincipal extends JFrame {

    private ControladorPrincipal ctrlP;

    public enum operacoes {
        MENU_FUNCIONARIO, MENU_VEICULO, MENU_EMPRESTIMO, MENU_RELATORIOS;
    }

    // declaração do Container e gerenciador de botões
    private Container container;
    private GerenciadorBotoes botaoManager;
    private GridBagConstraints constraints;

    // declaração dos componentes da tela -> buttons
    private JButton btMenuFuncionario;
    private JButton btMenuVeiculo;
    private JButton btMenuEmprestimo;
    private JButton btMenuRelatorios;

    public TelaPrincipal(ControladorPrincipal owner) {
        this.ctrlP = owner;
    }

    public void exibeMenuPrincipal() {
        //Faz a aplicação encerrar quando eu clicar para fechar a tela
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //TAMANHO DA TELA - Configura o tamanho da tela
        setSize(400, 230);
        //LOCAL ONDE FICA A JANELA NA TELA - Centraliza a janela no meio da tela
        setLocationRelativeTo(null);
        //Desabilita o RESIZE da Tela
        setResizable(false);
        //CHAMADA DE MÉTODO RESPONSÁVEL PELOS COMPONENTES
        criarTela();
    }

    private void criarTela() {

        //Pego o container do JFrame para que eu possa guardar os componentes nele;
        this.container = getContentPane();
        //Digo qual o layout da tela que eu irei utilizar
        this.container.setLayout(new GridBagLayout());

        constraints = new GridBagConstraints();

        //Instancio o meu gerenciador de botoes e Adiciono o botao
        this.botaoManager = new GerenciadorBotoes();

        //Pensa nisso como um Excel. X sao as colunas e Y são as linhas
        constraints.gridx = 0;
        constraints.gridy = 0;

        //Elementos no centro
        constraints.anchor = GridBagConstraints.PAGE_START;
        constraints.fill = GridBagConstraints.VERTICAL;

        // Botão Funcionário ---------------------------------------------------
        btMenuFuncionario = new JButton("MENU FUNCIONÁRIO");
        // OU btMenuEleitor = new JButton("MENU DE ELEITOR");
        btMenuFuncionario.setPreferredSize(new Dimension(250, 30));
        //ADICIONO AO LISTENER - GERENCIADOR DE BOTOES
        btMenuFuncionario.addActionListener(botaoManager);
        //DIGO QUAL O ACTIONCOMAND DE CADA BOTAO
        btMenuFuncionario.setActionCommand(operacoes.MENU_FUNCIONARIO.name());
        //ADICIONO OS COMPONENTES NO CONTAINER
        container.add(btMenuFuncionario, constraints);
        constraints.gridy++;

        // Botão Veículo -------------------------------------------------------
        btMenuVeiculo = new JButton("MENU VEÍCULO");
        btMenuVeiculo.setPreferredSize(new Dimension(250, 30));
        //ADICIONO AO LISTENER - GERENCIADOR DE BOTOES
        btMenuVeiculo.addActionListener(botaoManager);
        //DIGO QUAL O ACTIONCOMAND DE CADA BOTAO
        btMenuVeiculo.setActionCommand(operacoes.MENU_VEICULO.name());
        //ADICIONO OS COMPONENTES NO CONTAINER
        container.add(btMenuVeiculo, constraints);
        constraints.gridy++;

        // Botão Empréstimo ----------------------------------------------------
        btMenuEmprestimo = new JButton("MENU EMPRÉSTIMO");
        btMenuEmprestimo.setPreferredSize(new Dimension(250, 30));
        //ADICIONO AO LISTENER - GERENCIADOR DE BOTOES
        btMenuEmprestimo.addActionListener(botaoManager);
        //DIGO QUAL O ACTIONCOMAND DE CADA BOTAO
        btMenuEmprestimo.setActionCommand(operacoes.MENU_EMPRESTIMO.name());
        //ADICIONO OS COMPONENTES NO CONTAINER
        container.add(btMenuEmprestimo, constraints);
        constraints.gridy++;

        // Botão Relatórios ----------------------------------------------------
        btMenuRelatorios = new JButton();
        btMenuRelatorios.setText("MENU RELATÓRIOS");
        btMenuRelatorios.setPreferredSize(new Dimension(250, 30));
        //ADICIONO AO LISTENER - GERENCIADOR DE BOTOES
        btMenuRelatorios.addActionListener(botaoManager);
        //DIGO QUAL O ACTIONCOMAND DE CADA BOTAO
        btMenuRelatorios.setActionCommand(operacoes.MENU_RELATORIOS.name());
        //ADICIONO OS COMPONENTES NO CONTAINER
        container.add(btMenuRelatorios, constraints);

        setVisible(true);

    }

    private class GerenciadorBotoes implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getActionCommand().equals(operacoes.MENU_FUNCIONARIO.name())) {
                //VOU EXIBIR O MENU Do FUNCIONÁRIO
               ControladorPrincipal.getINSTANCE().exibeTelaFuncionario();
                //Se eu fechar a visualização da tela, como reabro ela depois?
                setVisible(false);
            }
            
            if (ae.getActionCommand().equals(operacoes.MENU_VEICULO.name())) {
                //VOU EXIBIR O MENU DE VEÍCULO
               // ctrlP.exibeTelaVeiculo();
                //Se eu fechar a visualização da tela, como reabro ela depois?
                setVisible(false);
            }
            
            if (ae.getActionCommand().equals(operacoes.MENU_EMPRESTIMO.name())) {
                //VOU EXIBIR O MENU DE EMPRÉSTIMOS
               // ctrlP.exibeTelaEmprestimo();
                //Se eu fechar a visualização da tela, como reabro ela depois?
                setVisible(false);
            }
            
            if (ae.getActionCommand().equals(operacoes.MENU_RELATORIOS.name())) {
                //VOU EXIBIR O MENU DE RELATÓRIOS
               // ctrlP.exibeTelaRelatorios();
                //Se eu fechar a visualização da tela, como reabro ela depois?
                setVisible(false);
            }
        }

    }

}
