package _01designpatterns._01VaskaranSarcarVScwm._06proxy_loginexample_S;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by Gra_m on 2022 03 15
 */

public class Proxy extends AdminLevelAccessSubject{
    private AdminLevelAccessOnlyWork adminLevelAccessOnlyWork;
    private String userName;
    private List<String> adminUsers;

    public Proxy(String userName) {
        this.userName = userName;
    }

    @Override
    void doSomeWork() {
        getAdminUsers();

        if(adminUsers.contains(userName)) {

            if(adminLevelAccessOnlyWork == null)
                adminLevelAccessOnlyWork = new AdminLevelAccessOnlyWork();
            adminLevelAccessOnlyWork.doSomeWork();


        } else {
            System.out.println("Sorry, you do not have the necessary access rights to execute that operation.");
        }

    }

    private void getAdminUsers() {
        adminUsers = new ArrayList<>(asList("Peter", "Paul", "Agnes", "Admin"));
    }
}
