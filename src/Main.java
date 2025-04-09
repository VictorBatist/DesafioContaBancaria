import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                
                Olá bem-vindo ao Seu Banco
                
                Para acessar sua conta informe o seu CPF :D
                """);
        String nome = "João de Souza";
        String cpf = scanner.nextLine();
        String tipoConta = "Corrente";
        double valor = 2500.00;

        if(cpf.length() == 11){

            /// Informações iniciais do cliente
            System.out.println("""
                    
                    Olá João, muito bom ter o senhor de volta conosco! 
                    
                    ------------------------------
                    Dados atuais do Cliente:
                    
                    Nome:             %s
                    CFP:              %s
                    Tipo de conta:    %s
                    Saldo em conta:   %.2f
                    ------------------------------
                    """.formatted(nome, cpf, tipoConta, valor));

        }else {
            System.out.println("O CPF informado está incorreto");
        }
    }
}