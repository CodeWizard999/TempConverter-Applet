# TempConverter-Applet

This is a simple JavaFX application that converts temperatures between Celsius and Fahrenheit.

# How to Use

To use this application, simply enter a temperature in either Celsius or Fahrenheit, and press Enter. The other field will automatically update with the converted temperature.

If you enter an invalid temperature, an error message will appear. Click the "OK" button to dismiss the message and try again.

# How to Run
There are two ways to run this application:

# Using Gradle

Clone this repository to your local machine.
Make sure you have Java 8 or later installed.
Open a terminal or command prompt and navigate to the project directory.

Run the following command to build the project:

./gradlew build

Run the following command to start the application:

./gradlew run

The application window should appear. Use it as described in the "How to Use" section above.
Alternatively, you can import the project into an IDE such as Eclipse or IntelliJ IDEA and run it from there.

# Using Java

Clone this repository to your local machine.
Make sure you have Java 8 or later installed.
Open a terminal or command prompt and navigate to the project directory.

Run the following command to compile the source code:

javac -cp .:lib/* com/example/javafx_final_partb/TemperatureConverterApplication.java

Run the following command to start the application:

java -cp .:lib/* com.example.javafx_final_partb.TemperatureConverterApplication

The application window should appear. Use it as described in the "How to Use" section above.
# Note: 
The lib directory contains the required JavaFX libraries. If you're using a different version of JavaFX, you may need to update the libraries in this directory.

You can also run the TemperatureConverterApplication class directly from an IDE such as Eclipse or IntelliJ IDEA by running the main method.
