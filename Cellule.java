public class Cellule {
    private boolean life;
    public Cellule(boolean vivante) {
        this.life = vivante;
    }

    public boolean isAlife() {
        return life;
    }

    public void setLife(boolean life) {
        this.life = life;
    }
    @Override
    public String toString() {
        //return vivante ? "NON" : "OUI";
        return life ? "⬛" : "⬜";
    }
}
