package Exercise5;

public interface Observable {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
}
