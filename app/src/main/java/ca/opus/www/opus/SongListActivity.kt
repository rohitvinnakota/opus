package ca.opus.www.opus

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_songlist.*

/**
 * Created by Rohit on 2017-11-18.
 */
class SongListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_songlist)
        //If user clicks on create new, taken to create new song
        newSongFab.setOnClickListener({
            val intent =   Intent(this, CreateNewSong::class.java);
            var message = "Test";
            intent.putExtra(AlarmClock.EXTRA_MESSAGE, message);
            startActivity(intent);
        })

        //If user clicks on listView item, go to trackview for that song
        /**list_forms.setOnItemClickListener({
            val context = applicationContext
            val text = "Take to trackView!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(context, text, duration)
            toast.show()
        })*/
    }
}