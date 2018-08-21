public class Test {
    public static void main(String[] args) {

        System.out.println("Hello!");

        Sub sm = new Sub();
        sm.Start();

        while(!sm.IsEnd()){
            sm.Update();
        }

        System.out.println("Bye!");
    }
}
 