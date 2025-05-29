package org.example;

import org.example.config.AppConfig;
import org.example.config.AopConfig;
import org.example.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 加载配置
        ApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class,
                AopConfig.class
        );

        // 获取Service实例
        OrderService orderService = context.getBean(OrderService.class);

        // 测试订单操作
        orderService.createOrder("P1001", 2);
        orderService.createOrder("P1002", 3);

        // 查询订单
        System.out.println("\n当前所有订单:");
        orderService.listOrders().forEach(System.out::println);
    }
}
