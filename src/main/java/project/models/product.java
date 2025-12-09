package project.models;

public class product {
    private int productId,productStock,categoryId;
    private String productName,productBrand,productImagePath;
    private double productPrice;

    public product(){}

    public product(int productId, int productStock, int categoryId, String productName, String productBrand, String productImagePath, double productPrice) {
        this.productId = productId;
        this.productStock = productStock;
        this.categoryId = categoryId;
        this.productName = productName;
        this.productBrand = productBrand;
        this.productImagePath = productImagePath;
        this.productPrice = productPrice;
    }

    public product(int productStock, int categoryId, String productName, String productBrand, String productImagePath, double productPrice) {
        this.productStock = productStock;
        this.categoryId = categoryId;
        this.productName = productName;
        this.productBrand = productBrand;
        this.productImagePath = productImagePath;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductImagePath() {
        return productImagePath;
    }

    public void setProductImagePath(String productImagePath) {
        this.productImagePath = productImagePath;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
