package calcEight;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import java.awt.TextArea;
import java.awt.Toolkit;

public class index extends JFrame {

	private JPanel contentPane;
	private JTextField textMin;
	private JTextField textMax;
	private JTextField textMult;
	private JPanel panel_2;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index frame = new index();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public index() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(index.class.getResource("/calcEight/ico.png")));
		setFont(new Font("Ubuntu", Font.PLAIN, 14));
		setResizable(false);
		setType(Type.POPUP);
		setBackground(new Color(34,34,34));
		setTitle("CalcMult");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 500);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(34, 34, 34));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0,0));
		panel.setBounds(0, 0, 284, 284);
		contentPane.add(panel);
		panel.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		textArea.setBounds(10, 11, 264, 263);
		panel.add(textArea);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(68,68,68));
		panel_1.setBounds(0, 285, 284, 120);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textMin = new JTextField();
		textMin.setToolTipText("Definir numero de Inicio.");
		textMin.setHorizontalAlignment(SwingConstants.LEFT);
		textMin.setForeground(new Color(68, 68, 68));
		textMin.setText("0");
		textMin.setFont(new Font("Ubuntu", Font.PLAIN, 16));
		textMin.setBounds(10, 11, 86, 40);
		textMin.setBackground(new Color(221, 221, 221));
		panel_1.add(textMin);
		textMin.setColumns(10);
		
		textMax = new JTextField();
		textMax.setToolTipText("Definir Numero de Termino");
		textMax.setHorizontalAlignment(SwingConstants.LEFT);
		textMax.setText("80");
		textMax.setForeground(new Color(68, 68, 68));
		textMax.setFont(new Font("Ubuntu", Font.PLAIN, 16));
		textMax.setBounds(106, 11, 86, 40);
		textMax.setBackground(new Color(221, 221, 221));
		panel_1.add(textMax);
		textMax.setColumns(10);
		
		JButton btnResult = new JButton("=");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        
				int numMin = Integer.parseInt(textMin.getText());
				int numMax = Integer.parseInt(textMax.getText());
				int numMult = Integer.parseInt(textMult.getText());
		        String num = "";
		        
		        for(int i=numMin; i<=numMax; i++){
		            		            
		            if(i % numMult == 0){
		                num = num+i+"; \n";
		            }
		            
		        }
		        
		        textArea.setText(num);
		       
			}
		});
		btnResult.setForeground(new Color(68, 68, 68));
		btnResult.setFont(new Font("Ubuntu", Font.PLAIN, 24));
		btnResult.setBounds(202, 11, 72, 91);
		btnResult.setBackground(new Color(221, 221, 221));
		panel_1.add(btnResult);
		
		textMult = new JTextField();
		textMult.setToolTipText("Definir numero multiplo");
		textMult.setHorizontalAlignment(SwingConstants.LEFT);
		textMult.setText("8");
		textMult.setForeground(new Color(68, 68, 68));
		textMult.setBackground(new Color(221, 221, 221));
		textMult.setFont(new Font("Ubuntu", Font.PLAIN, 16));
		textMult.setBounds(10, 62, 182, 40);
		panel_1.add(textMult);
		textMult.setColumns(10);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(68,68,68));
		panel_2.setBounds(0, 405, 284, 56);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(index.class.getResource("/calcEight/ic_logo.png")));
		lblNewLabel.setBounds(154, 11, 120, 34);
		panel_2.add(lblNewLabel);
	}
}
