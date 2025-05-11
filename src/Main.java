import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Main {
   
    public static void main(String[] args) throws Exception{
        
        JFrame frame = new JFrame();
        
        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        
        Font font = new Font("Times New Roman", Font.ITALIC, 15);
        
        JLabel labelinter = new JLabel("Interface test");
        labelinter.setFont(font);
        labelinter.setBounds(300, 50, 100, 20);

        JLabel labelresult = new JLabel("Result");
        labelresult.setFont(font);
        labelresult.setBounds(315, 310, 100, 20);
       

        JTextField textfieldinter = new JTextField();
        textfieldinter.setBounds(315, 200, 50, 20);


        JButton butao = new JButton("PESQUISAR");
        butao.setBounds(315, 250, 50, 20);
        butao.addActionListener((ActionEvent e) -> {
            System.out.println("Teste função");
            labelresult.setText("alterado");
        });

        frame.add(labelinter);
        frame.add(textfieldinter);
        frame.add(butao);
        frame.add(labelresult);
        frame.setVisible(true);
    }
}
