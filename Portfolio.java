package com.mkyong.hashing;
import java.util.ArrayList;
import java.util.HashSet;

public class Portfolio {

    ArrayList<TradePosition> portfolio;

    public Portfolio() {
        portfolio = new ArrayList<>();
    }

    public boolean addTradePosition(TradePosition trade) throws Exception{

        if (!this.isValid()) {
            throw new Exception("Portfolio not valid, error creating/modifying it. ");
        }

        if (!(trade instanceof TradePosition)) {
            return false;
        }

        int portfolioSize = portfolio.size();
        String newAssetName = trade.getAssetName();
        int amount = trade.getAmount();

        boolean found = false;

        for (int i = 0; i < portfolioSize; i++) {

            TradePosition currentStock = portfolio.get(i);
            String curName = currentStock.getAssetName();

            if (curName.equals(newAssetName)) {
                currentStock.addAsset(amount);
                found = true;
                return true;
            }
        }

        if (!found) {
            portfolio.add(trade);
        }
        return true;
    }

    public TradePosition getTrade(String assetName) throws Exception {

        if (!this.isValid()) {
            throw new Exception("Portfolio not valid, error creating/modifying it");
        }

        int portfolioSize = portfolio.size();

        for (int i = 0; i < portfolioSize; i++) {

            TradePosition currentStock = portfolio.get(i);
            if (currentStock.getAssetName().equals(assetName)) {
                return currentStock;
            }

        }

        throw new Exception("Asset with given name of: " + assetName + " not found. ");

    }

    public ArrayList<String> getCompleteListAssetNames() {

        ArrayList<String> res = new ArrayList<>();

        int portfolioSize = portfolio.size();

        for (int i = 0; i < portfolioSize; i++) {

            TradePosition currentStock = portfolio.get(i);
            String name = currentStock.getAssetName();
            res.add(name);
        }
        return res;
    }

    public ArrayList<TradePosition> getTradeWithXAssets(double XAssets) throws Exception {

        ArrayList<TradePosition> res = new ArrayList<TradePosition>();

        int portfolioSize = portfolio.size();

        for (int i = 0; i < portfolioSize; i++) {

            TradePosition currentStock = portfolio.get(i);
            if (currentStock.getAmount() == XAssets) {
                res.add(currentStock);
            }
        }

        if (res.size() > 0) {
            return res;
        }

        throw new Exception("No Assets have the given amount of " + XAssets + ".");

    }

    public boolean isValid() {


        HashSet<String> assets = new HashSet<>();

        int portfolioSize = portfolio.size();

        for (int i = 0; i < portfolioSize; i++) {

            TradePosition currentStock = portfolio.get(i);
            String assetName = currentStock.getAssetName();

            if (assets.contains(assetName)) {
                return false;
            }

            assets.add(assetName);
        }

        return true;

    }
}
