package guilhermenieto.projects.arquiteturaspring.montadora;

import java.awt.*;

public class HondaHRB extends Carro{
    public HondaHRB(Motor motor) {
        super(motor);
        setModelo("HRV");
        setColor(Color.BLACK);
        setMontadora(Montadora.HONDA);
    }
}
