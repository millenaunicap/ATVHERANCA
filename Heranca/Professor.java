package Heranca;

public class Professor extends Funcionario {
    
	private String disciplina;

    public Professor(String nome, int inscricao, double salario, String turno, String disciplina) {
        super(nome, inscricao, salario, turno);
        this.disciplina = disciplina;
    }

    public String lecionar() {
        return "Lecionando";
    }

    public String criarAtividades() {
        return "Criando atividades";
    }
    
    @Override
    public void funcaoDesempenhar() {
        System.out.println("trabalho do professor.");
    }
}
