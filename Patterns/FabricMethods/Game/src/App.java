import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.ItemGenerator;
import Fabric.GemGenerator;
import Fabric.GolgGenerator;

public class App {
    public static void main(String[] args) throws Exception {
      Random rnd = ThreadLocalRandom.current();

      
        List<ItemGenerator> generatorList = new ArrayList<>();
       generatorList.add(new GolgGenerator());
       generatorList.add(new GemGenerator());
       for (int i = 0; i<10; i++)
       {
        int index = rnd.nextInt(2);
        generatorList.get(index).openReward();
       }\
    }
}
