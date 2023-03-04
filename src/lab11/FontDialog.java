package lab11;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class FontDialog extends JDialog {

    private final JPanel contentPanel = new JPanel();
    private JComboBox fontNameBox = null;
    private JComboBox fontStyleBox = null;
    private JComboBox fontSizeBox = null;
    private JTextArea txtrHereIs = null;

    private String fontName;
    private String fontStyle;
    private String fontSize;
    private int fontSty;
    private int fontSiz;


    public static void main(String[] args) {
        try {
            FontDialog dialog = new FontDialog();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public FontDialog() {
        setTitle("\u5B57\u4F53");
        setBounds(100, 100, 483, 234);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);
        {
            JLabel lblf = new JLabel("\u5B57\u4F53(F):");
            lblf.setBounds(0, 10, 54, 15);
            contentPanel.add(lblf);
        }
        {
            JLabel lbly = new JLabel("\u5B57\u5F62(Y):");
            lbly.setBounds(182, 10, 54, 15);
            contentPanel.add(lbly);
        }
        {
            JLabel lbls = new JLabel("\u5927\u5C0F(S):");
            lbls.setBounds(315, 10, 54, 15);
            contentPanel.add(lbls);
        }
        {
            JLabel label = new JLabel("\u663E\u793A\u6548\u679C:");
            label.setBounds(126, 82, 64, 15);
            contentPanel.add(label);
        }

        Panel panel = new Panel();
        panel.setBounds(196, 40, 228, 113);
        contentPanel.add(panel);
        panel.setLayout(null);
        {
            txtrHereIs = new JTextArea();
            txtrHereIs.setBounds(39, 38, 177, 44);
            txtrHereIs
                    .setText("\u8FD9\u91CC\u663E\u793A\u9884\u89C8\r\nHere is the preview");
            panel.add(txtrHereIs);
        }
        {
            fontNameBox = new JComboBox();
            fontNameBox.setBounds(49, 7, 123, 21);
            contentPanel.add(fontNameBox);
            fontNameBox.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent itemevent) {
                    fontName = (String) itemevent.getItem();
                    System.out.println(fontName);

                    // change preview
                    Font f = new Font(fontName, fontSty, fontSiz);
                    txtrHereIs.setFont(f);
                }
            });
        }
        {
            fontStyleBox = new JComboBox();
            fontStyleBox.setBounds(232, 7, 73, 21);
            contentPanel.add(fontStyleBox);
            fontStyleBox.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent itemevent) {
                    fontStyle = (String) itemevent.getItem();
                    fontSty = getFontStyleByCnName(fontStyle);
                    // change preview
                    Font f = new Font(fontName, fontSty, fontSiz);
                    txtrHereIs.setFont(f);
                }
            });
        }
        {
            fontSizeBox = new JComboBox();
            fontSizeBox.setBounds(379, 7, 78, 21);
            contentPanel.add(fontSizeBox);
            fontSizeBox.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent itemevent) {
                    fontSize = (String) itemevent.getItem();
                    fontSiz = Integer.parseInt(fontSize);

                    // change preview
                    Font f = new Font(fontName, fontSty, fontSiz);
                    txtrHereIs.setFont(f);
                }
            });
        }
        {
            JPanel buttonPane = new JPanel();
            buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
            getContentPane().add(buttonPane, BorderLayout.SOUTH);
            {
                JButton okButton = new JButton("\u786E\u5B9A");
                okButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent actionevent) {
                        int fontSty = getFontStyleByCnName(fontStyle);
                        int fontSiz = Integer.parseInt(fontSize);
                        JOptionPane.showMessageDialog(FontDialog.this,
                                "Название выбранного шрифта:" + fontName + ", стиль шрифта:" + fontStyle
                                        + ", Размер шрифта:" + fontSiz, "prompt",
                                JOptionPane.CLOSED_OPTION);

                    }
                });
                okButton.setActionCommand("OK");
                buttonPane.add(okButton);
                getRootPane().setDefaultButton(okButton);
            }
            {
                JButton cancelButton = new JButton("\u53D6\u6D88");
                cancelButton.setActionCommand("Cancel");
                buttonPane.add(cancelButton);
                cancelButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent actionevent) {
                        FontDialog.this.dispose();
                    }
                });
            }
        }

        // Инициализируем имя шрифта
        GraphicsEnvironment ge = GraphicsEnvironment
                .getLocalGraphicsEnvironment();
        String[] fontNames = ge.getAvailableFontFamilyNames();
        fontNameBox.setModel(new DefaultComboBoxModel(fontNames));
        // Инициализируем стиль шрифта
        String[] fontStyles = {"Обычный", "Курсив", "Полужирный", "Полужирный курсив"};
        fontStyleBox.setModel(new DefaultComboBoxModel(fontStyles));
        // Инициализируем размер шрифта
        String[] fontSizes = {"8", "9", "10", "11", "12", "14", "16", "18",
                "20", "22", "24", "26", "28", "36", "48", "72"};
        fontSizeBox.setModel(new DefaultComboBoxModel(fontSizes));
        System.out.println("finish.");

        fontSizeBox.setSelectedIndex(4);
        fontStyle = (String) fontStyleBox.getSelectedItem();
        fontSize = (String) fontSizeBox.getSelectedItem();
        fontSty = getFontStyleByCnName(fontStyle);
        fontSiz = Integer.parseInt(fontSize);
    }

    public static int getFontStyleByCnName(String fontStyle) {
        if (fontStyle.equals("General")) {
            return Font.PLAIN;
        }
        if (fontStyle.equals("Italic")) {
            return Font.ITALIC;
        }
        if (fontStyle.equals("bold")) {
            return Font.BOLD;
        }
        if (fontStyle.equals("Жирный курсив")) {
            return Font.BOLD + Font.ITALIC;
        }
        return -1;
    }
}