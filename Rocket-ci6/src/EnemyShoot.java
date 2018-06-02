import java.util.ArrayList;
import java.util.List;

public class EnemyShoot {
    public List<Bullet> bulletEnemies;
    private int count =0;

    public EnemyShoot(){
        this.bulletEnemies = new ArrayList<>();
    }
    public void run(Enemy enemy){
        //create bullet
        if (this.count == 50){
            for (double angle =0; angle <=360; angle +=30.0){
                Bullet bullet = new Bullet();
                bullet.position.set(enemy.position);
                bullet.velocity.set(new Vector2D(3,0).rotate(angle));
                this.bulletEnemies.add(bullet);
            }
            count =0;
        }
        else{
            count +=1;
        }


    }

}
