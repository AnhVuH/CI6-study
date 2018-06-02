import java.awt.*;

public class BackgroundRenderer implements Renderer{

        private int width;
        private int height;
        private Color color;
    public BackgroundRenderer(Color color, int width, int height){
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public void render(Graphics graphics, Vector2D position){
        graphics.setColor(color);
        graphics.fillRect((int)position.x, (int)position.y,this.width, this.height);
    }

}