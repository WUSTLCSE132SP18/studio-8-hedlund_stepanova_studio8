#include <Wire.h>
#include <SparkFun_MMA8452Q.h>

MMA8452Q accel;

void setup(){
  Serial.begin(9600);
  accel.init();
}

void loop(){
  if (accel.available()){
    accel.read();
    printCalculatedAccels();
  }
}


void printCalculatedAccels()
{ 
  Serial.print(accel.cx, 3);
  Serial.print(",");
  Serial.print(accel.cy, 3);
  Serial.print(",");
  Serial.println(accel.cz, 3);
}
