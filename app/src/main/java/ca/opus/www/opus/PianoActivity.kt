package ca.opus.www.opus

import android.content.Intent
import android.media.SoundPool
import android.os.Bundle
import android.provider.AlarmClock
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.util.Log.println
import kotlinx.android.synthetic.main.activity_tracklist.*
import kotlinx.android.synthetic.main.piano_activity.*

/**
 * Created by James on 11/18/2017.
 */
class PianoActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.piano_activity)
        var recording = false
        var pool = SoundPool.Builder().setMaxStreams(5).build();
        var a_key = pool.load(this, R.raw.piano_a, 1);
        var b_key = pool.load(this, R.raw.piano_b, 1);
        var c_key = pool.load(this, R.raw.piano_c, 1);
        var d_key = pool.load(this, R.raw.piano_d, 1);
        var e_key = pool.load(this, R.raw.piano_e, 1);
        var f_key = pool.load(this, R.raw.piano_f, 1);
        var g_key = pool.load(this, R.raw.piano_g, 1);

        a.setOnClickListener({
            pool.play(a_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
            if(recording){
                a.setText("SAOIHDAOSIDJOSAIFJOFSAIJ")
            }
        })

        b.setOnClickListener({
            pool.play(b_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
            if(recording){
                print("recording")
            }
        })

        c.setOnClickListener({
            pool.play(c_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
            if(recording){
                print("recording")
            }
        })

        d.setOnClickListener({
            pool.play(d_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
            if(recording){
                print("recording")
            }
        })

        e.setOnClickListener({
            pool.play(e_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
            if(recording){
                print("recording")
            }
        })

        f.setOnClickListener({
            pool.play(f_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
            if(recording){
                print("recording")
            }
        })

        g.setOnClickListener({
            pool.play(g_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
            if(recording){
                print("recording")
            }
        })

        Record.setOnClickListener({
            recording = true
        })


    }
}