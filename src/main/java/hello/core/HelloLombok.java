package hello.core;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("HelloLombok");
        helloLombok.setAge(23);

        String name = helloLombok.getName();
        System.out.println("name = " + name);
        int age = helloLombok.getAge();
        System.out.println("age = " + age);
    }
}
