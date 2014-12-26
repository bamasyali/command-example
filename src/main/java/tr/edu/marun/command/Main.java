/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import org.reflections.Reflections;
import tr.edu.marun.command.button.Button;
import tr.edu.marun.command.button.decorator.impl.IndexedButton;

/**
 *
 * @author bamasyali
 */
public class Main {

    private static Set<Class<? extends Button>> getButtonClasses() {
        Reflections reflections = new Reflections("tr.edu.marun.command.button.impl");
        return reflections.getSubTypesOf(Button.class);
    }

    public static List<IndexedButton> getIndexedButtons(Set<Class<? extends Button>> buttonClassSet) throws InstantiationException, IllegalAccessException {
        List<IndexedButton> indexedButtonList = new ArrayList<>();

        Integer index = 1;
        for (Class<? extends Button> buttonClass : buttonClassSet) {
            indexedButtonList.add(new IndexedButton(index, buttonClass.newInstance()));
            index++;
        }

        return indexedButtonList;
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        Set<Class<? extends Button>> buttonClassSet = getButtonClasses();
        List<IndexedButton> indexedButtonList = getIndexedButtons(buttonClassSet);

        Iterator<IndexedButton> buttonIterator = indexedButtonList.iterator();
        while (buttonIterator.hasNext()) {
            IndexedButton button = buttonIterator.next();
            System.out.println(button.getIndex() + " " + button.getName());
        }

        System.out.print("Buton Seçiniz:");
        Scanner in = new Scanner(System.in);
        Integer index = in.nextInt();

        buttonIterator = indexedButtonList.iterator();
        while (buttonIterator.hasNext()) {
            IndexedButton button = buttonIterator.next();
            if (index.equals(button.getIndex())) {
                button.run();
                break;
            }
        }

    }

}
