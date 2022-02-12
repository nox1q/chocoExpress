package kz.chocoexpress.app.ui.activities.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kz.chocoexpress.app.R
import kz.chocoexpress.app.databinding.ActivityMainBinding
import kz.chocoexpress.app.ui_common.base.BaseActivity

class MainActivity : BaseActivity() {

    companion object {
        fun getIntent(context: Context?) = Intent(context, MainActivity::class.java)
    }

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this

        viewModel = getViewModel(MainViewModel::class.java!!)
        binding.viewModel = viewModel

        initView()
    }

    private fun initView() {

        navController = findNavController(R.id.nav_host_fragment)

    }

}