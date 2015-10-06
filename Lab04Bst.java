// Lab04Bst.java
// The Expo Graphics Program
// This is the student, starting version, of Lab 04B.


import java.awt.*;
import java.applet.*;


public class Lab04Bst extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
		
		
		Expo.drawRectangle(g,50,100,250,300); //First Square
		Expo.drawRectangle(g,100,150,300,350); // Second Sqaure
		// Connections for Cube 
		Expo.drawLine(g,250,300,300,350);
		Expo.drawLine(g,50,100,100,150);
		Expo.drawLine(g,50,300,100,350);
		Expo.drawLine(g,250,100,300,150);
	
		
		
		// DRAW TARGET
		Expo.drawCircle(g,600,200,20);
		Expo.drawCircle(g,600,200,40);
		Expo.drawCircle(g,600,200,60);
		Expo.drawCircle(g,600,200,80);
		Expo.drawCircle(g,600,200,100);


		// DRAW TRIANGLE
		// Triangle Sides
		Expo.drawLine(g,700,500,800,500);
		Expo.drawLine(g,700,500,750,400);
		Expo.drawLine(g,800,500,750,400);
		// Lines in Triangle
		Expo.drawLine(g,750,500,750,400);
		Expo.drawLine(g,700,500,775,450);
		Expo.drawLine(g,800,500,725,450);


		// DRAW SMILEY FACE
		// Face
		Expo.drawOval(g,400,400,50,75);
		// Eyes
		Expo.drawCircle(g,380,375,10);
		Expo.drawCircle(g,420,375,10);
		Expo.drawPoint(g,380,375);
		Expo.drawPoint(g,420,375);
		// Eyebrows
		Expo.drawArc(g,380,375,10,20,300,60);
		Expo.drawArc(g,420,375,10,20,300,60);
		// Smile
		Expo.drawArc(g,400,425,40,10,100,270);




		// DRAW JPII






	}

}


