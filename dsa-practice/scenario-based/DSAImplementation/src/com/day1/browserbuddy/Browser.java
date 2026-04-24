package com.day1.browserbuddy;

import java.util.Stack;

class Browser {
    private BrowserTab activeTab = new BrowserTab();
    private Stack<BrowserTab> closedTabs = new Stack<>();

    BrowserTab getActiveTab() {
        return activeTab;
    }

    // Close current tab
    void closeTab() {
        closedTabs.push(activeTab);
        activeTab = new BrowserTab();
        System.out.println("Tab closed");
    }

    // Restore recently closed tab
    void restoreTab() {
        if (!closedTabs.isEmpty()) {
            activeTab = closedTabs.pop();
            System.out.println("Tab restored at: " + activeTab.getCurrentPage());
        } else {
            System.out.println("No closed tabs to restore");
        }
    }
}
