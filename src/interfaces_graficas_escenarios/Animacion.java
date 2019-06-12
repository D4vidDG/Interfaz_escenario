/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_graficas_escenarios;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Animacion extends AnimationTimer{
private GraphicsContext lapiz;
private Carro carro;

    public Animacion(GraphicsContext lapiz) {
        this.lapiz = lapiz;
        this.carro = new Carro (0,150);
    }

    @Override
    
    public void handle(long l) {
      this.lapiz.clearRect(0, 0, 300, 300);
      lapiz.setFill(Color.RED);
      this.lapiz.fillRect(this.carro.getX(), this.carro.getY(),40, 40);
      this.carro.mover();
      
    }
    
}
