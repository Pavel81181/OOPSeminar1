package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {

    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    public boolean isReturnable;

    public Actor(String name) {
        this.name = name;
    }

    abstract public void setName(String name);
    abstract public String getName();

}