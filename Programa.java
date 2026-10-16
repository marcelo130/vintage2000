import model.Conta;
import model.Receita;
import model.Meta;
import model.Despesa;

public class Programa {
    public static void main(String args[]) {
        
        Conta conta_1 = new Conta("Darcy", "123456789");
        
        Despesa despesa_1 = new Despesa("Aluguel", 500,0);
        
        System.out.println("-------"); 
        System.out.println("Nome: " + conta_1.getNome());
        System.out.println("CPF: " + conta_1.getCpf());
        System.out.println("Despesa: " + despesa_1.getDescricao());
        System.out.println("Valor: " + despesa_1.getValor());
        System.out.println("-------");
        
    }
}    
