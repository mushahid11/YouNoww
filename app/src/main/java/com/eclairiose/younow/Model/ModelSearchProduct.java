package com.eclairiose.younow.Model;

import android.widget.ImageView;
import android.widget.TextView;

public class ModelSearchProduct {

  private   int productImage,searchImage;
  private   String ProductName,SellerName,ProductPrice;

    public ModelSearchProduct(int productImage, int searchImage, String productName, String sellerName, String productPrice) {
        this.productImage = productImage;
        this.searchImage = searchImage;
        ProductName = productName;
        SellerName = sellerName;
        ProductPrice = productPrice;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public int getSearchImage() {
        return searchImage;
    }

    public void setSearchImage(int searchImage) {
        this.searchImage = searchImage;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getSellerName() {
        return SellerName;
    }

    public void setSellerName(String sellerName) {
        SellerName = sellerName;
    }

    public String getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(String productPrice) {
        ProductPrice = productPrice;
    }
}
