package com.nanda.diffutilssample.utils;

import com.nanda.diffutilssample.model.PersonItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by nandagopal on 2/28/17.
 */
public class CommonUtils {

  public static List<PersonItem> getPersonList() {

    List<PersonItem> personItemList = new ArrayList<>();

    personItemList.add(new PersonItem("1", "Kalpesh", 1234567890));
    personItemList.add(new PersonItem("2", "Rajiv", 1234567590));
    personItemList.add(new PersonItem("3", "Raja", 1234567490));
    personItemList.add(new PersonItem("4", "Nanda", 1234562890));
    personItemList.add(new PersonItem("5", "Pavan", 1234555890));
    personItemList.add(new PersonItem("6", "Selva", 1234577890));
    personItemList.add(new PersonItem("7", "Shyam", 1234522890));
    personItemList.add(new PersonItem("8", "Karthik", 1234567891));
    personItemList.add(new PersonItem("9", "Prabhu", 1234567866));

    return personItemList;
  }

  public static List<PersonItem> getUpdatedPersonList() {

    List<PersonItem> personItemList = new ArrayList<>();

    personItemList.add(new PersonItem("1", "Kalpesh Patel", 934567890));
    personItemList.add(new PersonItem("2", "Rajiv Manivannan", 924567590));
    personItemList.add(new PersonItem("3", "Raja Mohammed", 954567490));
    personItemList.add(new PersonItem("4", "Nandagopal", 904562890));
    personItemList.add(new PersonItem("5", "Pavan", 1234555890));
    personItemList.add(new PersonItem("6", "Selva", 1234577890));
    personItemList.add(new PersonItem("7", "Shyam", 1234522890));
    personItemList.add(new PersonItem("8", "Karthik", 1234567891));
    personItemList.add(new PersonItem("9", "Prabhu", 1234567866));
    personItemList.add(new PersonItem("10", "Ezhil", 1234567811));
    personItemList.add(new PersonItem("11", "Prakash", 1266567811));
    personItemList.add(new PersonItem("12", "Ram", 1266522811));
    personItemList.add(new PersonItem("13", "Vicky", 1266522899));

    return personItemList;
  }

  public static List<PersonItem> getPersonListSortedByName() {
    final List<PersonItem> actorList = getPersonList();

    Collections.sort(actorList, new Comparator<PersonItem>() {
      @Override public int compare(PersonItem a1, PersonItem a2) {
        return a1.getPersoName().compareTo(a2.getPersoName());
      }
    });

    return actorList;
  }
}
