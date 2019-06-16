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
private Llanta llanta1;
private Llanta llanta2;

    public Chasis getChasis() {
        return chasis;
    }
    public Llanta getLlanta1() {
        return llanta1;
    }
    public Llanta getLlanta2() {
        return llanta2;
    }

    public void setLlanta2(Llanta llanta2) {
        this.llanta2 = llanta2;
    }


    public Carro(int x, int y) {
        super(x, y);
       this.chasis=new Chasis (x,y);
       this.llanta1=new Llanta(x,y);
       this.llanta2=new Llanta(x,y);
    }
    @Override
    public void mover(int mov_x,int mov_y) {
        this.chasis.mover(mov_x,mov_y);
        this.llanta1.mover(mov_x,mov_y);
        this.llanta2.mover(mov_x,mov_y);
    }
    
}
