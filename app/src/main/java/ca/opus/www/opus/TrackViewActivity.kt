package ca.opus.www.opus

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_create_song.*
import kotlinx.android.synthetic.main.activity_songlist.*
import kotlinx.android.synthetic.main.activity_tracklist.*

/**
 * Created by Rohit on 2017-11-18.
 */
class TrackViewActivity: AppCompatActivity() {

    companion object {
        val songs: ArrayList<SongRecording> = ArrayList(0);
        val songNames: ArrayList<String> = ArrayList();
    }

//    companion object {
//        lateinit var songs: ArrayList<SongRecording>
//        lateinit var songNames: ArrayList<String>
//    }
//
//    init{
//        songs = ArrayList(0);
//
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_tracklist)

//        var intent = this.getIntent();
//        var bundle = intent.getExtras();
//
//        var song: SongRecording = bundle!!.getSerializable("song") as SongRecording;
//
//        songs.add(song);
//        songNames.add(song.name);
//
//        // set list view with song names
//        var listView = findViewById<ListView>(R.id.song_list_forms);
//
//        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, songNames);
//
//        listView.adapter = adapter;

//        song_list_forms.setOnItemClickListener({
//
//
//        })

//        newInstrumentFab.setOnClickListener({
//            //take user to instrument screen
//            val intent = Intent(this, InstrumentSelect::class.java);
//            var message = "Test";
//            intent.putExtra(AlarmClock.EXTRA_MESSAGE, message);
//            startActivity(intent);
//        })
//
//        trackToggleButton.setOnClickListener(){
//
//        }
    }

    override fun onResume() {
        super.onResume()

        setContentView(R.layout.activity_tracklist)
        val context = applicationContext
        val text = songs.size.toString()
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(context, text, duration)
        toast.show()
        var intent = this.getIntent();
        var bundle = intent.getExtras();

        var song: SongRecording = bundle!!.getSerializable("song") as SongRecording;

        songs.add(song);
        songNames.add(song.name);

        // set list view with song names
        var listView = song_list_forms

        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, songNames);

        listView.adapter = adapter;
        adapter.notifyDataSetChanged();

        newInstrumentFab.setOnClickListener({
            //take user to instrument screen
            val intent = Intent(this, InstrumentSelect::class.java);
            var message = "Test";
            intent.putExtra(AlarmClock.EXTRA_MESSAGE, message);
            startActivity(intent);
        })

        trackToggleButton.setOnClickListener(){

        }
    }

}



//// Get ListView object from xml
//var listView = findViewById(R.id.list);
//
//// Defined Array values to show in ListView
//String[] values = new String[] { "Android List View", "Adapter implementation", "Simple List View In Android", "Create List View Android", "Android Example", "List View Source Code",  "List View Array Adapter",  "Android Example List View" };
//
//// Define a new Adapter
//// First parameter - Context
//// Second parameter - Layout for the row
//// Third parameter - ID of the TextView to which the data is written
//// Forth - the Array of data
//
//ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
//
//// Assign adapter to ListView
//listView.setAdapter(adapter); 
