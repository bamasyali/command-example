/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.command.button.impl;

import tr.edu.marun.command.button.Button;

/**
 *
 * @author bamasyali
 */
public class DeatchButton implements Button {

    @Override
    public String getName() {
        return "Kapat";
    }

    @Override
    public void run() {
        System.exit(-1);
    }

}
