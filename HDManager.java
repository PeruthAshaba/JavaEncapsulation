public class HDManager {
    public static void main (String [] args){
        HardWareStore store = new HardWareStore("Pasha UG", "+256759709120","Mukono");
        Product product1 = new Product(1, "Cement",20,90000,"cementimage");
        Product product2 = new Product(2, "Adhesives",200,300000,"adhesiveimage");
        Product product3 = new Product(3, "Batteries",90,450000,"Batteriesimage");
        Product product4 = new Product(4, "Keys&door locks",209,10000,"Keys&door locksimage");
        Product product5 = new Product(5, "Nails&nuts",780,90000,"Nails&nutsimage");

        System.out.println("StoreName: " + store.getName());
        System.out.println("Contact: " + store.getContact());
        System.out.println("Location: " + store.getLocation());
        System.out.println("Product list " + store.getProducts());
        System.out.println();

        // Adding initial products
        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        store.addProduct(product4);
        store.addProduct(product5);

        // Updating stock for new products
        store.updateProductStock("Cement", 97);
        store.updateProductStock("Adhesives", 90);
        store.updateProductStock("Batteries", 340);
        store.updateProductStock("Keys&door locks", 970);
        store.updateProductStock("Nails&nuts",100);

        System.out.println("Product list " + store.getProducts());
        System.out.println();

        System.out.println("Product Name: " + product1.getName());
        System.out.println("Product_Id " + product1.getId());
        System.out.println("Product1 price: " + product1.getPrice());
        System.out.println("Product1 stock: " + product1.getStock());
        System.out.println("Product1 Image: " + product1.getImage());
        System.out.println();

        System.out.println("Product Name: " + product2.getName());
        System.out.println("Product_Id " + product2.getId());
        System.out.println("Product2 price: " + product2.getPrice());
        System.out.println("Product2 stock: " + product2.getStock());
        System.out.println("Product2 Image: " + product2.getImage());
        System.out.println();

        System.out.println("Product Name: " + product3.getName());
        System.out.println("Product_Id " + product3.getId());
        System.out.println("Product3 price: " + product3.getPrice());
        System.out.println("Product3 stock: " + product3.getStock());
        System.out.println("Product3 Image: " + product3.getImage());
        System.out.println();

        System.out.println("Updating Product2");
        product2.setName("Axes");
        product2.setPrice(75000);
        product2.setImage("AxeImage");
        product2.setStock(908);


        System.out.println();
        System.out.println("Product Name: " + product2.getName());
        System.out.println("Product_id " + product2.getId());
        System.out.println("Price of product1: " + product2.getPrice());
        System.out.println("Available stock: " + product2.getStock());
        System.out.println("Image of Product1: " + product2.getImage());
        System.out.println();



        // Displays product list and total products
        store.displayProductList();
        System.out.println("Total Products = " + store.getTotalProducts());
    }
}
