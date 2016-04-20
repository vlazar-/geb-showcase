package pages

import geb.Page

class BaffinSnowPage extends Page{

    static url = '/content/geometrixx-outdoors/en/equipment/skiing/baffin-snow.html'

    static at = {
        title == 'Baffin Snow'
    }

    static content = {
        addToCart{
            $('.product-submit > .button-group > input', 0, value: 'Add to Cart')
        }
    }
}
