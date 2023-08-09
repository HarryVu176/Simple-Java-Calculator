/**
 * CalculatorApp.java
 * Purpose: GUI for the calculator
 * Coder: Anh Duc Vu (1057322)
 * Date: Aug 7, 2023
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame {

    private JMenuBar mb;
    private JButton helpBtn = new JButton("Help"), aboutBtn = new JButton("About"), calcBtn = new JButton("Calculator");
    private JRadioButton dec, hex, oct, bin;
    // Panels for the calculator
    private JPanel displayChoicePanel, helpPanel, aboutPanel, calcButtonPanel, underPanel, upperPanel, cards, card1;
    // Buttons for the calculator
    private JButton aBtn, andBtn, leftShiftBtn, rightShiftBtn, clrBtn, backBtn
            , bBtn, nandBtn, multiplyBtn, divideBtn, plusBtn, minusBtn
            , cBtn, orBtn, sevenBtn, eightBtn, nineBtn, modBtn
            , dBtn, norBtn, fourBtn, fiveBtn, sixBtn, clraBtn
            , eBtn, xorBtn, oneBtn, twoBtn, threeBtn, clrrBtn
            , fBtn, notBtn, switchSignBtn, zeroBtn, equalBtn, clroBtn;
    private JLabel accumulatorLabel, operatorLabel, registerLabel;

    private CardLayout cardLayout;


    /**
     * Constructor
     */
    public CalculatorApp() {
        super("Anh Duc Vu's Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        //this.setLayout(new BorderLayout());
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(true);

        mb = new JMenuBar();
        mb.add(calcBtn);
        mb.add(helpBtn);
        mb.add(aboutBtn);
        this.setJMenuBar(mb);

        buildCardLayout();
        this.add(cards);

        helpBtn.addActionListener(new menuBarListener());
        aboutBtn.addActionListener(new menuBarListener());
        calcBtn.addActionListener(new menuBarListener());

    }

    /**
     * Build the card layout for the calculator
     */
    private void buildCardLayout() {
        cards = new JPanel(new CardLayout());
        cardLayout = (CardLayout) cards.getLayout();
        buildCard1Panel();
        cards.add(card1, "Calculator");
        buildHelpPanel();
        cards.add(helpPanel, "Help");
        buildAboutPanel();
        cards.add(aboutPanel, "About");
    }

    /**
     * Build the calculator panel
     */
    private void buildCard1Panel() {
        card1 = new JPanel();
        card1.setLayout(new BoxLayout(card1, BoxLayout.Y_AXIS));
        buildUpperPanel();
        buildUnderPanel();
        card1.add(upperPanel);
        card1.add(underPanel);
    }

    /**
     * Build the upper panel of calculator (accumulator, operator, register)
     */
    private void buildUpperPanel() {
        upperPanel = new JPanel();
        upperPanel.setLayout(new BoxLayout(upperPanel, BoxLayout.Y_AXIS));

        accumulatorLabel = new JLabel(" ");
        accumulatorLabel.setFont(new Font("Roboto", Font.BOLD, 20));

        operatorLabel = new JLabel(" ");
        operatorLabel.setFont(new Font("Open Sans Serif", Font.BOLD, 20));
        operatorLabel.setForeground(Color.GRAY);

        registerLabel = new JLabel(" ");
        registerLabel.setFont(new Font("Roboto", Font.BOLD, 20));
        registerLabel.setForeground(Color.RED);

        upperPanel.add(accumulatorLabel);
        upperPanel.add(operatorLabel);
        upperPanel.add(registerLabel);
    }

    /**
     * Put both calc button and display choice together (buttons and display choice)
     */
    private void buildUnderPanel() {
        underPanel = new JPanel();
        underPanel.setLayout(new BoxLayout(underPanel, BoxLayout.X_AXIS));
        buildCalcButtonPanel();
        buildDisplayChoicePanel();
        underPanel.add(displayChoicePanel);
        underPanel.add(calcButtonPanel);
    }

    /**
     * Build the button panel of calculator
     */
    private void buildCalcButtonPanel() {
        calcButtonPanel = new JPanel();
        calcButtonPanel.setLayout(new GridLayout(6, 6));

        aBtn = new JButton("A");
        andBtn = new JButton("And");
        leftShiftBtn = new JButton("<<");
        rightShiftBtn = new JButton(">>");
        clrBtn = new JButton("CLR");
        backBtn = new JButton("back");
        bBtn = new JButton("B");
        nandBtn = new JButton("Nand");
        multiplyBtn = new JButton("*");
        divideBtn = new JButton("/");
        plusBtn = new JButton("+");
        minusBtn = new JButton("-");
        cBtn = new JButton("C");
        orBtn = new JButton("Or");
        sevenBtn = new JButton("7");
        eightBtn = new JButton("8");
        nineBtn = new JButton("9");
        modBtn = new JButton("mod");
        dBtn = new JButton("D");
        norBtn = new JButton("Nor");
        fourBtn = new JButton("4");
        fiveBtn = new JButton("5");
        sixBtn = new JButton("6");
        clraBtn = new JButton("ClrA");
        eBtn = new JButton("E");
        xorBtn = new JButton("Xor");
        oneBtn = new JButton("1");
        twoBtn = new JButton("2");
        threeBtn = new JButton("3");
        clrrBtn = new JButton("ClrR");
        fBtn = new JButton("F");
        notBtn = new JButton("Not");
        switchSignBtn = new JButton("+/-");
        zeroBtn = new JButton("0");
        equalBtn = new JButton("=");
        clroBtn = new JButton("ClrO");

        calcButtonPanel.add(aBtn);
        calcButtonPanel.add(andBtn);
        calcButtonPanel.add(leftShiftBtn);
        calcButtonPanel.add(rightShiftBtn);
        calcButtonPanel.add(clrBtn);
        calcButtonPanel.add(backBtn);
        calcButtonPanel.add(bBtn);
        calcButtonPanel.add(nandBtn);
        calcButtonPanel.add(multiplyBtn);
        calcButtonPanel.add(divideBtn);
        calcButtonPanel.add(plusBtn);
        calcButtonPanel.add(minusBtn);
        calcButtonPanel.add(cBtn);
        calcButtonPanel.add(orBtn);
        calcButtonPanel.add(sevenBtn);
        calcButtonPanel.add(eightBtn);
        calcButtonPanel.add(nineBtn);
        calcButtonPanel.add(modBtn);
        calcButtonPanel.add(dBtn);
        calcButtonPanel.add(norBtn);
        calcButtonPanel.add(fourBtn);
        calcButtonPanel.add(fiveBtn);
        calcButtonPanel.add(sixBtn);
        calcButtonPanel.add(clraBtn);
        calcButtonPanel.add(eBtn);
        calcButtonPanel.add(xorBtn);
        calcButtonPanel.add(oneBtn);
        calcButtonPanel.add(twoBtn);
        calcButtonPanel.add(threeBtn);
        calcButtonPanel.add(clrrBtn);
        calcButtonPanel.add(fBtn);
        calcButtonPanel.add(notBtn);
        calcButtonPanel.add(switchSignBtn);
        calcButtonPanel.add(zeroBtn);
        calcButtonPanel.add(equalBtn);
        calcButtonPanel.add(clroBtn);

        aBtn.setEnabled(false);
        bBtn.setEnabled(false);
        cBtn.setEnabled(false);
        dBtn.setEnabled(false);
        eBtn.setEnabled(false);
        fBtn.setEnabled(false);

        aBtn.addActionListener(new calcBtnListener());
        andBtn.addActionListener(new calcBtnListener());
        leftShiftBtn.addActionListener(new calcBtnListener());
        rightShiftBtn.addActionListener(new calcBtnListener());
        clrBtn.addActionListener(new calcBtnListener());
        backBtn.addActionListener(new calcBtnListener());
        bBtn.addActionListener(new calcBtnListener());
        nandBtn.addActionListener(new calcBtnListener());
        multiplyBtn.addActionListener(new calcBtnListener());
        divideBtn.addActionListener(new calcBtnListener());
        plusBtn.addActionListener(new calcBtnListener());
        minusBtn.addActionListener(new calcBtnListener());
        cBtn.addActionListener(new calcBtnListener());
        orBtn.addActionListener(new calcBtnListener());
        sevenBtn.addActionListener(new calcBtnListener());
        eightBtn.addActionListener(new calcBtnListener());
        nineBtn.addActionListener(new calcBtnListener());
        modBtn.addActionListener(new calcBtnListener());
        dBtn.addActionListener(new calcBtnListener());
        norBtn.addActionListener(new calcBtnListener());
        fourBtn.addActionListener(new calcBtnListener());
        fiveBtn.addActionListener(new calcBtnListener());
        sixBtn.addActionListener(new calcBtnListener());
        clraBtn.addActionListener(new calcBtnListener());
        eBtn.addActionListener(new calcBtnListener());
        xorBtn.addActionListener(new calcBtnListener());
        oneBtn.addActionListener(new calcBtnListener());
        twoBtn.addActionListener(new calcBtnListener());
        threeBtn.addActionListener(new calcBtnListener());
        clrrBtn.addActionListener(new calcBtnListener());
        fBtn.addActionListener(new calcBtnListener());
        notBtn.addActionListener(new calcBtnListener());
        switchSignBtn.addActionListener(new calcBtnListener());
        zeroBtn.addActionListener(new calcBtnListener());
        equalBtn.addActionListener(new calcBtnListener());
        clroBtn.addActionListener(new calcBtnListener());
    }

    /**
     * Builds the display choice panel.
     */
    private void buildDisplayChoicePanel() {
        displayChoicePanel = new JPanel();
        displayChoicePanel.setLayout(new BoxLayout(displayChoicePanel, BoxLayout.Y_AXIS));
        dec = new JRadioButton("dec");
        hex = new JRadioButton("hex");
        oct = new JRadioButton("oct");
        bin = new JRadioButton("bin");
        ButtonGroup group = new ButtonGroup();
        group.add(dec);
        group.add(hex);
        group.add(oct);
        group.add(bin);
        dec.setSelected(true);
        dec.addActionListener(new displayChoiceListener());
        hex.addActionListener(new displayChoiceListener());
        oct.addActionListener(new displayChoiceListener());
        bin.addActionListener(new displayChoiceListener());
        displayChoicePanel.add(dec);
        displayChoicePanel.add(hex);
        displayChoicePanel.add(oct);
        displayChoicePanel.add(bin);
    }

    /**
     * Builds the help panel.
     */
    private void buildHelpPanel() {
        helpPanel = new JPanel();
        helpPanel.setLayout(new BorderLayout());
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<p>");
        sb.append("Use this calculator just like any other calculator.");
        sb.append("<br>If you have further question, please do not contact me.");
        sb.append("</p>");
        sb.append("</html>");
        JLabel help = new JLabel(sb.toString());
        help.setHorizontalAlignment(JLabel.CENTER);

        helpPanel.add(help, BorderLayout.CENTER);

    }

    /**
     * Builds the about panel.
     */
    private void buildAboutPanel() {
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
        JLabel name = new JLabel(sb.toString());
        name.setHorizontalAlignment(JLabel.CENTER);

        aboutPanel.add((name), BorderLayout.CENTER);

    }

    public class menuBarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Switch to the appropriate card when the user selects
            if (e.getSource() == helpBtn) {
                cardLayout.show(cards, "Help");
            } else if (e.getSource() == aboutBtn) {
                cardLayout.show(cards, "About");
            } else if (e.getSource() == calcBtn) {
                cardLayout.show(cards, "Calculator");
            }
        }
    }

    public class calcBtnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Apply same for the rest
            if (e.getSource() == aBtn) {
                if (accumulatorLabel.getText().equals(" ")) accumulatorLabel.setText("A"); // if accumulator is empty, set accumulator to A
                else if (!operatorLabel.getText().equals(" ") && registerLabel.getText().equals(" ")) // if operator is not empty and register is empty, set register to A
                    registerLabel.setText("A");
                else if (!operatorLabel.getText().equals(" ") && !registerLabel.getText().equals(" ")) // if operator is not empty and register is not empty, append A to register
                    registerLabel.setText(registerLabel.getText() + "A");
                else accumulatorLabel.setText(accumulatorLabel.getText() + "A");
            } else if (e.getSource() == bBtn) {
                if (accumulatorLabel.getText().equals(" ")) accumulatorLabel.setText("B");
                else if (!operatorLabel.getText().equals(" ") && registerLabel.getText().equals(" "))
                    registerLabel.setText("B");
                else if (!operatorLabel.getText().equals(" ") && !registerLabel.getText().equals(" "))
                    registerLabel.setText(registerLabel.getText() + "B");
                else accumulatorLabel.setText(accumulatorLabel.getText() + "B");
            } else if (e.getSource() == cBtn) {
                if (accumulatorLabel.getText().equals(" ")) accumulatorLabel.setText("C");
                else if (!operatorLabel.getText().equals(" ") && registerLabel.getText().equals(" "))
                    registerLabel.setText("C");
                else if (!operatorLabel.getText().equals(" ") && !registerLabel.getText().equals(" "))
                    registerLabel.setText(registerLabel.getText() + "C");
                else accumulatorLabel.setText(accumulatorLabel.getText() + "C");
            } else if (e.getSource() == dBtn) {
                if (accumulatorLabel.getText().equals(" ")) accumulatorLabel.setText("D");
                else if (!operatorLabel.getText().equals(" ") && registerLabel.getText().equals(" "))
                    registerLabel.setText("D");
                else if (!operatorLabel.getText().equals(" ") && !registerLabel.getText().equals(" "))
                    registerLabel.setText(registerLabel.getText() + "D");
                else accumulatorLabel.setText(accumulatorLabel.getText() + "D");
            } else if (e.getSource() == eBtn) {
                if (accumulatorLabel.getText().equals(" ")) accumulatorLabel.setText("E");
                else if (!operatorLabel.getText().equals(" ") && registerLabel.getText().equals(" "))
                    registerLabel.setText("E");
                else if (!operatorLabel.getText().equals(" ") && !registerLabel.getText().equals(" "))
                    registerLabel.setText(registerLabel.getText() + "E");
                else accumulatorLabel.setText(accumulatorLabel.getText() + "E");
            } else if (e.getSource() == fBtn) {
                if (accumulatorLabel.getText().equals(" ")) accumulatorLabel.setText("F");
                else if (!operatorLabel.getText().equals(" ") && registerLabel.getText().equals(" "))
                    registerLabel.setText("F");
                else if (!operatorLabel.getText().equals(" ") && !registerLabel.getText().equals(" "))
                    registerLabel.setText(registerLabel.getText() + "F");
                else accumulatorLabel.setText(accumulatorLabel.getText() + "F");
            } else if (e.getSource() == zeroBtn) {
                if (accumulatorLabel.getText().equals(" ")) accumulatorLabel.setText("0");
                else if (!operatorLabel.getText().equals(" ") && registerLabel.getText().equals(" "))
                    registerLabel.setText("0");
                else if (!operatorLabel.getText().equals(" ") && !registerLabel.getText().equals(" "))
                    registerLabel.setText(registerLabel.getText() + "0");
                else accumulatorLabel.setText(accumulatorLabel.getText() + "0");
            } else if (e.getSource() == oneBtn) {
                if (accumulatorLabel.getText().equals(" ")) accumulatorLabel.setText("1");
                else if (!operatorLabel.getText().equals(" ") && registerLabel.getText().equals(" "))
                    registerLabel.setText("1");
                else if (!operatorLabel.getText().equals(" ") && !registerLabel.getText().equals(" "))
                    registerLabel.setText(registerLabel.getText() + "1");
                else accumulatorLabel.setText(accumulatorLabel.getText() + "1");
            } else if (e.getSource() == twoBtn) {
                if (accumulatorLabel.getText().equals(" ")) accumulatorLabel.setText("2");
                else if (!operatorLabel.getText().equals(" ") && registerLabel.getText().equals(" "))
                    registerLabel.setText("2");
                else if (!operatorLabel.getText().equals(" ") && !registerLabel.getText().equals(" "))
                    registerLabel.setText(registerLabel.getText() + "2");
                else accumulatorLabel.setText(accumulatorLabel.getText() + "2");
            } else if (e.getSource() == threeBtn) {
                if (accumulatorLabel.getText().equals(" ")) accumulatorLabel.setText("3");
                else if (!operatorLabel.getText().equals(" ") && registerLabel.getText().equals(" "))
                    registerLabel.setText("3");
                else if (!operatorLabel.getText().equals(" ") && !registerLabel.getText().equals(" "))
                    registerLabel.setText(registerLabel.getText() + "3");
                else accumulatorLabel.setText(accumulatorLabel.getText() + "3");
            } else if (e.getSource() == fourBtn) {
                if (accumulatorLabel.getText().equals(" ")) accumulatorLabel.setText("4");
                else if (!operatorLabel.getText().equals(" ") && registerLabel.getText().equals(" "))
                    registerLabel.setText("4");
                else if (!operatorLabel.getText().equals(" ") && !registerLabel.getText().equals(" "))
                    registerLabel.setText(registerLabel.getText() + "4");
                else accumulatorLabel.setText(accumulatorLabel.getText() + "4");
            } else if (e.getSource() == fiveBtn) {
                if (accumulatorLabel.getText().equals(" ")) accumulatorLabel.setText("5");
                else if (!operatorLabel.getText().equals(" ") && registerLabel.getText().equals(" "))
                    registerLabel.setText("5");
                else if (!operatorLabel.getText().equals(" ") && !registerLabel.getText().equals(" "))
                    registerLabel.setText(registerLabel.getText() + "5");
                else accumulatorLabel.setText(accumulatorLabel.getText() + "5");
            } else if (e.getSource() == sixBtn) {
                if (accumulatorLabel.getText().equals(" ")) accumulatorLabel.setText("6");
                else if (!operatorLabel.getText().equals(" ") && registerLabel.getText().equals(" "))
                    registerLabel.setText("6");
                else if (!operatorLabel.getText().equals(" ") && !registerLabel.getText().equals(" "))
                    registerLabel.setText(registerLabel.getText() + "6");
                else accumulatorLabel.setText(accumulatorLabel.getText() + "6");
            } else if (e.getSource() == sevenBtn) {
                if (accumulatorLabel.getText().equals(" ")) accumulatorLabel.setText("7");
                else if (!operatorLabel.getText().equals(" ") && registerLabel.getText().equals(" "))
                    registerLabel.setText("7");
                else if (!operatorLabel.getText().equals(" ") && !registerLabel.getText().equals(" "))
                    registerLabel.setText(registerLabel.getText() + "7");
                else accumulatorLabel.setText(accumulatorLabel.getText() + "7");
            } else if (e.getSource() == eightBtn) {
                if (accumulatorLabel.getText().equals(" ")) accumulatorLabel.setText("8");
                else if (!operatorLabel.getText().equals(" ") && registerLabel.getText().equals(" "))
                    registerLabel.setText("8");
                else if (!operatorLabel.getText().equals(" ") && !registerLabel.getText().equals(" "))
                    registerLabel.setText(registerLabel.getText() + "8");
                else accumulatorLabel.setText(accumulatorLabel.getText() + "8");
            } else if (e.getSource() == nineBtn) {
                if (accumulatorLabel.getText().equals(" ")) accumulatorLabel.setText("9");
                else if (!operatorLabel.getText().equals(" ") && registerLabel.getText().equals(" "))
                    registerLabel.setText("9");
                else if (!operatorLabel.getText().equals(" ") && !registerLabel.getText().equals(" "))
                    registerLabel.setText(registerLabel.getText() + "9");
                else accumulatorLabel.setText(accumulatorLabel.getText() + "9");
            } else if (e.getSource() == clrBtn) {
                accumulatorLabel.setText(" ");
                operatorLabel.setText(" ");
                registerLabel.setText(" ");
            } else if (e.getSource() == clraBtn) {
                accumulatorLabel.setText(" ");
            } else if (e.getSource() == clroBtn) {
                operatorLabel.setText(" ");
            } else if (e.getSource() == clrrBtn) {
                registerLabel.setText(" ");
            } else if (e.getSource() == multiplyBtn) {
                operatorLabel.setText("*");
            } else if (e.getSource() == divideBtn) {
                operatorLabel.setText("/");
            } else if (e.getSource() == plusBtn) {
                operatorLabel.setText("+");
            } else if (e.getSource() == minusBtn) {
                operatorLabel.setText("-");
            } else if (e.getSource() == modBtn) {
                operatorLabel.setText("%");
            } else if (e.getSource() == andBtn) {
                operatorLabel.setText("And");
            } else if (e.getSource() == nandBtn) {
                operatorLabel.setText("Nand");
            } else if (e.getSource() == orBtn) {
                operatorLabel.setText("Or");
            } else if (e.getSource() == norBtn) {
                operatorLabel.setText("Nor");
            } else if (e.getSource() == xorBtn) {
                operatorLabel.setText("Xor");
            } else if (e.getSource() == notBtn) {
                operatorLabel.setText("Not");
            } else if (e.getSource() == leftShiftBtn) {
                operatorLabel.setText("<<");
            } else if (e.getSource() == rightShiftBtn) {
                operatorLabel.setText(">>");
            }
            // if the button is back then backspace of one key click at a time when building an operand in the register
            else if (e.getSource() == backBtn) {
                if (!registerLabel.getText().equals(" ")) {
                    if (registerLabel.getText().length() == 1) registerLabel.setText(" ");
                    else registerLabel.setText(registerLabel.getText().substring(0, registerLabel.getText().length() - 1));
                } else if (!operatorLabel.getText().equals(" ")) {
                    operatorLabel.setText(" ");
                } else if (!accumulatorLabel.getText().equals(" ")) {
                    if (accumulatorLabel.getText().length() == 1) accumulatorLabel.setText(" ");
                    else accumulatorLabel.setText(accumulatorLabel.getText().substring(0, accumulatorLabel.getText().length() - 1));
                }
            } else if (e.getSource() == switchSignBtn) {
                if (!registerLabel.getText().equals(" ")) {
                    if (registerLabel.getText().charAt(0) == '-') registerLabel.setText(registerLabel.getText().substring(1));
                    else registerLabel.setText("-" + registerLabel.getText());
                } else if (!accumulatorLabel.getText().equals(" ")) {
                    if (accumulatorLabel.getText().charAt(0) == '-') accumulatorLabel.setText(accumulatorLabel.getText().substring(1));
                    else accumulatorLabel.setText("-" + accumulatorLabel.getText());
                }
            } else if (e.getSource() == equalBtn) {
                int result = 0;
                Calculator calc = new Calculator();
                if (operatorLabel.getText().equals(" ")) {
                    registerLabel.setText(accumulatorLabel.getText());
                }
                int decimalAccumulator = Integer.parseInt(accumulatorLabel.getText(), getCurrentBase());
                int decimalRegister = Integer.parseInt(registerLabel.getText(), getCurrentBase());
                try {
                    result = calc.calculate(decimalAccumulator, decimalRegister, operatorLabel.getText());
                } catch (Calculator.IllegalOperationException ex) {
                    JOptionPane.showMessageDialog(null, "Illegal Operation", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (Calculator.InvalidOperandException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid Operand", "Error", JOptionPane.ERROR_MESSAGE);
                }
                accumulatorLabel.setText(" ");
                registerLabel.setText(Integer.toString(result, getCurrentBase()));
                operatorLabel.setText(" ");
            }
        }
    }

    /**
     * This method returns the current base of the calculator
     * @return the current base of the calculator
     */
    private int getCurrentBase() {
        if (aBtn.isEnabled()) return 16;
        if (!threeBtn.isEnabled()) return 2;
        if (!nineBtn.isEnabled()) return 8;
        return 10;
    }
    public class displayChoiceListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (accumulatorLabel.getText().equals(" ")) accumulatorLabel.setText("0");
            if (registerLabel.getText().equals(" ")) registerLabel.setText("0");
            int decimalAccumulator = Integer.parseInt(accumulatorLabel.getText(), getCurrentBase());
            int decimalRegister = Integer.parseInt(registerLabel.getText(), getCurrentBase());
            if (e.getSource() == dec) {
                // disable the buttons that are not needed
                aBtn.setEnabled(false);
                bBtn.setEnabled(false);
                cBtn.setEnabled(false);
                dBtn.setEnabled(false);
                eBtn.setEnabled(false);
                fBtn.setEnabled(false);
                twoBtn.setEnabled(true);
                threeBtn.setEnabled(true);
                fourBtn.setEnabled(true);
                fiveBtn.setEnabled(true);
                sixBtn.setEnabled(true);
                sevenBtn.setEnabled(true);
                eightBtn.setEnabled(true);
                nineBtn.setEnabled(true);
                accumulatorLabel.setText(Integer.toString(decimalAccumulator));
                registerLabel.setText(Integer.toString(decimalRegister));
            } else if (e.getSource() == hex) {
                aBtn.setEnabled(true);
                bBtn.setEnabled(true);
                cBtn.setEnabled(true);
                dBtn.setEnabled(true);
                eBtn.setEnabled(true);
                fBtn.setEnabled(true);
                twoBtn.setEnabled(true);
                threeBtn.setEnabled(true);
                fourBtn.setEnabled(true);
                fiveBtn.setEnabled(true);
                sixBtn.setEnabled(true);
                sevenBtn.setEnabled(true);
                eightBtn.setEnabled(true);
                nineBtn.setEnabled(true);
                accumulatorLabel.setText(Integer.toHexString(decimalAccumulator));
                registerLabel.setText(Integer.toHexString(decimalRegister));
            } else if (e.getSource() == oct) {
                aBtn.setEnabled(false);
                bBtn.setEnabled(false);
                cBtn.setEnabled(false);
                dBtn.setEnabled(false);
                eBtn.setEnabled(false);
                fBtn.setEnabled(false);
                eightBtn.setEnabled(false);
                nineBtn.setEnabled(false);
                twoBtn.setEnabled(true);
                threeBtn.setEnabled(true);
                fourBtn.setEnabled(true);
                fiveBtn.setEnabled(true);
                sixBtn.setEnabled(true);
                sevenBtn.setEnabled(true);
                accumulatorLabel.setText(Integer.toOctalString(decimalAccumulator));
                registerLabel.setText(Integer.toOctalString(decimalRegister));

            } else if (e.getSource() == bin) {
                aBtn.setEnabled(false);
                bBtn.setEnabled(false);
                cBtn.setEnabled(false);
                dBtn.setEnabled(false);
                eBtn.setEnabled(false);
                fBtn.setEnabled(false);
                twoBtn.setEnabled(false);
                threeBtn.setEnabled(false);
                fourBtn.setEnabled(false);
                fiveBtn.setEnabled(false);
                sixBtn.setEnabled(false);
                sevenBtn.setEnabled(false);
                eightBtn.setEnabled(false);
                nineBtn.setEnabled(false);
                accumulatorLabel.setText(Integer.toBinaryString(decimalAccumulator));
                registerLabel.setText(Integer.toBinaryString(decimalRegister));
            }
        }
    }

    public static void main(String[] args) {
        new CalculatorApp();
    }

}
