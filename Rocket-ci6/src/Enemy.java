import java.awt.*;
import java.awt.image.BufferedImage;

public class Enemy {
    public BufferedImage image;
    public int x,y;
    public int width, height;
    public int velocityX, velocityY;


    //constructor

    public Enemy(BufferedImage image, int x, int y, int width, int height, int velocityX, int velocityY) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    public void run(){
        this.x += this.velocityX;
        this.y += this.velocityY;
    }

    public void render(Graphics graphics){
        graphics.drawImage(this.image, this.x, this.y,this.width,this.height,null);
    }
}