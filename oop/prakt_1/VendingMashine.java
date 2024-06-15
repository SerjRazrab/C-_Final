package prakt_1;
import java.util.*;

public class VendingMashine {
    private List<Product> productList;

    
    public VendingMashine() {
        productList = new ArrayList<>();
    }


    public void addProduct(Product product){
        productList.add(product);
    }

    public Product findProductByName(String nameProduct){
        for(Product product : productList){
            if(product.getName().equalsIgnoreCase(nameProduct)){
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов :\n");
        for(Product product : productList){
            stringBuilder.append(product);
            stringBuilder.append("\n --------- \n");
        }
        return stringBuilder.toString();
    }
}
