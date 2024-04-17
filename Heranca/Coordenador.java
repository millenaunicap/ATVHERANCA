package Heranca;

public class Coordenador extends Funcionario {
    
	public Coordenador(String nome, int inscricao, double salario, String turno) {
		super(nome, inscricao, salario, turno);
		// TODO Auto-generated constructor stub
	}

	public void auxiliarProfessores() {
        
    }

    public void organizarFestivais() {
        
    }
    
    @Override
    public void funcaoDesempenhar() {
        System.out.println("trabalho do coordenador.");
    }
}
