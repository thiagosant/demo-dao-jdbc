package com.sansoft.demodaojdbc.application;

import com.sansoft.demodaojdbc.model.dao.DaoFactory;
import com.sansoft.demodaojdbc.model.dao.SellerDao;
import com.sansoft.demodaojdbc.model.entities.Department;
import com.sansoft.demodaojdbc.model.entities.Seller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Program {

    public static void main(String[] args) {
        SpringApplication.run(Program.class, args);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }

}
