package icbc.com.mymddemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2017/5/19 0019.
 */
public class PictureAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private Context context;
    private List<PictureItem> itemList;
    private OnItemClickLinstener itemClickLinstener;

    public PictureAdapter(Context context, List<PictureItem> itemList){
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_picture,parent,false);
        return new BaseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, final int position) {
        holder.mItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickLinstener.onItemClick(position);
            }
        });

        holder.setText(R.id.text,itemList.get(position).getText());
        holder.setImageResource(R.id.image,itemList.get(position).getResId());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public void setOnItemClickLinstener(OnItemClickLinstener itemClickLinstener){
        this.itemClickLinstener = itemClickLinstener;
    }

    interface OnItemClickLinstener{
        void onItemClick(int position);
    }
}
