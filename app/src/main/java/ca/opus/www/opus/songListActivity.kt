package ca.opus.www.opus

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_songlist.*

/**
 * Created by Rohit on 2017-11-18.
 */
class songListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_songlist)
        createSong.setOnClickListener({
            val intent =   Intent(this,createNewSong::class.java);
            var message = "Test";
            intent.putExtra(AlarmClock.EXTRA_MESSAGE, message);
            startActivity(intent);
        })
    }
}