import java.util.*;
public class TicTacToe {
	
	Scanner scan = new Scanner(System.in);
	static int winner = 0;	// 0 is a draw; 1 human wins; 2 ai wins
	static int turn;	// 0 human's turn; 1 ai's turn
	
	public static void main(String[] args) {
		Board gameboard = new Board();
		Opponent human = new Opponent();
		PlayerAI ai = new PlayerAI();
		pickStarter();
		while(!gameboard.isFull() && winner==0) {
			switch(turn){
			case 0: humanPlays();
				break;
			case 1: aiPlays();
				break;
			}
			checkWin();
			updateTurn();
		}
		declareWinner();
	}
	
	static void pickStarter() {
		// TODO
	}
	
	static void humanPlays() {
		// TODO
	}
	
	static void aiPlays() {
		// TODO
	}
	
	static void checkWin() {
		// TODO
	}
	
	static void updateTurn() {
		// TODO
	}
	
	static void declareWinner() {
		switch(winner) {
		case 0: System.out.println("This is a draw!");
			break;
		case 1: System.out.println("You win!");
			break;
		case 2: System.out.println("The AI wins!");
		default: break;
		}
	}


}


class Board{
	
	private int[][] board = new int[3][3];
	
	boolean isFull() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}
}


class Opponent{
	
	private int[] move = new int[2];
	
	int[] getNewMove(Scanner scan) {
		move[0] = scan.nextInt();
		move[1] = scan.nextInt();
		return move;
	}
	
}


class PlayerAI{
	
	private int[] move = new int[2];
	
	int[] getNewMove(Board gameboard) {
		move = computeNextMove(gameboard);
		return move;
	}
	
	private int[] computeNextMove(Board gameboard) {
		return null;
	}
}
