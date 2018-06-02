import java.awt.*;

public class Bullet extends GameObject{

    public Vector2D velocity;


    //constructor
    public Bullet(){
        this.velocity = new Vector2D();
        this.renderer = new ImageRenderer("resources-rocket/resources/images/circle.png",6,6);
    }

    @Override
    public void run(){
        super.run();
        this.position.addUp(this.velocity);
    }

    public void render(Graphics graphics){
        super.render(graphics);
    }
}
