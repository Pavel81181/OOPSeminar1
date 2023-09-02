package Interfaces;
/**
 * Интерфейс возврата товара
 */

public interface iReturnOrder {
    /**
     * Метод, позволяющий узнать, может ли товар быть возвращен
     * @param canBeReturned
     * @return
     */
    public boolean isReturnable(boolean canBeReturned); 
    /**
     *  Метод, позволяющий вернуть товар по его ID
     * @param orderId
     * @return
     */
    public boolean returnOrder(int orderId); 
    
    
}
