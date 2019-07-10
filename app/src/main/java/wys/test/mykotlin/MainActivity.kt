package wys.test.mykotlin

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import org.jetbrains.anko.toast
import wys.test.mykotlin.databinding.ActivityMainBinding
import wys.test.mykotlin.entity.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.data = User("张三", "男")
    }

    fun myonClick(view: View) {
//        binding.data = User("李四", "女")
        toast("点击")
    }
}
