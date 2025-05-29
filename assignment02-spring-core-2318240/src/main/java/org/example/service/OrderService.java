package org.example.service;

import java.util.List;

public interface OrderService {
    void createOrder(String productId, int quantity);
    List<String> listOrders();
}
