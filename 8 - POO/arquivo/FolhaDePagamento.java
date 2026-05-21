import empresa.dados.*;
class FolhaDePagamento { 
        public static void main(String[] args) { 
                Funcionario funcionario = new Funcionario("Arnaldo", 5000.00);
                funcionario.aumentarSalario(100d);

                System.out.println(funcionario.obterInfo());
                
    }
}