package nl.bryanderidder.demo_toggle_cards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import nl.bryanderidder.themedtogglebuttongroup.ThemedButton
import nl.bryanderidder.themedtogglebuttongroup.ThemedToggleButtonGroup

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val themedButtonGroup = findViewById<ThemedToggleButtonGroup>(R.id.themedButtonGroup)
        val btnMultipleChoice = findViewById<ThemedButton>(R.id.btnMultipleChoice)
        val tvText = findViewById<TextView>(R.id.tvText)

        //optional initial selection
        btnMultipleChoice.isSelected = true

        //selection listener
        themedButtonGroup.setOnSelectListener { button: ThemedButton ->
            tvText.text = button.text
        }
    }
}
