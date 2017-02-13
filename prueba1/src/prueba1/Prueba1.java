/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Alumno
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    JFrame ventana1;
    public static void main(String[] args) {
       JFrame ventana1= new JFrame("Ventana de prueba1");
       ventana1.setSize(320,200);
       ventana1.setVisible(true);
       ventana1.setLayout(new FlowLayout());
       JButton btn1=new JButton("Cerrar");
       btn1.addActionListener(new ActionListener(){
       
           @Override
           public void actionPerformed(ActionEvent e){
           System.exit(0);
           
           }
           
           }
       );
           
      
        // TODO code application logic here
    }
    
    
}
