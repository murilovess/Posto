import java.util.Scanner;
public class atividade {
    public static void main(String[] args) {
        String combustivel;
        float litro;
        float pagamento = 0;
        String formaPagamento;

        Scanner ler = new Scanner(System.in);
        

        System.out.println("Tabela de preços\n Gasolina -6,80 - opção I\n Etanol - 5,30 - opção II \n Diesel - 7,10 - opção III");

        System.out.println("Digitie a opção desejada: ");
        combustivel = ler.nextLine();

        System.out.println("Digite a quantidade de litros deseajada: ");
        litro = ler.nextFloat();
        
        if(combustivel.equals("I") ){
            pagamento = litro * 6.80f;
        }

        if (combustivel.equals("II")) {
            pagamento = litro * 5.3f;
            
        }
        if (combustivel.equals("III")) {
            pagamento = litro * 7.1f;
        }
        
        System.out.printf("Valor pagar: \n " + pagamento);

        System.out.println("Qual a forma de pagamento? \n Digite P para Pix \n Digite C para cartão de credito \n Digite D para dinheiro");
        formaPagamento = ler.nextLine();
        if (formaPagamento.equals("P")) {
            System.out.println("Pix ");
            
        }
        
        ler.close();

        
    }
}
