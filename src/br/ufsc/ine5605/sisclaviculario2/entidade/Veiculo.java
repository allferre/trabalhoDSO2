package br.ufsc.ine5605.sisclaviculario2.entidade;

/**
 *
 * @author Allan
 */
public class Veiculo {
    
    private String placa;
    private String modelo;
    private String marca;
    private String ano;
    private String quilometragem;
    private String emprestado;

    public Veiculo(String placa, String modelo, String marca, String ano, String quilometragem, String emprestado) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.emprestado = emprestado;

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(String quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(String emprestado) {
        this.emprestado = emprestado;
    }

 
    
}
