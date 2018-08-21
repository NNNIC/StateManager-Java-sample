import java.util.function.Consumer;

public class StateManager {
    Consumer<Boolean> m_curfunc;
    Consumer<Boolean> m_nextfunc;

    public void Goto(Consumer<Boolean> func) {
        m_nextfunc = func;
    }

    public void Update() {
        Boolean bFirst = false;
        if (m_nextfunc != null) {
            m_curfunc = m_nextfunc;
            m_nextfunc = null;
            bFirst = true;
        }
        if (m_curfunc!=null) {
            m_curfunc.accept(bFirst);
        }
    }

    public Boolean CheckState(Consumer<Boolean> func) {
        return (m_curfunc == func);
    }
}