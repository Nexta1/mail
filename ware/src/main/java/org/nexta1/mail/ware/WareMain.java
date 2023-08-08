package org.nexta1.mail.ware;

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
@MapperScan("org.nexta1.mail.ware.dao")
public class WareMain {
    public static void main(String[] args) {
        SpringApplication.run(WareMain.class, args);

    }
}