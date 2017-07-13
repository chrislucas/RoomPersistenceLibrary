package components.com.project.googlecomponents.daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import components.com.project.googlecomponents.entities.User;

/**
 * Created by r028367 on 13/07/2017.
 */
@Dao
public interface UserDao {

    @Query("SELECT COUNT(*) FROM users WHERE register = :reg")
    public long count(String reg);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public long insert(User user);

}
