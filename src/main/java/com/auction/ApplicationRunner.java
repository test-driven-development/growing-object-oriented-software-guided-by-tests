package com.auction;

public class ApplicationRunner {
  public static final String SNIPER_ID = "sniper";
  public static final String SNIPER_PASSWORD = "sniper";
  public static final String XMPP_HOSTNAME = "localhost";
  private static final String STATUS_JOINING = "Joining";
  private static final String STATUS_LOST = "Lost";

  private AuctionSniperDriver driver;

  public void startBiddingIn(final FakeAuctionServer auction) {
    final Thread thread =
        new Thread("Test Application") {
          @Override
          public void run() {
            try {
              Main.main(
                  ApplicationRunner.XMPP_HOSTNAME,
                  ApplicationRunner.SNIPER_ID,
                  ApplicationRunner.SNIPER_PASSWORD,
                  auction.getItemId());
            } catch (final Exception e) {
              e.printStackTrace();
            }
          }
        };
    thread.setDaemon(true);
    thread.start();
    this.driver = new AuctionSniperDriver(1000);
    this.driver.showsSniperStatus(STATUS_JOINING);
  }

  public void showsSniperHasLostAuction() {
    this.driver.showsSniperStatus(STATUS_LOST);
  }

  public void stop() {
    if (this.driver != null) this.driver.dispose();
  }
}
