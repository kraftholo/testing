package com.example.testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var verticalRV : RecyclerView
    lateinit var horizontalRV : RecyclerView

    var listV = ArrayList<String>()

    companion object{
        var listH = ArrayList<String>()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createLists();

        initRecyclerViews()
    }




    private fun initRecyclerViews(){

        verticalRV = findViewById(R.id.verticalRV);
        verticalRV.adapter = VerticalAdapter(listV);
        verticalRV.layoutManager = LinearLayoutManager(this)


    }


    private fun createLists(){
        listV.add("asdasd")
        listV.add("12412e34daw")
        listV.add("asfsrgav")
        listV.add("dfasrdgaerghb")
        listV.add("yhtyjhtfdyju")
        listV.add("zvbcsfgbdf")
        listV.add("w345q34tg")
        listV.add("rhgbrtwsnbsyftn")
        listV.add("afdvbsdfbxdcvb")
        listV.add("e546yterytwergh")
        listV.add("asrgfsnjsdf")
        listV.add("wqertgfaersdgsdf")
        listV.add("sadgvdfbscvb")
        listV.add("sdfaegrtgaerg")
        listV.add("jhfkfghndfgh")
        listV.add("asrt4etsergt")
        listV.add("awdfawd")
        listV.add("sdfsdfc")
        listV.add("asdascxasc")
        listV.add("zxcvxcvxcv")
        listV.add("awsdwaeqfwq3erf")

        listH.add("asdasd")
        listH.add("12412e34daw")
        listH.add("asfsrgav")
        listH.add("dfasrdgaerghb")
        listH.add("yhtyjhtfdyju")
        listH.add("zvbcsfgbdf")
        listH.add("w345q34tg")
        listH.add("rhgbrtwsnbsyftn")
        listH.add("afdvbsdfbxdcvb")
        listH.add("e546yterytwergh")
        listH.add("asrgfsnjsdf")
        listH.add("wqertgfaersdgsdf")
        listH.add("sadgvdfbscvb")
        listH.add("sdfaegrtgaerg")
        listH.add("jhfkfghndfgh")
        listH.add("asrt4etsergt")
        listH.add("awdfawd")
        listH.add("sdfsdfc")
        listH.add("asdascxasc")
        listH.add("zxcvxcvxcv")
        listH.add("awsdwaeqfwq3erf")

    }
}
