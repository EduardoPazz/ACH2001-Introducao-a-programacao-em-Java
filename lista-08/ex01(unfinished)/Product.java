package ex01;

class Product {
    int factoryCode;
    int productCode;

    Product() {
        factoryCode = (int) ((Math.random() * 2) + 1);
        productCode = (int) (Math.random() * 100);
    }
}