package modules

import geb.Module

class ToolbarModule extends Module{

    static content = {
        search {
            $('.search-field input', 0, placeholder:'Search')
        }
        searchButton {
            $('.search-submit input', 0)
        }
        cart(wait: true){
            $('li.cartpage > a.cq-hovercart-link', 0, href: '/content/geometrixx-outdoors/en/user/cart.html')
        }
    }
}
