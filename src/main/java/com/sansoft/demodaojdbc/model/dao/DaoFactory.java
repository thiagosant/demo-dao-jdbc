package com.sansoft.demodaojdbc.model.dao;

import com.sansoft.demodaojdbc.db.DB;
import com.sansoft.demodaojdbc.model.dao.impl.DepartmentDaoJDBC;
import com.sansoft.demodaojdbc.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
