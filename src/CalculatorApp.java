import javax.swing.*;
import java.awt.*;

public class CalculatorApp extends JFrame {

    private JPanel displayChoicePanel, helpPanel, aboutPanel;
    public CalculatorApp() {
        super("Anh Duc Vu's Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.setLayout(new BorderLayout());
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(true);

        aboutPanel();
        this.add(aboutPanel, BorderLayout.CENTER);

//        displayChoicePanel();
//        this.add(displayChoicePanel);
    }

    private void displayChoicePanel() {
        displayChoicePanel = new JPanel();
        displayChoicePanel.setLayout(new BoxLayout(displayChoicePanel, BoxLayout.Y_AXIS));
        JRadioButton dec = new JRadioButton("dec");
        JRadioButton hex = new JRadioButton("hex");
        JRadioButton oct = new JRadioButton("oct");
        JRadioButton bin = new JRadioButton("bin");
        ButtonGroup group = new ButtonGroup();
        group.add(dec);
        group.add(hex);
        group.add(oct);
        group.add(bin);
        displayChoicePanel.add(dec);
        displayChoicePanel.add(hex);
        displayChoicePanel.add(oct);
        displayChoicePanel.add(bin);
    }

    private void helpPanel() {
        helpPanel = new JPanel();
        helpPanel.setLayout(new BorderLayout());
        StringBuilder sb = new StringBuilder();
    }

    private void aboutPanel() {
        aboutPanel = new JPanel();
        aboutPanel.setLayout(new BorderLayout());

        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<h1>");
        sb.append("ADV Java Calculator");
        sb.append("</h1>");
        sb.append("<h1>");
        sb.append("© 2023 Anh Duc Vu");
        sb.append("</h1>");
        JLabel name = new JLabel();
        name.setText(sb.toString());
        name.setHorizontalAlignment(JLabel.CENTER);

        JButton back = new JButton("Back");
        back.setPreferredSize(new Dimension(400, 50));


        aboutPanel.add((name), BorderLayout.CENTER);
        aboutPanel.add(back, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new CalculatorApp();
    }
}
