import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import processing.video.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Camera extends PApplet {



Capture video;

public void setup() {
  
  video = new Capture(this, 640, 480, 30);
  video.start();
}

public void captureEvent(Capture video) {
video.read();
}

public void draw() {
  background(0);
  tint(255, mouseY, mouseY);
  image(video, 0, 0, mouseX, mouseY);
}
  public void settings() {  size (600, 400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Camera" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
