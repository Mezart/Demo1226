package limeng.com.demo1226;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.BindColor;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.text)
    TextView tx;
    @BindColor(R.color.red)
    int color;
    @Bind(R.id.btn_commit)
    Button btn;
    @Bind(R.id.list)
    ListView list;
    @OnClick({R.id.btn_commit,R.id.text})
    public void change(){
        tx.setTextColor(color);
    }
    private MyAdapter adapter;
    private List<Model> modelList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        for(int i = 1;i<10;i++){
            Model m = new Model();
            m.setName("aa"+i);
            m.setSex("bb"+i);
            modelList.add(m);
        }
        adapter = new MyAdapter(modelList,this);
        list.setAdapter(adapter);
    }
    @OnItemClick(R.id.list)
    void click(int position){
        Log.e("aaa","bbbb");
    }
}
