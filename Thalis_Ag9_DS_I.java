package thalis_ag9_ds_i;

import java.util.Scanner;


public class Thalis_Ag9_DS_I {

    
    public static void main(String[] args) {
       
      
        Scanner scanner = new Scanner(System.in);
        char continuar = 's';
        double comissao;
        double Vendas;
        int quantidadeVendas;
        double bonus;
        double resultado = 0;
        
                
        // Loop principal para repetir o cálculo
        do {
            // Entrada de dados
            System.out.print("Digite o valor total das vendas: R$");
            Vendas = scanner.nextDouble();
            
            System.out.print("Digite a quantidade de vendas realizadas: ");
            quantidadeVendas = scanner.nextInt();
            
            // Cálculo da comissão
            if(Vendas < 1000) {
                comissao = Vendas * 0.05;
            } else if(Vendas <= 5000) {
                comissao = Vendas * 0.07;
            } else {
                comissao = Vendas * 0.10;
            }
            
            // Cálculo do bônus mais exibição no console do bonus
            if(quantidadeVendas > 10) {
                bonus = Vendas * 0.02;
                resultado = comissao + bonus;
                System.out.print("bonus adicional de 2%!!");
            }
            
            // Exibição dos resultados da comissão
            System.out.println("\nComissao total: R$" + resultado);
            
            // Exibição da pergunta ao usuario de um novo calculo
            System.out.print("\n\nDeseja calcular novamente? (s/n): ");
            continuar = scanner.next().charAt(0);
            
        } while(continuar == 's' || continuar == 'S');
        
        System.out.println("Programa encerrado!");
    }
}
    
    

