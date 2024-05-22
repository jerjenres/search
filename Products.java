/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package specialactivity;

/**
 *
 * @author Jerjen
 */
public class Products {
    public String productId;
    public String productName;
    public String productDes;
    public String productPrice;
    public String productDate;
    
    public Products(String productId, String productName, String productDes, String productPrice, String productDate){
        this.productId = productId;
        this.productName = productName;
        this.productDes = productDes;
        this.productPrice = productPrice;
        this.productDate = productDate;
    }
    
    public String getProductId(){
        return productId;
    }
    
    public String getProductName(){
        return productName;
    }
    
    public String getProductDes(){
        return productDes;
    }
    
    public String getProductPrice(){
        return productPrice;
    }
    
    public String getProductDate(){
        return productDate;
    }
    
    
}
