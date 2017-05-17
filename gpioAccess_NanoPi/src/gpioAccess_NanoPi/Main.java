package gpioAccess_NanoPi;

import in.weargenius.gpio.DigitalOutputPin;
import in.weargenius.gpio.GPIOController;
import in.weargenius.gpio.NanoPiPin;
import in.weargenius.gpio.gpio;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		gpio gpio= GPIOController.getInstance();
		
		DigitalOutputPin pin1=gpio.provisionDigitalOutputPin(NanoPiPin.GPIO_07);
		
		for(int i=0;i<20;i++){
			pin1.high();
			Thread.sleep(1000);
			pin1.low();
			Thread.sleep(1000);
		}
		pin1.close();
		
	}

	
}
