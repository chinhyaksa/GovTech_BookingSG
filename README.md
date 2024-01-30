# GovTech_BookingSG

# Purpose
This project is responsible for running automated end-to-end selenium tests.

***

# Dependencies
I use testng, selenium, cucumber framework
See `pom.xml` for the entire list.

***

# Installation
Make sure you have Maven 3.3.9 or newer installed (check with `mvn -version`)\
If not, install with \
`brew update`\
`brew install maven`

(If you don't have homebrew, following the instructions to install it here: https://brew.sh/)

Make sure Java 8 (or higher) is installed. _Note that the Jenkins job uses jdk1.8._\
Start a new project in IntelliJ and select `Check out from Version Control`. \
Select 'GitHub' and proceed with the authentication process, and select this repo (automation).

### IntelliJ plugins
In IntelliJ, go to IntelliJ -> Preferences (⌘,) -> Plugins -> Browse Repositories
Install the following plugins:
- `Cucumber for Java`
- `Gherkin`

**Note:** If the plugin `Substeps IntelliJ Plugin` is installed, make sure to disable it.

***

# Running Tests
Fire up your trusty terminal to run these tests!\
`mvn verify` - This will execute the test with configurations specified in our maven surefire plugin in `pom.xml`. Note that there are properties that you can pass (found in pom.xml), otherwise default values will be used.

Each time a test runs, a `target` folder is generated.\
`mvn clean` will delete the entire target folder.

*Pro-Tip:* You can use `mvn clean verify` to start a test with a clean `target` folder.\

### Tags
You can specify which tests you want to include / exclude in your run by using tags.\
Tags can be used anywhere in `.feature` files. So if you have a tag at the top of the file, it will include / exclude all the scenarios.\
Or if you have a tag above a specific scenario within a feature file, then your test will only include / exclude that scenario during execution.

More info about tag expressions here: https://docs.cucumber.io/cucumber/api/#tag-expressions