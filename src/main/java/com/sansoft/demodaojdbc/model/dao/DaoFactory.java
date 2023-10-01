package com.sansoft.demodaojdbc.model.dao;

import com.sansoft.demodaojdbc.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}
