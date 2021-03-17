/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetothread;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import projetothread.ProjetoThread;
/**
 *
 * @author roger
 */
public class ProjetoThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
//        System.out.println("Thread principal (MAIN)...");
//        System.out.println(Thread.class.getName());
//        Thread.sleep(60000);

        JFrame janela = new JFrame("Multiplicação");
        JTextField primeiro = new JTextField(10);
        JTextField segundo = new JTextField(10);
        JButton botao = new JButton(" = ");
        JLabel resultado = new JLabel ( " ? ");
        
        JPanel painel = new JPanel();
        painel.add(primeiro);
        painel.add(segundo);
        painel.add(botao);
        painel.add(resultado);
        
      //botao.addActionListener(new BotaoDeAcaoTestandoThread(primeiro, segundo, resultado));
        
        janela.add(painel);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setVisible(true);
        
        
        
    }
    
}
