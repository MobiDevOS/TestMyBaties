package com.github.mybaties.order;

//测试表字段和类的字段不一致的resultmap的解决办法
public class Order {
    public int id;
    public String orderNo;
    public float price;

    @Override
    public String toString() {
        return new StringBuffer("[")
                .append("id=").append(id)
                .append("orderNo=").append(orderNo)
                .append("price=").append(price).toString();
    }
}