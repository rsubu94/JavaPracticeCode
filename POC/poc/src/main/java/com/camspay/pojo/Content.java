package com.camspay.pojo;

public class Content
{
    private Order order;

    public Order getOrder ()
    {
        return order;
    }

    public void setOrder (Order order)
    {
        this.order = order;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [order = "+order+"]";
    }
}
