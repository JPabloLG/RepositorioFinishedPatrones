package co.unquindio.proyecto.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class FacturaControler {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?,?> cantidad;

    @FXML
    private Label code;

    @FXML
    private Label home;

    @FXML
    private TableColumn<?,?> item;

    @FXML
    private Label name;

    @FXML
    private Label phone;

    @FXML
    private Label phone1;

    @FXML
    private TableColumn<?,?> precio;

    @FXML
    private TableView<?> tablaFactura;

    @FXML
    private Label titleFactura;

    @FXML
    private Label txtFacturaCodigo;

    @FXML
    private Label txtFacturaNombre;

    @FXML
    private Label txtFacturaTelefono;

    @FXML
    void initialize() {
        assert cantidad!= null : "fx:id=\"cantidad\" was not injected: check your FXML file 'factura.fxml'.";
        assert code!= null : "fx:id=\"code\" was not injected: check your FXML file 'factura.fxml'.";
        assert home!= null : "fx:id=\"home\" was not injected: check your FXML file 'factura.fxml'.";
        assert item!= null : "fx:id=\"item\" was not injected: check your FXML file 'factura.fxml'.";
        assert name!= null : "fx:id=\"name\" was not injected: check your FXML file 'factura.fxml'.";
        assert phone!= null : "fx:id=\"phone\" was not injected: check your FXML file 'factura.fxml'.";
        assert phone1!= null : "fx:id=\"phone1\" was not injected: check your FXML file 'factura.fxml'.";
        assert precio!= null : "fx:id=\"precio\" was not injected: check your FXML file 'factura.fxml'.";
        assert tablaFactura!= null : "fx:id=\"tablaFactura\" was not injected: check your FXML file 'factura.fxml'.";
        assert titleFactura!= null : "fx:id=\"titleFactura\" was not injected: check your FXML file 'factura.fxml'.";
        assert txtFacturaCodigo!= null : "fx:id=\"txtFacturaCodigo\" was not injected: check your FXML file 'factura.fxml'.";
        assert txtFacturaNombre!= null : "fx:id=\"txtFacturaNombre\" was not injected: check your FXML file 'factura.fxml'.";
        assert txtFacturaTelefono!= null : "fx:id=\"txtFacturaTelefono\" was not injected: check your FXML file 'factura.fxml'.";
    }
}
