import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.ItemEvent;
import java.awt.JFrame;
import java.awt.JTextField;
import java.awt.JCheckBox;

public class CheckBoxFrame extends CheckBoxFrame
{
private JTextField txtField;
private JCheckBox boldJCheckBox;
private JCheckBox italicJCheckBox;

public CheckBoxFrame()
{
    super("JCheckBox test");
    setLayout( new FlowLayout());

    textField = new JTextField("Watch the font style change",20);
    add(textField);

    boldJCheckBox = new JCheckBox("Bold");
    italicJCheckBox = new JCheckBox("italic");
    add (boldJCheckBox);
    add(italicJCheckBox);

    CheckBoxHandler handler = new CheckBoxHandler();
    boldJCheckBox.addItemListener(handler);
    italicJCheckBox.addItemListener(handler);
}
private class CheckBoxHandler implements ItemListener
{
    private void itemStateChanged(ItemEvent event)
    {
        Font font = null;

        if(boldJCheckBox.isSelected()&& italicJCheckBox.isSelected())
        font = new Font("Serif". Font.BOLD + Font.ITALIC,14);
        else if (boldJCheckBox.isSelected())
        font = new Font("Serif". Font.BOLD,14);
        else if (italicJCheckBox.isSelected())
         font = new Font("Serif". Font.ITALIC,14);
         else
         font = new Font("Serif", Font.PLAIN,14);

         textField.setFont(font);
    }
}
}