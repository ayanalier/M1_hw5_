public class Hero {
    public Hero(int damage) {
        this.damage = damage;
    }


    private int life;
    private int damage;
    private String superpower;


    public Hero(int life,int damage,String superpower){
        this.life = life;
        this.damage = damage;
        this.superpower = superpower;
    }

    public Hero(int life, int damage) {
        this.life = life;
        this.damage = damage;
    }

    public Hero() {

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }






}
