package com.example.planosycentellas.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.planosycentellas.model.Episode;
import com.example.planosycentellas.repository.Repository;

import java.util.List;

public class HomeViewModel extends ViewModel {

    private Repository repository;
    private MutableLiveData<List<Episode>> episodeList;
    private MutableLiveData<List<String>> newsList;


    public HomeViewModel(){
        repository = new Repository();
    }

    public MutableLiveData<List<Episode>> getEpisodeList(){
        if(episodeList == null){
            getEpisodeListRepository();
        }
        return episodeList;
    }

    private void getEpisodeListRepository(){
        episodeList = repository.getEpisodes();
    }

    public MutableLiveData<List<String>> getNewsList(){
        if(newsList == null){
            getNewsListRepository();
        }
        return newsList;
    }

    private void getNewsListRepository(){
        newsList = repository.getNews();
    }
}