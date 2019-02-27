package sky7.game;

import java.util.Stack;

import sky7.board.Board;
import sky7.board.IBoard;
import sky7.card.ICard;
import sky7.host.IHost;

public class Client implements IClient {

    private IBoard board;
    private IHost host;
    private Stack<ICard> hand;
    
    public Client() {
        board = new Board(10,8);
        hand = new Stack<>();
    }

    @Override
    public IBoard gameBoard() {
        return this.board;
    }

    @Override
    public void connect(IHost host) {
        this.host = host;
        
    }

    @Override
    public void getCards(Stack<ICard> draw) {
        hand = draw;
    }

    @Override
    public void temp() {
        System.out.println("player 0 clicked ready");
        host.ready(0, hand, hand);
    }
}