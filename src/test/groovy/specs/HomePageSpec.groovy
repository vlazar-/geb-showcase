package specs

import geb.spock.GebReportingSpec
import org.openqa.selenium.Keys
import pages.BaffinSnowPage
import pages.CartPage
import pages.HomePage
import pages.SearchResultsPage

class HomePageSpec extends GebReportingSpec{

    def 'can open Geometrixx en home page'(){
        when:
        to HomePage

        then:
        at HomePage
    }


    def 'can open cart page as anonymous user'(){
        when:
        to HomePage
        waitFor {
            toolbar.isDisplayed()
        }

        and:
        toolbar.cart.click()

        then:
        at CartPage
    }

    def 'first time users cart status is 0'(){
        when:
        to HomePage
        waitFor {
            toolbar.isDisplayed()
        }

        and:
        toolbar.cart.click()

        then:
        at CartPage
        cartEmpty.isDisplayed()
    }

    def 'can search for Baffin Snow Winter Hat and add it to cart'() {
        when:
        to HomePage
        waitFor {
            toolbar.isDisplayed()
        }

        and:
        toolbar.search << 'Baffin Snow'
        toolbar.search << Keys.ENTER

        and:
        at SearchResultsPage
        baffinSnowLink.isDisplayed()
        baffinSnowLink.click()

        and:
        at BaffinSnowPage
        addToCart.click()

        then:
        at CartPage
        cartStatus.text() == "1 item in shopping cart."
    }
}
