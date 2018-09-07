package valentino.david.dicodingdavid.ankoLayoutList

import android.view.Gravity
import org.jetbrains.anko.*
import valentino.david.dicodingdavid.MainActivity
import valentino.david.dicodingdavid.R

class ItemListUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        linearLayout {
            imageView(R.drawable.img_barca).lparams(width = dip(50)){
                height = dip(50)
                id = R.id.image
            }
            textView("Barcelona FC").lparams(width = wrapContent){
                height = wrapContent
                margin = dip(10)
                gravity = Gravity.CENTER_VERTICAL
            }
        }
    }
}