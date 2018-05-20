import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class GameCanvas extends JPanel {

    BufferedImage starImage;
    BufferedImage enemyImage;
    BufferedImage playerImage;



    public int positionXStar = 400;
    public int positionYStar = 300;

    public int positionXEnemy = 500;
    public int positionYEnemy = 0;

    public int positionXPlayer= 400;
    public int positionYPlayer = 200;

    public GameCanvas()  {
        this.setSize(1024, 600);


        //load image
        try {
            this.starImage = ImageIO.read(new File("resources-rocket/resources/images/star.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.setVisible(true);

        try {
            this.enemyImage = ImageIO.read(new File("resources-rocket/resources/images/circle.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            this.playerImage = ImageIO.read(new File("resources-rocket/resources/images/circle.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0,0,1024, 600);
        g.drawImage(this.starImage, this.positionXStar,this.positionYStar,5,5,null);
        g.drawImage(this.enemyImage, this.positionXEnemy,this.positionYEnemy,10,10,null);
        g.drawImage(this.playerImage, this.positionXPlayer,this.positionYPlayer,50,50,null);

    }
}