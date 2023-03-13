
import java.awt.Color;

/**
 * Clase Player
 *
 * CLASE jugador
 *
 * @author Mayra
 * @version 1.0
 */
public class Player {

    private final String name;
    private int playerPosn;
    private int playerScore;
    private Color playerColor;

    /**
     *
     * @param no
     */
    public Player(int no) {
        name = "Player " + no;
        playerPosn = 0;
    }

    /**
     *
     * @return playerPosn
     */
    public int getPosition() {
        return playerPosn;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param posn
     */
    public void setPosition(int posn) {
        playerPosn = posn;
    }

    /**
     *
     * @param posn
     */
    public void incPosition(int posn) {
        playerPosn += posn;
    }

    /**
     *
     * @param c
     */
    public void setPlayerColor(Color c) {
        playerColor = c;
    }

    /**
     *
     * @return playerColor
     */
    public Color getPlayerColor() {
        return playerColor;
    }

    /**
     *
     * @param a
     */
    public void incPlayerScore(int a) {
        playerScore += a;
    }

    /**
     *
     * @return playerScore
     */
    public int getPlayerScore() {
        return playerScore;
    }

}
