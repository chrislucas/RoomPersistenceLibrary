package components.com.project.googlecomponents.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by r028367 on 13/07/2017.
 */
@Entity(tableName = "users")
public class User {
    @PrimaryKey
    @ColumnInfo(name = "register")
    private String register;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "passwd")
    private String passwd;

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
