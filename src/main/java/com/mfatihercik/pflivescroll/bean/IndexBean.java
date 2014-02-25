/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mfatihercik.pflivescroll.bean;

import com.mfatihercik.pflivescroll.model.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import org.apache.commons.lang.StringEscapeUtils;
import org.primefaces.context.RequestContext;

/**
 * @author mfatihercik
 */
    @ManagedBean
    @SessionScoped
    public class IndexBean {

        private int idOfProduct = 0;
        private List<Product> products;

        public IndexBean() {
              products = getProductsByCount(6);
        }
        public void scroll() {
            List<Product> products20 = getProductsByCount(6);
            String html="";
            for(Product p:products20){
                html+="<div class='product-box'>"+
                            "<h1>"+p.getName()+"</h1>"+
                            "<img src='"+p.getImage()+"'/>"+
                        "</div>";
            }
            appandToSelector(html, "#products");
        }

        private void appandToSelector(String html, String selector) {
            RequestContext requestContext = RequestContext.getCurrentInstance();
            html = StringEscapeUtils.escapeHtml(html);
            requestContext.addCallbackParam("selector", selector);
            requestContext.addCallbackParam("html", html);
        }

        private List<Product> getProductsByCount(int numberOfProduct) {
            List<Product> products20 = new ArrayList<Product>();
            for (int i = idOfProduct; i < numberOfProduct + idOfProduct; i++) {
                products20.add(new Product(i, "Kitten " + i, "http://placekitten.com/g/400/400"));
            }
            return products20;
        }

        //<editor-fold defaultstate="collapsed" desc="getter-setter">

        public List<Product> getProducts() {
            return products;
        }

        public void setProducts(List<Product> products) {
            this.products = products;
        }
        //</editor-fold>

    }
