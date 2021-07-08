package br.com.zup.E1_Heranca;

public class Funcionarios {
    private String nome;
    private String cpf;
    private String numeroDeRegistro;
    private String orgaoDeLotacao;
    private double salario;

    public Funcionarios(){

    }

    public Funcionarios(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.numeroDeRegistro = numeroDeRegistro;
        this.orgaoDeLotacao = orgaoDeLotacao;
        this.salario = salario;
    }

    //pegar valor de salario que esta private
    public double getSalario() {
        return salario;
    }

    //Aumento minimo de salario
    public double CalculoAumentoSalario (double salario){
        double aumentoSalario = 0.05 * salario;
        System.out.println("Salário anterior: R$" +salario+ "\nAumento salarial de R$" +aumentoSalario);
        return aumentoSalario;
    }

}

