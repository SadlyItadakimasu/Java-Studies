package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) throws ParseException {
        List<Product> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            System.out.printf("Product #%d data:%n", i+1);
            System.out.print("Common, used, or imported (c/u/i)? : ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (type == 'c'){
                Product c = new Product(name, price);
                list.add(c);
            }
            if (type == 'u'){
                System.out.print("Manufacture date (dd/MM/yyyy): ");
                SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
                Date date = sdf1.parse(sc.next());
                UsedProduct u = new UsedProduct(name, price, date);
                list.add(u);
            }
            if (type == 'i'){
                System.out.print("Customs fee: ");
                double customsfee = sc.nextDouble();
                ImportedProduct imp = new ImportedProduct(name, price, customsfee);
                list.add(imp);
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product p : list){
            System.out.println(p.priceTag());
        }
        sc.close();
    }
}
