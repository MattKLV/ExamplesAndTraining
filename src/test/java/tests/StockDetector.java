package tests;

public class StockDetector {

    int minPrice = 0;
    int maxPrice = 100;

    public void detector(String stockName, int stockPrice){

        if ("Apple".equals(stockName)) {
            buy();
        } else if ("Gamestop".equals(stockName)) {
            sell();
        } else {

        } if(stockPrice > maxPrice) {
            buy();
        } else if (stockPrice < minPrice){
            sell();
        }
    }

    public void buy(){
        System.out.println("You have bought something");
    }

    public void sell(){
        System.out.println("You have sold something");

    }

}
