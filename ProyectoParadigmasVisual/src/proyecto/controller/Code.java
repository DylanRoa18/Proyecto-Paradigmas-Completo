package proyecto.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import proyecto.model.Pelicula;

public class Code {
	
	@FXML
	private TextField txtdescrip;
	
	@FXML
	private TextField txtposter;
	
    @FXML
    private Button bttagregar;

    @FXML
    private Button bttreservar;

    @FXML
    private Button bttsalir;

    @FXML
    private Button bttver;

    @FXML
    private TableView<Pelicula> catalogo;

    @FXML
    private TableColumn<Pelicula, String> nombrec;

    @FXML
    private TableColumn<Pelicula, String> directorc;

    @FXML
    private TableColumn<Pelicula, String> generoc;

    @FXML
    private TableColumn<Pelicula, String> anioc;

    @FXML
    private Pane pane1;

    @FXML
    private Pane pane2;

    @FXML
    private TextField txtanio;

    @FXML
    private TextField txtdirector;

    @FXML
    private TextField txtgenero;

    @FXML
    private TextField txtleer;

    @FXML
    private TextField txtnombre;

    private ObservableList<Pelicula> catalogoData = FXCollections.observableArrayList();
           
    @FXML
    public void initialize() {
        // Configurar las columnas de la tabla
        nombrec.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        directorc.setCellValueFactory(new PropertyValueFactory<>("director"));
        generoc.setCellValueFactory(new PropertyValueFactory<>("genero"));
        anioc.setCellValueFactory(new PropertyValueFactory<>("anio"));

        // Vincular los datos de la tabla con la lista observable
        catalogo.setItems(catalogoData);
        // Añadir una película específica a la tabla
        Pelicula p1 = new Pelicula("Titanic", "James Cameron", "Drama", "1997", false, "\"Titanic\" es una película dramática dirigida por James Cameron y estrenada en 1997. La trama sigue la historia de Jack, un joven artista, y Rose, una chica de clase alta, quienes se conocen a bordo del Titanic. A medida que el lujoso buque se acerca a un inmenso iceberg, Jack y Rose se enamoran, desafiando las trabas impuestas por las diferencias sociales y "
        		+ "     el compromiso de Rose con un millonario engreído. La película explora temas de amor, sacrificio y tragedia en el contexto del legendario hundimiento del Titanic.\r\n","https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiNeAkIXlihujcTZtRpkrfRsM1aviplR5glvaef9mDHrjeGqbEHlPrQ4YYhXJaajg1grALT0eBqW2OiT9tVCHrOtaS_xZExsfSjWu3fFL9SWdX42tMzkdVEgz8PUuiDrwwwV6K1Rtu4xA4/s1600/titanic_ver7.jpg");
        catalogoData.add(p1);
        Pelicula p2=new Pelicula("El Padrino", "Francis Ford Coppola", "Crimen", "1972", false, "\"El Padrino\" es una película dirigida por Francis Ford Coppola que se estrenó en 1972. Es un clásico del cine de crimen que sigue la historia de la familia mafiosa Corleone y su ascenso al poder en el mundo criminal de Nueva York.\r\n"
        		+ "\r\n"
        		+ "","https://static.wikia.nocookie.net/doblaje/images/9/9a/Elpadrino.jpg/revision/latest?cb=20211023042804&path-prefix=es");
        catalogoData.add(p2);
		Pelicula p3=new Pelicula("Interestelar", "Christopher Nolan", "Ciencia ficción", "2014", false, "\"Interestelar\" es una película de ciencia ficción dirigida por Christopher Nolan, estrenada en 2014. La película narra la historia de un grupo de astronautas que viajan a través de un agujero de gusano en busca de un nuevo hogar para la humanidad, enfrentándose a desafíos científicos y personales en el proceso.", "https://mx.web.img2.acsta.net/pictures/19/01/28/01/13/3672733.png");
		catalogoData.add(p3);
		Pelicula p4=new Pelicula("La La Land", "Damien Chazelle", "Musical", "2016", false, "\"La La Land\" es un musical romántico dirigido por Damien Chazelle, lanzado en 2016. La película sigue la historia de amor entre un pianista de jazz y una aspirante a actriz en Los Ángeles, mientras luchan por alcanzar sus sueños en la industria del entretenimiento.","https://m.media-amazon.com/images/M/MV5BMzUzNDM2NzM2MV5BMl5BanBnXkFtZTgwNTM3NTg4OTE@._V1_.jpg");
		catalogoData.add(p4);
		Pelicula p5=new Pelicula("Pulp Fiction", "Quentin Tarantino", "Crimen", "1994", false,"\"Pulp Fiction\" es un clásico del cine dirigido por Quentin Tarantino, estrenado en 1994. La película presenta múltiples historias entrelazadas de criminales, pandilleros y boxeadores en Los Ángeles, con diálogos ingeniosos, violencia estilizada y una estructura narrativa no lineal.", "https://pics.filmaffinity.com/Pulp_Fiction-210382116-mmed.jpg");
		catalogoData.add(p5);
		Pelicula p6=new Pelicula("El Rey León", "Roger Allers", "Animación", "1994", false, "\"El Rey León\" es una película animada de Disney dirigida por Roger Allers y Rob Minkoff, lanzada en 1994. La película sigue la historia de Simba, un joven león destinado a ser rey, mientras lucha contra las adversidades para reclamar su lugar en el ciclo de la vida en la sabana africana.", "https://static.wikia.nocookie.net/doblaje/images/e/e0/Lion_king_1.jpg/revision/latest?cb=20200726001925&path-prefix=es");
		catalogoData.add(p6);
    }
    
    @FXML
    void pressagregar(ActionEvent event) {
        try {
            // Verificar si todos los campos están llenos
            if (txtnombre.getText().isEmpty() || txtdirector.getText().isEmpty() || txtgenero.getText().isEmpty() || txtanio.getText().isEmpty() 
            		|| txtdescrip.getText().isEmpty() || txtposter.getText().isEmpty()) {
                throw new IllegalArgumentException("Por favor,todos los campos deben estar Llenos.");
            }

            // Crear una nueva película con los datos ingresados
            Pelicula pelicula = new Pelicula(txtnombre.getText(), txtdirector.getText(), txtgenero.getText(), txtanio.getText(), false, txtdescrip.getText(), txtposter.getText());

            // Agregar la película a la lista observable
            catalogoData.add(pelicula);

        } catch (IllegalArgumentException e) {
            // Mostrar mensaje de error
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }

    @FXML
    void pressreservar(ActionEvent event) {
        // Obtener la película seleccionada en la tabla
        Pelicula peliculaSeleccionada = catalogo.getSelectionModel().getSelectedItem();

        if (peliculaSeleccionada != null) {
            // Verificar el estado de reserva actual
            if (!peliculaSeleccionada.isEstReserva()) {
                // Cambiar el estado de reserva a true
                peliculaSeleccionada.setEstReserva(true);
                mostrarAlerta(Alert.AlertType.INFORMATION, "Reserva Exitosa", "La película \"" + peliculaSeleccionada.getNombre() + "\" ha sido reservada exitosamente.");
            } else {
                mostrarAlerta(Alert.AlertType.WARNING, "Reserva No Disponible", "La película \"" + peliculaSeleccionada.getNombre() + "\" ya está reservada.");
            }
        } else {
            mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "Por favor, seleccione una película para reservar.");
        }
    }
    @FXML
    void presssalir(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void pressver() {
        String textoBusqueda = txtleer.getText().trim();
        if (textoBusqueda.isEmpty()) {
            mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "Por favor, ingrese el nombre de una película.");
            return;
        }

        Pelicula peliculaEncontrada = buscarPeliculaPorNombre(textoBusqueda);
        if (peliculaEncontrada != null) {
            mostrarInformacionPelicula(peliculaEncontrada);
        } else {
            mostrarAlerta(Alert.AlertType.WARNING, "Advertencia", "No se encontró ninguna película con el nombre proporcionado.");
        }
    }

    private Pelicula buscarPeliculaPorNombre(String nombre) {
        ObservableList<Pelicula> peliculas = catalogo.getItems();
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getNombre().equalsIgnoreCase(nombre)) {
                return pelicula;
            }
        }
        return null;
    }
    private void mostrarInformacionPelicula(Pelicula pelicula) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(pelicula.getNombre());
        alert.setHeaderText(null);
        alert.setGraphic(null); // Esto elimina el icono de la alerta

        VBox content = new VBox();
        content.setSpacing(10);

        Label nombre = new Label("Nombre: " + pelicula.getNombre());
        Label director = new Label("Director: " + pelicula.getDirector());
        Label genero = new Label("Género: " + pelicula.getGenero());
        Label anio = new Label("Año: " + pelicula.getAnio());
        Label descripcion = new Label("Descripción: " + pelicula.getDescripcion());
        descripcion.setWrapText(true); // Para que el texto se ajuste automáticamente
        descripcion.setMaxWidth(400); // Ancho máximo para la descripción

        // Agregar la imagen si la URL no es null
        if (pelicula.getPoster() != null && !pelicula.getPoster().isEmpty()) {
            ImageView imageView = new ImageView(new Image(pelicula.getPoster()));
            imageView.setFitWidth(200); // Ancho máximo de la imagen
            imageView.setPreserveRatio(true);
            content.getChildren().add(imageView);
        }

        content.getChildren().addAll(nombre, director, genero, anio, descripcion);

        alert.getDialogPane().setContent(content);

        alert.showAndWait();
    }
   
    private void mostrarAlerta(Alert.AlertType tipo, String titulo, String contenido) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(contenido);
        alert.showAndWait();
    }
}
