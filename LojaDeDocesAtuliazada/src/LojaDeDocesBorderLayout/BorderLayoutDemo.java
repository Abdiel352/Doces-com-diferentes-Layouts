/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LojaDeDocesBorderLayout;

/**
 *
 * @author abdie
 */
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JOptionPane;
public class BorderLayoutDemo extends JFrame{
    private JTextField qtd[] = new JTextField[3];
    private JLabel label[] = new JLabel[3];
    private JLabel preco[] = new JLabel[3];
    private JButton button;
    private BorderLayout layout;
    
    public BorderLayoutDemo(){
        super("Loja de doces BorderLayout");
        layout = new BorderLayout(5,5);
        setLayout(layout);
        
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
        
        add(label[0],BorderLayout.EAST);
        add(preco[0],BorderLayout.CENTER);
        add(qtd[0],BorderLayout.WEST);
        add(label[1],BorderLayout.EAST);
        add(preco[1],BorderLayout.CENTER);
        add(qtd[1],BorderLayout.WEST);
        add(label[2],BorderLayout.EAST);
        add(preco[2],BorderLayout.CENTER);
        add(qtd[2],BorderLayout.WEST); 
        
    }
    private class Handler implements ActionListener{
        int i;
        public void actionPerformed(ActionEvent event){
               if(event.getSource() == button){
                   //JOptionPane.showMessageDialog(null);
                   for(int count = 0; count < 3; count++){
                       String string = qtd[count].getText();
                       i += Integer.parseInt(string); 
                   }
                   JOptionPane.showMessageDialog(null,"Ficou R$" + i,"",JOptionPane.INFORMATION_MESSAGE);
                   i = 0;
               }
        }
    }
}
