package com.sansoft.demodaojdbc.model.dao.impl;

import java.sql.Connection;

public class DepartmentDaoJDBC {
    private Connection conn;

    public DepartmentDaoJDBC(Connection conn) {
        this.conn = conn;
    }
}
