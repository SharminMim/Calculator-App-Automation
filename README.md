## Project Title- Mobile App Automation on Calculator using ```Appium```
In this repository, I have automated the Google LLC Calculator Android App and generated an ```allure report``` for the test suite results.

### Work Scenerio
Automate any series for calculator app. Pass the series as a parameter to your test method.
For an example:

- 100/10*5-10+60
- 50+10-20*2+10/2

pseudocode for test function can be look like:

- public void doSeries(){
 calcuateSeries("100/10*5-10+60");}

## Tools Used
- Selenium
- TestNG Framework
- Appium
- Allure Report
   - Project run ```gradle clean test```
     For generating Allure Report-
   - allure generate allure-results --clean -o allure-report
   - allure serve allure-results

### Allure Report
#### Overview
![appOverview](https://github.com/user-attachments/assets/a335ccdd-4540-4473-94c2-0f76416853c4)

#### Behaviour
![appBehaviour](https://github.com/user-attachments/assets/430fd633-0fc8-4683-8eab-716ec0ff6c54)

### Project Demonstration Video
https://github.com/user-attachments/assets/faf56ad0-20bd-42de-810c-687190a970ed

