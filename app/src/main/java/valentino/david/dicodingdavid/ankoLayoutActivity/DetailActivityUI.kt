package valentino.david.dicodingdavid.ankoLayoutActivity

import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.*
import valentino.david.dicodingdavid.DetailActivity
import valentino.david.dicodingdavid.R

class DetailActivityUI : AnkoComponent<DetailActivity> {
    override fun createView(ui: AnkoContext<DetailActivity>) : View = with(ui) {
        linearLayout {
            lparams(width = matchParent){
                margin = dip(10)
            }
            imageView{
                setImageResource(R.drawable.img_barca)
                id = R.id.imageViewClub
            }.lparams(width = wrapContent,height = dip(0)){
                weight = 1F
            }
            textView{
                text = "Barcelona FC"
                padding = dip(10)
                id = R.id.textViewClub
                gravity = Gravity.CENTER_VERTICAL
            }.lparams(width= wrapContent, height = wrapContent)
        }
    }
}