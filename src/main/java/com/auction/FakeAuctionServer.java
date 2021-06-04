package com.auction;

public class FakeAuctionServer {
  private final String itemId;

  public FakeAuctionServer(final String itemId) {
    this.itemId = itemId;
  }

  public void startSellingItem() {}

  public void hasReceivedJoinRequestFromSniper() {}

  public void announceClosed() {}

  public void stop() {}

  public String getItemId() {
    return "";
  }
}
