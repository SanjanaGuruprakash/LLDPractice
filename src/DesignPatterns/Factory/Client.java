package DesignPatterns.Factory;

import DesignPatterns.Factory.components.button.Button;

public class Client {
    public static void main(String[] args) {
    Flutter flutter = new Flutter(SupportedPlatforms.ANDROID);
    UIFactory uiFactory= flutter.getFactory();

        Button button = uiFactory.createButton();
        button.changeSize();

    }
}

