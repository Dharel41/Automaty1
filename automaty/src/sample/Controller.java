package sample;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class Controller{

    public Canvas canvas;
    public TextField text_field1;
    public TextField text_field2;
    private int iteration;
    public ComboBox comboBox;
    ObservableList<String> rule;
    private Alert alert = new Alert(Alert.AlertType.ERROR);
    private Alert alert2 = new Alert(Alert.AlertType.ERROR);
    private int size=5;


    public void start(ActionEvent actionEvent) {
        Principle principle=new Principle();
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLACK);
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

try {
    iteration = Integer.parseInt(text_field1.getText());
    principle.size = Integer.parseInt(text_field2.getText());
    principle.board = new int[principle.size];
    principle.next_step = new int[principle.size];
    for (int i = 0; i < principle.size; i++) {
        principle.board[i] = 0;
    }
    principle.board[principle.size / 2] = 1;

    if(principle.size>256)
    {
        size=1500/principle.size;
        if(size<1)
        {
            size=1;
            principle.board[principle.size / 2] = 0;
            principle.board[640] = 1;

        }
    }
    else
    {
        size=5;
    }

    for (int j = 0; j < iteration; j++) {
        for (int i = 0; i < principle.size; i++) {
            if (principle.board[i] == 1) {
                gc.fillRect(i * size, j * size, size, size);
            }
        }
        if (comboBox.getValue().toString().equals("Rule 30"))
            principle.rule_30();
        if (comboBox.getValue().toString().equals("Rule 60"))
            principle.rule_60();
        if (comboBox.getValue().toString().equals("Rule 90"))
            principle.rule_90();
        if (comboBox.getValue().toString().equals("Rule 120"))
            principle.rule_120();
        if (comboBox.getValue().toString().equals("Rule 225"))
            principle.rule_225();

    }

}
catch(NumberFormatException e)
{
    alert.setTitle("Error Dialog");
    alert.setHeaderText("Incorrect number of iterations/size");
    alert.showAndWait();
}
catch(NullPointerException e)
{
    alert2.setTitle("Error Dialog");
    alert2.setHeaderText("You didn't choose a rule");
    alert2.showAndWait();

}
    }
    public void configurate(){
        ObservableList<String> rule =
                FXCollections.observableArrayList("Rule 30","Rule 60","Rule 90","Rule 120","Rule 225");
        comboBox.setItems(rule);
    }
}
