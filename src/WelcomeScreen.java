
import java.awt.event.ActionEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Clase WelcomeScreen
 *
 * Contiene pantalla de bienvenida
 *
 * @author Mayra
 * @version 1.0
 */
public class WelcomeScreen extends JPanel {

    //Atributos
    /**
     * title go quit mw
     */
    JLabel title;
    JButton go;
    JButton quit;

    MainWindow mw;

    /**
     *
     * @param t
     */
    public void setTitle(String t) {
        title.setText(t);
    }

    public void quitButtonActionListener() {
        if (JOptionPane.showConfirmDialog(this, ARE_YOU_SURE) == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }
    private static final String ARE_YOU_SURE1 = "Are you sure?";
    private static final String ARE_YOU_SURE = ARE_YOU_SURE1;
    private static final String NEW__GAME1 = "New Game";
    private static final String NEW__GAME = NEW__GAME1;
    private static final String QUIT1 = "Quit";
    private static final String QUIT = QUIT1;

    public void goButtonActionListener() {
        mw.showCard("Two");
    }

    /**
     *
     * @param mw
     */
    public WelcomeScreen(MainWindow mw) {
        this.mw = mw;

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        title = new JLabel();
        add(title);

        //add formatting here
        go = new JButton(NEW__GAME);
        quit = new JButton(QUIT);

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
