public class ScoreRegister1 implements MyObserver {
    
    @Override
    public void update(Source o) {
        System.out.println("live result : " + ((HeadQuater) o).getSomeData());
    }
}