package com.example.controller.web;

import com.example.sevice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {
    @Autowired
    private ProductService productService;
    @RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView mav = new ModelAndView("web/home");
        mav.addObject("listProduct",productService.getListProduct());
        return mav;
    }

    @RequestMapping(value = "/gio-hang", method = RequestMethod.GET)
    public ModelAndView cartPage() {
        ModelAndView mav = new ModelAndView("web/cart");
        return mav;
    }
    @RequestMapping(value = "/cua-hang", method = RequestMethod.GET)
    public ModelAndView shopPage() {
        ModelAndView mav = new ModelAndView("web/shop");
        return mav;
    }
    @RequestMapping(value = "/san-pham/{Name}-{Id}", method = RequestMethod.GET)
    public ModelAndView productPage(@PathVariable("Id") String idProduct) {
        ModelAndView mav = new ModelAndView("web/productDetail");
        mav.addObject("product",productService.getProductById(idProduct));
        return mav;
    }
    @RequestMapping(value = "/san-pham/{Name}-{Id}", method = RequestMethod.POST)
    public ModelAndView addCart(@PathVariable("Id") String idProduct) {
        ModelAndView mav = new ModelAndView("web/Cart");
        mav.addObject("product",productService.getProductById(idProduct));
        return mav;
    }
    @RequestMapping(value = "/giao-hang", method = RequestMethod.GET)
    public ModelAndView checkoutPage() {
        ModelAndView mav = new ModelAndView("web/checkout");
        return mav;
    }

}
