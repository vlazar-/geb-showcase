package pages.mobile

import geb.Page

class HomePageMobile extends Page{

    static url = ''

    static at = {
        title == 'Geometrixx Outdoors'
    }

    static content = {
        toolbar {
            module ToolbarMobileModule, $('#page-header.nav-buttons')
        }
    }
}
