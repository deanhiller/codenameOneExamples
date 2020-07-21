package app.mykeepintouch.todo;

import com.codename1.ui.CheckBox;
import com.codename1.ui.Container;
import com.codename1.ui.TextField;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.plaf.Border;
import com.codename1.ui.plaf.Style;

import static com.codename1.ui.layouts.BorderLayout.EAST;

public class TodoItem extends Container {
    private TextField nameText;
    private CheckBox done = new CheckBox();
    public TodoItem(String name, boolean checked) {
        super(new BorderLayout());
        nameText = new TextField(name);
        nameText.setUIID("Label");

        add(CENTER, nameText);
        add(EAST, done);
        done.setSelected(checked);

        setUIID("Task");
//        Style s = getAllStyles();
//        s.setPaddingUnit(Style.UNIT_TYPE_PIXELS);
//        s.setPadding(0, 2, 0, 0);
//        s.setBorder(Border.createLineBorder(2, 0xcccccc));
    }
    public void edit() {
        nameText.startEditingAsync();
    }
    public boolean isChecked() {
        return done.isSelected();
    }
    public String getText() {
        return nameText.getText();
    }
}
