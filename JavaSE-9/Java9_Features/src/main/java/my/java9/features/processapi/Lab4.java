package my.java9.features.processapi;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Use Case-4: To create and Start a process by using ProcessBuilder
 * Get any process id.
 * $ ps ax
 */
public class Lab4 {

    public static void main(String[] args) {

        Frame f = new Frame();
        f.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.add(new Label("This Process Started from Java by using ProcessBuilder !!!"));
        f.setSize(500, 500);
        f.setVisible(true);
    }
}