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
    Background background;
    List<Star> stars;

    Player player;
    private Random random = new Random();
    private FrameCounter frameCounter = new FrameCounter(30);
    private EnemySpawner enemySpawner = new EnemySpawner();



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
        this.background = new Background();


        this.setupPlayer();

        this.setupStar();


    }

    private  void setupPlayer(){
        this.player = new Player();
        this.player.position.set(500,300);
        this.player.playerMove.velocity.set(4,0);
    }

    private void setupStar(){
        this.stars = new ArrayList<>();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(this.backBuffered,0,0,null);

    }

    public void renderAll(){
        this.background.render(graphics);

        this.stars.forEach(star -> star.render(graphics));

        this.enemySpawner.enemies.forEach(enemy -> enemy.render(graphics));

        this.player.render(graphics);
        this.repaint();
    }


    public void runAll(){
        this.createStar();
        this.stars.forEach(star -> star.run());

        this.enemySpawner.enemies.forEach(enemy -> {
            Vector2D velocity = player.position.subtract(enemy.position).normalize()
                    .multiply(2.0f);
            enemy.velocity.set(velocity);
        });



        this.enemySpawner.run();
        this.player.run();

    }

    private  void createStar(){
        if(this.frameCounter.run()){
            Star star = new Star();
            star.position.set(1024,this.random.nextInt(600));
            star.velocity.set(-(this.random.nextInt(3)+1),0);

            this.stars.add(star);
            this.frameCounter.reset();
        }
    }



}
