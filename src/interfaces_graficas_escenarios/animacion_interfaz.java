/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_graficas_escenarios;

import java.util.Scanner;
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
private static int size_x;
private static int size_y;
  public static void main(String[] args) {
      Scanner lectura=new Scanner(System.in);
      System.out.println("Ingrese tamaño en x y y de el escenario");
       size_x=lectura.nextInt();
       size_y=lectura.nextInt();
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
       //Configurar pagina
       Pane panel=new Pane ();
       Canvas tablero=new Canvas(size_x,size_y);
       panel.getChildren().add(tablero);
       Scene escena=new Scene (panel,size_x, size_y,Color.GREEN);
       stage.setScene(escena);
       stage.setTitle("Escenario 1");
       stage.show();
       GraphicsContext lapiz=tablero.getGraphicsContext2D();
       Animacion animacion1=new Animacion (lapiz,size_x,size_y);
       animacion1.start();
       stage.setScene(escena);
       stage.setTitle("Escenario 1");
       stage.show();
    
}
}
