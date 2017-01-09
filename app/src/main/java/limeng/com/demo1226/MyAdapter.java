package limeng.com.demo1226;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;

/**
 * Created by Administrator on 2016/12/26 0026.
 */
public class MyAdapter extends BaseAdapter {
    @Bind(R.id.totle)
    View view;
    private List<Model> mList;
    private Context con;
    public MyAdapter(List<Model> mList,Context con){
           this.mList = mList;
           this.con = con;
    }
    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        Holder holder;
        if(view==null){
            view = LayoutInflater.from(con).inflate(R.layout.list_item,null);
            holder = new Holder(view);
            view.setTag(holder);
        }else{
            holder = (Holder) view.getTag();
        }
        holder.tx.setText(mList.get(position).getName());
        holder.btn.setText(mList.get(position).getSex());
        return view;
    }

    static class Holder{
        @Bind(R.id.name)TextView tx;
        @Bind(R.id.delete)Button btn;
        public Holder(View view){
            ButterKnife.bind(this,view);
        }
    }
}
