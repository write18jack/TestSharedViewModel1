package com.example.testsharedviewmodel1.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlayerViewModel : ViewModel(){

    private val _posi = MutableLiveData<Int>(0)
    val posi: LiveData<Int> = _posi

    private val _player = MutableLiveData<Int>(0)
    val player: LiveData<Int> = _player

    fun setPosi(positionId:Int){
        _posi.value = positionId
    }

    fun setPlayer(playerId:Int){
        _player.value = playerId
    }
}