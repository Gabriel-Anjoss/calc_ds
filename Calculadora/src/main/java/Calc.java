import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calc extends JFrame{
    
    JButton Somar,Subtrair,Multiplicar,Dividir,Habilitar,Desabilitar,Exibir,Ocultar,Limpar,Sair;
    JLabel num1,num2,nome,result;
    JTextField valor1,valor2;        
    
    public Calc(){
   
      super("Calc");
      setSize(600,450);
      setResizable(false);
      setLayout(null);
      Container  tela =  getContentPane();
      
      
      num1 = new JLabel ("1° Número:");
      num1.setBounds(30, 20,100, 20);
      
      num2 = new JLabel ("2° Número:");
      num2.setBounds(30, 60,100, 20); 
      
      result = new JLabel ("");
      result.setBounds(50,100,250,20);
      
      valor1 = new JTextField(5);
      valor1.setBounds(100,20,200,20);
      
      valor2 = new JTextField(5);
      valor2.setBounds(100,60,200,20);
      
      Somar = new JButton("+");
      Somar.setBounds(450,20,100,25);
      
      Subtrair = new JButton("-");
      Subtrair.setBounds(450,60,100,25);
      
      Multiplicar = new JButton("X");
      Multiplicar.setBounds(450,100,100,25);
      
      Dividir = new JButton("/");
      Dividir.setBounds(450,140,100,25);
      
      Habilitar = new JButton("Habilitar");
      Habilitar.setBounds(30,200,100,25);
      
      Desabilitar = new JButton("Desabilitar");
      Desabilitar.setBounds(130,200,100,25);
      
      Exibir = new JButton("Exibir");
      Exibir.setBounds(230,200,100,25);     
      
      Ocultar = new JButton("Ocultar");
      Ocultar.setBounds(330,200,100,25);
      
      Limpar = new JButton("Limpar");
      Limpar.setBounds(430,200,100,25); 
      
      Sair = new JButton("Sair");
      Sair.setBounds(240,350,100,20);
      
      nome = new JLabel ("Desenvolvido pelo aluno Gabriel Anjos do 2ºAno de AMS/ADS");
      nome.setBounds(110, 300, 2000, 20);
      
      Somar.setMnemonic(KeyEvent.VK_S);
      Multiplicar.setMnemonic(KeyEvent.VK_M);
     
      
        Somar.addActionListener((ActionEvent e) -> {
          int num1 = Integer.parseInt(valor1.getText());
          int num2 = Integer.parseInt(valor2.getText());
          int re = num1+num2;
          
          result.setVisible(true);
          result.setText("O Resultado é: " +re);
      });
        
        Subtrair.addActionListener((ActionEvent e) -> {
          int num1 = Integer.parseInt(valor1.getText());
          int num2 = Integer.parseInt(valor2.getText());
          int re = num1-num2;
          
          result.setVisible(true);
          result.setText("O Resultado é: " +re);
      });
        
        
        Multiplicar.addActionListener((ActionEvent e) -> {
          int num1 = Integer.parseInt(valor1.getText());
          int num2 = Integer.parseInt(valor2.getText());
          int re = num1*num2;
          
          result.setVisible(true);
          result.setText("O Resultado é: " +re);
      });
        
        
         Dividir.addActionListener((ActionEvent e) -> {
          int num1 = Integer.parseInt(valor1.getText());
          int num2 = Integer.parseInt(valor2.getText());
          int re = num1/num2;
          
          result.setVisible(true);
          result.setText("O Resultado é: " +re);
      });
        
      
         
       Habilitar.addActionListener((ActionEvent e) -> {
          result.setEnabled(true);
      });
       
       Desabilitar.addActionListener((ActionEvent e) -> {
          result.setEnabled(false);
      });
      
       
       Exibir.addActionListener((ActionEvent e) -> {
          result.setVisible(true);
      });
       
       
        Ocultar.addActionListener((ActionEvent e) -> {
          result.setVisible(false);
      });
       
      
      Sair.addActionListener((ActionEvent e) -> {
          System.exit(0);
      });
      
      Limpar.addActionListener((ActionEvent e) -> {
          valor1.setText("");
          valor2.setText("");
      });
      
    
      tela.add(nome);     
      tela.add(num1);
      tela.add(num2);
      tela.add(result);
      
      tela.add(valor1);
      tela.add(valor2);
      
      tela.add(Somar);
      tela.add(Subtrair);
      tela.add(Multiplicar);
      tela.add(Dividir);
      
      tela.add(Exibir);
      tela.add(Ocultar);    
      
      tela.add(Habilitar);
      tela.add(Desabilitar);
      
      tela.add(Limpar);
      tela.add(Sair);
      
      
      
      setLocationRelativeTo(null);
      setVisible(true);
    }
    
    public static void main(String [] args){
        Calc app = new Calc();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


