package application;

import entities.*;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static entities.Order.sdf1;
import static entities.Order.sdf2;

public class Program {
    public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String clientBirthDate = sc.next();
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        sc.nextLine();
        String orderstatus = sc.nextLine();
        Order pedido = new Order(new Client(clientName, clientEmail, sdf1.parse(clientBirthDate)), OrderStatus.valueOf(orderstatus));
        System.out.print("How many items to this order?: ");
        Integer quantidadeItens = sc.nextInt();
        for (int i=0; i<quantidadeItens; i++){
            System.out.println("Enter #" +i+1+" item data:");
            System.out.print("Product Name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer productQuantity = sc.nextInt();
            Product p = new Product(productName, productPrice);
            OrderItem item = new OrderItem(p , productQuantity, productPrice);
            pedido.addItem(item);
        }
        System.out.println();
        System.out.print(pedido);
        Double total = pedido.total();
        System.out.printf("Total price: %.2f", total);
        sc.close();
    }
}
