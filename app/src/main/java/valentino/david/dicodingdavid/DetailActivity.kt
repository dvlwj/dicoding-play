package valentino.david.dicodingdavid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import valentino.david.dicodingdavid.ankoLayoutActivity.DetailActivityUI
import org.jetbrains.anko.setContentView

class DetailActivity : AppCompatActivity() {

    private var items: MutableList<item.Item> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DetailActivityUI().setContentView(this)
        initData()
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