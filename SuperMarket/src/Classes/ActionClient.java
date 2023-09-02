package Classes;

/**
 * Класс для акционного клиента
 */
public class ActionClient extends Actor{
    private String actionName;
    private int clienId;
    private static int actionClientCount;
    
    /**
     * Конструктор класса
     * @param actionName название акции
     * @param clienId идентификатор клиента
     */
    public ActionClient (String name, String actionName, int clienId) {
        super(name);
        this.actionName = actionName;
        this.clienId = clienId;
        actionClientCount ++;
    }
    /**
     * Метод получения названия акции
     * @return название акции
     */
    public String getActionName () {
        return actionName;
    } 
    
    /**
     * Метод получения Id клиента
     * @return Id клиента
     */
    public int getClienId() {
        return clienId;
    }

    /**
     * Метод получения количества участников акции
     * @return количество участников
     */
    public static int getActionClientCount() {
        return actionClientCount;

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