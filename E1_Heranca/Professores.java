package br.com.zup.E1_Heranca;
import java.util.Scanner;
import java.util.ArrayList;

public class Professores extends Funcionarios {

    private String nivelGraduacao;
    private String disciplinaMinistrada;
    private int qtdAlunos;
    private int qtdTurmas;


    public Professores(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelGraduacao, String disciplinaMinistrada, int qtdAlunos, int qtdTurmas) {

        //no super, atributos herdados do pai funcionarios
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.qtdAlunos = qtdAlunos;
        this.qtdTurmas = qtdTurmas;
    }

    public int getQtdTurmas(){
        return qtdTurmas;
    }

    //aumentando 10% do salario
    @Override
    public double CalculoAumentoSalario (double salario){
        double aumento = 0.1 * salario;
        System.out.println("Este professor recebia R$" +salario+ " e terá um aumento de R$" +aumento);
        return aumento;
    }

    //aumentando turma

    public int calculoAumentaTurma (int qtdTurmas){
        Scanner leitura = new Scanner(System.in);
        ArrayList <Integer> listaTurma = new ArrayList();

        System.out.println("Quantas turmas você gostaria de adicionar para este professor? ");
        int t = leitura.nextInt();

        int aumentaTurma = qtdTurmas + t;
        listaTurma.add (aumentaTurma);
        System.out.println("Sucesso! Este professor é responsável por " +aumentaTurma+ " turmas.");

        return aumentaTurma;
    }

}

