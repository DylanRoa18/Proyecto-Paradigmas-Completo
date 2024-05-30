module ProyectoParadigmasVisual {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens proyecto.model to javafx.base;
    exports proyecto.model;
    exports proyecto.vista;
    opens proyecto.vista to javafx.fxml;
    opens proyecto.controller to javafx.fxml;
    exports proyecto.controller;
}