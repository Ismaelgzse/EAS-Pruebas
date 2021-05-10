package model.game;

/**
 * This class represents a runtime exception in model.game.
 * 
 * @author Hector
 *
 */
@SuppressWarnings("serial")
public class GameError extends RuntimeException {

    /**
     * Construct an error.
     * 
     * @param errMsg
     *            --- the error message string
     */
    public GameError(String errMsg) {
        super(errMsg);
    }

}
