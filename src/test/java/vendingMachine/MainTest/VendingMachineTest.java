package vendingMachine.MainTest;

import Util.Base_test;
import org.junit.Test;
import vendingMachine.Steps.Accept_coins;
import vendingMachine.Steps.Product_availability;


public class VendingMachineTest extends Base_test {

    Accept_coins acceptCoins = new Accept_coins();
    Product_availability productAvailability = new Product_availability();
    int totalAmtInserted = 0;

    @Test
    //test for Accepting coins of 1,5,10,25 Cents i.e. penny, nickel, dime, and quarter.
    public void TC_001() throws Exception {
        acceptCoins.validateCoins(getGlobalValue("accepted.coins"), getGlobalValue("input.coins"));
        totalAmtInserted = acceptCoins.getTotalAmt(getGlobalValue("input.coins"));
    }

    @Test
    //test for select products Coke(25), Pepsi(35), Soda(45) (if product not available then select other product validation)
    public void TC_002() throws Exception {
        productAvailability.validateProduct(getGlobalValue("input.product"), getGlobalValue("accept.products"));
    }

    @Test
    //test for  user to take refund by cancelling the request
    public void TC_003() throws Exception {
        acceptCoins.validateCoins(getGlobalValue("accepted.coins"),getGlobalValue("input.coins"));
        totalAmtInserted = acceptCoins.cancelRequest();

    }

    @Test
    //test for  Return selected product and remaining change if any
    public void TC_004() throws Exception {

        boolean productAvailable = productAvailability.validateProduct(getGlobalValue("input.product"), getGlobalValue("accept.products"));
        if (productAvailable == true) {
            productAvailability.dispatchProduct(getGlobalValue("input.product"));
            productAvailability.returnRemainingChange(totalAmtInserted,getGlobalValue("input.product"));
        }
    }


}
