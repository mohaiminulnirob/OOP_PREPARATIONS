package LambdaExpression;
public class Product implements Comparable<Product> {
        int id;
        String name;
        float price;
        public Product(int id, String name, float price) {
            super();
            this.id = id;
            this.name = name;
            this.price = price;
        }
        public int compareTo(Product st) {
        if (id == st.id)
            return 0;
        else if (id < st.id)
            return -1;
        else
            return 1;
    }
    }

