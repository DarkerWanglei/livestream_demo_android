package cn.ucai.live.utils;

import android.app.Activity;
import android.content.Intent;

import com.hyphenate.chat.EMClient;
import com.hyphenate.easeui.domain.User;

import cn.ucai.live.I;
import cn.ucai.live.R;
import cn.ucai.live.ui.activity.LoginActivity;
import cn.ucai.live.ui.activity.MainActivity;
import cn.ucai.live.ui.activity.RegisterActivity;


/**
 * Created by Administrator on 2017/1/10.
 */

/**
 * 开机
 */
public class MFGT {
    public static void startActivity(Activity activity, Class<?> clz) {
        activity.startActivity(new Intent(activity, clz));
        activity.overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
    }

    /**
     * 结束activity
     *
     * @param activity
     */
    public static void finishActivity(Activity activity) {
        activity.finish();
        activity.overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
    }

    /**
     * 启动另一个activity
     *
     * @param activity
     * @param intent
     */
    public static void startActivity(Activity activity, Intent intent) {
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
    }

    public static void gotoLogin(Activity activity) {
        startActivity(activity, LoginActivity.class);
    }

    public static void gotoLoginCleanTask(Activity activity) {
        startActivity(activity, new Intent(activity, LoginActivity.class)
                .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));

    }

    public static void gotoRegister(Activity activity) {
        startActivity(activity, RegisterActivity.class);
    }

    public static void gotoMain(Activity activity) {
        startActivity(activity, new Intent(activity, MainActivity.class).putExtra(I.BACK_MAIN_FROM_CHAT, true));
    }
}
