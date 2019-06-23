/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_graficas_escenarios;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class Animacion extends AnimationTimer{
private GraphicsContext lapiz;
private Carro carro;
 private int mov_x;
 private int mov_y;
 private int size_x;
 private int size_y;
 private int vida;
 private ArrayList <Obstaculo> obstaculos;
 private Image fondo=null;
 private Image UFO=null;
 private int animacion_UFO;
 private int contador;


    public Animacion(GraphicsContext lapiz,int size_x,int size_y,int num_obst) {
        this.lapiz = lapiz;
        this.carro = new Carro (0,150);
        this.mov_x=1;
        this.mov_y=1;
        this.fondo=new Image("/Imagenes/fondo.png");
        this.size_x=size_x;
        this.size_y=size_y;
        this.obstaculos=new ArrayList <>();
        for(int i=0;i<num_obst;i++){
          this.obstaculos.add(new Obstaculo (i*100,i*100));
                }
        this.animacion_UFO=0;
    }

    @Override
    
    public void handle(long l) {
      //
      
      this.lapiz.clearRect(0, 0, this.size_x, this.size_y);  
      lapiz.drawImage(fondo, 0, 0);
      if(this.contador%30==0){
      if(this.animacion_UFO<5){
          this.UFO=new Image("/Imagenes/ufo_"+this.animacion_UFO+".png");
          this.animacion_UFO++;
         
      }else{
          animacion_UFO=0;
         
      }
      }
    
      lapiz.drawImage(UFO, this.carro.getChasis().getX(), this.carro.getChasis().getY());
       /*
      lapiz.setFill(Color.RED);
      this.lapiz.fillRect(this.carro.getChasis().getX(), this.carro.getChasis().getY(),70,40);
      lapiz.setFill(Color.BLACK);
      this.lapiz.fillOval(this.carro.getLlanta1().getX()+5,this.carro.getLlanta1().getY()+30,20,20);
      this.lapiz.fillOval(this.carro.getLlanta2().getX()+45,this.carro.getLlanta2().getY()+30,20,20);
*/
      if((this.carro.getChasis().getX()+70)>this.size_x||(this.carro.getChasis().getX())<0){
      this.mov_x=-(this.mov_x);
      } 
      if((this.carro.getChasis().getY())<0||(this.carro.getChasis().getY()+40)>this.size_y){
      this.mov_y=-(this.mov_y);
      }
      this.carro.mover(mov_x,mov_y);
      this.lapiz.setFill(Color.WHITE);
      this.lapiz.fillRect(size_x-100, size_y-20, 100, 20);
      this.lapiz.setFill(Color.GREENYELLOW);
      this.lapiz.fillRect(size_x-100, size_y-20, 100-vida, 20);
      
      this.lapiz.setFill(Color.BLUE);
      
      Shape carro= new Rectangle (this.carro.getChasis().getX(),this.carro.getChasis().getY()
              ,70,40);
      Shape [] obstaculos_shapes= new Rectangle [this.obstaculos.size()];
      Shape [] intersecciones= new Shape[this.obstaculos.size()];
      for(int i=0;i<this.obstaculos.size();i++){
          this.lapiz.fillRect(this.obstaculos.get(i).getX(), this.obstaculos.get(i).getY(), 50, 50);
          obstaculos_shapes[i]=new Rectangle (this.obstaculos.get(i).getX(), this.obstaculos.get(i).getY(), 50, 50);
          intersecciones[i]=SVGPath.intersect(carro, obstaculos_shapes[i]);
          if(intersecciones[i].getLayoutBounds().getWidth()!=-1&&this.obstaculos.get(i).getIsActivo()==true){
              this.obstaculos.get(i).setIsActivo(false);
              vida=(vida+5);
          }
      }
    this.contador++;
    }
    
}
