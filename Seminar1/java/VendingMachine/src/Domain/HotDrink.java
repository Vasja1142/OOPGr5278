package Domain;

public class HotDrink extends Product{
        private float temperature;

        public HotDrink(int price, int place, String name, long id, int temperature) {
            super(price, place, name, id);
            this.temperature = temperature;
        }

        public float getBottleVolume() {
            return temperature;
        }

        public void setBottleVolume(float temperature) {
            this.temperature = temperature;
        }

        @Override
        public String toString()
        {
            return super.toString() + "Temperature = "+temperature+"\n";
        }

}
