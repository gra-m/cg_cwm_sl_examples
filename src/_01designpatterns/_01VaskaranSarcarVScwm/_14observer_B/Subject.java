package _01designpatterns._01VaskaranSarcarVScwm._14observer_B;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

public class Subject implements SubjectInterface{
    List<Observer> observerList = new ArrayList(3);
    private int flag;

    public int getFlag(){
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
        // Value change == notify users:
        notifyRegisteredUsers(flag);
    }

    @Override
    public void register(Observer anObserver) {
        if(!isNull(anObserver))
            observerList.add(anObserver);
    }

    @Override
    public void unregister(Observer anObserver) {
        if(!isNull(anObserver))
            observerList.remove(anObserver);
    }

    private void notifyRegisteredUsers(int updatedValue) {
        for (Observer observer : observerList)
            observer.update(updatedValue);
    }
}
