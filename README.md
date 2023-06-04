## TFH_Android_Automation
TFH Android Automation is an automation project that focuses on automating Android application testing in a production environment. This project utilizes various tools and technologies to ensure efficient and reliable testing of Android applications.

# Prerequisites
Before running the code for TFH Android Automation, make sure you have the following software installed:

- Homebrew: A package manager for macOS. Visit the Homebrew website (https://brew.sh/) for installation instructions.
- Node.js: Ensure you have Node.js installed with the required version. TFH Android Automation requires Node.js version v18.15.0. You can install Node.js using Homebrew with the following command: **brew install node@18**
- Java Development Kit (JDK): Install JDK version 19.0.2. You can download JDK from the official Oracle website ([Download JDK](https://www.oracle.com/java/technologies/javase/jdk19-archive-downloads.html)) and follow the installation instructions.
- Eclipse IDE: TFH Android Automation utilizes Eclipse IDE for development. Download and install Eclipse IDE from the official Eclipse website ([Eclipse IDE - Download] (https://www.eclipse.org/downloads/)).

# Getting Started
To get started with TFH Android Automation, follow these steps:

- Clone the project repository: git clone [TFH_Android](https://github.com/Jayvachhani77/TFH_Android.git)
- Open the Eclipse IDE and import the project:
- Select File > Import.
- Choose General > Existing Projects into Workspace.
- Browse to the cloned project directory and select it.
- Click Finish to import the project into Eclipse.
- Install project dependencies.
- Configure the app.properties file.
- Configure report store location on ExtentReporterNG.java file.
- Update the necessary configuration files within the project to match your production environment settings.
- Launch emulator.
- Start Appium server from terminal using **Appium** command. 
- Run the TestNG suite.
- Check the genereated report.