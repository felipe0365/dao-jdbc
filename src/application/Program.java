package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department department = new Department(1, "books");

        Seller seller = new Seller(21, "bob", "bob@gmail.com", 3000.0, new Date(), department);

        System.out.println(seller);
    }
}
