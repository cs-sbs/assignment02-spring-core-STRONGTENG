package org.example.repository;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
    @Override
    public void saveOrder(){
        System.out.println("保存订单");
    }
}
