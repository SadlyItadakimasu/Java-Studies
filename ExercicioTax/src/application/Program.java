import ProgramAndEntities.application.entities.Contribuintes;
import ProgramAndEntities.application.entities.PessoaFisica;
import ProgramAndEntities.application.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        List<Contribuintes> list = new ArrayList<>();
        for (int i=0; i<n; i++){
            System.out.printf("Tax payer #%d data:%n", i+1);
            System.out.print("Individual or company (i/c)?: ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualincome = sc.nextDouble();
            if (type == 'i'){
                System.out.print("Health expenditures: ");
                double gastosaude = sc.nextDouble();
                PessoaFisica p = new PessoaFisica(name, anualincome, gastosaude);
                list.add(p);
            }
            else{
                System.out.print("Number of employees: ");
                int funcionarios = sc.nextInt();
                PessoaJuridica Y = new PessoaJuridica(name, anualincome, funcionarios);
                list.add(Y);
            }
        }
        double totaltax = 0.0;
        System.out.println("TAXES PAID:");
        for (Contribuintes c : list){
            totaltax = totaltax + c.imposto();
            System.out.println(c);
        }
        System.out.printf("TOTAL TAXES: $ %.2f", totaltax);
        sc.close();
    }
}
