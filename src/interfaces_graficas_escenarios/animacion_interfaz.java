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

/**
 *
 * @author Estudiante
 */
public class animacion_interfaz extends Application {

  public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
       //Configurar pagina
       Pane panel=new Pane ();
       Canvas tablero=new Canvas(1000,300);
       panel.getChildren().add(tablero);
       Scene escena=new Scene (panel, 1000, 300,Color.GREEN);
       stage.setScene(escena);
       stage.setTitle("Escenario 1");
       stage.show();
       GraphicsContext lapiz=tablero.getGraphicsContext2D();
       Animacion animacion1=new Animacion (lapiz);
       animacion1.start();
       stage.setScene(escena);
       stage.setTitle("Escenario 1");
       stage.show();
    
}
}
