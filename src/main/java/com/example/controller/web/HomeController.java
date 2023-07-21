package com.example.controller.web;

import com.example.entity.Customer;
import com.example.entity.Product;
import com.example.sevice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private ProductService productService;
    @RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
    public ModelAndView homePage(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView("web/home");
        request.getSession().setAttribute("listProduct",productService.getListProduct());
        Customer customer=new Customer();
        customer.setCustomerId(1);
        request.getSession().setAttribute("user",customer);
        return mav;
    }

    @RequestMapping(value = "/cua-hang", method = RequestMethod.GET)
    public ModelAndView shopPage() {
        ModelAndView mav = new ModelAndView("web/shop");
        return mav;
    }

    @RequestMapping(value = "/san-pham/{Name}-{Id}", method = RequestMethod.GET)
    public ModelAndView productPage(@PathVariable("Id") String idProduct,HttpServletRequest request) {
        ModelAndView mav = new ModelAndView("web/productDetail");
        mav.addObject("product",productService.getProductById((List<Product>)request.getSession().getAttribute("listProduct"),idProduct));
        return mav;
    }
    @RequestMapping(value = "/giao-hang", method = RequestMethod.GET)
    public ModelAndView checkoutPage() {
        ModelAndView mav = new ModelAndView("web/checkout");
        return mav;
    }
    @RequestMapping(value = "/login" ,method = RequestMethod.GET)
    public ModelAndView loginPage() {
        ModelAndView mav = new ModelAndView("web/checkout");
        return mav;
    }

}
