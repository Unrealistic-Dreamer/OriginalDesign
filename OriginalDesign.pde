int y =70;
boolean up =false;

void setup()
{
  size(400,400);
  background(255,0,0);
}

void draw()
{
base() ;
face() ;
legs() ;
box();
noLoop();
}

void base()
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

void face()
{
fill (0,0,0) ;
ellipse(180,y+50,25,25) ;
ellipse(222,y+50,25,25) ;
}

void legs()
{
fill(0,0,0);
stroke(0,0,0);
ellipse(170,y+155,35,25);
ellipse(230,y+155,35,25);
}

void box()
{
rect (150,150,100,100);
}

void mousePressed()
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
	
