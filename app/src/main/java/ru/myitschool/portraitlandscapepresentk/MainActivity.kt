package ru.myitschool.portraitlandscapepresentk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

var i = 1;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val image = findViewById<ImageView>(R.id.picture)
        // TODO: заменять картинку на ту, которую установили при нажатии кнопки
        // иначе будет исходная с котиком
        if(i%3==0){
            image.setImageResource(R.drawable.car1)
        }else if(i%3==1){
            image.setImageResource(R.drawable.car2)
        }else if(i%3==2){
            image.setImageResource(R.drawable.car3)
        }

        button.setOnClickListener{
            i+=1
            if(i%3==0){
                image.setImageResource(R.drawable.car1)
            }else if(i%3==1){
                image.setImageResource(R.drawable.car2)
            }else if(i%3==2){
                image.setImageResource(R.drawable.car3)
            }
        }
    }

}