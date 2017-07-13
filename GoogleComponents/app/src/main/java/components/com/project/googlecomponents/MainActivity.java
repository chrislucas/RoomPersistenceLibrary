package components.com.project.googlecomponents;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import components.com.project.googlecomponents.daos.AbsDatabase;
import components.com.project.googlecomponents.daos.DBUtils;
import components.com.project.googlecomponents.daos.UserDao;
import components.com.project.googlecomponents.entities.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testUserDaoInstance();
    }


    public void testUserDaoInstance() {
        final Context context = this;
        new Thread(new Runnable() {
            @Override
            public void run() {
                UserDao userDao = DBUtils.getInstance(context).userDao();
                User user = new User();
                user.setName("Christoffer Lucas");
                user.setPasswd("admin123");
                user.setRegister("r028367");
                userDao.insert(user);
                long c = userDao.count(user.getRegister());
                Log.i("INSERT", String.valueOf(c));
                return;
            }
        }).start();
    }
}
