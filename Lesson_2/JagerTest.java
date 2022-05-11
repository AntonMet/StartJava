class JagerTest {
    public static void main(String[] args) {
        Jager chernoAlpha = new Jager();
        chernoAlpha.setName("Cherno Alpha");
        chernoAlpha.setYearOfIssue(2015);
        chernoAlpha.setMark("Mark-1");
        chernoAlpha.setDestroid(true);
        chernoAlpha.setOrigin("Russia");
        chernoAlpha.setHeight(85.34);
        chernoAlpha.setWeight(2.412);
        chernoAlpha.setSpeed(3);
        chernoAlpha.setArmor(10);
        Jager strikerEureka = new Jager();
        strikerEureka.setName("Striker Eureka");
        strikerEureka.setYearOfIssue(2019);
        strikerEureka.setMark("Mark-5");
        strikerEureka.setDestroid(true);
        strikerEureka.setOrigin("Australia");
        strikerEureka.setHeight(76.2);
        strikerEureka.setWeight(1.850);
        strikerEureka.setSpeed(10);
        strikerEureka.setArmor(10);
        chernoAlpha.run();
        strikerEureka.run();
        chernoAlpha.repairTheRobot();
        strikerEureka.repairTheRobot();
        chernoAlpha.run();
        strikerEureka.run();
    }
}