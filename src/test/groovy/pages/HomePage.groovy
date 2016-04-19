package pages

import geb.Page
import modules.ToolbarModule

class HomePage extends Page{

    static url = '/content/geometrixx-outdoors-mobile/en.html'

    static at = {
        title == 'English'
    }

    static content = {
        toolbar {
            module ToolbarModule, $('div.page-systemnav')
        }
    }

}