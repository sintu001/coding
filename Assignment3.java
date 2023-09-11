public class Assignment3 {
    static class Cake {
        private String name;
        private float price;

        public Cake(String name, float price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public void display() {
            System.out.println(name + " : ₹ " + price + " per pound");
        }
    }

    static class Pastry extends Cake {
        public Pastry(String name, float price) {
            super(name, price);
        }

        @Override
        public void display() {
            System.out.println(getName() + " : ₹ " + getPrice() + " per piece");
        }
    }

    public static void main(String[] args) {
        Cake[] cakes = {
                new Cake("Chocolate Brownie", 250.0f),
                new Cake("Chocolate Maple", 300.0f)
        };

        Pastry[] pastries = {
                new Pastry("Black Forest", 35.0f),
                new Pastry("Choco Truffle", 40.0f)
        };

        System.out.println("Today's Special Menu");
        System.out.println("--------------------------------------------------");
        System.out.println("Special Cakes");
        System.out.println("---------------------------------------------");
        for (Cake cake : cakes) {
            cake.display();
        }

        System.out.println("Special Pastries");
        System.out.println("---------------------------------------------");
        for (Pastry pastry : pastries) {
            pastry.display();
        }
    }
}
