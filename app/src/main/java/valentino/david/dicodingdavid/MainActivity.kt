package valentino.david.dicodingdavid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import org.jetbrains.anko.setContentView
import valentino.david.dicodingdavid.R.id.recycleClub
import valentino.david.dicodingdavid.ankoLayoutActivity.MainActivityUI
import android.content.Intent



class MainActivity : AppCompatActivity() {

    private var items: MutableList<item.Item> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivityUI().setContentView(this)
        val list = findViewById<RecyclerView>(R.id.recycleClub)
        initData()
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = RecyclerViewAdapter(this, items){
            val toast = Toast.makeText(applicationContext, it.name, Toast.LENGTH_SHORT)
            toast.show()
        }
    }

    private fun initData(){
        val name = resources.getStringArray(R.array.club_name)
        val image = resources.obtainTypedArray(R.array.club_image)
        items.clear()
        for (i in name.indices) {
            items.add(item.Item(name[i],
                    image.getResourceId(i, 0)))
        }
        //Recycle the typed array
        image.recycle()
    }
}
