/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_graficas_escenarios;

/**
 *
 * @author Estudiante
 */
public class Carro extends Objeto{
private Chasis chasis;
private Llanta llantas;
    public Carro(int x, int y) {
        super(x, y);
       this.chasis=new Chasis (x,y);
        
    } 
    @Override
    public void mover() {
        this.x++;
    }
    
}
