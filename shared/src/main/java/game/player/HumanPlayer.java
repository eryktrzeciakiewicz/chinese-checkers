package game.player;

import game.board.field.FieldColor;

public final class HumanPlayer extends AbstractPlayer {

    public HumanPlayer(FieldColor playerColor) {
        homeColor = playerColor;
        enemyColor = FieldColor.getEnemy(playerColor);
    }

    @Override
    public boolean isBot() {
        return false;
    }
}