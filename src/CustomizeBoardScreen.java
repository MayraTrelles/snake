
import java.awt.event.ActionEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//needs massive improvements
/**
 * Clase CustomizeBoardScreen
 *
 * Contiene informacion de dibujar en la pantalla
 *
 * @author Mayra
 * @version 1.0
 */
public class CustomizeBoardScreen extends JPanel {

//Atributos
    /**
     * go quit mw
     */
    JButton go;
    JButton quit;
    MainWindow mw;

    private static final String TWO = "Two";

    public void quitButtonActionListener() {
        mw.showCard(TWO);
    }

    private static final String FOUR = "Four";

    public void goButtonActionListener() {
        mw.showCard(FOUR);
    }

    /**
     *
     * @param mw
     */
    public CustomizeBoardScreen(MainWindow mw) {
        this.mw = mw;

        JLabel mess = new JLabel("Customize Board [Under Construction] ");
        add(mess);

        JLabel uc = new JLabel("Default: 8x8 board with 8 randomly generated snakes/ladders");
        add(uc);

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        go = new JButton("Start Game");
        quit = new JButton("Back");

        go.addActionListener((ActionEvent event) -> {
            goButtonActionListener();
        });

        quit.addActionListener((ActionEvent event) -> {
            quitButtonActionListener();
        });

        add(go);
        add(quit);

    }
}
