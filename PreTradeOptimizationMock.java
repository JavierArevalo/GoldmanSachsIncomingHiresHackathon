package com.mkyong.hashing;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class PreTradeOptimizationMock {

    public PreTradeOptimizationMock() {


    }

    public PreTradeOptimizationResultMock loadData1() {
        String createdById = "872839f3af8240108e0bf48e52f1288d";

        String[] edit = {"guid:872839f3af8240108e0bf48e52f1288d"};
        String[] view = {"guid:872839f3af8240108e0bf48e52f1288d"};
        String[] admin = {"guid:872839f3af8240108e0bf48e52f1288d"};

        Entitlements entitlements = new Entitlements(edit, view, admin);

        String id = "LI1ZQ8CXS5V62VS9";
        String ownderId = "872839f3af8240108e0bf48e52f1288d";

        String status = "Completed";

        Analytics analytics;


        PortfolioChar portfolioChar;

        Sell sell = new Sell(
                -139290,
                1,
                5228.001073080936,
                7378.072144407818,
                4818.7861953855245,
                1970.5971052229481,
                0.9864000000000002,
                2.050474607723084,
                470.7723088034401,
                0.0014005308796331101,
                0.0014005308796331101
        );

        Buy buy = new Buy(
                17432.73,
                1,
                850.6482398419299,
                1015.6015230715882,
                504.1032868368569,
                231.78417098549596,
                0.8304,
                8.032980688356153,
                64.8024395103115,
                0.016327690126203644,
                0.016327690126203644
        );

        Net net = new Net(
                -121857.27,
                2,
                5296.753500785325,
                7179.347189228349,
                4421.589257537034,
                1984.181658274387,
                0.15600000000000014,
                2.7159263467722603,
                458.09227475991185,
                0.016327690126203644
        );

        Gross gross = new Gross(
                156722.73,
                2,
                0.9690476613826214,
                2.7159263467722603,
                0.0030609226863127633,
                0.016327690126203644

        );

        portfolioChar = new PortfolioChar(
                sell, buy, net, gross
        );


        AssetAnalyticsDaily[] assetAnalyticsDaily = new AssetAnalyticsDaily[1];

        AssetAnalyticsDaily assetAnalyticsDaily1 = new AssetAnalyticsDaily(
                "MA4B66MW5E27U9VBB94",
                1,
                -0.8741121180376512,
                105.06185460696557,
                104.18774248892791,
                3,
                "Sm QTime, Rather Thin Q, Liquid,Lrg Px Move"
        );

        assetAnalyticsDaily[0] = assetAnalyticsDaily1;


        PortfolioAnalyticsDaily[] portfolioAnalyticsDailies = new PortfolioAnalyticsDaily[1];

        PortfolioAnalyticsDaily portfolioAnalyticsDaily = new PortfolioAnalyticsDaily(
                1,
                10.162618078760483,
                24.277046475645243
        );

        portfolioAnalyticsDailies[0] = portfolioAnalyticsDaily;




        FactorAnalyticsIntraday factorAnalyticsIntraday;


        FactorAnalytics[] country = new FactorAnalytics[1];
        Factors[] factors = new Factors[1];
        Factors factorsCountry = new Factors(
                "United States",
                121857.27,
                77.75341202900178
        );
        factors[0] = factorsCountry;

        FactorAnalytics factorAnalyticsCountry = new FactorAnalytics(
                0,
                1,
                LocalDateTime.of(
                        2020,
                        4,
                        30,
                        02,
                        00,
                        00
                ),
                LocalDateTime.of(
                        2020,
                        5,
                        1,
                        20,
                        20,
                        00
                ),
                LocalDateTime.of(
                        2020,
                        4,
                        30,
                        02,
                        00,
                        00
                ),
                factors
        );

        country[0] = factorAnalyticsCountry;



        FactorAnalytics[] sector = new FactorAnalytics[1];

        Factors[] factorsSector = new Factors[2];
        Factors factorsSector1 = new Factors(
                "Consumer Staples",
                -17432.73,
                -11.123293985499103
        );
        Factors factorsSector2 = new Factors(
                "Information Technology",
                139290,
                88.8767060145009
        );
        factorsSector[0] = factorsSector1;
        factorsSector[1] = factorsSector2;

        FactorAnalytics factorAnalyticsSector = new FactorAnalytics(
                0,
                1,
                LocalDateTime.of(
                        2020,
                        4,
                        30,
                        02,
                        00,
                        00
                ),
                LocalDateTime.of(
                        2020,
                        5,
                        1,
                        20,
                        20,
                        00
                ),
                LocalDateTime.of(
                        2020,
                        4,
                        30,
                        02,
                        00,
                        00
                ),
                factorsSector

        );

        sector[0] = factorAnalyticsSector;


        FactorAnalytics[] market = new FactorAnalytics[1];

        Factors[] factorMarket = new Factors[1];

        Factors factorMarket1 = new Factors(
                "market intercept",
                121857.27,
                77.75341202900178
        );

        factorMarket[0] = factorMarket1;

        FactorAnalytics factorAnalyticsMarket = new FactorAnalytics(
                0,
                1,
                LocalDateTime.of(
                        2020,
                        4,
                        30,
                        02,
                        00,
                        00
                ),
                LocalDateTime.of(
                        2020,
                        5,
                        1,
                        20,
                        20,
                        00
                ),
                LocalDateTime.of(
                        2020,
                        4,
                        30,
                        02,
                        00,
                        00
                ),
                factorMarket
        );

        market[0] = factorAnalyticsMarket;



        FactorAnalytics[] industry = new FactorAnalytics[1];

        Factors[] factorIndustry = new Factors[2];

        Factors factorIndustry1 = new Factors(
                "food products",
                -17432.73,
                -11.123293985499103
        );

        Factors factorIndustry2 = new Factors(
                "technology hardware, storage & peripherals",
                139290,
                88.8767060145009
        );

        factorIndustry[0] = factorIndustry1;
        factorIndustry[1] = factorIndustry2;

        FactorAnalytics factorAnalyticsIndustry = new FactorAnalytics(
                0,
                1,
                LocalDateTime.of(
                        2020,
                        4,
                        30,
                        02,
                        00,
                        00
                ),
                LocalDateTime.of(
                        2020,
                        5,
                        1,
                        20,
                        20,
                        00
                ),
                LocalDateTime.of(
                        2020,
                        4,
                        30,
                        02,
                        00,
                        00
                ),
                factorIndustry
        );

        industry[0] = factorAnalyticsIndustry;


        FactorAnalytics[] risk = new FactorAnalytics[1];

        Factors[] factorsRisk = new Factors[3];
        Factors factorRisk1 = new Factors(
                "dividend yield",
                -43510.5227403765,
                -10.93507985276181
        );

        Factors factorRisk2 = new Factors(
                "earnings yield",
                -991.4024750948997,
                -0.2523627085922797
        );

        Factors factorRisk3 = new Factors(
                "exchange rate sensitivity",
                -11885.8763376942,
                -3.022686599839697
        );

        factorsRisk[0] = factorRisk1;
        factorsRisk[1] = factorRisk2;
        factorsRisk[2] = factorRisk3;

        FactorAnalytics factorAnalyticsRisk = new FactorAnalytics(
                0,
                1,
                LocalDateTime.of(
                        2020,
                        4,
                        30,
                        02,
                        00,
                        00
                ),
                LocalDateTime.of(
                        2020,
                        5,
                        1,
                        20,
                        20,
                        00
                ),
                LocalDateTime.of(
                        2020,
                        4,
                        30,
                        02,
                        00,
                        00
                ),
                factorsRisk

        );

        risk[0] = factorAnalyticsRisk;

        factorAnalyticsIntraday = new FactorAnalyticsIntraday(
                country,
                sector,
                market,
                industry,
                risk
        );






        AssetAnalyticsIntraday[] assetAnalyticsIntraday = new AssetAnalyticsIntraday[2];

        AssetAnalyticsIntraday assetAnalyticsIntraday1 = new AssetAnalyticsIntraday(
                0,
                1,
                LocalDateTime.of(
                        2020,
                        4,
                        30,
                        02,
                        00,
                        00
                ),
                LocalDateTime.of(
                        2020,
                        5,
                        1,
                        20,
                        20,
                        00
                ),
                true,
                "MA4B66MW5E27U9XPVA7",
                0,
                2872421,
                "AMRS"
        );

        AssetAnalyticsIntraday assetAnalyticsIntraday2 = new AssetAnalyticsIntraday(
                0,
                1,
                LocalDateTime.of(
                        2020,
                        4,
                        30,
                        02,
                        00,
                        00
                ),
                LocalDateTime.of(
                        2020,
                        5,
                        1,
                        20,
                        20,
                        00
                ),
                true,
                "MA4B66MW5E27U9VBB94",
                35700748,
                0,
                "AMRS"

        );

        assetAnalyticsIntraday[0] = assetAnalyticsIntraday1;
        assetAnalyticsIntraday[1] = assetAnalyticsIntraday2;




        PortfolioAnalyticsIntraday[] portfolioAnalyticsIntradays = new PortfolioAnalyticsIntraday[1];

        PortfolioAnalyticsIntraday portfolioAnalyticsIntraday = new PortfolioAnalyticsIntraday(
                0,
                1,
                LocalDateTime.of(
                        2020,
                        4,
                        30,
                        02,
                        00,
                        00
                ),
                LocalDateTime.of(
                        2020,
                        5,
                        1,
                        20,
                        20,
                        00
                ),
                LocalDateTime.of(
                        2020,
                        4,
                        30,
                        02,
                        00,
                        00
                ),
                -139290,
                17432.73,
                156722.73,
                -121857.27,
                156722.73,
                6.590138762145294,
                0.11971478249472678,
                0.055525586579433746,
                4.051817991653101,
                0.0030609226863127633,
                6031.828796619081,
                2632.778709984617,
                1181.4555632326335,
                5296.753500785325,
                384.87262164327285,
                -77.75341202900178
        );

        portfolioAnalyticsIntradays[0] = portfolioAnalyticsIntraday;

        ClusterAnalyticsIntraday[] clusterAnalyticsIntradays = new ClusterAnalyticsIntraday[1];

        ClusterAnalyticsIntradayItem[] clusterAnalyticsIntradayItems = new ClusterAnalyticsIntradayItem[2];

        ClusterAnalyticsIntradayItem clusterAnalyticsIntradayItem1 = new ClusterAnalyticsIntradayItem(
                3,
                0.888767060145009,
                0.888767060145009
        );

        ClusterAnalyticsIntradayItem clusterAnalyticsIntradayItem2 = new ClusterAnalyticsIntradayItem(
                5,
                0.11123293985499103,
                0.11123293985499103
        );

        clusterAnalyticsIntradayItems[0] = clusterAnalyticsIntradayItem1;
        clusterAnalyticsIntradayItems[1] = clusterAnalyticsIntradayItem2;

        ClusterAnalyticsIntraday clusterAnalyticsIntraday = new ClusterAnalyticsIntraday(
                LocalDateTime.of(
                        2020,
                        4,
                        30,
                        02,
                        00,
                        00
                ),
                0,
                1,
                clusterAnalyticsIntradayItems

        );

        clusterAnalyticsIntradays[0] = clusterAnalyticsIntraday;



        ClusterAnalytics[] clusterAnalytics = new ClusterAnalytics[2];

        ClusterAnalytics clusterAnalytics1 = new ClusterAnalytics(
                3,
                "Sm QTime, Rather Thin Q, Liquid,Lrg Px Move",
                139290,
                0.2784168285707854,
                132.52217456999256
        );

        ClusterAnalytics clusterAnalytics2 = new ClusterAnalytics(
                5,
                "Avg QTime, Avg Q, Rather Liquid, Sticky",
                17432.73,
                0.09966883356228798,
                31.498125910084784
        );

        clusterAnalytics[0] = clusterAnalytics1;
        clusterAnalytics[1] = clusterAnalytics2;


        EndofDayCashPositions[] eodCashPositions = new EndofDayCashPositions[1];

        EODCashPositionPerCurrency[] positions = new EODCashPositionPerCurrency[2];
        EODCashPositionPerCurrency eodCashPositionPerCurrency1 = new EODCashPositionPerCurrency(
                "Initial",
                121857.27
        );
        EODCashPositionPerCurrency eodCashPositionPerCurrency2 = new EODCashPositionPerCurrency(
                "1",
                118675.07999999999
        );
        positions[0] = eodCashPositionPerCurrency1;
        positions[1] = eodCashPositionPerCurrency2;

        EndofDayCashPositions eodCashPosition = new EndofDayCashPositions(
                "USD",
                positions
        );
        eodCashPositions[0] = eodCashPosition;


        analytics = new Analytics(
                portfolioChar,
                assetAnalyticsDaily,
                portfolioAnalyticsDailies,
                factorAnalyticsIntraday,
                assetAnalyticsIntraday,
                portfolioAnalyticsIntradays,
                clusterAnalyticsIntradays,
                clusterAnalytics,
                eodCashPositions
        );

        PreTradeOptimizationResultMock mockResult = new PreTradeOptimizationResultMock(
                createdById,
                entitlements,
                id,
                ownderId,
                status,
                analytics

        );

       return mockResult;



    }
}
