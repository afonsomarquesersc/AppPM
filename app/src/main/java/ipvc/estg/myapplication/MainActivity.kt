package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.zip.Inflater

const val PARAM1_NAME = "name"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, R.string.Welcome, Toast.LENGTH_SHORT).show()
        Log.d("****TAG", "onCreate")
    }



    fun button2(view: View) {
        var editTextHello = findViewById<EditText>(R.id.editTextPersonName)
        Toast.makeText(this, editTextHello.text, Toast.LENGTH_SHORT).show()
        findViewById<TextView>(R.id.Hellotoall1).setText(Hellotoall1.text)
    }

    fun button1(view: View) {
        var editTextHello = findViewById<EditText>(R.id.editTextPersonName)

        val intent = Intent(this, MainActivity2::class.java).apply {
            putExtra(PARAM1_NAME, editTextHello.text.toString())
        }
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater;
        inflater.inflate(R.menu.menu, menu);

        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item1 -> {
                Toast.makeText(this, "item1", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.item2 -> {
                Toast.makeText(this, "item2", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.item3 -> {
                Toast.makeText(this, "item3", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
    }
    }
}