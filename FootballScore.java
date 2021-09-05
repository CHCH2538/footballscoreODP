import java.util.Scanner;

public class FootballScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScoreRegister1 t1 = new ScoreRegister1();
        ScoreRegister2 t2 = new ScoreRegister2();
        HeadQuater hq = new HeadQuater();

        hq.register(t1);
        hq.register(t2);

        while (true) {
            System.out.print("Enter Score ");
            String score = sc.nextLine();
            if (score.equals("")) {
                break;
            } else {
                hq.setSomeData(score);
            }
        }
    }
}
