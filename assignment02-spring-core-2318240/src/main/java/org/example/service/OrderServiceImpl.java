package org.example.service;

import org.example.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public void createOrder(String productId, int quantity) {
        String order = String.format("产品: %s, 数量: %d", productId, quantity);
        orderDao.saveOrder(order);
    }

    @Override
    public List<String> listOrders() {
        return orderDao.findAll();
    }
}
