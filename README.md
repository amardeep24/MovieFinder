#Title
This app queries the OMDB api to get movie details.

##Stack
1. UI is made using Angular 5.
2. Server REST service is made using Spring Boot 2.0.1
3. The app is run in a Docker container.

##Build
1. Navigate to the src/main/client and do a ng build
2. Copy the contents of the generated dist folder to src/main/resources/static
3. Run a Maven build using mvn clean install
4. Open a terminal in the current directory and build the docker image docker build -t moviefinder .
5. Run the image by  docker run -i -p 8070:8070 -t moviefinder
6. Navigate to the ip of the docker process and open http://<ip>:8070/index.html
