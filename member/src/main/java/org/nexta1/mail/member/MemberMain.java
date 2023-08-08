package org.nexta1.mail.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description: ${DESCRIPTION}
 *
 * @author nexta1
 * @date 2023/7/27 22:15
 */

@SpringBootApplication
@MapperScan("org.nexta1.mail.member.dao")
@EnableDiscoveryClient
public class MemberMain {
    public static void main(String[] args) {
        SpringApplication.run(MemberMain.class, args);

    }
}