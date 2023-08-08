package org.nexta1.mail.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description: ${DESCRIPTION}
 *
 * @author nexta1
 * @date 2023/7/27 22:15
 */

@SpringBootApplication
@MapperScan("org.nexta1.mail.order.dao")
public class OrderMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class, args);

    }
}