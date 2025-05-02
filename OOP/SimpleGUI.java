import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SimpleGUI extends JFrame {

    private JTextField inputField;
    private JTextField outputField;
    private JButton processButton;

    public SimpleGUI() {
        createView();

        setTitle("Simple GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel inputLabel = new JLabel("Input:");
        panel.add(inputLabel);

        inputField = new JTextField();
        panel.add(inputField);

        JLabel outputLabel = new JLabel("Output:");
        panel.add(outputLabel);

        outputField = new JTextField();
        outputField.setEditable(false);
        panel.add(outputField);

        processButton = new JButton("Process");
        processButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                String output = processInput(input);
                outputField.setText(output);
            }
        });
        panel.add(processButton);
    }

    private String processInput(String input) {
        // Example processing: Reverse the input string
        return new StringBuilder(input).toString();
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleGUI().setVisible(true);
            }  
        });
        System.out.println("GUI Done");
    }
}
