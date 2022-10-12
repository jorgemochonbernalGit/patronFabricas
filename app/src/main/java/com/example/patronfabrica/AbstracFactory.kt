package com.example.patronfabrica

abstract class AbstracFactory {
    abstract fun getBread(breadType: String?): Bread?;
    abstract fun getFilling(breadType: String?): Filling?;
}