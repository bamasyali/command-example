/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.command.button;

/**
 *
 * @author bamasyali
 */
public interface Button extends Runnable {

    String getName();

    @Override
    public void run();

}
