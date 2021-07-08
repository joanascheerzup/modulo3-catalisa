package br.com.zup.E1_Heranca;
import java.util.Scanner;
import java.util.ArrayList;

public class Coordenadores extends Funcionarios{

    private int professoresSupervisionados;
    ArrayList <Integer> listaProfessoresSupervisionados = new ArrayList<>();


    public Coordenadores(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, int professoresSupervisionados){
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.professoresSupervisionados = professoresSupervisionados;
        //adicionando na lista de professores supervisionados
        listaProfessoresSupervisionados.add(professoresSupervisionados);
    }

    public int getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    // Adiciona professor

    public int adicionaProfessor(int professoresSupervisionados) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos professores deseja adicionar à lista de supervisão? ");
        Integer n = ler.nextInt();

        Integer totalListaProfs = professoresSupervisionados + n;

        if (totalListaProfs > 10 && n > 10 ) {
            System.out.println("Este coordenador só pode supervisionar até 10 professores!");
        }
        if (professoresSupervisionados >= 10) {
            System.out.printf("Este coordenador já atingiu a quantidade máxima de professores para supervisão. ****");
        } else {
            if (totalListaProfs > 10){
                System.out.println("Não é possível que este coordenador seja responsável por mais de 10 professores. Ele já supervisiona " +professoresSupervisionados);
            } else {
                listaProfessoresSupervisionados.add(totalListaProfs);
                System.out.println("Pronto! Foram adicionados " +n+ " professores");
                System.out.println("Agora o coordenador é responsável por " +totalListaProfs+ " professores.");
                }
        }

        return listaProfessoresSupervisionados.size();
    }
}

