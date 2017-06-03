/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.sisclaviculario2.entidade;

import java.util.ArrayList;

/**
 *
 * @author Allan
 */
public class Funcionario {
    
     public enum CargoFuncionario {
        DIRETOR("Diretor"),
        FUNCIONARIO("Funcionario");
        public String mensagem;

        CargoFuncionario(String mensagem) {

            this.mensagem = mensagem;
        }
    }

    private int numMatricula;
    private String nome;
    private String dataNascimento;
    private long telefone;
    private CargoFuncionario cargo;
    private boolean acessoLiberado;
    private ArrayList<Veiculo> veiculos;
    

    public Funcionario(int numMatricula, String nome, String dataNascimento, long telefone, CargoFuncionario cargo) {
        this.numMatricula = numMatricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.cargo = cargo;
        this.acessoLiberado = false;
        this.veiculos = new ArrayList<>();

    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public CargoFuncionario getCargoFuncionario() {
        return cargo;
    }

    public void setCargo(CargoFuncionario cargo) {
        this.cargo = cargo;
    }

    public boolean getAcessoLiberado() {
        return acessoLiberado;
    }

    public void setAcessoLiberado(boolean acessoLiberado) {
        this.acessoLiberado = acessoLiberado;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    
    
    
}
