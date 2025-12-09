package project.salesystem;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import project.models.product;

public class adminProductPageController {
    @FXML
    BorderPane root;

    @FXML
    TableView<product> productTable;

    @FXML
    TableColumn <Integer,product> productIdCol;

    @FXML
    TableColumn <String,product> productNameCol;

    @FXML
    TableColumn <String,product> productBrandCol;

    @FXML
    TableColumn <Double,product> productPriceCol;

    @FXML
    TableColumn <Integer,product> productStockCol;

    @FXML
    TableColumn <String,product> productCategoryCol;

    @FXML
    TableColumn <?,?> productActionCol;

    @FXML
    HBox productProgressBox;



}
