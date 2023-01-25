class Roket {
    private String name;
    private double lenMetr;
    private int power;
    private int stypeni;


    public Roket(String name, double lenMetr, int power, int stypeni) {
        this.name = name;
        this.lenMetr = lenMetr;
        this.power = power;
        this.stypeni = stypeni;
    }

    private void hello() {
        System.out.println("Привіт я ракета " + name);
    }


    private boolean bul(int distance) {
        if (distance < power * 100) {
            return true;
        } else return false;
    }

    private  boolean bul(double distance) {
        if (distance < power * 100) {
            return true;
        } else return false;
    }

    void helloH(){
        hello();
    }

    boolean aBoolean(double dist){
        return bul(dist);
    }
    boolean bBoolean(int dist){
        return bul(dist);
    }



    public String getName() {
        return name;
    }

    public double getLenMetr() {
        return lenMetr;
    }

    public int getPower() {
        return power;
    }

    public int getStypeni() {
        return stypeni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLenMetr(double lenMetr) {
        this.lenMetr = lenMetr;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setStypeni(int stypeni) {
        this.stypeni = stypeni;
    }
}
