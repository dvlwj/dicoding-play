package valentino.david.dicodingdavid.ankoLayoutActivity

import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.*
import valentino.david.dicodingdavid.DetailActivity
import valentino.david.dicodingdavid.R

class DetailActivityUI : AnkoComponent<DetailActivity> {
    override fun createView(ui: AnkoContext<DetailActivity>) : View = with(ui) {
        scrollView {
            lparams(width = matchParent, height = matchParent) {
                isFillViewport = true
                padding = sp(10)
            }
            verticalLayout {
                lparams(width = matchParent, height = wrapContent) {
                    margin = sp(10)
                }
                imageView {
                    id = R.id.imageViewClub
                }.lparams(width = wrapContent, height = sp(128)) {
                    gravity = Gravity.CENTER
                }
                textView {
                    padding = sp(10)
                    id = R.id.textViewClub
                }.lparams(width = wrapContent, height = wrapContent) {
                    gravity = Gravity.CENTER
                }
                textView {
                    padding = sp(10)
                    id = R.id.descViewClub
                }.lparams(width = matchParent, height = wrapContent) {
                    gravity = Gravity.FILL
                }
            }
        }
    }
}