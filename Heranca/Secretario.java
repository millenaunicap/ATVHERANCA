package Heranca;

public class Secretario extends Funcionario {
    
	public Secretario(String nome, int inscricao, double salario, String turno) {
		super(nome, inscricao, salario, turno);
		// TODO Auto-generated constructor stub
	}

	public void receberEncomendas() {
        
    }

    public void receberPagamentos() {
       
    }
    
    @Override
    public void funcaoDesempenhar() {
        System.out.println("trabalho do secretario.");
    }
}
