# UI Tests

Your task is to create automated checks for the search function for the CRUK find a shop page ([https://www.cancerresearchuk.org/get-involved/find-a-shop](https://www.cancerresearchuk.org/get-involved/find-a-shop)).

## Scenarios

You need to test the following scenarios (this is a live website, please don't overuse the page/functionality):

1. create a "happy path" scenario.
1. create a negative scenario.

## Guidance

If you prefer to use a different test framework (feel free to add it as a dependency, we use Cypress.io at CRUK) to solve the challenge. Use best practices for the test architecture and setup.

### Setup
1. Java installed
1. Maven installed
1. Download ChromeDriver & put in `C:/chromedriver/` folder [Chromedriver Downloads](http://chromedriver.chromium.org/downloads). If not using windows you may need to change the executable path.
1. Download [docker](https://docs.docker.com/get-docker/)

### Run Selenium Grid
Using docker to run Selenium Grid (Feel free to use a local instance yourself)
```sh
docker pull elgalu/selenium

docker run -d --name=grid -p 4444:24444 -p 5900:25900 \
     -e TZ="US/Pacific" -v /dev/shm:/dev/shm --privileged elgalu/selenium
```

### Run
```sh
mvn clean test -DsuiteXmlFile=testng/testng.xml
```

## Documentation

Please describe in a README.md file how to run the tests and any other additional info needed about any assumptions you make.

## On Completion

Please either:
1. Zip up the project and send it back to the hiring manager
1. Publish to your github and send us the link
