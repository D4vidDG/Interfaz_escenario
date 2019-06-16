/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_graficas_escenarios;

public abstract class Objeto {
    protected int x;
    protected int y;

    public Objeto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    public void mover(int mov_x,int mov_y){
        this.x=this.x+mov_x;
        this.y=this.y+mov_y;
    };
    
}
