package PK1;

/**
 * User
 */
public class User implements Cloneable, Comparable<User>{
    private String name;
    private String email;
    private int Id;
    public User(String name, String email, int Id) {
        this.name = name;
        this.email = email;
        this.Id = Id;
    }

    @Override
    public String toString() {
        return "User [Id=" + Id + ", email=" + email + ", name=" + name + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User user = (User) obj;
            if (this.Id == user.Id) {
                return true;
            }
        }
        return false;
    }
    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public int compareTo(User o) {
        // TODO Auto-generated method stub

        return this.Id-o.Id;
       
    }
    //compareTo using address



        

}
    
