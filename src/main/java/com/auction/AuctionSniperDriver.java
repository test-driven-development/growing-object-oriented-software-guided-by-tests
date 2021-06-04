package com.auction;

import com.objogate.wl.swing.AWTEventQueueProber;
import com.objogate.wl.swing.driver.ComponentDriver;
import com.objogate.wl.swing.driver.JFrameDriver;
import com.objogate.wl.swing.gesture.GesturePerformer;

public class AuctionSniperDriver extends JFrameDriver {
  public AuctionSniperDriver(final int timeoutMillis) {
    super(
        new GesturePerformer(),
        JFrameDriver.topLevelFrame(
            ComponentDriver.named(Main.MAIN_WINDOW_NAME), ComponentDriver.showingOnScreen()),
        new AWTEventQueueProber(timeoutMillis, 100));
  }

  public void showsSniperStatus(String statusJoining) {}
}
