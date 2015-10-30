package ro.alex.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private ArrayList<BoardPiece> boardPieces = new ArrayList<BoardPiece>(8);
	private JMenuBar menu = new JMenuBar();
	private JPanel topPanel;
	private JPanel botomPannel;
	private  JMenu fileMenu = new JMenu("File");

	public MainWindow() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Tic Tac Toe Game");
		this.setVisible(true);
		this.setSize(300, 300);
		

		this.topPanel = new JPanel();
		this.botomPannel = new JPanel();
		this.botomPannel.setLayout(new GridLayout(3, 3));
		topPanel.setLayout(new BorderLayout());
		this.menu.add(fileMenu);
		topPanel.add(menu);
		this.setJMenuBar(menu);
		for (int pieces = 0; pieces < 9; pieces++) {
			this.botomPannel.add(new BoardPiece(pieces));
		}
		this.add(topPanel);
		this.add(botomPannel);
	}

	public ArrayList<BoardPiece> getBoardPieces() {
		return boardPieces;
	}

	public void setBoardPieces(ArrayList<BoardPiece> boardPieces) {
		this.boardPieces = boardPieces;
	}

	public static void main(String[] args) {
		MainWindow w = new MainWindow();
	}

}
