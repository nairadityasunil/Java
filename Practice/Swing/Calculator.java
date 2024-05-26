import javax.swing.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener {
    private JTextField tf1, tf2;
    private JButton addb, subb, mulb;
    private JLabel result;

    public Calculator() {
        setTitle("Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        tf1 = new JTextField();
        tf1.setBounds(20, 20, 100, 30);
        add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(140, 20, 100, 30);
        add(tf2);

        addb = new JButton("Add");
        addb.setBounds(20, 60, 80, 30);
        addb.addActionListener(this);
        add(addb);

        subb = new JButton("Sub");
        subb.setBounds(110, 60, 80, 30);
        subb.addActionListener(this);
        add(subb);

        mulb = new JButton("Mul");
        mulb.setBounds(200, 60, 80, 30);
        mulb.addActionListener(this);
        add(mulb);

        result = new JLabel("");
        result.setBounds(20, 100, 250, 30);
        add(result);

        setVisible(true); // Added to make the frame visible
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int n1 = Integer.parseInt(tf1.getText());
            int n2 = Integer.parseInt(tf2.getText());

            int r = 0;
            if (e.getSource() == addb) {
                r = n1 + n2;
            } else if (e.getSource() == subb) {
                r = n1 - n2;
            } else if (e.getSource() == mulb) {
                r = n1 * n2;
            }

            result.setText("Result : " + r);
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
