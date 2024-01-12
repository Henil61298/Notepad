import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TextEditor implements ActionListener {
//    Declaring properties of text editor
    JFrame frame;
    JMenuBar menuBar;
    JMenu file, edit;

    JMenuItem newFile, openFile, saveFile;

    JMenuItem cut, copy, paste, selectAll, close;

    JTextArea textArea;
    TextEditor(){
//    All initialisation
        frame = new JFrame();
        menuBar = new JMenuBar();
        textArea = new JTextArea();

        file = new JMenu("File");
        edit = new JMenu("Edit");

        newFile = new JMenuItem("New Window");
        openFile = new JMenuItem("Open File");
        saveFile = new JMenuItem("Save File");

//        Adding Action listeners

        newFile.addActionListener(this);
        openFile.addActionListener(this);
        saveFile.addActionListener(this);

        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        selectAll = new JMenuItem("Select All");
        close = new JMenuItem("Close");

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
        close.addActionListener(this);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        edit.add(close);

        file.add(newFile);
        file.add(openFile);
        file.add(saveFile);

        menuBar.add(file);
        menuBar.add(edit);

        frame.setJMenuBar(menuBar);
        frame.add(textArea);
        frame.setBounds(100, 100, 400, 400);
        frame.setVisible(true);
        frame.setLayout(null);
    }
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut){
            textArea.cut();
        }

        if (e.getSource() == copy){
            textArea.copy();
        }

        if (e.getSource() == paste){
            textArea.paste();
        }

        if (e.getSource() == selectAll){
            textArea.selectAll();
        }

        if (e.getSource() == close){
            System.exit(0);
        }
    }
}
