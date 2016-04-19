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
    }
}
