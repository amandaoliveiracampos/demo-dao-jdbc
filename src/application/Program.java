package application;

import dao.model.DaoFactory;
import dao.model.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.creatSellerDao();

        System.out.println("=== Teste 1: seller findById ===");

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
        System.out.println("\n=== Teste 2: seller findByDepartment ===");

        Department departament = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(departament);

        for (Seller obj : list) {
            System.out.println(obj);
        }
        System.out.println("\n=== Teste 3: seller findAll ===");

        list = sellerDao.findAll();

        for (Seller obj : list) {
            System.out.println(obj);
        }
        System.out.println("\n=== Teste 4: seller insert ===");

        Seller newseller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 400d, departament);
        sellerDao.insert(newseller);

        System.out.println("Inserted! New id = " + newseller.getId());
        System.out.println("\n=== Teste 5: seller sellerUpDate ===");

        seller = sellerDao.findById(1);
        seller.setName("Marta Waine");
        sellerDao.update(seller);

        System.out.println("UpDate completed");
        System.out.println("\n=== Teste 6: seller sellerDelete ===");
        System.out.println("Enter id for delete test: ");

        int id = sc.nextInt();
        sellerDao.deleteById(id);

        System.out.println("Delete completed");

        sc.close();
    }
}
