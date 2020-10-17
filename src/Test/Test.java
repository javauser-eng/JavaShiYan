package Test;

import CPU.*;
import HardDisk.HardDisk;
import PC.PC;

public class Test {
	public static void main(String args[]){
		CPU cpu =new CPU();
		HardDisk HD=new HardDisk();
		cpu.setSpeed(2200);
		cpu.setBrand("Ώαξ£");
		HD.setAmount(200);
		HD.setBrand("Ο£½έ");
		PC pc=new PC();
		pc.setCpu(cpu);
		pc.setHardDisk(HD);
		pc.show();
	}
}
