public enum Planet {
    MERCURY(520),
    VENUS(300),
    EARTH(800);

    private int mass;

    Planet(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return this.mass;
    }
}
