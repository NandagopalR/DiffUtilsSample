package com.nanda.diffutilssample.adapter;

import android.content.Context;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.nanda.diffutilssample.R;
import com.nanda.diffutilssample.callback.PersonDiffUtilCallBack;
import com.nanda.diffutilssample.model.PersonItem;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nandagopal on 2/28/17.
 */
public class PersonRecyclerViewAdapter
    extends RecyclerView.Adapter<PersonRecyclerViewAdapter.PersonViewHolder> {

  private Context context;
  private LayoutInflater inflater;
  private List<PersonItem> personItemList;

  public PersonRecyclerViewAdapter(Context context) {
    this.context = context;
    personItemList = new ArrayList<>();
    inflater = LayoutInflater.from(context);
  }

  public void setPersonItemList(List<PersonItem> itemList) {
    if (itemList == null) return;

    personItemList.clear();
    personItemList.addAll(itemList);
  }

  @Override public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    final View view = inflater.inflate(R.layout.item_person, parent, false);
    return new PersonViewHolder(view);
  }

  @Override public void onBindViewHolder(PersonViewHolder holder, int position) {
    final PersonItem item = personItemList.get(position);
    holder.setDataToView(item);
  }

  public void swapListItems(List<PersonItem> newList) {
    final PersonDiffUtilCallBack diffUtilCallBack =
        new PersonDiffUtilCallBack(this.personItemList, newList);
    DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(diffUtilCallBack);

    this.personItemList.clear();
    this.personItemList.addAll(newList);
    diffResult.dispatchUpdatesTo(this);
  }

  @Override public int getItemCount() {
    return personItemList.size();
  }

  final class PersonViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.item_person_name) TextView tvPersonName;
    @BindView(R.id.item_person_mobile_number) TextView tvPersonMobileNumber;

    public PersonViewHolder(View itemView) {
      super(itemView);
      ButterKnife.bind(this, itemView);
    }

    public void setDataToView(PersonItem item) {
      tvPersonName.setText(item.getPersoName());
      tvPersonMobileNumber.setText(String.valueOf(item.getMobileNumber()));
    }
  }
}
