import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Player {

    public Vector2D position;
    public PlayerMove playerMove;
    public PlayerShoot playerShoot;

    private Renderer renderer;


    public Player() {
        this.position = new Vector2D();

        this.renderer = new PolygonRenderer(
                Color.RED,
                new Vector2D(),
                new Vector2D(0, 16),
                new Vector2D(20, 8)
        );
        this.playerMove = new PlayerMove();
        this.playerShoot = new PlayerShoot();
    }

    public void run() {
        this.playerMove.run(this);
        this.playerShoot.run(this);
        this.playerShoot.bulletPlayers.forEach(bullet -> bullet.run());
        ((PolygonRenderer)this.renderer).angle = this.playerMove.angle;

    }

   public void render(Graphics graphics) {
        this.renderer.render(graphics,position);
        this.playerShoot.bulletPlayers.forEach(bullet -> bullet.render(graphics));
   }


}


