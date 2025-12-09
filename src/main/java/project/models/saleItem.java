package project.models;

public class saleItem {
    private int saleItemId,saleId,productId,saleQty;
    private double subTotal;

    public saleItem() {
    }

    public saleItem(int saleItemId, int saleId, int productId, int saleQty, double subTotal) {
        this.saleItemId = saleItemId;
        this.saleId = saleId;
        this.productId = productId;
        this.saleQty = saleQty;
        this.subTotal = subTotal;
    }

    public saleItem(int saleId, int productId, int saleQty, double subTotal) {
        this.saleId = saleId;
        this.productId = productId;
        this.saleQty = saleQty;
        this.subTotal = subTotal;
    }

    public int getSaleItemId() {
        return saleItemId;
    }

    public void setSaleItemId(int saleItemId) {
        this.saleItemId = saleItemId;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSaleQty() {
        return saleQty;
    }

    public void setSaleQty(int saleQty) {
        this.saleQty = saleQty;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
}
