/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_year_fireworks2;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class fwframe extends JFrame{
	int width = 500, height = 500;
	public fwframe(){
		setSize(width, height);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		// get content
		getContentPane().add(new fwpanel(width, height), BorderLayout.CENTER);
	}
	public static void main(String args[]) {
		new fwframe();
	}
}