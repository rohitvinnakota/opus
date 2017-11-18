package ca.opus.www.opus

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_create_song.*
import kotlinx.android.synthetic.main.activity_instrument_select.*

/**
 * Created by Rohit on 2017-11-18.
 */
class InstrumentSelect : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instrument_select)
        pianoFab.setOnClickListener({
            //
            val intent = Intent(this, PianoActivity::class.java);
            var message = "Test";
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);

        })

        drumsFab.setOnClickListener({
            val intent = Intent(this, TrackViewActivity::class.java);
            var message = "Test";
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        })

        vocalsFab.setOnClickListener({
            val intent = Intent(this, TrackViewActivity::class.java);
            var message = "Test";
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        })
    }

}