package pages

import geb.Page

class SearchResultsPage extends Page{
    static at = {
        title =='Search'
    }

    static content = {
        baffinSnowLink(required: false){
            $("a", href: '/content/geometrixx-outdoors/en/equipment/skiing/baffin-snow.html')
        }
    }
}
