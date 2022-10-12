package com.example.patronfabrica

class FillingFactory : AbstracFactory() {
    override fun getFilling(breadType: String?): Filling? {
        if (breadType == null) {
            return null;
        }

        return if (breadType == "CHE") {
            Chesse();
        } else {
            Tomato();
        }
        return null;
    }

    override fun getBread(breadType: String?): Bread? = null;
}