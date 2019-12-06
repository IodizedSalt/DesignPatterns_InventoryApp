import java.util.ArrayList;

public class GenerateData {

        public ArrayList<Item> getList() {
            ItemFactory itemFactory = new ItemFactory();
            Item carrot = itemFactory.getItem("Vegetable");
            carrot.setName("Carrot");
            Item car = itemFactory.getItem("Vegetable");
            car.setName("Carrot");
            ArrayList<Item> items = new ArrayList<>();
            items.add(carrot);
            items.add(car);
            return items;
        }

}
