

TO run this project : 
1) install maven 
2) open cmd ot git bash
3) go to project 
4) Execute command: mvn verify -P chrome


Or open Project in intellij or any IDE 
run TestAcceptance class with adding -P chrome 

Please feel freee to contact me if you have an issue i can make a demo


For CI : 

We have to configure : 
serenity-jenkins.properties 
add proxy server if needed 
define on which ports 

what can be done next : 
1) chose better XPATH 
sorry i didn't have the time 
i had to finish this today 
I hope this won't be an issue 

2) add a false test when searching something that doesn't have any links 

NB: 
Google chrome version 91 a été utilisé 
faudra updaté le driver sinon ca marchera pas 
le driver se situe dans /src/test/resources/webdriver

