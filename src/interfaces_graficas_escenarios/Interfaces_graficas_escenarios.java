/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_graficas_escenarios;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class Interfaces_graficas_escenarios extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
       //Configurar pagina
       Pane panel=new Pane ();
       Canvas tablero=new Canvas(300,300);
       panel.getChildren().add(tablero);
       Scene escena=new Scene (panel, 300, 300,Color.GREEN);
       GraphicsContext lapiz=tablero.getGraphicsContext2D();
       lapiz.strokeLine(0, 0, 300, 300);
       lapiz.strokeLine(300, 0, 0, 300);
       lapiz.setFill(Color.ORANGERED);
       int x_ref=130;
       int y_ref=130;
       lapiz.fillRect(x_ref, y_ref, 40, 40);
        lapiz.setFill(Color.BLACK);
       lapiz.fillOval(x_ref+5, y_ref+40,10,10);
       lapiz.fillOval(x_ref+25, y_ref+40,10,10);
       stage.setScene(escena);
       stage.setTitle("Escenario 1");
       stage.show();
       
    }
    
}
