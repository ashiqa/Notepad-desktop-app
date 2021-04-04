import java.awt.*;
import java.awt.event.*;
import java.awt.Desktop;
import javax.swing.*;

public class notepadGUI {
    Frame f;
    MenuBar mb;
    Menu File, Edit, Settings, Languages;
    MenuItem New, Open, Save, Delete, Rename, Print;
    MenuItem cut, copy, paste, convertCase, undo;
    MenuItem Import, ChangeBackground, ApplyChanges;
    MenuItem c, cpp, java, python, Go, Ruby, PHP, JavaScript;
    JTextArea txt1, txt2;
    Label l;

    notepadGUI() {
        f = new Frame();
        f.setTitle("Notepad");
        f.setSize(500, 500);
        f.setVisible(true);
        txt1 = new JTextArea();
        txt2 = new JTextArea();
        l = new Label();
        txt1.setText("This is a notebook ");
        mb = new MenuBar();

        File = new Menu("File");
        Edit = new Menu("Edit");
        Settings = new Menu("settings");
        Languages = new Menu("Languages");

        New = new MenuItem("new");
        Open = new MenuItem("open");
        Save = new MenuItem("save");
        Delete = new MenuItem("delete");
        Rename = new MenuItem("rename");
        Print = new MenuItem("print");

        cut = new MenuItem("cut");
        copy = new MenuItem("copy");
        paste = new MenuItem("paste");
        convertCase = new MenuItem("convertCase");
        undo = new MenuItem("undo");

        Import = new MenuItem("Import");
        ChangeBackground = new MenuItem("ChangeBackground");
        ApplyChanges = new MenuItem("ApplyChanges");

        c = new MenuItem("c");
        cpp = new MenuItem("cpp");
        java = new MenuItem("java");
        python = new MenuItem("python");
        Go = new MenuItem("Go");
        Ruby = new MenuItem("Ruby");
        PHP = new MenuItem("PHP");
        JavaScript = new MenuItem("JavaScript");

        mb.add(File);
        mb.add(Edit);
        mb.add(Settings);
        mb.add(Languages);

        File.add(New);
        File.add(Open);
        File.add(Save);
        File.add(Delete);
        File.add(Rename);
        File.add(Print);

        Edit.add(cut);
        Edit.add(copy);
        Edit.add(paste);
        Edit.add(convertCase);
        Edit.add(undo);

        Settings.add(Import);
        Settings.add(ChangeBackground);
        Settings.add(ApplyChanges);

        Languages.add(c);
        Languages.add(cpp);
        Languages.add(java);
        Languages.add(python);
        Languages.add(Go);
        Languages.add(Ruby);
        Languages.add(PHP);
        Languages.add(JavaScript);

        f.setMenuBar(mb);
        f.add(txt1);
        f.add(txt2);
        f.setLayout(new GridLayout(2, 2));
        f.addWindowListener(new WindowAdapter() {
            public void WindowClosing(WindowEvent w) {
                f.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new notepadGUI();
    }
}