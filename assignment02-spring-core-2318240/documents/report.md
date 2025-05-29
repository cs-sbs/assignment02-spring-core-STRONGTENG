Spring IoC&AOP 实践报告

 应用场景
在线商城的订单管理系统，实现：
- 订单创建/查询（业务逻辑）
- 操作日志记录（AOP实现）

 技术实现
| 组件          | 实现方式                | 关键注解/配置         |
|---------------|-------------------------|-----------------------|
| IoC容器装配   | 注解方式                | @Service @ComponentScan|
| AOP日志       | 注解驱动                | @Aspect @Before       |
| 日志配置      | Logback XML配置         | logback.xml           |

运行验证
![运行截图](documents/operation-screenshot.png)

 问题解决方案
1. 日志配置异常：
   - 错误现象：SAXParseException
   - 解决方法：规范XML文件编码格式，使用UTF-8无BOM格式
   - 验证方式：mvn clean compile
