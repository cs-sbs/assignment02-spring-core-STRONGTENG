// AppConfig.java
package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")  // 必须扫描基础包
public class AppConfig {
}
