package application;

import dao.model.DaoFactory;
import dao.model.SellerDao;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.creatSellerDao();

        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

    }
}