package Labs;

import TurtleGraphics.StandardPen;
import java.util.Random;
import java.awt.*;

public class DrawSquare1
{
public static void main(String[] args)
{
	Random gen = new Random();
	StandardPen pen = new StandardPen();


	// puts the pen in the pos to start shape
	pen.up();
	pen.move(25);
	pen.turn(90); pen.move(25);
	pen.down();
	pen.move (100);


	pen.setColor(Color.red);


























//	pen.turn(90); pen.move(100);
	//pen.setWidth(10);
//	pen.turn(90); pen.move(100);
//	pen.setColor(Color.green);
//	pen.turn(90); pen.move(100);


/*	for (int i = 25; i <720; i++)
	{
		pen.turn(i*3);
		pen.move(20);
	}

*/



/**/




/*
	for(int i =0;i<1000;i++)
	{
	pen.move(25);
	pen.turn(gen.nextInt(90)+1);
	}
	pen.move(25);
	pen.turn(gen.nextInt(90)+1);
	pen.move(25);
	pen.turn(gen.nextInt(90)+1);
	pen.move(25);
	pen.turn(gen.nextInt(90)+1);
	pen.move(25);
	pen.turn(gen.nextInt(90)+1);
	pen.move(25);
	pen.turn(gen.nextInt(90)+1);
	pen.move(25);
*/
}
}