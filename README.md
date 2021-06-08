# WeatherApp
It is a spring boot project, provides a rest API service that will retrieve the weather information via a given city name. This API utilize the open resource https://goweather.herokuapp.com/weather/{city}. Currently, it only provides three cities, which is confiured by the include_cities parameter from the application.properties.

## API Detail
| name | path | type | input parameter | response 
| :----: | :----: | :----: | :----: | :----: |
| getWeatherByCity | /weather | RequestMethod.GET | @RequestParam String city | WeatherModel


## How to work
* Download this project
* Utilize the maven to refresh the dependencies
* Start the project with the main function
* Input the server URL from the browser, the URL is ***http://localhost:1234/weather?city=melbourne***
* The weather information of melbourne city will be shown from the browser
