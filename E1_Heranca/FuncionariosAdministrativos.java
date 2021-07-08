package br.com.zup.E1_Heranca;

public class FuncionariosAdministrativos extends Funcionarios{
    private String funcaoAdm;
    private String senioridade;

    public FuncionariosAdministrativos(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String funcaoAdm, String senioridade) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.funcaoAdm = funcaoAdm;
        this.senioridade = senioridade;
    }

    @Override
    public double CalculoAumentoSalario (double salario){
        double aumento = 0.1 * salario;
        System.out.println("Este funcionário recebia R$" +salario+ " e terá um aumento de R$" +aumento);
        return aumento;
    }


}
