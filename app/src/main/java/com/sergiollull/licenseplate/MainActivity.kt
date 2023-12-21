package com.sergiollull.licenseplate

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sergiollull.licenseplate.databinding.ActivityMainBinding
import com.sergiollull.licenseplate.ui.theme.LicensePlateTheme

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                setContentView(R.layout.activity_main)
            var button = findViewById(R.id.button) as Button
            var editTextNumber = findViewById(R.id.editTextNumber) as EditText
            var textView = findViewById(R.id.textView) as TextView
            button.setOnClickListener{
                if(editTextNumber.text.isNotEmpty()){
                    var plakaKodu = editTextNumber.text.toString().toInt()
                    when(plakaKodu){

                        35->textView.text="İzmir"
                        34->textView.text="İstanbul"
                        6->textView.text="Ankara"
                        1->textView.text="Adana"
                        7->textView.text="Antalya"
                        16->textView.text="Bursa"
                        9->textView.text="Aydın"
                        else->{
                            textView.text ="DNE"
                        }

                    }
                    editTextNumber.text.clear()

                }else
                {
                    textView.text="Enter The License Plate Code"
                }

            }
        }
    }
}
