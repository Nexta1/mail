package org.nexta1.procuct;

import org.springframework.boot.test.context.SpringBootTest;

/**
 * Description:
 *
 * @author nexta1
 * @date 2023/8/25 01:22
 */
@SpringBootTest
public class ProductApplicationTests {
    public static void modifyName(Person person) {
        person.name = "Alice";
    }

    public static void main(String[] args) {
        Person person = new Person("Bob");
        System.out.println(person.name);  // 输出: Bob
        modifyName(person);
        System.out.println(person.name);  // 输出: Alice
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }


}
