import java.util.Scanner;
import java.time.LocalDate;
public class Main {

    static boolean loop = true;
    static String Descricao;
    static int index;
    static Scanner input = new Scanner(System.in);
    static Conta conta1;

    public static void interfaceterminal(String nome){
        System.out.println("============================ MENU ===============================");
        System.out.println("Conta atual: " + nome);
        System.out.println("\n--> Insira a primeira palavra da operação desejada:\n");
        System.out.println("1. Transferir Dinheiro para outras Contas"); // transferencia mesmo
        System.out.println("2. Relatório Financeiro"); // soma das despesas e receitas em um periodo de tempo
        System.out.println("3. Remover uma Transação"); // eu acho q isso é uma op
        System.out.println("4. Despesa"); // basicametne perder saldo diretamente da bunda
        System.out.println("5. Receita"); // Basicamente adicionar saldo diretamente da bunda
        System.out.println("6. Encerrar");
        System.out.println("=================================================================");
    }

    public static void ColetaDados(){
        System.out.println("--> Qual é o motivo para ocorrer essa transacao?");
        Descricao = input.nextLine();
        System.out.println("--> Em qual topico você deseja inserir? (index)");
        index = input.nextInt();
    }

    public static void Operacao(String operacao){
        switch(operacao){
             case "transferir":
                System.out.println("--> Quanto que voce deseja transferir?");
                double transferencia = input.nextDouble();
                ColetaDados();
                // aqui precisa da transferencia(n vi ainda)
                break;

             case "relatorio":
               
                // aqui precisa do relatorio --> ai depende doq ue vai ter na classe relatorio
                break;

             case "editar":
                System.out.println("--> Digite o numero da linha que voce quer remover"); // temporario creio eu
                int linha = input.nextInt();
                conta1.RemoverLinhaInteira(linha - 1);
                System.out.println("Linha " + linha + " foi removida com sucesso");
                break;

             case "despesa":
                System.out.println("--> Quanto que ser depositado?");
                double despesa = input.nextDouble();
                ColetaDados();
                // aqui precisa da despesa --> Transacao t = new Despesa(os 5 parametros)); 
                // conta1.AdicionarLinha(t);
                break;

             case "receita":
                System.out.println("--> Quanto que será recebido?");
                double receita = input.nextDouble();
                ColetaDados();
                // aqui precisa da receita --> Transacao t = new Receita(os 5 parametros)); 
                // conta1.AdicionarLinha(t);
                break;

             case "encerrar":
                loop = false;
                break;

             default:
                System.out.println("Essa opção não existe tente novamente");
      }
    }

    public static void main(String[] args){

        System.out.println("============================= Cadastro =============================");
        System.out.println("     Digite primeiro o seu nome e o seu saldo bancario inicial");
        String nome = input.nextLine();
        double saldoinicial = input.nextDouble();
        input.nextLine();
        System.out.println("");
        Conta conta1 = new Conta(nome,saldoinicial);
        Conta conta2 = new Conta("Conta 2",0);
        
        while(loop){
        interfaceterminal(nome);
        String digita = input.nextLine();
        Operacao(digita);
        // ai a operacao faz o trabalho de armazenar todas as varaiveis na Conta conta1 ou conta2
    }
}
}
