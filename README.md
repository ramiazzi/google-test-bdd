*Serenity - Cucumber - travel-web-bdd*
----------
## Goals 

The goal of this project is to automatize task on Traveldoo's platforms. Theses tests will be runned to verify the stability of each application during the developments and the release process. 


## Technical stack 
* Maven
* Cucumber
* Selenium
* Serenity

The test suite can be runned on **chrome** or **phantomjs** browsers


## Installation 

* Git clone the repository
* Dowload Mavane and Java
* Verify maven and java isntallation on terminal
  * Java : `java -v`
  * Maven : `mvn`
* Execute `mvn clean install` on directory 
* Launch `mvn verify -P chrome -P integration`


## Execution 

* Launch `mvn clean install -Dmaven.test.skip=true ` in the project folder 
* Run tests with `mvn verify -P browser -P environment`
    * Whitout browser profile, tests will be launched with Firefox
* You can run specific test with `mvn verify -Dcucumber.options="--tags @TAG @TAG2"`


## Tags 

There is availables Tags :
* @Connection	
* @Enterprise
* @Portal
* @Admin
* @Intelligence
* @Assisteur
* @SupportSite
* @Reporting
* @Risk
* @Air
* @Rail
* @Hotel
* @Car
* @Amadeus
* @ElsyArres
* @Gallileo
* @Sabre
* @WBS
* @More_Options
* @Search
* @Avis
* @EuropCar
* @Hertz
* @Sixt
* @CDS
* @EAN
* @Harp
* @Hcorpo
* @HotelInfo
* @OHH
* @NVS
 * @RIVA
* @RailOne
* @TrainLine

## Profiles ##

You need to select two differents profile to launch tests :

* Browser 
  * chrome 
  * phantomjs
* Environment 
  * local
  * integration
  * test
  * produciton

 