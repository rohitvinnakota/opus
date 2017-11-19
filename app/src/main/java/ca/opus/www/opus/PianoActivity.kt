package ca.opus.www.opus

import android.content.Intent
import android.media.SoundPool
import android.os.Bundle
import android.provider.AlarmClock
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tracklist.*
import kotlinx.android.synthetic.main.piano_activity.*

/**
 * Created by James on 11/18/2017.
 */
class PianoActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.piano_activity)

        var pool = SoundPool.Builder().setMaxStreams(5).build();
        var a_key = pool.load(this, R.raw.a, 1);
        var b_key = pool.load(this, R.raw.b, 1);
        var c_key = pool.load(this, R.raw.c, 1);
        var d_key = pool.load(this, R.raw.d, 1);
        var e_key = pool.load(this, R.raw.e, 1);
        var f_key = pool.load(this, R.raw.f, 1);
        var g_key = pool.load(this, R.raw.g, 1);

        a.setOnClickListener({
            pool.play(a_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
        })

        b.setOnClickListener({
            pool.play(b_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
        })

        c.setOnClickListener({
            pool.play(c_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
        })

        d.setOnClickListener({
            pool.play(d_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
        })

        e.setOnClickListener({
            pool.play(e_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
        })

        f.setOnClickListener({
            pool.play(f_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
        })

        g.setOnClickListener({
            pool.play(g_key, 1.toFloat(), 1.toFloat(), 0, 0, 1.toFloat())
        })
    }
}