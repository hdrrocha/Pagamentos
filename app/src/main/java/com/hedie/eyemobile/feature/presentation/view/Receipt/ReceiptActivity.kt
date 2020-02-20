package com.hedie.eyemobile.feature.presentation.view.Receipt

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.hedie.eyemobile.R
import kotlinx.android.synthetic.main.activity_receipt.*
import kotlinx.android.synthetic.main.cards_first_fragment.*


class ReceiptActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receipt)
        val arguments = requireNotNull(intent?.extras){}
        var  money:String;
        var  title:String;
        with(arguments){
            tv_value_peyment.text = getString("money").toString()
            tv_type_peyment.text= getString("title").toString()
        }

        img_bkg.setOnClickListener{ finish() }
    }
}
