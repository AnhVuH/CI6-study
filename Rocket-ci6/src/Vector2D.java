public class Vector2D {
    public float x, y;

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D(){
        this.x =0;
        this.y =0;
    }
    public Vector2D set(float x, float y){
        this.x =x;
        this.y = y;
        return this;
    }

    // kiểu trả về khai báo ở hàm là Vector2D
    public Vector2D set(Vector2D vector2D){
        return this.set(vector2D.x, vector2D.y);
    }

    public Vector2D addUp(float x, float y){
        this.x +=x;
        this.y +=y;
        return this;
    }
    public Vector2D addUp(Vector2D vector2D){
        return this.addUp(vector2D.x, vector2D.y);
    }

    public Vector2D add(float x, float y){
        return new Vector2D(this.x + x, this.y + y);
    }

    public Vector2D add(Vector2D vector2D){
        return this.add(vector2D.x , vector2D.y );
    }

/*
* subtractBy -> thay doi chinh no x2
* subtract -> vecto moi x2
* mulitply(number) -> thay doi chinh no -> return this (nhan x, y voi number)
* length() -> do dai vector
* copy()-> vector moi
* rotate(angle: double) ->vecto moi
* normalize() -> chuan hoa vecto -> vecto moi (x/length, y/length)
* * */

    public Vector2D subtractBy(float x, float y){
        this.x -=x;
        this.y -=y;
        return this;
    }
    public Vector2D subtractBy(Vector2D vector2D){
        return this.subtractBy(vector2D.x, vector2D.y);
    }

    public Vector2D subtract(float x, float y){
        return new Vector2D(this.x - x, this.y - y);
    }

    public Vector2D subtract(Vector2D vector2D){
        return this.subtract(vector2D.x , vector2D.y );
    }

    public Vector2D multiply(float number){
        this.x *=  number;
        this.y *= number;
        return this;
    }

    public float length(){
        return (float)Math.sqrt(Math.pow((double)this.x,2)+ Math.pow((double)this.y,2));
    }

    public Vector2D copy(){
        return new Vector2D(this.x, this.y);
    }

    public Vector2D rotate(double angle){
        double radians = Math.toRadians(angle);
        float cos = (float) Math.cos(radians);
        float sin = (float) Math.sin(radians);
        return new Vector2D(this.x *cos - this.y*sin, this.x*sin + this.y*cos);
    }


    public Vector2D normalize(){
        float length = this.length();
        return new Vector2D(this.x/length, this.y/length);
    }




}
