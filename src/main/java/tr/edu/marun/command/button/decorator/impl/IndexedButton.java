/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.command.button.decorator.impl;

import tr.edu.marun.command.button.Button;
import tr.edu.marun.command.button.decorator.ButtonDecorator;

/**
 *
 * @author bamasyali
 */
public class IndexedButton extends ButtonDecorator {

    private final Integer index;

    public IndexedButton(Integer index, Button button) {
        super(button);
        this.index = index;
    }

    public Integer getIndex() {
        return index;
    }

}
