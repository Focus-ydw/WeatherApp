# WeatherApp
It is a spring boot project, provides a rest API service that will retrieve the weather information via a given city name. This API utilize the open resource https://goweather.herokuapp.com/weather/{city}.

## API Detail
| name | path | type | input parameter | response 
| :----: | :----: | :----: | :----: | :----: |
| getWeatherByCity | /weather | RequestMethod.GET | @RequestParam String city | WeatherModel



