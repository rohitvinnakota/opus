package ca.opus.www.opus

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_create_song.*

/**
 * Created by Rohit on 2017-11-18.
 */
class createNewSong : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_song)
        startButton.setOnClickListener({
            //take user to instrument screen
            val intent = Intent(this, songListActivity::class.java);
            var message = "Test";
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);


        })
    }

}