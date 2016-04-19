package specs.mobile

import geb.spock.GebReportingSpec
import pages.mobile.HomePageMobile

class HomePageMobileSpec extends GebReportingSpec{

    def 'can open Geometrixx en home page on mobile device'(){
        when:
        to HomePageMobile

        then:
        at HomePageMobile
    }

}

