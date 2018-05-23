import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class GameCanvas extends JPanel {


    BufferedImage playerImage;
    BufferedImage backBuffered;

    Graphics graphics;
    List<Star> stars;
    List<Enemy>  enemies;
    private Random random = new Random();
    private int countStar =0;
    private int countEnemy =0;




    public int positionXPlayer= 400;
    public int positionYPlayer = 200;

    public GameCanvas()  {
        this.setSize(1024, 600);
        //load image
        this.setupCharacter();
        this.setupBackbuffered();
        this.setVisible(true);

    }
    private void setupBackbuffered(){
        this.backBuffered = new BufferedImage(1024,600, BufferedImage.TYPE_4BYTE_ABGR);
        this.graphics = this.backBuffered.getGraphics();
    }

    private void setupCharacter(){
        this.playerImage = this.loadImage("resources-rocket/resources/images/circle.png");

        this.setupStar();
        this.setupEnemy();
    }

    private void setupStar(){
        this.stars = new ArrayList<>();
    }
    private void setupEnemy(){
        this.enemies = new ArrayList<>();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(this.backBuffered,0,0,null);

    }

    public void renderAll(){
        this.renderBackground();

        this.stars.forEach(star -> star.render(graphics));
        this.enemies.forEach(enemy -> enemy.render(graphics));

        this.graphics.drawImage(this.playerImage, this.positionXPlayer,this.positionYPlayer,50,50,null);
        this.repaint();
    }
    private void renderBackground(){
        this.graphics.setColor(Color.BLACK);
        this.graphics.fillRect(0,0,1024, 600);
    }

    public void runAll(){
        this.createStar();
        this.createEnemy();
        this.stars.forEach(star -> star.run());
        this.enemies.forEach(enemy -> enemy.run());

    }

    private  void createStar(){
        if(this.countStar==30){
            Star star = new Star(this.loadImage("resources-rocket/resources/images/star.png"),
                    1024,
                    this.random.nextInt(600),
                    5,
                    5,
                    -this.random.nextInt(3)-1,
                    0);
            this.stars.add(star);
            this.countStar =0;
        }else{
            this.countStar +=1;
        }

    }
    private void createEnemy(){
        if(this.countEnemy==20){
            Enemy enemy = new Enemy(this.loadImage("resources-rocket/resources/images/circle.png"),
                    this.random.nextInt(1024),
                    this.random.nextInt(600),
                    20,
                    20,
                    this.random.nextInt(4)+1,
                    this.random.nextInt(3));
            this.enemies.add(enemy);
            this.countEnemy =0;
        }
        else{
            this.countEnemy +=1;
        }
    }


    private BufferedImage loadImage(String path){
        try{
            return ImageIO.read(new File(path));
        }catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
