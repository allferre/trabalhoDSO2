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
    

    private String numMatricula;
    private String nome;
    private String dataNascimento;
    private String telefone;
    private String cargo;
    private String acessoLiberado;
    private ArrayList<Veiculo> veiculos;
    

    public Funcionario(String numMatricula, String nome, String dataNascimento, String telefone, String cargo) {
        this.numMatricula = numMatricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.cargo = cargo;
        this.veiculos = new ArrayList<>();
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAcessoLiberado() {
        return acessoLiberado;
    }

    public void setAcessoLiberado(String acessoLiberado) {
        this.acessoLiberado = acessoLiberado;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }


    
    
    
}
