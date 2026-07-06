
package conversormoedas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ConversorMoedas {

   
    public static void main(String[] args) {
       JFrame tela = new JFrame("Conversor de Moedas");
       tela.setLayout(null);
       tela.setSize(600, 600);
       tela.getContentPane().setBackground(new Color(213, 177, 236));
       tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
       JLabel titulo = new JLabel("Conversor de Moedas");
       titulo.setFont(new Font("Times New Roman", Font.BOLD, 35));
       titulo.setBounds(125, 40, 350, 40);
       titulo.setForeground(Color.black);
       tela.add(titulo);
       
       JLabel para = new JLabel("Converter para:");
       para.setFont(new Font("Times New Roman", Font.BOLD, 16));
       para.setBounds(200, 265, 250, 40);
       para.setForeground(Color.black);
       tela.add(para);
       
       JLabel dica = new JLabel("Valor a ser convertido:");
       dica.setFont(new Font("Times New Roman", Font.BOLD, 16));
       dica.setBounds(90, 155, 450, 40);
       dica.setForeground(Color.black);
       tela.add(dica);
       
       JLabel tot = new JLabel("Total:");
       tot.setFont(new Font("Times New Roman", Font.BOLD, 16));
       tot.setBounds(260, 365, 120, 40);
       tot.setForeground(Color.black);
       tela.add(tot);
       
       
       
       JTextField caixa1 = new JTextField();
       caixa1.setBounds(90, 190, 80, 30);
       
       JTextField caixa2 = new JTextField();
       caixa2.setBounds(260, 400, 80, 30);
       caixa2.setBorder(null);
       
       String selecao[] = {"Real Brasileiro", "Dolar", "Euro", "Libra", "Peso Argentino", "Bolivares Soberanos", "Yen", "Peso Uruguaio", "Kwanza Angolano"};
       double valor[] = {5.36, 1, 0.8, 0.75, 1437.50, 219.35, 154, 39.81, 917}; 
       String simbolo[] = {"R$", "US$", "€", "£", "$", "Bs.S", "¥", "$U", "AOA"};
      

       
               
       JComboBox<String> moeda1 = new JComboBox<>(selecao);
       moeda1.setBounds(200, 190, 250, 30);
       
       
       JComboBox<String> moeda2 = new JComboBox<>(selecao);
       moeda2.setBounds(200, 300, 250, 30);
       
       
       JButton botao = new JButton("Converter");
       botao.setBounds(450, 450, 100, 20);
       
               
       
          botao.addActionListener(new ActionListener() {
        @Override
        
            public void actionPerformed(ActionEvent e) {
                int index1 = moeda1.getSelectedIndex(); // índice do item selecionado
                double taxa1 = valor[index1];           // pega o valor correspondente
                int index2 = moeda2.getSelectedIndex(); 
                double taxa2 = valor[index2];           
                double quant = Double.parseDouble(caixa1.getText().trim());
                double total;
                total = (quant * (taxa2 / taxa1));
                String resultado = String.format("%.2f", total);
                String simboloEscolhido = simbolo[index2];
                caixa2.setText(" "+simboloEscolhido+" "+resultado);
            }   
           
            
        
    });
            
        
              
          
      tela.add(botao);
      tela.add(moeda1);
      tela.add(moeda2);
      tela.add(caixa1);
      tela.add(caixa2);
      tela.setVisible(true);
    }
    
}
