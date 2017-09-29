package com.example.Model;

import javax.persistence.*;

@Entity
@Table(name = "Catelogue")
public class Catelogue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int catelogue_id;

    @Column(name = "product_id")
    private int product_id;

    public Catelogue()
    {

    }

    public Catelogue(int catelogue_id,int product_id)
    {
        this.catelogue_id = catelogue_id;
        this.product_id = product_id;
    }

    public Product getProduct(int product_id)
    {
        Product getVariable = new Product();

        product_id = getVariable.getProduct_id();

        return  new Product(getVariable.getProduct_name(),getVariable.getProduct_price(), getVariable.getImage());
    }
}
