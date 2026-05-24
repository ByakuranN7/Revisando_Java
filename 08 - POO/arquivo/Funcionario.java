package empresa.dados;
public class Funcionario { 
    private String nome; 
    public double salario;

    public Funcionario(String nomeInit, double salarioInit) { 
        nome = nomeInit; 
        salario = salarioInit;
    }
    public String obterInfo() { 
        return "Nome: " + nome + ", Salario: " + salario; 
    } 
    
    public void aumentarSalario(double aumento) {
        salario += aumento;
    }
    public void aumentarSalario(int porcentagem) {
        salario += salario * porcentagem / 100.0;
    }
}