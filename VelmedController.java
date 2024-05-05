import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.fxml.FXML;

public class VelmedController
{
    @FXML
    private TextField textFieldDistancia;
    @FXML
    private TextField textFieldTempo;
    @FXML
    private Label labelResultado;

    private VelmedView VelmedView;
    private Stage stage;
    
    public VelmedController()
    {
        this.stage = new Stage();
        this.VelmedView = new VelmedView();
        this.VelmedView.setController(this);
    }
    
    public void iniciar() throws Exception {
        this.VelmedView.start(this.stage);
        this.stage.show();
    }
    
    @FXML
    public void botaoCalcularClicado(ActionEvent e) {
        try {
            double Distancia = Double.parseDouble(textFieldDistancia.getText());
            double Tempo = Double.parseDouble(textFieldTempo.getText());
            Velmed velmed = new Velmed(Distancia, Tempo);
            this.labelResultado.setText(velmed.interpretar());
        } catch (NumberFormatException exception) {
            labelResultado.setText("Dados de entrada incompletos ou inválidos");
        }
    }
    
    @FXML
    public void botaoLimparClicado(ActionEvent e) {
        textFieldDistancia.setText("");
        textFieldTempo.setText("");
        labelResultado.setText("");
    }    
}
