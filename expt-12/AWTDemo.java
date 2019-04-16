
/*
<APPLET CODE = AWTDemo.java WIDTH = 400 HEIGHT = 400></APPLET>
*/

import java.awt.*;
import java.applet.*;

public class AWTDemo extends Applet {
    Label lName, lGender, lAddress, lYear, lLanguage;
    TextField txtName;
    Checkbox cbMale, cbFemale;
    CheckboxGroup cbgGender;
    TextArea taAddress;
    Choice chYear;
    List liLang;
    Button bSubmit;

    public void init() {
        setFont(new Font("Roboto", Font.BOLD, 22));
 
        lName = new Label("Name: ");
        txtName = new TextField(50);

        lAddress = new Label("Address: ");
        taAddress = new TextArea(3, 50);

        lGender = new Label("Gender: ");
        cbgGender = new CheckboxGroup();
        cbMale = new Checkbox("Male", cbgGender, true);
        cbFemale = new Checkbox("Female", cbgGender, false);

        lYear = new Label("Year: ");
        chYear = new Choice();
        chYear.add("First");
        chYear.add("Second");
        chYear.add("Third");

        lLanguage = new Label("Known languages: ");
        liLang = new List(5, true);
        liLang.add("C");
        liLang.add("C++");
        liLang.add("Java");
        liLang.add("Python");
        liLang.add("HTML");

        bSubmit = new Button("Submit");

        add(lName);
        add(txtName);
        add(lAddress);
        add(taAddress);
        add(lGender);
        add(cbMale);
        add(cbFemale);
        add(lYear);
        add(chYear);
        add(lLanguage);
        add(liLang);
        add(bSubmit);
    }
}
