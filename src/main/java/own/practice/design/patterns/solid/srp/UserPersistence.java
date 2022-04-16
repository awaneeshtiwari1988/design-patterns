package own.practice.design.patterns.solid.srp;

import own.practice.design.patterns.solid.srp.violate.Store;
import own.practice.design.patterns.solid.srp.violate.User;

public class UserPersistence {

    private Store store = new Store();

    public void saveUser(User user){
        store.store(user);
    }
}
