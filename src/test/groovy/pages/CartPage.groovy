package pages

import geb.Page

class CartPage extends Page {

    static url = '/content/geometrixx-outdoors/en/user/cart.html';

    static at = {
        title == 'My Cart'
    }

    static content = {
        cartStatus {
            $('h2.cart-title', 0)
        }
        cartEmpty(required: false) {
            $('h2.cart-title > .emptycart', 0)
        }
    }

}
