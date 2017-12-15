package com.shop.controller;

import com.shop.dao.PizzaDao;
import com.shop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PizzaRestController {


    @Autowired
    private PizzaDao pizzaDao;

    @GetMapping("/")
    public List getAll() {
        return pizzaDao.list();
    }

    @GetMapping("/product/{orderId}")
    public ResponseEntity<Product> getProduct(@PathVariable("orderId") Integer orderId) {

        if (orderId == null) {
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }

        Product product = pizzaDao.getProduct(orderId);
        return new ResponseEntity<Product>(product, HttpStatus.OK);
    }
}
