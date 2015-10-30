package ro.alex.view;

import javax.swing.JButton;

public class BoardPiece extends JButton {

	private static final long serialVersionUID = 1L;

	public BoardPiece(int number) {
		if (number < 0 || number > 8) {
			throw new IllegalArgumentException("The board piece number can not be grater than 8 or smaller than 0");
		}
		this.number = number;
		this.setSize(50, 50);
		this.setText("");
	}

	private int number;
	private final String PLAYER1 = "X";
	private final String PLAYER2 = "O";

	public String getPlayer1() {
		return PLAYER1;
	}

	public String getPlayer2() {
		return PLAYER2;
	}

	public String getBoardPieceStatus() {
		return this.getText();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
