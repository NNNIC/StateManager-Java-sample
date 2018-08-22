import java.util.function.Consumer;

class Sub extends StateManager {

    Consumer<Boolean> S_START=(bFirst)->{
        if (bFirst) {
            System.out.println("Into S_START");
        }
        this.Goto(this.S_0001);
    };
    Consumer<Boolean> S_0001=(bFirst)->{
        if (bFirst) {
            System.out.println("Into S_0001");
        }
        this.SetNextState(this.S_END);
        this.GoNextState();
    };
    Consumer<Boolean> S_END=(bFirst)->{
        if (bFirst) {
            System.out.println("Into S_END");
        }
    };
    
    public void Start()
    {
        this.Goto(this.S_START);
    }
    
    public Boolean IsEnd()
    {
        return this.CheckState(this.S_END);
    }
}
