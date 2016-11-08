package Module6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        User user1 = new User(13331, "Nick 1", "Bush", 200, 4569);
        User user2 = new User(14553, "Nick 2", "Bush", 200, 4469);
        User user3 = new User(133451, "Nick", "Bush", 250, 4569);
        User user4 = new User(13453, "Nick", "Bush", 200, 4569);
        User user5 = null;
        User user11 = null;
        User user7 = new User(13331, "Nick 1", "Bush", 200, 4569);
        User user12 = new User(133451, "Nick", "Bush", 200, 4469);
        User user6 = new User(13335, "Nick", "Bush", 250, 4569);
        User user13 = null;
        User user8 = new User(13331, "Nick", "Bush", 100, 4569);
        User user9 = new User(14553, "Nick 2", "Bush", 200, 4549);
        User user10 = new User(13331, "Nick", "Bush", 200, 4569);

        User[] users = {user1, user2, user3, user4, user7, user12, user6, user8, user9, user10,user5,user11,user13};

        UserUtils userUtils = new UserUtils();

        System.out.println(Arrays.deepToString(userUtils.deleteEmptyUsers(users)));
        System.out.println(Arrays.toString(userUtils.getUsersId(users)));
        System.out.println(Arrays.deepToString(userUtils.paySalaryToUsers(users)));

        System.out.println(Arrays.deepToString(userUtils.uniqueUsers(users)));
        System.out.println(Arrays.deepToString(userUtils.usersWithContitionalBalance(users, 4569)));

    }
}



