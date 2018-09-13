package valentino.david.dicodingdavid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import valentino.david.dicodingdavid.ankoLayoutActivity.DetailActivityUI
import org.jetbrains.anko.setContentView

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DetailActivityUI().setContentView(this)
        val nameVal = intent.getStringExtra("name")
        val imageVal = intent.getIntExtra("image",0)
        val descVal = intent.getStringExtra("desc")
//        val position = intent.getStringExtra("position")
        val image = this.findViewById<ImageView>(R.id.imageViewClub)
        val name = this.findViewById<TextView>(R.id.textViewClub)
        val desc = this.findViewById<TextView>(R.id.descViewClub)
//        val imageFinal = "R.drawable.$imageVal"
        Glide.with(this).load(imageVal).into(image)
        name?.text = nameVal?.toString()
        desc?.text = descVal?.toString()
//        initData(position.toInt())
    }

//    private fun initData(i: Int){
//        val nameVal = resources.getStringArray(R.array.club_name)
//        val imageVal = resources.obtainTypedArray(R.array.club_image)
//        val descVal = resources.getStringArray(R.array.club_description)
//        val image = this.findViewById<ImageView>(R.id.imageViewClub)
//        val name = this.findViewById<TextView>(R.id.textViewClub)
//        val desc = this.findViewById<TextView>(R.id.descViewClub)
//        Glide.with(this).load(imageVal.getResourceId(i,0)).into(image)
//        name?.text = nameVal[i]?.toString()
//        desc?.text = descVal[i]?.toString()
////        items.clear()
////        for (i in name.indices) {
////            items.add(item.Item(
////                    name[i],
////                    image.getResourceId(i, 0),
////                    desc[i]
////            ))
////        }
//        //Recycle the typed array
////        image.recycle()
//    }
}