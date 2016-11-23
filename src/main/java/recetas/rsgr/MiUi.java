package recetas.rsgr;

import com.vaadin.annotations.Theme;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by zukua on 04/11/2016.
 */
@SpringUI
@Theme("valo")
public class MiUi extends UI{
    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();



        Label label = new Label("NEGADO");
        Button boton=new Button("UMF mas negadas");
        boton.addStyleName(ValoTheme.BUTTON_PRIMARY);

        layout.addComponent(label);
        layout.addComponent(boton);




        setContent(layout);
    }
}


