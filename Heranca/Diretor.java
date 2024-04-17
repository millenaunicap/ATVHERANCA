package Heranca;

public class Diretor extends Funcionario {
    
	public Diretor(String nome, int inscricao, double salario, String turno) {
		super(nome, inscricao, salario, turno);
		// TODO Auto-generated constructor stub
	}

	public void segTurno() {
        
    }

    public void criarDescontos() {
        
    }

    public void encomendarFardas() {
       
    }

    public void gerenciarProfessores() {
        
    }
    
    @Override
    public void funcaoDesempenhar() {
        System.out.println("trabalho do diretor.");
    }
}
