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
 private int mov_x;
 private int mov_y;
 private int size_x;
 private int size_y;

    public Animacion(GraphicsContext lapiz,int size_x,int size_y) {
        this.lapiz = lapiz;
        this.carro = new Carro (0,150);
        this.mov_x=1;
        this.mov_y=1;
        this.size_x=size_x;
        this.size_y=size_y;
    }

    @Override
    
    public void handle(long l) {
      this.lapiz.clearRect(0, 0, this.size_x, this.size_y);
      lapiz.setFill(Color.RED);
      this.lapiz.fillRect(this.carro.getChasis().getX(), this.carro.getChasis().getY(),70,40);
      lapiz.setFill(Color.BLACK);
      this.lapiz.fillOval(this.carro.getLlanta1().getX()+5,this.carro.getLlanta1().getY()+30,20,20);
      this.lapiz.fillOval(this.carro.getLlanta2().getX()+45,this.carro.getLlanta2().getY()+30,20,20);
      if((this.carro.getChasis().getX()+70)>this.size_x||(this.carro.getChasis().getX())<0){
      this.mov_x=-(this.mov_x);
      } 
      if((this.carro.getChasis().getY())<0||(this.carro.getChasis().getY()+40)>this.size_y){
      this.mov_y=-(this.mov_y);
      }
      this.carro.mover(mov_x,mov_y);
    }
    
}
