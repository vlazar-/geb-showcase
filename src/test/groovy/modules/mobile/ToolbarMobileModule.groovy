package modules.mobile

import geb.Module

class ToolbarMobileModule extends Module{

    static content = {
        search {
            $('a#nav-button-search')
        }
        searchField(required: false) {
            $('input#search-field')
        }
    }

}
