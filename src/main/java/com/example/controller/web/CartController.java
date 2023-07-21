package com.example.controller.web;

import com.example.entity.Customer;
import com.example.entity.Product;
import com.example.sevice.CartService;
import com.example.sevice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CartController {
    @Autowired
    private CartService cartService;
    @Autowired
    private ProductService productService;
    @RequestMapping(value = "/gio-hang", method = RequestMethod.GET)
    public ModelAndView cartPage(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView("web/cart");
        Customer customer=(Customer) request.getSession().getAttribute("user");
//        if(customer==null){
//            return new ModelAndView("login");
//        }
        mav.addObject("listProduct",cartService.getListCartModel(customer.getCustomerId()+""));
        return mav;
    }
    @RequestMapping(value = "/api-addCart", method = RequestMethod.POST)
    public ModelAndView addProductToCart(HttpServletRequest request, @RequestParam("pro") String productId,@RequestParam("quantity")int quality) {
        HttpSession httpSession = request.getSession();
        Customer customer = (Customer) httpSession.getAttribute("user");
        if (customer == null) {
            return new ModelAndView("login");
        }
        try {
            Product product = productService.getProductById((List<Product>) httpSession.getAttribute("listProduct"),productId);
            cartService.addProductToCart(product, customer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ModelAndView("web/productDetail");
    }
}
