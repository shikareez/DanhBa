package com.android.danhba

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.subdanhba.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arraydanhba: ArrayList<DanhBa> = ArrayList()
        arraydanhba.add(DanhBa(R.drawable.avatar, "Nguyễn Tấn Cường", "0913700115"))
        arraydanhba.add(DanhBa(R.drawable.avatar, "Nguyễn Tất Thắng", "0888908853"))
        arraydanhba.add(DanhBa(R.drawable.avatar, "Nguyễn Tất Thịnh", "0942118757"))
        arraydanhba.add(DanhBa(R.drawable.avatar, "Nguyễn Ngọc Khánh Như", "0799881070"))
        listdanhba.adapter = CustomAdapter(this@MainActivity, arraydanhba)

        listdanhba.setOnItemClickListener { _, _, position, _ ->
            Log.d("mmm","vi tri dong: "+position)

            val intent = Intent(this,DetailDanhBa::class.java)
//            Log.d("mmm","item: "+listdanhba.getItemAtPosition(position))

//            var aa = arraydanhba.get(position)
            var putdetail:DanhBa = listdanhba.getItemAtPosition(position) as DanhBa
            Log.d("mmm","item: "+ putdetail.hoten)



            intent.putExtra("parc",putdetail)
            startActivity(intent)
        }
    }

}