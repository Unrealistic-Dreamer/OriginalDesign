import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int y =70;
boolean up =false;

public void setup()
{
  size(400,400);
  background(255,0,0);
}

public void draw()
{
base() ;
face() ;
legs() ;
box();
noLoop();
}

public void base()
{
fill (0,0,0) ;
stroke (0,0,0) ;
ellipse(170,y,30,30);
ellipse(230,y,30,30);

fill (0,0,0) ;
stroke (0,0,0) ;
ellipse (200,y+105,75,100);

fill (255,255,255);
ellipse (200,y+115,75,80);
fill(255,255,255) ;
ellipse(200,y+30,80,80) ;
}

public void face()
{
fill (0,0,0) ;
ellipse(180,y+50,25,25) ;
ellipse(222,y+50,25,25) ;
}

public void legs()
{
fill(0,0,0);
stroke(0,0,0);
ellipse(170,y+155,35,25);
ellipse(230,y+155,35,25);
}

public void box()
{
rect (150,150,100,100);
}

public void mousePressed()
{


	background(255,0,0);
	redraw();

	

	if(up=true){
		y= y-10;

	}



	if (up=false){
		y=y+10;
	}

	
	


}
	
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
