// AopConfig.java
package org.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy  // 启用AOP自动代理
public class AopConfig {
}