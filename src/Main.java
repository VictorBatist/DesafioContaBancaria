import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                
                Olá bem-vindo ao Seu Banco
                
                Para acessar sua conta informe o seu CPF :D
                """);

        //dados iniciais
        String nome = "João de Souza";
        String cpf = scanner.nextLine();
        String tipoConta = "Corrente";
        double valor = 2500.99;
        int opcao = 0;

        if(cpf.length() == 11){

            /// Informações iniciais do cliente
            System.out.println("""
                    
                    Olá João, muito bom ter o senhor de volta conosco! 
                    
                    ------------------------------
                    Dados atuais do Cliente:
                    
                    Nome:             %s
                    CFP:              %s
                    Tipo de conta:    %s
                    Saldo em conta:   R$ %.2f
                    ------------------------------
                    """.formatted(nome, cpf, tipoConta, valor));

            /// Menu para escolha da ação

            String menu = """
                    
                    Escolha uma das opções: 
                    
                    1 - Ver saldo atual
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    
                    """;

            while (opcao != 4){
                System.out.println(menu);
                opcao = scanner.nextInt();

                switch (opcao){
                    case 1:
                        break;
                    case 2:
                        System.out.println("\nInforme o valor que deseja receber: ");
                        double valorReceber = scanner.nextDouble();
                        valor += valorReceber;
                        break;
                    case 3:
                        System.out.println("\nInforme o valor de deseja transferir:");
                        double valorTransferir = scanner.nextDouble();
                        if (valorTransferir <= valor){
                            valor -= valorTransferir;
                        }else {
                            System.out.println("Transação negada!\n\nVocê não possui saldo suficiente");

                        }
                        break;
                };

                    if (opcao == 1 || opcao == 2 || opcao == 3){
                        System.out.println("\nO valor do saldo atual é de R$ " + valor );
                    }else if (opcao == 4){
                        System.out.println("Saindo...");
                    }else {
                        System.out.println("\nValor invalido!");
                    }
            }

        }else {
            System.out.println("O CPF informado está incorreto");
        }
    }
}