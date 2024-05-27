module co.unquindio.proyecto {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.unquindio.proyecto to javafx.fxml;
    exports co.unquindio.proyecto;

    opens co.unquindio.proyecto.Controller;
    exports co.unquindio.proyecto.Controller;

    opens co.unquindio.proyecto.Model;
    exports co.unquindio.proyecto.Model;
}
