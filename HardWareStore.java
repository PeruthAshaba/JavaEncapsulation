import java.util.ArrayList;

public class HardWareStore {
    //private attributes of the HardWareStore class
    private String name;
    private String contact;
    private String location;
    private ArrayList<Product> products;

    public HardWareStore(String name, String contact, String location) {//constructors
        this.name = name;
        this.contact = contact;
        this.location = location;
        this.products = new ArrayList<>();
    }

    //Getters and Setters for the attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public ArrayList<Product> getProducts(){
        return products;
    }
    public void setProducts(ArrayList<Product> products){
        this.products=products;
    }
    //creating a function to add new products
    public void addProduct(Product product){
        products.add(product);
    }
    public void updateProductStock(String productName, double quantity) {//parameters productName and quantity
        for (Product product : products) {
            if (product.getName().equals(productName)) {//iterating to check if name of the product matches with the provided productName
                product.updateStock(quantity);//updating stock quantity of the product
                break;//break is used to exit the loop
            }
        }
    }

    public void displayProductList() {
        System.out.println("Product List:");
        for (Product product : products) {
            System.out.println(product.getName() + "_ Stock: " + product.getStock());
        }
    }

    //Determining the number of products in the HardWare collection
    public double getTotalProducts() {
        return products.size();
    }
}
