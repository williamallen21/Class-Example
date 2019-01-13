  class vehicle { //setting up instant class for vehicles
    int passangerCap;
    int numDoors;
    int fuelCap;
    int mpg;
    int topSpeed;
    double acceleration;
    int battery;
    
    vehicle (int pc, int nd, int fc, int fe, int ts, double ac, int bat) { //setting up the 7 instant variables 5 being required, 2 being my own
    passangerCap = pc;
    numDoors = nd;
    fuelCap = fc;
    mpg = fe;
    topSpeed = ts;
    acceleration = ac;
    battery = bat;
}

    double laToLv (double mpg) { // calculates how many tanks it would take for the car to go from Los Angeles to Las Vegas by taking the distance from LA to LV and dividing it by the mpg
        double gallons = (double)270.2/mpg;
        gallons = Math.round(gallons);
        return gallons;
    }
    double laTosd (double mpg) { // calculates how many tanks it would take for the car to go from Los Angeles to San Diego by taking the distance from LA to SD and dividing it by the mpg
        double gallons = (double)120.3/mpg;
        gallons = Math.round(gallons);
        return gallons;
}
  double laToaz (double mpg) { // calculates how many tanks it would take for the car to go from Los Angeles to Arizona by taking the distance from LA to AZ and dividing it by the mpg
        double gallons = (double)519.1/mpg;
        gallons = Math.round(gallons);
        return gallons;
}
  }

class Main {
  public static void main(String[] args) {
  vehicle teslaS = new vehicle (5, 4, 315, 90, 155, 2.5, 100); // creates the object tesla model S and sets up the parameters to the tesla model S's instant variables
  vehicle tesla3 = new vehicle (5, 4, 289, 28, 140, 3.3, 75); // creates the object tesla model 3 and sets up the parameters to the tesla model 3's instant variables
  vehicle teslaX = new vehicle (7, 4, 298, 88, 130, 2.9, 100); // creates the object tesla model X and sets up the parameters to the tesla model X's instant variables
  /* 
  vehicle teslaS = new vehicle(); // creates object (Teslas) of class vehicle
  vehicle tesla3 = new vehicle(); // creates object (Tesla3) of class vehicle
  vehicle teslaX = new vehicle(); // creates object (TeslaX) of class vehicle

   // adds paremeters to the model S's instant variables
    teslaS.passangerCap = 5;
    teslaS.numDoors = 4;
    teslaS.fuelCap = 315;
    teslaS.mpg = 90;
    teslaS.topSpeed = 155;
    teslaS.acceleration = 2.5;
    teslaS.battery = 100;
    
    // adds paremeters to the model 3's instant variables
    tesla3.passangerCap = 5;
    tesla3.numDoors = 4;
    tesla3.fuelCap = 289;
    tesla3.mpg = 28;
    tesla3.topSpeed = 140;
    tesla3.acceleration = 3.3;
    tesla3.battery = 75;
    
    // // adds paremeters to the model X's instant variables
    teslaX.passangerCap = 7;
    teslaX.numDoors = 4;
    teslaX.fuelCap = 298;
    teslaX.mpg = 88;
    teslaX.topSpeed = 130;
    teslaX.acceleration = 2.9;
    teslaX.battery = 100;
*/     
    // prints out sentances describing the specs of the tesla model S and how many full tanks of gas it takes to go from La to Las Vegas, San Diego, and Arizona
    System.out.println("\n The Tesla Model S can seat " + teslaS.passangerCap + " passangers. It has " + teslaS.numDoors + " doors and a fuel capacity of " + teslaS.fuelCap + " gallons. Furthermore, it can hold " + teslaS.mpg + " miles per gallon and reach a top speed of " + teslaS.topSpeed + " miles per hour, going from 0-60 mph in " + teslaS.acceleration + " seconds. Finally, it's battery can generate at " + teslaS.battery + " kilowatts an hour.");
    System.out.println("You can go from Los Angeles to Las Vegas using approximatly " + teslaS.laToLv(teslaS.mpg) + " full tanks.");
    System.out.println("You can go from Los Angeles to San Diego using approximatly " + teslaS.laTosd(teslaS.mpg) + " full tanks.");
    System.out.println("You can go from Los Angeles to San Arizona using approximatly " + teslaS.laToaz(teslaS.mpg) + " full tanks.");
    
    // prints out sentances describing the specs of the tesla model 3 and how many full tanks of gas it takes to go from La to Las Vegas, San Diego, and Arizona
    System.out.println("\n The Tesla Model 3 can seat " + tesla3.passangerCap + " passangers. It has " + tesla3.numDoors + " doors and a fuel capacity of " + tesla3.fuelCap + " gallons. Furthermore, it can hold " + tesla3.mpg + " miles per gallon and reach a top speed of " + tesla3.topSpeed + " miles per hour, going from 0-60 mph in " + tesla3.acceleration + " seconds. Finally, it's battery can generate at " + tesla3.battery + " kilowatts an hour.");
    System.out.println("You can go from Los Angeles to Las Vegas using approximatly " + tesla3.laToLv(tesla3.mpg) + " full tanks.");
    System.out.println("You can go from Los Angeles to San Diego using approximatly " + tesla3.laTosd(tesla3.mpg) + " full tanks.");
    System.out.println("You can go from Los Angeles to Arizona using approximatly " + tesla3.laToaz(tesla3.mpg) + " full tanks.");
    
    // prints out sentances describing the specs of the tesla model X and how many full tanks of gas it takes to go from La to Las Vegas, San Diego, and Arizona
    System.out.println("\n The Tesla Model S can seat " + teslaX.passangerCap + " passangers. It has " + teslaX.numDoors + " doors and a fuel capacity of " + teslaX.fuelCap + " gallons. Furthermore, it can hold " + teslaX.mpg + " miles per gallon and reach a top speed of " + teslaX.topSpeed + " miles per hour, going from 0-60 mph in " + teslaX.acceleration + " seconds. Finally, it's battery can generate at " + teslaX.battery + " kilowatts an hour.");
    System.out.println("You can go from Los Angeles to Las Vegas using approximatly " + teslaX.laToLv(teslaX.mpg) + " full tanks.");
    System.out.println("You can go from Los Angeles to San Diego using approximatly " + teslaX.laTosd(teslaX.mpg) + " full tanks.");
    System.out.println("You can go from Los Angeles to Arizona using approximatly " + teslaX.laToaz(teslaX.mpg) + " full tanks.");
}
  }
