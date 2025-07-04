package min.java.test;

public abstract class AbInstance {
    protected abstract void go();
    static AbInstance instance = new AbInstance(){
        @Override
        protected void go() {

        }
    };
    public static AbInstance getInstance(){
        return instance;
    }
}
