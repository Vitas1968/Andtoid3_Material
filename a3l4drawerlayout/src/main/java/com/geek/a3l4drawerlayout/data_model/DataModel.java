package com.geek.a3l4drawerlayout.data_model;

import com.geek.a3l4drawerlayout.R;

import java.util.ArrayList;

public class DataModel {
    private ArrayList<String> listMemberFamily;
    private ArrayList<Integer> listImgMemberFamily;
    private  ArrayList<ArrayList> listResult;

    public DataModel() {
        this.listMemberFamily = new ArrayList<>();
        this.listImgMemberFamily = new ArrayList<>();
        this.listResult=new ArrayList<>();
        initlistMemberFamily();
        initlistImgMemberFamily();
        resultList();
    }
    private ArrayList initlistMemberFamily(){
        listMemberFamily.add("Свинопапа");
        listMemberFamily.add("Свиномама");
        listMemberFamily.add("Свиносына");
        return listMemberFamily;
    }
    private ArrayList initlistImgMemberFamily(){
        listImgMemberFamily.add(R.drawable.boar);
        listImgMemberFamily.add(R.drawable.pig);
        listImgMemberFamily.add(R.drawable.pig_mini);
        return listImgMemberFamily;
    }
    private    ArrayList resultList(){
        listResult.add(listMemberFamily);
        listResult.add(listMemberFamily);
        return listResult;
    }

    public ArrayList<ArrayList> getListResult() {
        return listResult;
    }
}
