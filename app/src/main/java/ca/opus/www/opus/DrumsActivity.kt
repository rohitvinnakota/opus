package ca.opus.www.opus

import android.content.Intent
import android.media.SoundPool
import android.os.Bundle
import android.provider.AlarmClock
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_drums.*
import kotlinx.android.synthetic.main.activity_instrument_select.*
import kotlinx.android.synthetic.main.piano_activity.*

/**
 * Created by Rohit on 2017-11-18.
 */

    /**
     * Created by Rohit on 2017-11-18.
     */
    class DrumsActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_drums)

            var recording = false
            var recordingStartTime = 0.toLong();

            var pool = SoundPool.Builder().setMaxStreams(5).build();
            var hihat_sound = pool.load(this, R.raw.hihat, 1);
            var kick_sound = pool.load(this, R.raw.kick, 1);
            var openhat_sound = pool.load(this, R.raw.openhat, 1);
            var ride_sound = pool.load(this, R.raw.ride, 1);
            var crash_sound = pool.load(this, R.raw.crash, 1);
            var snare_sound = pool.load(this, R.raw.snare, 1);
            var tom_sound = pool.load(this, R.raw.tom, 1);

            var song = SongRecording("Drums","MyTune", "James");

            rideCymbal.setOnClickListener({
                pool.play(ride_sound, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
                if(recording){
                    val tsLong = System.currentTimeMillis() / 1000 - recordingStartTime;
                    song.add(tsLong, ride_sound );
                }
            })

            crashCymbal.setOnClickListener({
                pool.play(crash_sound, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
                if(recording){
                    val tsLong = System.currentTimeMillis() / 1000 - recordingStartTime;
                    song.add(tsLong, crash_sound );
                }
            })

            hiHat.setOnClickListener({
                pool.play(hihat_sound, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
                if(recording){
                    val tsLong = System.currentTimeMillis() / 1000 - recordingStartTime;
                    song.add(tsLong, hihat_sound );
                }
            })

            openHat.setOnClickListener({
                pool.play(openhat_sound, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
                if(recording){
                    val tsLong = System.currentTimeMillis() / 1000 - recordingStartTime;
                    song.add(tsLong, openhat_sound );
                }
            })

            kick.setOnClickListener({
                pool.play(kick_sound, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
                if(recording){
                    val tsLong = System.currentTimeMillis() / 1000 - recordingStartTime;
                    song.add(tsLong, kick_sound );
                }
            })

            tom.setOnClickListener({
                pool.play(tom_sound, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
                if(recording){
                    val tsLong = System.currentTimeMillis() / 1000 - recordingStartTime;
                    song.add(tsLong, tom_sound );
                }
            })

            snare.setOnClickListener({
                pool.play(snare_sound, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
                if(recording){
                    val tsLong = System.currentTimeMillis() / 1000 - recordingStartTime;
                    song.add(tsLong, snare_sound);
                }
            })


            Record.setOnClickListener({
                recording = true
                song.clear();
                recordingStartTime = System.currentTimeMillis() / 1000;
                StopRecord.setEnabled(true)
            })

            StopRecord.setOnClickListener({
                recording = false
                StopRecord.setEnabled(false)
            })

            Save.setOnClickListener(){
                val intent = Intent(this, TrackViewActivity::class.java);
                var message = "TrackView";
                var bundle = Bundle();
                bundle.putSerializable("song", song);
                intent.putExtra(AlarmClock.EXTRA_MESSAGE, message);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        }
    }
