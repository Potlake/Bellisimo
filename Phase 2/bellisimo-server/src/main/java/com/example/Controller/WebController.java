package com.example.Controller;

import com.example.Model.Product;
import com.example.Repository.BellisimoDAO;
import com.sun.org.apache.bcel.internal.generic.VariableLengthInstruction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping("Product")
public class WebController {

    @Autowired
    private BellisimoDAO bellisimoDAO;

    @RequestMapping(value = " ")
    public String index(Model model){

        model.addAttribute("Products", bellisimoDAO.findAll());
        model.addAttribute("title", "Product");

        return "product/index";
    }

    @RequestMapping(value = "addproduct", method = RequestMethod.GET)
    public String displayAddProductForm(Model model)
    {
        model.addAttribute("title", "Add Product");
        model.addAttribute(new Product());
        //model.addAttribute("Product", Product.values());

        return "product/addproduct";
    }
    @RequestMapping(value = "addproduct", method = RequestMethod.POST)
    public String processAddProductForm(@ModelAttribute @Valid Product newProduct, Errors errors, Model model)
    {
        if(errors.hasErrors())
        {
            model.addAttribute("title", "Add Product");
            return "product/addproduct";
        }

        bellisimoDAO.save(newProduct);
        return "redirect";
    }

    @RequestMapping(value = "removeproduct", method = RequestMethod.GET)
    public String displayRemoveProductForm(Model model)
    {
        model.addAttribute("Products", bellisimoDAO.findAll());
        model.addAttribute("title", "Remove Product");

        return "product/removeproduct";
    }


}
