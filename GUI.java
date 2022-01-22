import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int count = 0;
    private int boughtCount = 0;
    private JLabel yeetLabel;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JButton buyPhone;


    public GUI() {
        frame = new JFrame();
        JButton button = new JButton("Click me!");
        button.addActionListener(this);
        label = new JLabel("Number of clicks: 0");
        yeetLabel = new JLabel("Bought Items: 0");
        JButton buyPhone = new JButton("Buy a Phone");
        buyPhone.addActionListener(this);
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        panel.add(yeetLabel);
        panel.add(buyPhone);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Clicker Game");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
        if (count > 50) {
            boughtCount++;
            for (int i = 0; i < 50; i++) {
                count--;
            }
            yeetLabel.setText("Bought Items: " + boughtCount);
        }
    }
}
