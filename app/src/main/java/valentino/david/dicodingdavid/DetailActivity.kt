package valentino.david.dicodingdavid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import valentino.david.dicodingdavid.ankoLayoutActivity.DetailActivityUI
import org.jetbrains.anko.setContentView
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity() {

//    private var items: MutableList<item.Item> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DetailActivityUI().setContentView(this)
        val nameVal = intent.getStringExtra("name")
        val imageVal = intent.getStringExtra("image")
        val descVal = intent.getStringExtra("desc")
        val image = this.findViewById<ImageView>(R.id.imageViewClub)
        val name = this.findViewById<TextView>(R.id.textViewClub)
        val desc = this.findViewById<TextView>(R.id.descViewClub)
        Glide.with(this).load(imageVal).into(image)
        name?.text = nameVal?.toString()
        desc?.text = descVal?.toString()
//        initData()
    }

//    private fun initData(){
//        val name = resources.getStringArray(R.array.club_name)
//        val image = resources.obtainTypedArray(R.array.club_image)
//        val desc = resources.getStringArray(R.array.club_description)
//        items.clear()
//        for (i in name.indices) {
//            items.add(item.Item(
//                    name[i],
//                    image.getResourceId(i, 0),
//                    desc[i]
//            ))
//        }
//        //Recycle the typed array
//        image.recycle()
//    }
}