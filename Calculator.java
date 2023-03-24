/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author MS
 */
public class Calculator extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    private TextField number1Field;
    private TextField number2Field;
    private TextField resultField;
    @Override
    public void start(Stage stage) throws Exception {
            stage.setTitle("Calculator");       //Title
            GridPane grid = new GridPane();
            grid.setAlignment(Pos.CENTER);
            grid.setHgap(10);
            grid.setVgap(10);
            grid.setPadding(new Insets(25, 25, 25, 25));
            
            //Number one and its Field
            Label number1 = new Label("Number1: ");
            number1.setFont(Font.font("Times New Roman", 16));
            grid.add(number1, 0, 0);
            number1Field = new TextField();
            grid.add(number1Field, 1, 0);
            //Number two and its Field
            Label number2 = new Label("Number2: ");
            number2.setFont(Font.font("Times New Roman", 16));
            grid.add(number2, 0, 1);
            number2Field = new TextField();
            grid.add(number2Field, 1, 1);
            //Result
            Label result = new Label("Result: ");
            result.setFont(Font.font("Times New Roman", 16));
            grid.add(result, 0, 2);
            resultField = new TextField();
            grid.add(resultField, 1, 2);
            resultField.setFocusTraversable(false);
            
            //create buttons
            HBox buttons = new HBox();
            Button addButton = new Button("+");
            addButton.setOnAction(e -> add());
            Button subButton = new Button("-");
            subButton.setOnAction(e -> sub());
            Button multiButton = new Button("*");
            multiButton.setOnAction(e -> multiply());
            Button divideButton = new Button("/");
            divideButton.setOnAction(e -> divide());
            buttons.getChildren().addAll(addButton, subButton, multiButton, divideButton);
            buttons.setSpacing(10);
            grid.add(buttons, 1, 3);
            Scene scene = new Scene(grid, 400, 250);
            stage.setScene(scene);
            stage.show();
    }
    //adding method
    private void add(){
        double number1 = Double.parseDouble(number1Field.getText());
        double number2 = Double.parseDouble(number2Field.getText());
        double result = number1 + number2;
        resultField.setText(String.valueOf(result));
    }
    //subtract method
    private void sub(){
        double number1 = Double.parseDouble(number1Field.getText());
        double number2 = Double.parseDouble(number2Field.getText());
        double result = number1 - number2;
        resultField.setText(String.valueOf(result));
    }
    //multiply method
    private void multiply(){
        double number1 = Double.parseDouble(number1Field.getText());
        double number2 = Double.parseDouble(number2Field.getText());
        double result = number1 * number2;
        resultField.setText(String.valueOf(result));
    }
    //divide method
    private void divide(){
        double number1 = Double.parseDouble(number1Field.getText());
        double number2 = Double.parseDouble(number2Field.getText());
        double result = number1 / number2;
        resultField.setText(String.valueOf(result));
    }
}
