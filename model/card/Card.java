package model.card;

/**
 * This interface represents a model.card in Cluedo model.game. It could be a Character model.card, a Room
 * (Location) model.card, or a weapon model.card.
 * 
 * @author Hector
 *
 */
public interface Card {

    /**
     * This is an alternative version of toString() method which returns a single char
     * String to print a symbol on text-based graphical board.
     * 
     * @return --- a single char String to print a symbol on text-based graphical board.
     */
    public char toStringOnBoard();

}
