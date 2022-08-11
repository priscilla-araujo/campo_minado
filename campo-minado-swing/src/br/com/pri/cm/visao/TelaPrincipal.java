package br.com.pri.cm.visao;

import javax.swing.JFrame;

import br.com.pri.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
	
	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(20, 40, 20);
		add(new PainelTabuleiro(tabuleiro));
		
		setTitle("Campo Minado - by Pri ♥");
		setSize(900, 600); 
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new TelaPrincipal();
		
	}

}
