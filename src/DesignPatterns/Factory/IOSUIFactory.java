package DesignPatterns.Factory;

import DesignPatterns.Factory.components.button.Button;
import DesignPatterns.Factory.components.button.IOSButton;
import DesignPatterns.Factory.components.dropdown.Dropdown;
import DesignPatterns.Factory.components.dropdown.IOSDropdown;
import DesignPatterns.Factory.components.menu.IOSMenu;
import DesignPatterns.Factory.components.menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
