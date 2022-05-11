class Jager {
    private String name;
    private int yearOfIssue;
    private String mark;
    private boolean destroid;
    private String origin;
    private double height;
    private double weight;
    private int speed;
    private int armor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public boolean isDestroid() {
        return destroid;
    }

    public void setDestroid(boolean destroid) {
        this.destroid = destroid;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void run() {
        if (destroid) {
            System.out.println("Робот не может бежать, так как он разрушен");
        } else {
            System.out.println(name + " бежит со скоростью " + speed);
        }
    }

    public void repairTheRobot() {
        destroid = false;
        System.out.println("Робот починен");
    }
}