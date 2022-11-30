package dao.model;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao creatSellerDao() {
        return new SellerDaoJDBC();
    }

}
