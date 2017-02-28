package com.nanda.diffutilssample.callback;

import android.support.annotation.Nullable;
import android.support.v7.util.DiffUtil;
import com.nanda.diffutilssample.model.PersonItem;
import java.util.List;

/**
 * Created by nandagopal on 2/28/17.
 */
public class PersonDiffUtilCallBack extends DiffUtil.Callback {

  private List<PersonItem> oldList;
  private List<PersonItem> newList;

  public PersonDiffUtilCallBack(List<PersonItem> oldList, List<PersonItem> newList) {
    this.oldList = oldList;
    this.newList = newList;
  }

  @Override public int getOldListSize() {
    return oldList.size();
  }

  @Override public int getNewListSize() {
    return newList.size();
  }

  @Override public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
    return oldList.get(oldItemPosition) == newList.get(newItemPosition);
  }

  @Override public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {

    PersonItem oldItem = oldList.get(oldItemPosition);
    PersonItem newItem = oldList.get(newItemPosition);

    return oldItem.getPersoName().equals(newItem.getPersoName());
  }

  @Nullable @Override public Object getChangePayload(int oldItemPosition, int newItemPosition) {
    return super.getChangePayload(oldItemPosition, newItemPosition);
  }
}
