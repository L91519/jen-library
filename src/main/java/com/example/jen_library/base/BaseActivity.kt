package com.example.jen_library.base

import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<B : ViewDataBinding, VM : BaseViewModel>(
    @LayoutRes private val layoutRes: Int
) : RootActivity() {

    protected lateinit var binding: B
    protected abstract val vm: VM

}