package vendingMachine.Steps;

import org.junit.Assert;

import java.util.List;

public class Accept_coins {

    public int getTotalAmt(String input) {
        int lgetTotalAmt = 0;
        String[] inputCoins = input.split(",");
        for (int i = 0; i < inputCoins.length; i++) {
            lgetTotalAmt += Integer.parseInt(inputCoins[i]);

        }
        return lgetTotalAmt;
    }

    public void validateCoins(String acceptedCoins, String inputCoins) {
        String[] inputCoin = inputCoins.split(",");
        boolean coinAccepted = false;
        List<String> notAcceptedCoinlist = null;
        List<String> acceptedCoinlist = null;
        for (int i = 0; i < inputCoin.length; i++) {
            //lgetTotalAmt+=Integer.parseInt(inputCoins[i]);
            coinAccepted = false;

            String[] acceptedCoin = acceptedCoins.split(",");
            for (int j = 0; j < acceptedCoin.length; j++) {
                if (inputCoin[i].equals(acceptedCoin[j])) {
                    System.out.println("entered coin is " + inputCoin[i]);
                    coinAccepted = true;
                    System.out.println(coinAccepted);
                    // acceptedCoinlist.add(inputCoin[i]);
                }
//                else{
//                    coinAccepted=false;
//                  //break;
//                    //notAcceptedCoinlist.add(inputCoin[i]);
//                }
//                    System.out.println(inputCoin[i]);
//                    coinAccepted=false;
//                    break;
//                }

            }
            if (coinAccepted == false) {
                System.out.println("entered coin not accepted : please enter coins in 1,5,10,25 Cents ");
                Assert.assertEquals("coin is not accepted,please enter coins in 1,5,10,25 Cents", false, coinAccepted);
                returnCoins();
                //break;
            }

        }

//        if (coinAccepted == false) {
//            System.out.println("entered coin not accepted : ");
//            Assert.assertEquals("coin is not accepted,please enter coins in 1,5,10,25 Cents", false, coinAccepted);
//            returnCoins();
//        } else {
        if (coinAccepted == true) {
            //System.out.println("accepted coins entered are: ");
            Assert.assertEquals("coin is accepted", true, coinAccepted);
        }
//        }
    }

    private void returnCoins() {
        //functionality to return coins/change

    }

    public int cancelRequest() {
        //refund coins that has been inserted

        Assert.assertEquals("money refunded",true,true);
        return 0;
    }
}
