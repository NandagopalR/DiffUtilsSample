package com.nanda.diffutilssample.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.nanda.diffutilssample.R;
import com.nanda.diffutilssample.adapter.PersonRecyclerViewAdapter;
import com.nanda.diffutilssample.base.BaseActivity;
import com.nanda.diffutilssample.utils.CommonUtils;

public class MainActivity extends BaseActivity {

  @BindView(R.id.recyclerview) RecyclerView recyclerView;

  private PersonRecyclerViewAdapter adapter;
  private Runnable runnable = new Runnable() {
    @Override public void run() {
      adapter.swapListItems(CommonUtils.getPersonList());
    }
  };

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);

    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    recyclerView.setItemAnimator(null);

    adapter = new PersonRecyclerViewAdapter(this);
    recyclerView.setAdapter(adapter);
    new Handler().postDelayed(runnable, 2000);
  }

  @Override public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu_update_person_item, menu);
    return super.onCreateOptionsMenu(menu);
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {

    if (item.getItemId() == R.id.action_update) {
      adapter.swapListItems(CommonUtils.getUpdatedPersonList());
      return true;
    }

    return super.onOptionsItemSelected(item);
  }
}
