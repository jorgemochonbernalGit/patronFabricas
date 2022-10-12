package com.example.patronfabrica

object FactoryGenerator {
    fun getFactory(factoryType: String?): AbstracFactory? {
        if (factoryType == null) {
            return null;
        }

        return if (factoryType == "BRE") {
            BreadFactory();
        } else {
            FillingFactory();
        }
        return null;
    }
}
