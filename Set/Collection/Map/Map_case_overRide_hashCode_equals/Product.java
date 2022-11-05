package com.baidu.javase.Map;

import java.util.Objects;

public class Product {
    private int np;
    private String name;

    public Product() {
    }

    public Product(int np, String name) {
        this.np = np;
        this.name = name;
    }

    public int getNp() {
        return np;
    }

    public void setNp(int np) {
        this.np = np;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //重写hashCode()+equals()方法
    //假设业务要求：商品编号相同，并且商品名字相同，表示同一个商品。

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return np == product.np && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(np, name);
    }
}
