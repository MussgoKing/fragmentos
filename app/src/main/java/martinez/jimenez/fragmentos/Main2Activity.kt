package martinez.jimenez.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        bt1.setOnClickListener(this)
        bt2.setOnClickListener(this)
        bt3.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
    var f:Fragment? = null
        when(p0!!.id){ //es un switch con el elemento al que se le de click, se le tiene que gritar que si existe !! y no es nulo
            R.id.bt1 -> {
                f = PrimerFragment.newInstance()
            }
            R.id.bt2 -> {}
            R.id.bt3 -> {}
        }
        supportFragmentManager.beginTransaction()
            .replace(R.id.container,f!!)
            .commitNow()
    }
}
