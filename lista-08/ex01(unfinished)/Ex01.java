package ex01;

class Ex01 {

    static Product[] createProducts(byte length) {
        Product[] products = new Product[length];

        for (byte i = 0; i < length; i++) {
            products[i] = new Product();
        }

        return products;
    }

    static void sortProducts(Product[] products) {
        Product stage;
        
        for (byte i = 1, j = 1; i < products.length; i++, j = i) {
            stage = products[i];

            while (j > 0 && products[j-1].factoryCode > stage.factoryCode) {
                products[j] = products[--j];
            }

            products[j] = stage;
        }

        sortProductsPerProduct(products);
    }

    static void sortProductsPerProduct(Product[] products) {


        for (byte i = (byte) (products.length - 1); i >= 0; i--) {
/*             System.out.println(products[i].factoryCode);
            System.out.println(products[i+1].factoryCode + "\n"); */

            byte min = i;
            /* byte max = i; */
            while (min > -1 && products[i].factoryCode == products[min].factoryCode) {
                min--;
            }

            sortFactorysProducts(products, ++min, i);

            i = min;
        }
    }

    static void sortFactorysProducts(Product[] products, byte min, byte max) {
        Product stage;
        System.out.println("Min:\t" + min);
        System.out.println("Max:\t" + max + "\n");
        for (byte i = min, j = i; i <= max; i++, j = i) {
            stage = products[i];

            while (j > 0 && products[j-1].productCode > stage.productCode) {
                products[j] = products[--j];
            }

            products[j] = stage;
        }
    }

    public static void main(String[] args) {
        Product[] products = createProducts((byte) 5);

        System.out.println("Unsorted:\n");
        for (Product product : products) {
            System.out.format(
                "Factory Code\tProduct Code\n\t%d\t\t%d\n",
                product.factoryCode,
                product.productCode
            );
        }

        sortProducts(products);

        System.out.println("\n\nSorted:\n");
        for (Product product : products) {
            System.out.format(
                "Factory Code\tProduct Code\n\t%d\t\t%d\n",
                product.factoryCode,
                product.productCode
            );
        }     
    }
}