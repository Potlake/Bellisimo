package com.example.Bellisimo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int product_id;

    @Column(name = "product_name")
    private String product_name;

    @Column(name = "product_price")
    private double product_price;

    @Column(name = "product_image")
    private byte image;

    protected Product()
    {

    }

    public Product(String product_name, double product_price, byte image)
    {
        this.product_name = product_name;
        this.product_price = product_price;
        this.image = image;
    }

    public Product addProduct()
    {

    }

    public void deleteProduct(int id)
    {

    }

    public void setImage(byte image) {
        this.image = image;
    }

    public void setProduct_id(int product_id)
    {
        this.product_id = product_id;
    }

    public void setProduct_name(String name)
    {
        this.name = name;
    }

    public void setProduct_price(double price)
    {
        this.price = price;
    }

    public byte getImage()
    {
        return image;
    }

    public String getProduct_name() {
        return product_name;
    }

    public double getProduct_price() {
        return product_price;
    }

    public int getProduct_id() {
        return product_id;
    }

    @Override
    public String toString()
    {
        return String.format("Product[product_id=%d,product_name='%s',product_price='%d',image='%b']",product_id,product_name,product_price,image);
    }

}
