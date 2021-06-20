package models;

import lombok.Data;

@Data
public class UserModel {

    private String userName;
    private String userSurname;
    private String userUsername;
    private String userPassword;
    private int userYearOfBirth;
    private String userEmail;
    private boolean isNewUser;

}
