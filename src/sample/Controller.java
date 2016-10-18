package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    TextField name;
    @FXML
    TextField phone;
    @FXML
    TextField email;
    @FXML
    ListView contactList;

    ObservableList<Contacts> cont = FXCollections.observableArrayList();


    public void onAdd() {
        String n = name.getText();
        String p = phone.getText();
        String e = email.getText();
        Contacts cont2= new Contacts(n, p, e);
        cont.add(cont2);
        name.clear();
        phone.clear();
        email.clear();
    }

    public void onRemove() {
        Contacts item = (Contacts) contactList.getSelectionModel().getSelectedItem();
        cont.remove(item);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        contactList.setItems(cont);
    }
}
