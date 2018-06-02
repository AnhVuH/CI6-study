import java.awt.*;
import java.awt.image.BufferedImage;

public class Star {
    public BufferedImage image;
    public Vector2D position;
    private Renderer renderer;
    public Vector2D velocity;

    //constructor

    public Star() {
        this.position = new Vector2D();
        this.velocity = new Vector2D();
        this.renderer = new ImageRenderer("resources-rocket/resources/images/star.png",5,5);
    }

    public void run(){
        this.position.addUp(this.velocity);
    }

    public void render(Graphics graphics){
        this.renderer.render(graphics,position);
    }
}
