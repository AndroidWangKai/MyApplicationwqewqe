package com.example.mvptest3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Bean> list=new ArrayList<>();
    private RecyclerView rec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initView();
}

    private void initView() {
        rec = (RecyclerView) findViewById(R.id.rec);
        rec.setLayoutManager(new LinearLayoutManager(this));
        for (int i = 0; i <20 ; i++) {
            list.add(new Bean("http://img.juhe.cn/joke/201412/19/B9EBF01A3C718DABB4C166356CC839A8.jpg"));
        }
        RecAdapter recAdapter = new RecAdapter(R.layout.layout_item, list);
        rec.setAdapter(recAdapter);
        recAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
        recAdapter.isFirstOnly(true);
        recAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
