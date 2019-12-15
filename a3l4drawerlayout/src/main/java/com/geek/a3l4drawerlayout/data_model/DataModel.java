package com.geek.a3l4drawerlayout.data_model;

import com.geek.a3l4drawerlayout.R;

import java.util.ArrayList;

public class DataModel {
    private ArrayList<String> listMemberFamily;
    private ArrayList<Integer> listImgMemberFamily;
    private ArrayList<Integer> listAgeMemberFamily;
    private ArrayList<ArrayList> listResult;

    public DataModel() {
        this.listMemberFamily = new ArrayList<>();
        this.listImgMemberFamily = new ArrayList<>();
        this.listAgeMemberFamily = new ArrayList<>();
        this.listResult = new ArrayList<>();
        initlistMemberFamily();
        initlistImgMemberFamily();
        initlistAgeMemberFamily();
    }

    private ArrayList initlistMemberFamily() {
        listMemberFamily.add("Свинопапа");
        listMemberFamily.add("Свиномама");
        listMemberFamily.add("Свиносына");
        listMemberFamily.add("Свинобрат");
        listMemberFamily.add("Свиносестра");
        listMemberFamily.add("Свинодоча");
        return listMemberFamily;
    }

    private ArrayList initlistImgMemberFamily() {
        listImgMemberFamily.add(R.drawable.boar);
        listImgMemberFamily.add(R.drawable.pig);
        listImgMemberFamily.add(R.drawable.pig_mini);
        listImgMemberFamily.add(R.drawable.boar);
        listImgMemberFamily.add(R.drawable.pig);
        listImgMemberFamily.add(R.drawable.pig_mini);
        return listImgMemberFamily;
    }
    private ArrayList initlistAgeMemberFamily() {
        listAgeMemberFamily.add(6);
        listAgeMemberFamily.add(5);
        listAgeMemberFamily.add(2);
        listAgeMemberFamily.add(5);
        listAgeMemberFamily.add(4);
        listAgeMemberFamily.add(1);
        return listAgeMemberFamily;
    }

    private ArrayList resultList() {
        listResult.add(listMemberFamily);
        listResult.add(listImgMemberFamily);
        listResult.add(listAgeMemberFamily);
        return listResult;
    }

    public ArrayList getListResult() {
        return resultList();
    }
}
