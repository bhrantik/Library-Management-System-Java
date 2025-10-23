public class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showUser() {
        System.out.println("User ID: " + id + ", Name: " + name);
    }
}
