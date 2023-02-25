package com.example.a5_monthlesson1.presenter

import com.example.a5_monthlesson1.model.CounterModel
import com.example.a5_monthlesson1.view.MainActivityView

class CounterPresenter {
    private val counterModel = CounterModel()
    private lateinit var view: MainActivityView

    fun increment(){
        counterModel.increment()
        view.updateCounterView(counterModel.count)
        showToast()
        changeColor()
    }

    private fun showToast(){
         if (counterModel.count == 10) {
            view.showToast()
        }
    }
    fun changeColor(){
        if(counterModel.count == 15){
            view.changeColor()
        }
    }

    fun decrement(){
        counterModel.decrement()
        view.updateCounterView(counterModel.count)
        showToast()
        changeColor()

    }
    fun attachView(view: MainActivityView){
        this.view = view
    }

}