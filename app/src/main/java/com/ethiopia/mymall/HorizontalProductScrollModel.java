package com.ethiopia.mymall;

public class HorizontalProductScrollModel {

    private String productID;
    private String produceImage;
    private String productTitle;
    private String productDescription;
    private String productPrices;


    public HorizontalProductScrollModel(String productID,String produceImage, String productTitle, String productDescription, String productPrices) {
        this.productID = productID;
        this.produceImage = produceImage;
        this.productTitle = productTitle;
        this.productDescription = productDescription;
        this.productPrices = productPrices;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProduceImage() {
        return produceImage;
    }

    public void setProduceImage(String produceImage) {
        this.produceImage = produceImage;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductPrices() {
        return productPrices;
    }

    public void setProductPrices(String productPrices) {
        this.productPrices = productPrices;
    }
}
