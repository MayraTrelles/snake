
import java.util.Random;

/**
 * Clase Portal
 *
 * Contiene informacion de pantalla
 *
 * @author Mayra
 * @version 1.0
 */
public class Portal {

    //Atributos
    /**
     * nature start end
     */
    private final int nature;
    private final int start;
    private final int end;

    /**
     *
     * @param maxCells
     */
    public Portal(int maxCells) {
        Random luck = new Random();
        start = luck.nextInt(maxCells);
        end = luck.nextInt(maxCells);
        if (start < end) {
            nature = 1;
        } else {
            nature = -1;
        }
    }

    /**
     *
     * @return
     */
    public int returnNature() {
        return nature;
    }

    /**
     *
     * @return
     */
    public int returnStart() {
        return start;
    }

    /**
     *
     * @return
     */
    public int returnEnd() {
        return end;
    }

}
