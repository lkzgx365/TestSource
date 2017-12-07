package com.test.source.entity;

import java.math.BigDecimal;

public class Person {

    private String name;

    private Integer age;

    private BigDecimal salary;

    private Character sex;

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Person setSalary(BigDecimal salary) {
        this.salary = salary;
        return this;
    }

    public Character getSex() {
        return sex;
    }

    public Person setSex(Character sex) {
        this.sex = sex;
        return this;
    }
}
