package com.example.task1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.task1.ui.theme.AdapterClass
import com.example.task1.ui.theme.DataClass

class FacebookHomeActivity : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView
    private lateinit var dataList : ArrayList<DataClass>
    //Images
    private lateinit var profileImageList : Array<Int>
    private lateinit var postImageList : Array<Int>
    private lateinit var shareImageList : Array<Int>

    //Strings
    private lateinit var nameList : Array<String>
    private lateinit var timeList : Array<String>
    private lateinit var captionList : Array<String>
    private lateinit var linkList : Array<String>
    private lateinit var numberOFLikesList : Array<String>
    private lateinit var numberOfSharesList : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facebook_home)


        profileImageList = arrayOf(
            R.drawable.yellow,
            R.drawable.yellow,
            R.drawable.knight,
        )
        postImageList = arrayOf(
            R.drawable.yellow,
            R.drawable.yellow,
            R.drawable.knight,
        )
        shareImageList = arrayOf(
            R.drawable.yellow,
            R.drawable.yellow,
            R.drawable.knight,
        )

        nameList = arrayOf(
            "Unblast",
            "Unblast",
            "Ali Elsadany",
        )
        timeList = arrayOf(
            "2 hrs",
            "2 hrs",
            "13 hrs",
        )
        captionList = arrayOf(
            "Buckle up, because change is coming to wordPress",
            "Buckle up, because change is coming to wordPress",
            "Hello Every Body",
        )
        linkList = arrayOf(
            "http://unblast.com/color-schemes",
            "http://unblast.com/color-schemes",
            "http://unblast.com/color-schemes",
        )
        numberOFLikesList = arrayOf(
            "12",
            "12",
            "13",
        )
        numberOfSharesList = arrayOf(
            "1 Share",
            "1 Share",
            "7 Share",
        )

        recyclerView = findViewById(R.id.RecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf<DataClass>()
        getData()
    }
    private fun getData(){
        for (i in profileImageList.indices){
            val dataClass = DataClass(
                profileImageList[i],
                postImageList[i],
                shareImageList[i],

                nameList[i],
                timeList[i],
                captionList[i],
                linkList[i],
                numberOFLikesList[i],
                numberOfSharesList[i],

            )
            dataList.add(dataClass)
        }
        recyclerView.adapter = AdapterClass(dataList)
    }
}