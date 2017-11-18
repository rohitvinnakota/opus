package ca.opus.www.opus

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_create_song.*
import kotlinx.android.synthetic.main.activity_songlist.*
import kotlinx.android.synthetic.main.activity_tracklist.*

/**
 * Created by Rohit on 2017-11-18.
 */
class TrackViewActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tracklist)
        newInstrumentFab.setOnClickListener({
            //take user to instrument screen
            val intent = Intent(this, InstrumentSelect::class.java);
            var message = "Test";
            intent.putExtra(AlarmClock.EXTRA_MESSAGE, message);
            startActivity(intent);

        })


    }

}