package ca.opus.www.opus

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.provider.AlarmClock.EXTRA_MESSAGE

import kotlinx.android.synthetic.main.activity_login.*

/**
 * A login screen that offers login via email/password.
 */
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        loginButton.setOnClickListener({
            //if name in textview is Rohit, James, Matt go ahead, else Toast incorrect login
            val intent =   Intent(this, SongListActivity::class.java);
            var message = "Test";
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);


        })



    }



        /*
         * Keep track of the login task to ensure we can cancel it if requested.
         */
}
