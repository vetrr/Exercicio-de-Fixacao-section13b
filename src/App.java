import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaJuridica;
import entities.PessosaFisica;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Pessoa> pessoaFouJ = new ArrayList<>();

        System.out.println();
        System.out.println("---Programa Iniciado---");
        System.out.print("Quantidade de pessoas a pagar o imposto: ");
        Integer n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("Informações da"+(i+1)+"Pessoa");
            System.out.print("Pessoa física ou jurídica? (f/j)");
            char fj = sc.next().charAt(0);
            
            switch (fj) {
                case 'f':
                    System.out.print("Nome: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.print("Renda anual: ");
                    Double rendaAnual = sc.nextDouble();
                    System.out.print("Gastos com saúde: ");
                    Double gastoSaude = sc.nextDouble();

                    Pessoa novaPF = new PessosaFisica(nome, rendaAnual, gastoSaude);
                    pessoaFouJ.add(novaPF);

                    break;
                case 'j':
                    System.out.print("Nome: ");
                    String nomeJu = sc.nextLine();
                    System.out.print("Renda anual: ");
                    Double rendaAnualJu = sc.nextDouble();
                    System.out.print("Quantos funcionáios?: ");
                    Integer qtdFuncionario = sc.nextInt();

                    Pessoa novaPJ = new PessoaJuridica(nomeJu, rendaAnualJu, qtdFuncionario);
                    pessoaFouJ.add(novaPJ);

                    break;
            
                default:
                    System.out.println("Digite 'f' ou 'j'");
                    break;
            }

        }

        for (Pessoa i : pessoaFouJ) {
            
        }

        // Pessoa pTest = new PessoaJuridica("Vitor", 40000.00, 25);

        // System.out.println("IMPOSTO A SER PAGO");
        // System.out.println(pTest.toString());

        sc.close();
    }
}
