import processing.core.PApplet;

public class TryProcessing extends PApplet{
    public static void main(String[] args){PApplet.main("TryProcessing", args);}
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    int[] X_Coordinate = {0,0,0,0};
    int[] speed = {1,2,3,4};
    int noOfBalls = speed.length;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }
    @Override
    public void draw() {
        for(int iteration = 0; iteration < noOfBalls ; iteration++){
            ellipse(X_Coordinate[iteration] += speed[iteration], HEIGHT * speed[iteration] / 5, DIAMETER, DIAMETER);
        }
    }
}