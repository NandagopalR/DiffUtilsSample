# DiffUtilsSample
This is simple example of DiffUtils to avoid notifyDataSetChanged() method.

# DiffUtil
   DiffUtil is a utility class that can calculate the difference between two lists and output a list of update operations that converts the first list into the second one.It can be used to calculate updates for a RecyclerView Adapter.
   
# Why DiffUtil
   Most of the time our list changes completely and we set new list to RecyclerView Adapter. And we call notifyDataSetChanged to update adapter. NotifyDataSetChanged is costly. DiffUtil class solves that problem.
  
# DiffUtil.Callback Methods

# getOldListSize() : 
   It returns the size of the old list.
# getNewListSize() : 
   It returns the size of the new list;
# areItemsTheSame(int oldItemPosition, int newItemPosition) : 
   Called by the DiffUtil to decide whether two object represent the same Item.If your items have unique ids, this method should check their id equality.
# areContentsTheSame(int oldItemPosition, int newItemPosition) : 
   Checks whether two items have the same data.You can change its behavior depending on your UI. This method is called by DiffUtil only if areItemsTheSame returns true.
# getChangePayload(int oldItemPosition, int newItemPosition) : 
   If areItemTheSame return true and areContentsTheSame returns false DiffUtil calls this method to get a payload about the change. 
   
# References:
https://developer.android.com/reference/android/support/v7/util/DiffUtil.html
