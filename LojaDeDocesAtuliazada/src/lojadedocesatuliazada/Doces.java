/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojadedocesatuliazada;

/**
 *
 * @author Aluno
 */
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class Doces extends JFrame{
    
    private JTextField qtd[] = new JTextField[3];
    private JLabel label[] = new JLabel[3];
    private JLabel preco[] = new JLabel[3];
    private GridLayout gridLayout;
    private JButton button;
    
    public Doces(){
        super("Loja de Doces");
        
        gridLayout = new GridLayout(4,3,8,8);
        setLayout(gridLayout);
        
        Icon brigadeiro = new ImageIcon(getClass().getResource("brigadeiro.png"));
        Icon biscoito = new ImageIcon(getClass().getResource("biscoito.png"));
        Icon pudim = new ImageIcon(getClass().getResource("pudim.png"));
        
        label[0] = new JLabel(brigadeiro);
        label[1] = new JLabel(biscoito);
        label[2] = new JLabel(pudim);
        
        
        preco[0] = new JLabel("R$ 15,00");
        preco[1] = new JLabel("R$ 25,00");
        preco[2] = new JLabel("R$ 20,00");
        
        
        qtd[0] = new JTextField();
        qtd[1] = new JTextField();
        qtd[2] = new JTextField();
        
        add(label[0]);
        add(preco[0]);
        add(qtd[0]);
        add(label[1]);
        add(preco[1]);
        add(qtd[1]);
        add(label[2]);
        add(preco[2]);
        add(qtd[2]); 
        
        button = new JButton("enviar");
        add(button);
        
        Handler handler = new Handler();
        
        button.addActionListener(handler);
        
    }  
    private class Handler implements ActionListener{
        int i;
        public void actionPerformed(ActionEvent event){
               if(event.getSource() == button){
                   //JOptionPane.showMessageDialog(null);
                   for(int count = 0; count < 3; count++){
                       String string = getText(qtd[count]);
                       i += Integer.parseInt(string); 
                   }
               }
        }
    }
}