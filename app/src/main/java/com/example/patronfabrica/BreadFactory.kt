package com.example.patronfabrica

class BreadFactory : AbstracFactory() {
    override fun getBread(breadType: String?): Bread? {
        if (breadType == null) {
            return null;
        }

        return if (breadType == "BAG") {
            Baguette();
        } else {
            SliceBread();
        }
        return null;
    }

    override fun getFilling(breadType: String?): Filling? = null;
}