package app.mykeepintouch.uber;

import com.codename1.components.FloatingActionButton;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.layouts.BoxLayout;

public class TodoForm extends Form {
    private int counter = 0;

    public TodoForm() {
        super("Todo App", BoxLayout.y());

        FloatingActionButton fab = FloatingActionButton.createFAB(FontImage.MATERIAL_ADD);
        fab.bindFabToContainer(this);
        fab.addActionListener(e -> addNewItem());
    }

    private void addNewItem() {
        String str;
        if(counter == 0)
            str = "First Item";
        else if(counter == 1)
            str = "Second Item";
        else
            str = "Third Item";
        counter++;
        TodoItem td = new TodoItem(str, false);
        add(td);
        revalidate();
        td.edit();
    }
}
