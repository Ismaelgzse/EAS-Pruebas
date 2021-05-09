package model.tile;

/**
 * This class represents a model.tile inside a room. It mainly is used to hold weapon and
 * character tokens for displaying them on GUI or text-based ui.
 * 
 * @author Hector
 *
 */
public class RoomTile extends Room {

    /**
     * coordinates;
     */
    private int x, y;
    /**
     * if this model.tile is holding a token
     */
    private boolean isHoldingToken;

    /**
     * Construct a RoomTile object.
     * 
     * @param room
     *            --- which room is this model.tile in
     * @param x
     *            --- the horizontal coordinate
     * @param y
     *            --- the vertical coordinate
     */
    public RoomTile(Room room, int x, int y) {
        super(room.getRoom(), room.getSecPasTo());
        this.x = x;
        this.y = y;
        isHoldingToken = false;
    }

    /**
     * Get x.
     * 
     * @return --- x
     */
    public int getX() {
        return x;
    }

    /**
     * Get y.
     * 
     * @return --- y
     */
    public int getY() {
        return y;
    }

    /**
     * Is this model.tile holding (displaying) a token?
     * 
     * @return --- true if it is holding a token, or false if not
     */
    public boolean isHoldingToken() {
        return isHoldingToken;
    }

    /**
     * Let the model.tile know it is holding a token or not.
     * 
     * @param isHoldingToken
     *            --- true if it is holding a token, or false if not
     */
    public void setHoldingToken(boolean isHoldingToken) {
        this.isHoldingToken = isHoldingToken;
    }
}
