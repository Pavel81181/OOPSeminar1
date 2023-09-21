package Fabric;

import Interfaces.iGameItem;
import Product.GoldReward;

public class GolgGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new GoldReward();
    }
    
    
}
