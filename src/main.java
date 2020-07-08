public class main {

    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        Reader john = new Reader("John");
        Reader marry = new Reader("Marry");
        Reader lin = new Reader("Lin");
        john.subcribe(magazine);
//        marry.subcribe(magazine);
//        lin.subcribe(magazine);
        System.out.println("---------------");
        john.unSubcribe(magazine);
    }
}
