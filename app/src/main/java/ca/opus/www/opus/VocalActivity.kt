package ca.opus.www.opus

import android.content.Intent
import android.provider.AlarmClock
import android.support.v7.app.AppCompatActivity
import android.media.*
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_voice.*
import java.io.IOException
import android.view.View.OnTouchListener
import android.widget.Button
import android.widget.AdapterView
import android.widget.Toast
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference


/**
 * Created by Rohit on 2017-11-18.
 */
class VocalActivity : AppCompatActivity() {

    val recorder =  android.media.MediaRecorder()
    var filename = ""
    private val mStorageRef: StorageReference? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        filename = Environment.getExternalStorageDirectory().getAbsolutePath()
        filename = filename +"/" + Math.random().toString() +  "recorded_audio.3gp"
        val mStorageRef = FirebaseStorage.getInstance().getReference();
        setContentView(R.layout.activity_voice)
        recordButton.setOnClickListener({
            recordVocals()


        })
        stopRecordButton.setOnClickListener({
            stopRecordVocals()
        })
    }



    fun recordVocals() {
        recorder.setAudioSource(MediaRecorder.AudioSource.MIC)
        recorder.setOutputFormat(MediaRecorder.OutputFormat.DEFAULT)
        recorder.setOutputFile(filename)
        recorder.setAudioEncoder(MediaRecorder.AudioEncoder.DEFAULT)
        recorder.setAudioSamplingRate(16000);

        try {
            recorder.prepare()
            recorder.start()
        } catch (e : IOException) {
            e.printStackTrace()
        }
    }

    fun stopRecordVocals() {
        recorder.stop()
        recorder.release()

    }



        }
