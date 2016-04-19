#!/bin/bash
mvn clean compile

mvn -Dgeb.env=chrome -Dtest="HomePageSpec" test

mvn -Dgeb.env=chrome-android -Dtest="HomePageMobileSpec" test

mvn surefire-report:report-only

mvn site -DgenerateReports=false

mvn postman:send-mail
