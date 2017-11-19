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
        var a_key = pool.load(this, R.raw.piano_a, 1);
        var b_key = pool.load(this, R.raw.piano_b, 1);
        var c_key = pool.load(this, R.raw.piano_c, 1);
        var d_key = pool.load(this, R.raw.piano_d, 1);
        var e_key = pool.load(this, R.raw.piano_e, 1);
        var f_key = pool.load(this, R.raw.piano_f, 1);
        var g_key = pool.load(this, R.raw.piano_g, 1);

        var song = SongRecording("MyTune", "James");

        a.setOnClickListener({
            pool.play(a_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
            if(recording){
                a.setText("SAOIHDAOSIDJOSAIFJOFSAIJ")
            }
        })

        b.setOnClickListener({
            pool.play(b_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
            if(recording){
                val tsLong = System.currentTimeMillis() / 1000 - recordingStartTime;
                song.add(tsLong, b.toString() );
            }
        })

        c.setOnClickListener({
            pool.play(c_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
            if(recording){
                val tsLong = System.currentTimeMillis() / 1000 - recordingStartTime;
                song.add(tsLong, c.toString() );
            }
        })

        d.setOnClickListener({
            pool.play(d_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
            if(recording){
                val tsLong = System.currentTimeMillis() / 1000 - recordingStartTime;
                song.add(tsLong, d.toString() );
            }
        })

        e.setOnClickListener({
            pool.play(e_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
            if(recording){
                val tsLong = System.currentTimeMillis() / 1000 - recordingStartTime;
                song.add(tsLong, e.toString() );
            }
        })

        f.setOnClickListener({
            pool.play(f_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
            if(recording){
                val tsLong = System.currentTimeMillis() / 1000 - recordingStartTime;
                song.add(tsLong, f.toString() );
            }
        })

        g.setOnClickListener({
            pool.play(g_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
            if(recording){
                val tsLong = System.currentTimeMillis() / 1000 - recordingStartTime;
                song.add(tsLong, g.toString() );
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
