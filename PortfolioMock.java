package com.mkyong.hashing;
public class PortfolioMock {

    private Portfolio portfolio;

    public PortfolioMock(String[][] stocks) throws Exception {

        //parameter in form: stocks[0] = [stockName, quantityAsString]
        portfolio = new Portfolio();

        for (String[] stock: stocks) {

            String AssetName = stock[0];
            int amount = Integer.parseInt(stock[1]);

            TradePosition tradePosition = new TradePosition(AssetName, amount);

            portfolio.addTradePosition(tradePosition);

        }
    }

    public Portfolio getPortfolio() {
        return this.portfolio;
    }
}
