package com.ethiopia.mymall;

public class HorizontalProductScrollModel {

    private int produceImage;
    private String productTitle;
    private String productDescription;
    private String productPrices;


    public HorizontalProductScrollModel(int produceImage, String productTitle, String productDescription, String productPrices) {
        this.produceImage = produceImage;
        this.productTitle = productTitle;
        this.productDescription = productDescription;
        this.productPrices = productPrices;
    }

    public int getProduceImage() {
        return produceImage;
    }

    public void setProduceImage(int produceImage) {
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
