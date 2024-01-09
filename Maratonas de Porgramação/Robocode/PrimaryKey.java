package pk;

import robocode.*;
import java.awt.Color;

/**
 * MyClass - a class by (Guilherme Custodio Nieto)
 */
public class PrimaryKey extends Robot{
	public void run(){
		setColors(Color.red, Color.yellow, Color.green);
		double angulo=0;
		while(true){
			//ahead(100);
			turnRight(angulo);
			angulo += 0.3;
			if (angulo == 360){
				angulo = 0;
			}
		}
	}
	
	public void onScannedRobot(ScannedRobotEvent e){
		double distancia = e.getDistance();
		double energia = e.getEnergy();

		while (distancia > 135){
			ahead(10);
			distancia = e.getDistance();	
			
			fire(3);
			
			while (distancia < 100){
				back(90);
				distancia = e.getDistance();	
				break;
			}
		}
		
		while (distancia < 100){
			back(90);
			distancia = e.getDistance();	
			System.out.println("distancia: " + distancia);
		}


		
	}
		
	
	
public void onHitWall(HitWallEvent e) {
	back(50);
	turnRight(90);
}
	

}
