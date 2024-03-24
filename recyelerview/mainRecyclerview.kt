package recyelerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pemrogramanbergerak.R

class mainRecyclerview : AppCompatActivity() {

    private lateinit var  recyclerView: RecyclerView
    private lateinit var  dataList: ArrayList<dataClass>
    lateinit var listGambar: ArrayList<Int>
    lateinit var listNama: ArrayList<String>
    lateinit var listNIM: ArrayList<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        listGambar = arrayListOf(
            R.drawable.akmal,
            R.drawable.fadlan,
            R.drawable.dillah,
            R.drawable.harry,
            R.drawable.aulia,
            R.drawable.akbar,
            R.drawable.raja,
            R.drawable.deli,
            R.drawable.ready,
            R.drawable.andin,
            R.drawable.faiz,
            R.drawable.caca,
            R.drawable.tasya,
            R.drawable.yana
        )

        listNama = arrayListOf(
            "Aqmal Syarif Fadilah",
            "Fadlan Nur Ramadhan ",
            "Farhan Fadhila",
            "Harry Finaldhi ",
            "M. Farhan Aulia Pratama ",
            "Muhammad Ilham Akbar",
            "Muhammad Raja Fahrezy ",
            "Nur Delifah ",
            "Ready Malik Putra",
            "Restu Kharrisa Andini",
            "Rifki Faiz Azzurananda",
            " Salsabila Aurelia Rickardo",
            "Tasya Dwi Yant",
            " Yuliana Mislianingsih"
            )

        listNIM = arrayListOf(
            "12250113564",
            "12250113820",
            "12250113444",
            "12250113594",
            "12250113521",
            "12250113387",
            "12250113812 ",
            "12250123957",
            "12250113761",
            "12250124591",
            "12250113451",
            "12250121918",
            "12250123081",
            "12250123497"
        )


        recyclerView = findViewById(R.id.recylerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf<dataClass>()
        getData()

    }

    private fun getData(){
        for (i in listGambar.indices){
            val dataClass = dataClass(listGambar[i], listNama[i], listNIM[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter = adapterClass(dataList)
    }
}