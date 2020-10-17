
package PC;

import CPU.CPU;
import HardDisk.HardDisk;

public class PC {
	CPU cpu;
	HardDisk HD;
	public void setCpu(CPU cpu){
		this.cpu=cpu;
	}
	public void setHardDisk(HardDisk HD){
		this.HD=HD;
	}
	public void show(){
		System.out.println("CPUspeed:"+cpu.getSpeed());	
		System.out.println("CPUbrand:"+cpu.getBrand());	
		System.out.println("HDamount:"+HD.getBrand());
		System.out.println("HDamount:"+HD.getAmount());	
	}
}