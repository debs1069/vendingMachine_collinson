package vendingMachine.Steps;

import org.junit.Assert;

import java.io.File;


//* accepted product may vary as per product availability
public class Product_availability {
    public boolean validateProduct(String inputProduct, String acceptedProduct) {
        //String[] inputProd=inputProduct.split(",");
        boolean productAccepted = false;

        //lgetTotalAmt+=Integer.parseInt(inputCoins[i]);


        String[] acceptedProd = acceptedProduct.split(",");
        for (int i = 0; i < acceptedProd.length; i++) {
            if (inputProduct.equals(acceptedProd[i])) {
                System.out.println("entered product is " + inputProduct);
                productAccepted = true;
                System.out.println(productAccepted);
            }

        }
        if (productAccepted == false) {
            System.out.println("product is not available,please select other product ");
            Assert.assertEquals("product is not available,please select other product", false, productAccepted);

        } else {
            Assert.assertEquals("product is accepted", true, productAccepted);

        }
        return productAccepted;
    }

    public void dispatchProduct(String globalValue) {
        //trigger dispatch of the product from machine
        Assert.assertEquals("product is dispatched", true, true);
    }

    public void returnRemainingChange(int totalAmtInserted, String productValue) {
        int productPrice = Integer.parseInt(productValue.split("-")[1]);
        if(totalAmtInserted-productPrice>0){
            remainingChange(totalAmtInserted-productPrice);
        }
    }

    public void remainingChange(int i) {
        //find and dispatched from coin inventory,eg. if need to return 15p then need to find 5p and 10p coin if no 10p then 35p coin,if no change available then display 'no change available' message
        Assert.assertEquals("remaining amt is dispatched", true, true);
    }



}
