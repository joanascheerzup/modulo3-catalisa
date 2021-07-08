package br.com.zup.E1_Heranca;

public class Programa {
    public static void main(String[] args) {

        // Professor
        Professores obj_professor = new Professores ("Mikael", "222.222.222-22", "123", "456", 25000, "PHD", "Matemática", 35,2);
        // Aumentando o salário do professor puxando Override
        double aumentoDeSalarioProfessor = obj_professor.CalculoAumentoSalario(obj_professor.getSalario());
        // Aumentando número de turmas do professor
        int aumentaTurmaProfessor = obj_professor.calculoAumentaTurma(obj_professor.getQtdTurmas());

        System.out.println("-----------------------------------");

        // Coordenador
        Coordenadores obj_coordenador = new Coordenadores("Gabriel", "333.333.333-33", "321", "654", 30000, 9);
        // Aumento de salário do coordenador
        double aumentoDeSalarioCoordenador = obj_coordenador.CalculoAumentoSalario(obj_coordenador.getSalario());
        // Aumentando professor à supervisão do coordenador.
        double aumentaProfessorSup = obj_coordenador.adicionaProfessor(obj_coordenador.getProfessoresSupervisionados());

        System.out.println("-----------------------------------");

        // Funcionário administrativo
        FuncionariosAdministrativos obj_funcAdm = new FuncionariosAdministrativos ("Daniel", "444.444.444-44", "789", "987", 50000, "Lindo da mamãe", "Pós PHD");
        // Aumento de salário do funcionário administrativo
        double aumentoDeSalarioFuncAdm = obj_funcAdm.CalculoAumentoSalario(obj_funcAdm.getSalario());
    }
}
