import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;


class CalculadoraChafa extends JFrame implements ActionListener{
	
	
	
	String guardado = "";
	int operacion = 0;
	
	JTextField entrada = new JTextField();
	
	JButton btnSumar = new JButton("+");
	JButton btnRestar = new JButton("_");
	JButton btnX = new JButton("X");
	JButton btnDividir = new JButton("/");
	JButton btnResi = new JButton("%");
	JButton btn1X = new JButton("1/x");
	JButton btnPow = new JButton("x^2");
	JButton btnRaiz = new JButton("RAIZ");
	JButton btnBorrar = new JButton("<=");
	JButton btnC = new JButton("CE");
	JButton btnIgual = new JButton("=");
	
	JButton b0 = new JButton("0");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton btnpunto= new JButton(".");
	
	
	public CalculadoraChafa() {
		getContentPane().setLayout(null);
		setSize(417,400);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Calculadora");
		
		setVisible(true);
		
	
		entrada.setBounds(0, 0, 400, 30);
		add(entrada);
		
		btnResi.setBounds(0, 30, 100, 30);
		add(btnResi);
		btnResi.addActionListener(this);
		
		btnC.setBounds(100, 30, 100, 30);
		add(btnC);
		btnC.addActionListener(this);
		
		btnBorrar.setBounds(200, 30, 200, 30);
		add(btnBorrar);
		btnBorrar.addActionListener(this);
		
		btn1X.setBounds(0, 60, 100, 30);
		add(btn1X);
		btn1X.addActionListener(this);
		
		btnPow.setBounds(100, 60, 100, 30);
		add(btnPow);
		btnPow.addActionListener(this);
		
		btnRaiz.setBounds(200, 60, 100, 30);
		add(btnRaiz);
		btnRaiz.addActionListener(this);
		
		btnDividir.setBounds(300, 60, 100, 30);
		add(btnDividir);
		btnDividir.addActionListener(this);
		
		b7.setBounds(0, 90, 100, 30);
		add(b7);
		b7.addActionListener(this);
		
		b8.setBounds(100, 90, 100, 30);
		add(b8);
		b8.addActionListener(this);
		
		b9.setBounds(200, 90, 100, 30);
		add(b9);
		b9.addActionListener(this);
		
		btnX.setBounds(300, 90, 100, 30);
		add(btnX);
		btnX.addActionListener(this);
		
		b4.setBounds(0, 120, 100, 30);
		add(b4);
		b4.addActionListener(this);
		
		b5.setBounds(100, 120, 100, 30);
		add(b5);
		b5.addActionListener(this);
	
		b6.setBounds(200, 120, 100, 30);
		add(b6);
		b6.addActionListener(this);
		
		btnRestar.setBounds(300, 120, 100, 30);
		add(btnRestar);
		btnRestar.addActionListener(this);
		
		b1.setBounds(0, 150, 100, 30);
		add(b1);
		b1.addActionListener(this);
		
		b2.setBounds(100, 150, 100, 30);
		add(b2);
		b2.addActionListener(this);
		
		b3.setBounds(200, 150, 100, 30);
		add(b3);
		b3.addActionListener(this);
		
		btnSumar.setBounds(300, 150, 100, 30);
		add(btnSumar);
		btnSumar.addActionListener(this);
	
		b0.setBounds(0, 180, 150, 30);
		add(b0);
		b0.addActionListener(this);
		
		btnpunto.setBounds(150, 180, 100, 30);
		add(btnpunto);
		btnpunto.addActionListener(this);
		
		btnIgual.setBounds(250, 180, 150, 30);
		add(btnIgual);
		btnIgual.addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==b0) {entrada.setText(entrada.getText()+'0');
		}else if(e.getSource()==b1) {entrada.setText(entrada.getText()+'1');
		}else if(e.getSource()==b2) {entrada.setText(entrada.getText()+'2');
		}else if(e.getSource()==b3) {entrada.setText(entrada.getText()+'3');
		}else if(e.getSource()==b4) {entrada.setText(entrada.getText()+'4');
		}else if(e.getSource()==b5) {entrada.setText(entrada.getText()+'5');
		}else if(e.getSource()==b6) {entrada.setText(entrada.getText()+'6');
		}else if(e.getSource()==b7) {entrada.setText(entrada.getText()+'7');
		}else if(e.getSource()==b8) {entrada.setText(entrada.getText()+'8');
		}else if(e.getSource()==b9) {entrada.setText(entrada.getText()+'9');
		
		/* RESIDUO 			=> 1
		 * DIVISION	 		=> 2
		 * MULTIPLICACION 	=> 3
		 * RESTA 			=> 4
		 * SUMA 			=> 5
		 * NULO 			=> 0
		 */
		
		}else if(e.getSource()==btnResi) {
			operacion=1;
			guardado=entrada.getText();
			entrada.setText("");
			
		}else if(e.getSource()==btnC) {
			operacion=0;
			guardado="";
			entrada.setText("");
			
		}else if(e.getSource()==btnBorrar) {
			if (entrada.getText().length()>0) {
				//Se toma lo que hay como etrada, y establece la entrada menos el ultimo caracter
				entrada.setText(entrada.getText().substring(0, entrada.getText().length()-1)); 
			}
			
		}else if(e.getSource()==btn1X) {
			if (entrada.getText().length()>0) {
				double resul=Double.parseDouble(entrada.getText());
				//Se revisa que denominador sea diferente de sero
				if (resul!=0) {
					resul=1/resul;
					entrada.setText(String.valueOf(resul));
				}
			}
		}else if(e.getSource()==btnPow) {
			if (entrada.getText().length()>0) {
				Double resul=Double.parseDouble(entrada.getText());
				resul = Math.pow(resul, 2);
				entrada.setText(String.valueOf(resul));
			}
		}else if(e.getSource()==btnRaiz) {
			if (entrada.getText().length()>0) {
				Double resul=Double.parseDouble(entrada.getText());
				if (resul>0) {
					resul = Math.sqrt(resul);
					entrada.setText(String.valueOf(resul));
				}
			}
		}else if(e.getSource()==btnDividir) {
			guardado = entrada.getText();
			operacion=2;
			entrada.setText("");
			
		}else if(e.getSource()==btnX) {
			guardado = entrada.getText();
			operacion=3;
			entrada.setText("");
			
		}else if(e.getSource()==btnRestar) {
			guardado = entrada.getText();
			operacion=4;
			entrada.setText("");
			
		}else if(e.getSource()==btnSumar) {
			guardado = entrada.getText();
			operacion=5;
			entrada.setText("");
			
		}else if(e.getSource()==btnpunto) {
			if (!entrada.getText().contains(".")) {
				entrada.setText(entrada.getText()+'.');
			}
			
			
			
		}else if(e.getSource()==btnIgual) {
			if(operacion!=0) {
				double n1 = Double.parseDouble(guardado);
				double n2 = Double.parseDouble(entrada.getText());
				double r = 0;
				switch (operacion) {
				case 5:
					r=n1+n2;
					break;
				case 4:
					r=n1-n2;
					break;
				case 3:
					r=n1*n2;
						break;
				case 2:
					r=n1/n2;
					break;
				case 1:
					r=n1%n2;
					break;
				default:
					break;
				}
				entrada.setText(String.valueOf(r));
			}
		}
		
	}
	
}



public class PruebaCalculadora {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new CalculadoraChafa();
			}
		});

	}

}
