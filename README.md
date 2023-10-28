# SwagLabsProject
Project automation testing menggunakan framework selenium dengan menggunakan metodologi BDD dengan framework BDD cucumber. Pada project ini menggunakan bahasa gherkin pada cucumber dan bahasa java pada selenium. Pada project ini melakukan pengujian pada website SwagLabs pada halaman https://www.saucedemo.com/.  

Diperlukan instalasi untuk dapat menjalankan project ini yaitu sebagai berikut :
- Intellij IDE
- selenium 
- java
- cucumber
- maven
- Firefox driver (geckodriver)

Pada project terdiri dari beberapa file : 
- Feature, yang berisi scenario dalam bentuk gherkin syntax dengan nama swagLabs.feature
- Project java, yang berisi seluruh code menjalankan perintah automate dalam bahasa java dengan nama SwagLabsSteps.java
- TestRun, yang berisi perintah running project dengan nama TestRunner.java

Cara menjalankan project dengan cara : 
- untuk menjalankan keseluruhan dari Scenario lakukan Run pada TestRunner.java pada folder .idea/src/test/java/testRunner/TestRunner.java
- untuk menjalankan berdasarkan scenario dapat lakukan Run pada swagLabs.feature pada folder .idea/src/test/resources/Features/swagLabs.feature

