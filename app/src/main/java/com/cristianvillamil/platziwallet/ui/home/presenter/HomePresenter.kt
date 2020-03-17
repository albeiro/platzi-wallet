package com.cristianvillamil.platziwallet.ui.home.presenter

import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer
import com.cristianvillamil.platziwallet.ui.home.HomeContract
import com.cristianvillamil.platziwallet.ui.home.data.HomeInteractor

class HomePresenter:HomeContract.Presenter {
    val homeInteractor = HomeInteractor()
    override fun retrieveFavoriteTransfer():List<FavoriteTransfer>{

    }
}