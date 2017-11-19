package ca.opus.www.opus

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

/**
 * Created by James on 11/18/2017.
 */
class SongRecording : Serializable
{
    var instrument: String;
    var name: String;
    var artistName: String;
    var times: ArrayList<Long>;
    var records: ArrayList<ArrayList<Int>>;

    constructor(instrument : String, name : String, artistName : String)
    {
        this.instrument = instrument;
        this.name = name;
        this.artistName = artistName;
        this.times = ArrayList(0);
        this.records = ArrayList<ArrayList<Int>>(0);
    }

    fun add(time: Long, record: Int)
    {
        var index = times.indexOf(time)
        if(index == -1){
            times.add(time);
            var tempList = ArrayList<Int>(0)
            tempList.add(record)
            records.add(tempList)
        }
        else{
            records[index].add(record)
        }
    }

    fun size() : Int{
        return times.size;
    }

    fun clear()
    {
        times.clear();
        records.clear();
    }
}