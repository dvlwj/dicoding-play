package valentino.david.dicodingdavid.ankoLayoutActivity

import android.widget.LinearLayout
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView
import valentino.david.dicodingdavid.MainActivity
import valentino.david.dicodingdavid.R

class MainActivityUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        linearLayout{
            orientation = LinearLayout.VERTICAL
            id = R.id.verticalViewClub
            recyclerView{
                lparams(width = matchParent, height = matchParent)
                id = R.id.recycleClub
            }
        }
    }
}