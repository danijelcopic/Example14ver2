package rs.aleph.android.example12.activities;


public class Pizza {

    private int id;
    private String image;
    private String name;
    private float rating;
    private String ingridients;
    private String category;
    private String calorie;
    private String price;

    public Pizza() {
    }

    public Pizza( String image, String name, float rating, String ingridients, String category, String calorie, String price) {
        this.image = image;
        this.name = name;
        this.rating = rating;
        this.ingridients = ingridients;
        this.category = category;
        this.calorie = calorie;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getIngridients() {
        return ingridients;
    }

    public void setIngridients(String ingridients) {
        this.ingridients = ingridients;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCalorie() {
        return calorie;
    }

    public void setCalorie(String calorie) {
        this.calorie = calorie;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", ingridients='" + ingridients + '\'' +
                ", category='" + category + '\'' +
                ", calorie=" + calorie +
                ", price=" + price +
                '}';
    }
}
