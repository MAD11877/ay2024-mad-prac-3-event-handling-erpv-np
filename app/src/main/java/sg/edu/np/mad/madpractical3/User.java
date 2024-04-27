package sg.edu.np.mad.madpractical3;

public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;
    public void setName(String username) {
        this.name = username;
    }
    public void setId(int id) {
        this.id = id;
    }
    public User(String name, String description, int id, boolean followed) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
    }
}
