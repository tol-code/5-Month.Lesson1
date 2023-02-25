package com.example.a5_monthlesson1.view

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a5_monthlesson1.presenter.CounterPresenter

import com.example.a5_monthlesson1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),MainActivityView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = CounterPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        onClick()

    }

    override fun updateCounterView(model: Int) {
        binding.tvCounter.text = model.toString()
    }

    override fun showToast() {
        Toast.makeText(this,"Поздравляем!!", Toast.LENGTH_LONG).show()
    }

    override fun changeColor() {
        binding.tvCounter.setTextColor(Color.RED)
    }

    private fun onClick(){
        binding.btnIncrement.setOnClickListener {
            presenter.increment()
        }
        binding.btnDecrement.setOnClickListener {
            presenter.decrement()
        }

    }
}