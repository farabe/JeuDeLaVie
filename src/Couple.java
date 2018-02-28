
public class Couple {
    private int x;
    private int y;

    public Couple(){

    }

    public Couple(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }



    public void setY(int x){
        this.y = x;
    }

    public boolean equals (Object o){
        if (this.x == ((Couple) o).getX() && this.y == ((Couple) o).getY()){
            return true;
        }
        else
            return false;
    }

    private int getY() {
        return getY();
    }
}
