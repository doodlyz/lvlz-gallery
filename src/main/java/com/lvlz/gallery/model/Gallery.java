package com.lvlz.gallery.model;

import com.lvlz.gallery.data.DataResult;

import java.util.ArrayList;

public class Gallery {

  private final ArrayList<DataResult.Data> data;
  private final long next_pointer;
  private final int code_err;

  public Gallery(DataResult result) {

    this.data = result.dataCollections;
    this.next_pointer = result.nextPointer;
    this.code_err = result.codeErr;

  }

  public long getNextPointer() {

    return next_pointer;

  }

  public ArrayList<DataResult.Data> getData() {

    return data;

  }

  public int getCodeErr() {

    return code_err;

  }

}
