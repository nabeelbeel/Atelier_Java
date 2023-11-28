package PK1;

public class Client extends User {
   
    private String address;
    private String phone;
    public Client(String name, String email, int Id, String address, String phone) {
        super(name, email, Id);
        this.address = address;
        this.phone = phone;
    }
    @Override
    public String toString() {
        return  super.toString() +" [address=" + address + ", phone=" + phone + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if (obj==null) {
            return false;
        }
        if (obj instanceof Client) {
            Client client = (Client) obj;
             return this.address == client.address &&this.phone== client.phone;
           

        }
        return false;
    }
    @Override
    public Client clone()  {
     
            return (Client) super.clone();
        
    }
    @Override
    public int compareTo(User o) {
        // TODO Auto-generated method stub
        return super.compareTo(o);
    }
    //compareTo using address
    public int compareTo(Client o) {
        // TODO Auto-generated method stub
        return this.address.compareTo(o.address);
    }
    
    




}
