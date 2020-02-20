package com.hedie.eyemobile.feature.presentation.view.Receipt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hedie.eyemobile.R
import kotlinx.android.synthetic.main.activity_receipt.*


class ReceiptActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receipt)
        val arguments = requireNotNull(intent?.extras){}

        with(arguments){
            tv_value_peyment.text = getString("money").toString()
            tv_type_peyment.text= getString("receipt").toString()
        }

        img_finish.setOnClickListener{ finish() }
    }
}
