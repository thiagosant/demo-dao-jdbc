package com.sansoft.demodaojdbc.model.dao;

import com.sansoft.demodaojdbc.db.DB;
import com.sansoft.demodaojdbc.model.dao.impl.SellerDaoJDBC;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
