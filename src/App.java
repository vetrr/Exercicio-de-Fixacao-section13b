import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessosaFisica;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Pessoa> pessoaFouJ = new ArrayList<>();

        Pessoa pTest = new PessosaFisica("Vitor", 50000.00, 2000.00);

        System.out.println(pTest.toString());

        sc.close();
    }
}
