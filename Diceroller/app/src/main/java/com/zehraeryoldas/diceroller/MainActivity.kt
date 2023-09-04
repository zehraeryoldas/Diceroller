package com.zehraeryoldas.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.Random


class MainActivity : AppCompatActivity() {

    lateinit var diceImage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text="Let's Roll"
       // diceRoller()

        rollButton.setOnClickListener {
            //diceroller fonk. tıklayınca text değişiyor.
            diceRoller()
            //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

        }
        diceImage=findViewById(R.id.diceRoller)
    }
    private fun diceRoller(){
        val resulText: TextView=findViewById(R.id.roll_button)
        //sonradan eklendi
        val randomInt= Random().nextInt(6)+1 //tıklandığında rastgele syaılar ürettiriyoruz
       // resulText.text="Dice Roller!"
        resulText.text=randomInt.toString()

        val drawableResource=when (randomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5

            else -> R.drawable.dice_6
        }
        //uygulamanın daha verimli çalışabilmesi için bu satırı kaldıracağız ve activityde yazacğı<
        //val diceImage:ImageView=findViewById(R.id.diceRoller)
        diceImage.setImageResource(drawableResource)
    }
}