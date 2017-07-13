package components.com.project.googlecomponents.daos;

import android.arch.persistence.room.Room;
import android.content.Context;

/**
 * Created by r028367 on 13/07/2017.
 */

public class DBUtils {

    private static AbsDatabase absDatabase = null;

    public synchronized static AbsDatabase getInstance(Context context) {
        if(absDatabase == null) {
            absDatabase = Room.databaseBuilder(context
                    , AbsDatabase.class, AbsDatabase.DB_NAME).build();
        }
        return absDatabase;
    }

}
