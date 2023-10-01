package com.sansoft.demodaojdbc.model.dao;

import com.sansoft.demodaojdbc.model.entities.Department;
import com.sansoft.demodaojdbc.model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();

    List<Seller> findByDepartment(Department department);
}
