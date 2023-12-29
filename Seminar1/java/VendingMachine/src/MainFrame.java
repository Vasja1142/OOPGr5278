import Domain.Product;
import Services.VendingMachine;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame {
    
    VendingMachine vendingMachine;
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField many, tfLastName;
    
    
    JLabel lbWelcome;

    public MainFrame(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
    public void initialize() {

        JLabel lbPrice = new JLabel("Введите цену");
        lbPrice.setFont(mainFont);

        many = new JTextField();
        many.setFont(mainFont);


        JPanel formPanel = new JPanel();
        JPanel formPanel2 = new JPanel();

        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel2.setLayout(new GridLayout(10, 1, 5, 5));

        for (Product p : vendingMachine.getAssort()) {
            StringBuilder str = new StringBuilder();
            str.append(p.getName());
            str.append(" - ");
            str.append(p.getPrice());
            JLabel lbAssort = new JLabel(str.toString());
            lbAssort.setFont(mainFont);
            formPanel2.add(lbAssort);
        }

        formPanel.add(lbPrice);
        formPanel.add(many);

        
        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        
        
        JButton btnOk = new JButton("Pay");
        btnOk.setFont(mainFont);
        btnOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String manyText  = many.getText();

                lbWelcome.setText("Вы заплатили: " + manyText + " p.");
                
                
            }

        });

       
        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
                many.setText("");
                many.setText("");
                lbWelcome.setText("");
                
            }

        });

        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonPanel.add(btnOk);
        buttonPanel.add(btnClear);

        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));

        mainPanel.add(formPanel2, BorderLayout.NORTH);
        mainPanel.add(formPanel, BorderLayout.WEST);

        
        mainPanel.add(lbWelcome, BorderLayout.CENTER);

        
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

       
        add(mainPanel);

        
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        formPanel.setOpaque(false);
        buttonPanel.setOpaque(false);

        
        setTitle("VendingMachines");
        setSize(800, 600);
        setMaximumSize(new Dimension(800, 600));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
