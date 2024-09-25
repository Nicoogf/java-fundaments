package interfaces;
import javax.swing.*;
import java.awt.event.*;

public class Interfaces extends JFrame implements ActionListener {
    private JTextField textField_one;
    private JTextField textField_two;
    private JLabel label_one;
    private JLabel label_two;
    private JButton button_one;

    public Interfaces() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        label_one = new JLabel("De :");
        label_one.setBounds(15, 10, 100, 30);
        add(label_one);
        
        label_two = new JLabel("Asunto");
        label_two.setBounds(15, 50 , 100, 30);
        add(label_two);
         
        textField_one = new JTextField();
        textField_one.setBounds(80, 16, 190, 20);
        add(textField_one);
        
        textField_two = new JTextField();
        textField_two.setBounds(80, 50, 190, 20);
        add(textField_two);
        
        
        button_one = new JButton("Enviar");
        button_one.setBounds(175, 100, 100, 30);
        add(button_one);
        button_one.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button_one) {            
            JOptionPane.showMessageDialog(null, "Correo enviado exitosamente");
        }
    }

    public static void main(String[] args) { 
        Interfaces form = new Interfaces(); 
        form.setBounds(0, 0, 300, 200);
        form.setVisible(true);
        form.setLocationRelativeTo(null);
    }
}
