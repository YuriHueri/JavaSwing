import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends Result{
    public static void main(String[] args) {

        JFrame frame = new JFrame("Addition Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelTitle = new JPanel(new FlowLayout());
        JPanel panelOne = new JPanel(new GridLayout(2,3,9,9));
        JPanel panelTwo = new JPanel(new FlowLayout());
        JButton button = new JButton("Equals");

        panelTitle.setBackground(Color.LIGHT_GRAY);

        panelTitle.setBounds(50,10,320,30);
        panelOne.setBounds(30,60,350,80);
        panelTwo.setBounds(30,200,350,80);

        JLabel labelOne, labelTwo, labelTitle;

        JTextField tFieldOne, tFieldTwo;
        tFieldOne = new JTextField(15);
        tFieldOne.setPreferredSize(new Dimension(100,40));
        tFieldTwo = new JTextField(15);
        tFieldTwo.setPreferredSize(new Dimension(100,40));

        labelTitle = new JLabel("Input Integers:", JLabel.CENTER);
        labelOne = new JLabel("1st Integers");
        labelTwo = new JLabel("2nd Integers");


        labelTitle.setBounds(10,10,80,20);
        labelOne.setBounds(10,10,80,20);
        tFieldOne.setBounds(5, 5, 100, 100);
        labelTwo.setBounds(10,10,70,20);
        tFieldTwo.setBounds(5, 5, 90, 100);

        panelTitle.add(labelTitle);

        panelOne.add(labelOne);
        panelOne.add(tFieldOne);
        panelOne.add(labelTwo);
        panelOne.add(tFieldTwo);

        button.setBounds(60,10,90,20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = computeValue(tFieldOne.getText(),tFieldTwo.getText());
                displayMessage(String.valueOf(result));
            }
        });

        panelTwo.add(button);

        frame.add(panelTitle);
        frame.add(panelOne);
        frame.add(panelTwo);


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;


        frame.setSize(430,290);
        frame.setResizable(false);
        frame.setLayout(null);


        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}