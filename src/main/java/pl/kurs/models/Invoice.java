package pl.kurs.models;

import java.io.Serializable;

public class Invoice implements Serializable {
    private String invoiceNumber;
    private String seller;
    private String purchaser;
    private String title;
    private String products;
    private String date;
    private double price;

    public Invoice() {
    }

    public Invoice(String invoiceNumber, String seller, String purchaser, String title, String products, String date, double price) {
        this.invoiceNumber = invoiceNumber;
        this.seller = seller;
        this.purchaser = purchaser;
        this.title = title;
        this.products = products;
        this.date = date;
        this.price = price;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber='" + invoiceNumber + '\'' +
                ", seller='" + seller + '\'' +
                ", purchaser='" + purchaser + '\'' +
                ", title='" + title + '\'' +
                ", products='" + products + '\'' +
                ", date='" + date + '\'' +
                ", price=" + price +
                '}';
    }
}
