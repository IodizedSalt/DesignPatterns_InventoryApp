import java.util.ArrayList;

public class GenerateData {

        public ArrayList<Item> getList() {
            ItemFactory itemFactory = new ItemFactory();
            Item car = itemFactory.getItem("Vegetable");
            car.setName("Carrot");
            car.setAmount(4);
            ArrayList<Item> items = new ArrayList<>();
            items.add(car);
            return items;
        }

}
