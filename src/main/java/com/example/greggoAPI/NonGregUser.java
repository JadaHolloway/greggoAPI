package com.example.greggoAPI;

public class NonGregUser implements User {
    private int uniqueID;
    private GregUser gregUser;

    public NonGregUser(int uniqueID, GregUser gregUser) {
        this.uniqueID = uniqueID;
        this.gregUser = gregUser;
    }

    @Override
    public int getUniqueID() {
        return uniqueID;
    }

   public GregUser getGregUser() {
       return gregUser;
   }

    @Override
    public String toString() {
        return "NonGregUser{" +
                "uniqueID=" + uniqueID +
                ", gregUser=" + gregUser.getUniqueID() +      
                '}';
    }
    
}
