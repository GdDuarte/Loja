import entities.Product;

import java.util.Scanner;

/*
fazer um programa para ler os dados de um produto em estoque (nime, preço e quantidade no estoque). Em seguida
Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
realizar uma entrada no estoque e mostrar novamente os dados do produto
realizar uma saída no estoque e mostrar novamente os dados do produto
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println("");

        System.out.println("Product data: " + product.toString());

        System.out.println("");

        System.out.print("enter the number of products to be added in stock: ");
        int quantity =  sc.nextInt();
        product.addProducts(quantity);

        System.out.println("");

        System.out.println("Updated data: " + product.toString());

        System.out.println("");

        System.out.printf("Enter the number of products to be removed from stock: ");
        int rquantity = sc.nextInt();
        product.removeProducts(rquantity);

        System.out.println("");

        System.out.println("Updated data: " + product.toString());


        sc.close();

    }
}