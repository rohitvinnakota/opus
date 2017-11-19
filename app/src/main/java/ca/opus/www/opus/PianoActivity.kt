package ca.opus.www.opus

import android.content.Intent
import android.media.SoundPool
import android.os.Bundle
import android.provider.AlarmClock
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.piano_activity.*
import android.content.Intent.getIntent



/**
 * Created by James on 11/18/2017.
 */
class PianoActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.piano_activity)

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
        var a_key = pool.load(this, R.raw.piano_a, 1);
        var b_key = pool.load(this, R.raw.piano_b, 1);
        var c_key = pool.load(this, R.raw.piano_c, 1);
        var d_key = pool.load(this, R.raw.piano_d, 1);
        var e_key = pool.load(this, R.raw.piano_e, 1);
        var f_key = pool.load(this, R.raw.piano_f, 1);
        var g_key = pool.load(this, R.raw.piano_g, 1);

        //var song = SongRecording("Piano","MyTune", "James");

        a.setOnClickListener({
            pool.play(a_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
            if(recording){
                val tsLong = System.currentTimeMillis() - recordingStartTime;
                (application as Test).song.add(tsLong, a_key );
            }
        })

        b.setOnClickListener({
            pool.play(b_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
            if(recording){
                val tsLong = System.currentTimeMillis() - recordingStartTime;
                (application as Test).song.add(tsLong, b_key );
            }
        })

        c.setOnClickListener({
            pool.play(c_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
            if(recording){
                val tsLong = System.currentTimeMillis() - recordingStartTime;
                (application as Test).song.add(tsLong, c_key );
            }
        })

        d.setOnClickListener({
            pool.play(d_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
            if(recording){
                val tsLong = System.currentTimeMillis() - recordingStartTime;
                (application as Test).song.add(tsLong, d_key );
            }
        })

        e.setOnClickListener({
            pool.play(e_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
            if(recording){
                val tsLong = System.currentTimeMillis() - recordingStartTime;
                (application as Test).song.add(tsLong, e_key );
            }
        })

        f.setOnClickListener({
            pool.play(f_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
            if(recording){
                val tsLong = System.currentTimeMillis() - recordingStartTime;
                (application as Test).song.add(tsLong, f_key );
            }
        })

        g.setOnClickListener({
            pool.play(g_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
            if(recording){
                val tsLong = System.currentTimeMillis() - recordingStartTime;
                (application as Test).song.add(tsLong, g_key );
            }
        })

        Record.setOnClickListener({
            recording = true
            (application as Test).song.clear();
            recordingStartTime = System.currentTimeMillis();
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
            bundle.putSerializable("song", (application as Test).song);
            intent.putExtra(AlarmClock.EXTRA_MESSAGE, message);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
}
