package recetas.rsgr;

import com.vaadin.annotations.Theme;
import com.vaadin.server.FileResource;
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
      //  Button boton=new Button("UMF mas negadas");

        ComboBox cb1=new ComboBox();
        cb1.addItem("UMF Negadas");
      //  boton.addStyleName(ValoTheme.BUTTON_PRIMARY);

        cb1.addItem("Claves negadas");

        cb1.addItem("Recetas negadas");

        cb1.addItem("Vacunas");


        layout.addComponent(label);
        layout.addComponent(cb1);
       // layout.addComponent(boton);

         ImageUploader receiver = new  ImageUploader();
        Upload upload = new Upload("Upload it here", receiver);

        layout.addComponent(upload);
        setContent(layout);
    }
}

// Implement both receiver that saves upload in a file and
// listener for successful upload
class ImageUploader implements Upload.Receiver, Upload.SucceededListener {
    public File file;

    public OutputStream receiveUpload(String filename,
                                      String mimeType) {
        // Create upload stream
        FileOutputStream fos = null; // Stream to write to
        try {
            // Open the file for writing.
            file = new File("/tmp/uploads/" + filename);
            fos = new FileOutputStream(file);
        } catch (final java.io.FileNotFoundException e) {
            new Notification("Could not open file<br/>",
                    e.getMessage(),
                    Notification.Type.ERROR_MESSAGE)
                    .show(Page.getCurrent());
            return null;
        }
        return fos; // Return the output stream to write to
    }

    public void uploadSucceeded(Upload.SucceededEvent event) {
        // Show the uploaded file in the image viewer
       // image.setVisible(true);
       // image.setSource(new FileResource(file));
    }
}
