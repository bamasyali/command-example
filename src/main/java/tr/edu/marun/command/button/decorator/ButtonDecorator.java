/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.command.button.decorator;

import tr.edu.marun.command.button.Button;

/**
 *
 * @author bamasyali
 */
public class ButtonDecorator implements Button {

    protected final Button button;

    public ButtonDecorator(Button button) {
        this.button = button;
    }

    @Override
    public String getName() {
        return button.getName();
    }

    @Override
    public void run() {
        button.run();
    }

}
