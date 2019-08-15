package com.example.zhafirtubes.click;

import com.example.zhafirtubes.entity.Friends;

import java.util.ArrayList;

// 10116336 KAIZER NUGRAHA IF-8  8/14/2019
public interface LoadFriendsCallback {
    void preExecute();
    void postExecute(ArrayList<Friends> friends);
}
