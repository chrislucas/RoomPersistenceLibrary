package components.com.project.googlecomponents.daos;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import components.com.project.googlecomponents.entities.User;

/**
 * Created by r028367 on 13/07/2017.
 * https://developer.android.com/reference/android/arch/persistence/room/Database.html
 */

@Database(version = 1, entities = {User.class})
public abstract class AbsDatabase extends RoomDatabase {

    public static final String DB_NAME = "experimental";

    public abstract UserDao userDao();
}
