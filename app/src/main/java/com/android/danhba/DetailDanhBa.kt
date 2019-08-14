package com.android.danhba

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail_danh_ba.*


class DetailDanhBa: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_danh_ba)


        val intent = intent.extras?:return

//        bigavatar.setImageResource(linedb.avatar)
//        detailhoten.text = linedb.hoten
//        detailsodt.text = linedb.sodt
        var getdetail:DanhBa = intent.get("parc") as DanhBa
        bigavatar.setImageResource(getdetail.avatar)
        detailhoten.text = getdetail.hoten
        detailsodt.text = getdetail.sodt
        Log.d("ddd","Show somethings"+getdetail.hoten)
    }
}
