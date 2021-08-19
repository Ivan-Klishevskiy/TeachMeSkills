package Unit9.Additionally;

import java.util.Arrays;

public class Shop {
    private Product[] arrayProduct;
    private int value;

    public Shop() {
        this.arrayProduct = null;
        this.value = 0;
    }

    public void sortByAddition(){
        for(int i=value-1;i>=1;i--){
            for(int j=0;j<i;j++){
                if(arrayProduct[j].getHistoryNumber()<arrayProduct[i].getHistoryNumber()){
                    Product save=arrayProduct[j];
                    arrayProduct[j]=arrayProduct[i];
                    arrayProduct[i]=save;
                }
            }
        }
    }

    public void sortByPrice(){
        for(int i=value-1;i>=1;i--){
            for(int j=0;j<i;j++){
                if(arrayProduct[j].getPrice()>arrayProduct[i].getPrice()){
                    Product save=arrayProduct[j];
                    arrayProduct[j]=arrayProduct[i];
                    arrayProduct[i]=save;
                }
            }
        }
    }

    public void editProduct(Product product){
        for(Product i:arrayProduct){
            if(i.getId()==product.getId()){
                i.setName(product.getName());
                i.setPrice(product.getPrice());
                break;
            }
        }
    }

    public void removeProduct(int idElement) {
        boolean flag=false;
        for (Product i : arrayProduct) {
            if(i.getId()==idElement){
                flag=true;
            }
        }
        if(flag){
            Product[] copyArray=new Product[arrayProduct.length];
            int count=0;
            for(Product i: arrayProduct){
                if(i.getId()!=idElement){
                    copyArray[count]=i;
                    count++;
                }
            }
            arrayProduct=copyArray;
            value--;
        }
    }

    public Product[] getArrayProduct() {
        return arrayProduct;
    }

    public void addProduct(Product product) {
        if (arrayProduct == null) {
            arrayProduct = new Product[2];
            arrayProduct[0] = product;
            value++;
        } else {
            boolean flag = true;
            for (Product i : arrayProduct) {
                if (i == null) {
                    break;
                }
                if (i.getId() == product.getId()) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                if (arrayProduct.length <= value) {
                    Product[] copyArray = new Product[(int) (arrayProduct.length * 1.5)];
                    int count = 0;
                    for (Product i : arrayProduct) {
                        copyArray[count++] = i;
                    }
                    product.setHistoryNumber(count);
                    copyArray[count++] = product;
                    arrayProduct = copyArray;
                    value = count;
                } else {
                    product.setHistoryNumber(value);
                    arrayProduct[value] = product;
                    value++;
                }

            }
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "arrayProduct=" + Arrays.toString(arrayProduct) +
                '}';
    }
}
