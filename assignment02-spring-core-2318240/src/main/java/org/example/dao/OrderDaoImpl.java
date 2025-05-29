package org.example.dao;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderDaoImpl implements OrderDao {
    private final List<String> orders = new ArrayList<>();

    @Override
    public void saveOrder(String order) {
        orders.add(order);
    }

    @Override
    public List<String> findAll() {
        return new ArrayList<>(orders);
    }
}
