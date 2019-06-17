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
public class Obstaculo extends Objeto {
private boolean isActivo;

    public Obstaculo( int x, int y) {
        super(x, y);
        this.isActivo = true;
    }
    

    public boolean getIsActivo() {
        return isActivo;
    }
    public void setIsActivo(boolean isActivo) {
        this.isActivo = isActivo;
    }
    
    
}
