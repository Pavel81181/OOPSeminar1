package Classes;

public class OrdinaryClient extends Actor {

   // private boolean isTakenOrder;
   // private boolean isMakeOrder;

    public OrdinaryClient(String name) {
        super(name);
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public void setTakeOrder(boolean takenOrder) {
        super.isTakeOrder = takenOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    public Actor getActor()
    {
        return this;
    }

    @Override
    public String getName() {
        return super.name;        
    }

    @Override
    public void setName(String name) {
       super.name = name;        
    }

    @Override
    public boolean isReturnable(boolean canBeReturned) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isReturnable'");
    }

    @Override
    public boolean returnOrder(int orderId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnOrder'");
    }


}