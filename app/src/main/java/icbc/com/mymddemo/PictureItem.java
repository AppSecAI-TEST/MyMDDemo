package icbc.com.mymddemo;

/**
 * Created by Administrator on 2017/5/19 0019.
 */
public class PictureItem {
    int resId;
    String text;

    public PictureItem(String text, int resId) {
        this.resId = resId;
        this.text = text;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
