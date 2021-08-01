import behaviours.ISell;

import java.util.ArrayList;

public class MusicShop {


    private ArrayList<ISell> stock;
    private double money;

    public MusicShop() {
        this.stock = new ArrayList<>();
        this.money = 500;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addItemToStock(ISell item){
        stock.add(item);
    }

    public void removeItemFromStock(ISell itemToRemove){
        stock.remove(itemToRemove);
        this.money += itemToRemove.calculateMarkup();
    }

    public double getMoney() {
        return money;
    }

    public double calculatePotentialProfit(){
        double profit = 0;
        for(ISell item: stock){
            profit += item.calculateMarkup();
        }
        return profit;
    }

}
