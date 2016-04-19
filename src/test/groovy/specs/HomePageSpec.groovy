package specs

import geb.spock.GebReportingSpec
import org.openqa.selenium.Keys
import pages.HomePage
import pages.SearchResultsPage

class HomePageSpec extends GebReportingSpec{

    def 'can open Geometrixx en home page'(){
        when:
        to HomePage

        then:
        at HomePage
    }


    def 'can open cart page'(){

    }

    def 'can search for Baffin Snow Winter Hat'() {
        when:
        to HomePage
        waitFor {
            toolbar.isDisplayed()
        }

        and:
        toolbar.search << 'Baffin Snow'
        toolbar.search << Keys.ENTER

        then:
        at SearchResultsPage
        baffinSnowLink.isDisplayed()
    }
}
