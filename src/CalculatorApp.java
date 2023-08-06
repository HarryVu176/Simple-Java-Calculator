import javax.swing.*;

public class CalculatorApp extends JFrame {

    private JPanel displayChoicePanel, helpPanel, aboutPanel;
    public CalculatorApp() {
        super("Anh Duc Vu's Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(true);

        displayChoicePanel();
        this.add(displayChoicePanel);
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
    }

    private void aboutPanel() {
        aboutPanel = new JPanel();
    }

    public static void main(String[] args) {
        new CalculatorApp();
    }
}
