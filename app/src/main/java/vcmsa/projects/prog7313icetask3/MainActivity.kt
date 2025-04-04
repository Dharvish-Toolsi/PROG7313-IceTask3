package vcmsa.projects.prog7313icetask3

import vcmsa.projects.prog7313icetask3.R
import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    var InputNumber: Int = 0
    var SelectedOperation: Char = ' '
    fun btn0Click(view: View)
    {
        val textView = findViewById<View>(R.id.txtNumber) as TextView
        textView.append("0")
    }

    fun btn1Click(view: View)
    {
        val textView = findViewById<View>(R.id.txtNumber) as TextView
        textView.append("1")
    }

    fun btn2Click(view: View)
    {
        val textView = findViewById<View>(R.id.txtNumber) as TextView
        textView.append("2")
    }

    fun btn3Click(view: View)
    {
        val textView = findViewById<View>(R.id.txtNumber) as TextView
        textView.append("3")
    }

    fun btn4Click(view: View)
    {
        val textView = findViewById<View>(R.id.txtNumber) as TextView
        textView.append("4")
    }

    fun btn5Click(view: View)
    {
        val textView = findViewById<View>(R.id.txtNumber) as TextView
        textView.append("5")
    }

    fun btn6Click(view: View)
    {
        val textView = findViewById<View>(R.id.txtNumber) as TextView
        textView.append("6")
    }

    fun btn7Click(view: View)
    {
        val textView = findViewById<View>(R.id.txtNumber) as TextView
        textView.append("7")
    }

    fun btn8Click(view: View)
    {
        val textView = findViewById<View>(R.id.txtNumber) as TextView
        textView.append("8")
    }

    fun btn9Click(view: View)
    {
        val textView = findViewById<View>(R.id.txtNumber) as TextView
        textView.append("9")
    }

    fun btnPlusClick(view: View)
    {
        val textView = findViewById<View>(R.id.txtNumber) as TextView
        InputNumber = textView.text.toString().toInt()
        SelectedOperation = '+'
        textView.setText("")
    }

    fun btnMinusClick(view: View)
    {
        val textView = findViewById<View>(R.id.txtNumber) as TextView
        InputNumber = textView.text.toString().toInt()
        SelectedOperation = '-'
        textView.setText("")
    }

    fun btnMultiplyClick(view: View)
    {
        val textView = findViewById<View>(R.id.txtNumber) as TextView
        InputNumber = textView.text.toString().toInt()
        SelectedOperation = '*'
        textView.setText("")
    }

    fun btnDivideClick(view: View)
    {
        val textView = findViewById<View>(R.id.txtNumber) as TextView
        InputNumber = textView.text.toString().toInt()
        SelectedOperation = '/'
        textView.setText("")
    }

    fun btnEqualsClick(view: View)
    {
        val textViewInput = findViewById<View>(R.id.txtNumber) as TextView
        val textViewOutput = findViewById<View>(R.id.txtOutput) as TextView
        var InputNumber2: Int = textViewInput.text.toString().toInt()
        var OutputNumber: Double = 0.0
        when (SelectedOperation)
        {
            // Calculate then output to txtNumberOutput.
            '+' ->
            {
                OutputNumber = (InputNumber + InputNumber2).toDouble()
            }

            '-' ->
            {
                OutputNumber = (InputNumber - InputNumber2).toDouble()
            }

            '*' ->
            {
                OutputNumber = (InputNumber * InputNumber2).toDouble()
            }

            '/' ->
            {
                OutputNumber = InputNumber.toDouble() / InputNumber2.toDouble()
            }
            // Toast an error.
            else -> Toast.makeText(this, "Error: No second number inputted.", Toast.LENGTH_SHORT)
                .show()
        }
        textViewInput.setText("")
        textViewOutput.setText(OutputNumber.toString())
    }
    fun btnClearClick(view: View)
    {
        val textInputView = findViewById<View>(R.id.txtNumber) as TextView
        val textOutputView = findViewById<View>(R.id.txtOutput) as TextView
        textInputView.setText("")
        textOutputView.setText("")
        InputNumber = 0
        SelectedOperation = ' '
    }
}