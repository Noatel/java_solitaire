package nl.quintor.solitaire.ui;

import nl.quintor.solitaire.game.moves.Move;
import nl.quintor.solitaire.models.deck.Deck;
import nl.quintor.solitaire.models.state.GameState;


import java.util.Collection;

public class CMD implements UI {

    // Initialize CMD UI
    public CMD(){
        // create field
        GameState gameState = new GameState();

        System.out.println("deck is:");
        System.out.println(Deck.createDefaultDeck());

    }

    public void setMessage(String message) {

    }

    public void setErrorMessage(String message) {

    }

    public void refresh(GameState gameState) {

    }

    public String refreshAndRequestMove(GameState gameState, Collection<Move> moves) {
        return "test";
    }
}
