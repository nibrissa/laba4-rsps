package com.example.labs4;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private TableColumn<Agreement, String> column_client,column_dateclose,column_dateopen,column_number,column_status,column_type;
    @FXML
    private TableView<Agreement> table_view;
    ObservableList<Agreement> agreements = FXCollections.observableArrayList(
            new Agreement("E1232FG","ПАО \"Солидное счастье\"","Предварительный ","Завершен","02.10.2023","09.10.2023"),
            new Agreement("Р5123","ООО \"ТЕХНИК\"","Безвозмездный","Завершен","01.10.2023","03.10.2023"),
            new Agreement("Е3234А3","ООО \"Зрение\"","Двухсторонний","В работе","09.10.2023","25.12.2023"),
            new Agreement("B23111","ООО \"Кодекс\"","Публичный","Подготовка","27.11.2023","14.01.2024"));

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        column_number.setCellValueFactory(new PropertyValueFactory<Agreement,String>("number"));
        column_client.setCellValueFactory(new PropertyValueFactory<Agreement,String>("client"));
        column_type.setCellValueFactory(new PropertyValueFactory<Agreement,String>("type"));
        column_status.setCellValueFactory(new PropertyValueFactory<Agreement,String>("status"));
        column_dateopen.setCellValueFactory(new PropertyValueFactory<Agreement,String>("dateopen"));
        column_dateclose.setCellValueFactory(new PropertyValueFactory<Agreement,String>("dateclose"));
        table_view.setItems(agreements);
    }
}
