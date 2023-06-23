//write a java program that manages a hardware store. The store must have a name, contact and where it is located. The store consists of
//different products. New products can be added to the store each new day and the store manager keeps track of all these new products
//The store manager always updates these products based on the number in stock once a new product has been brought. The manager updates
//the product name if required and can also delete a product. The manager presents a list of these products to his boss with the total products
//in the store.

import java.util.ArrayList;//import the ArrayList class

public class Product{
    //private attributes of the product class
        private int id;
        private String name;
        private int stock;
        private int price;
        private String image;

        public Product(int id, String name, int stock, int price, String image){//constructor of the product class
            this.id=id;
            this.name=name;
            this.stock=stock;
            this.price=price;
            this.image=image;
        }
        //getters and setters for the attributes of the products
        public int getId(){
            return id;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
        //creating a function to update the stock
    public void updateStock(double quantity){
            stock += quantity;//(stock = stock+quantity)
    }
    }
