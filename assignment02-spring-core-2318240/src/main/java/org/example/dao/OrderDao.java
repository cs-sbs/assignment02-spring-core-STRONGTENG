package org.example.dao;

import java.util.List;  // 明确导入 List

public interface OrderDao {
    void saveOrder(String order);
    List<String> findAll();
}
