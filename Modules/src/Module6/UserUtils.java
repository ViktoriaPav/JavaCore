package Module6;

import java.util.Arrays;

public class UserUtils {
    //    Make sure paySalaryToUsers and getUsersId methods can’t be overriden in other classes.
    //    User[] uniqueUsers(User[] users) users are equal when all their field are equal

    public User[] uniqueUsers(User[] users) {
        User[] unique = deleteEmptyUsers(users);
        b: for (int i = 0; i < unique.length - 1; i++) {
            for (int k = i + 1; k < unique.length; k++) {
                if (unique[i].equals(unique[k])) {
                    unique[i] = null;
                    continue b;
                }
            }
        }
        User[] uniqueUsers = deleteEmptyUsers(unique) ;
        return uniqueUsers;
    }

//    User[] usersWithContitionalBalance(User[] users, int balance)
//    user’s balance == balance
    User[] usersWithContitionalBalance(User[] users, int balance){
        User[] cBalance = deleteEmptyUsers(users);
        for (int i = 0; i < cBalance.length; i++){
            if (cBalance[i].getBalance() != balance){
                cBalance[i] = null;
            }
        }
        User[] usersWithContitionalBalance = deleteEmptyUsers(cBalance);
        return usersWithContitionalBalance;
    }

//    User[] paySalaryToUsers(User[] users)
    final User[] paySalaryToUsers(User[] users){
        User[] paySalaryToUsers = deleteEmptyUsers(users);
        for (int i = 0; i < paySalaryToUsers.length; i++){
           paySalaryToUsers[i].setBalance(paySalaryToUsers[i].getSalary()+paySalaryToUsers[i].getBalance());
        }
        return paySalaryToUsers;
    }

//    long[] getUsersId(User[] users)
    final long[] getUsersId(User[] users){
        long[] getUsersId = new long[deleteEmptyUsers(users).length];
        for (int i = 0; i < deleteEmptyUsers(users).length; i++){
            getUsersId[i] = deleteEmptyUsers(users)[i].getId();
        }
        return getUsersId;
    }
//    User[] deleteEmptyUsers(User[] users)
    User[] deleteEmptyUsers(User[] users){
        int x = 0;
        for (User y : users) {
            if (y != null) {
                x += 1;
            }
        }
        User[] deleteEmptyUsers = new User[x];
        for (int u = 0, t = 0; t < users.length; u++, t++) {
                if (users[t] != null) {
                    deleteEmptyUsers[u] = users[t];
                } else {
                    u--;
            }
        }
        return deleteEmptyUsers;
    }
}

