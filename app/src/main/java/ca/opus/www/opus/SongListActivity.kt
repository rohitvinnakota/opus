package ca.opus.www.opus

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
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


        fun list_forms.itemClick(itemClick: (Int) -> Any): ListView {
            this.setOnItemClickListener (object: AdapterView.OnItemClickListener {
                override fun onItemClick(parent: AdapterView<out Adapter?>?, view: View?, position: Int, id: Long) {
                    itemClick(position)
                }

            })
        }
    }
}


