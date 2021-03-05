package semester_projecct;

public class Product {
    private String Produc_ID;
    private String Product_Name;
    private String Company_Name;
    private String stock;
    private String price;
    private Object Quantity;
    private int counter;


    public Product(String Produc_ID, String Product_Name, String Company_Name, String stock, String price, Object Quantity) {
        this.Produc_ID = Produc_ID;
        this.Product_Name = Product_Name;
        this.Company_Name = Company_Name;
        this.stock = stock;
        this.price = price;
        this.Quantity = Quantity;
    }

    public String getProduc_ID() {
        return Produc_ID;
    }

    public void setProduc_ID(String Produc_ID) {
        this.Produc_ID = Produc_ID;
    }

    public String getProduct_Name() {
        return Product_Name;
    }

    public void setProduct_Name(String Product_Name) {
        this.Product_Name = Product_Name;
    }

    public String getCompany_Name() {
        return Company_Name;
    }

    public void setCompany_Name(String Company_Name) {
        this.Company_Name = Company_Name;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Object getQuantity() {
        return Quantity;
    }

    public void setQuantity(Object Quantity) {
        this.Quantity = Quantity;
    }
    
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
}