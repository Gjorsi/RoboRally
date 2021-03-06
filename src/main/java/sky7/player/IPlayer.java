package sky7.player;

import sky7.card.ICard;

import java.util.ArrayList;

public interface IPlayer {

    /**
     * Subtract damage from players health
     *
     * @param damage integer representing damage
     */
    void applyDamage(int damage);

    /**
     * Add health to players health
     *
     * @param applyHealth integer representing health
     */
    void repairDamage(int applyHealth);

    /**
     * Update damage with totalDamage
     *
     * @param totalDamage the new total damage status of this player/robot.
     */
    void updateDamage(int totalDamage);

    /**
     * @return a list of cards chosen by player
     */
    ICard[] getRegistry();

    /**
     * @param programCards the program cards the player can choose from.
     */
    void setHand(ArrayList<ICard> programCards);

    /**
     * Clear the registry
     */
    void clearRegistry();

    /**
     * @return the hand that the player was dealt.
     */
    ArrayList<ICard> getHand();

    /**
     * @return the id of this player
     */
    public int getPlayerNumber();

    /**
     * @param playerNumber the id of this player.
     */
    void setPlayerNumber(int playerNumber);

    /**
     * @return the card not chosen by the player.
     */
    ArrayList<ICard> getDiscard();

    /**
     * Put in the register a new chosen card at a position.
     *
     * @param chosenCard         the card that the player chose
     * @param positionInRegistry the position of the card in the registry.
     */
    void setCard(ICard chosenCard, int positionInRegistry);

    /**
     * @return players damage
     */
    int getDamage();

    /**
     * @return life tokens
     */
    int getLifeToken();

    /**
     * @return number of locked card
     */
    int getNLocked();

	void resetRegistry();

	ICard[] getLockedRegistry();

    /**
     * Check if this lose a life token.
     *
     * @return true if this lose a life token, false otherwise.
     */
    boolean loseLifeToken();

    /**
     * @return chosen registry
     */
    ArrayList<ICard> getChosenRegistry();
}
