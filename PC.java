package package1;

public class PC {
	CPU CPU;
	HardDisk HD;
	public void setCPU(CPU c) {
		this.CPU = c;
	}
	public void setHardDisk(HardDisk h) {
		this.HD = h;
	}
	public void show() {
		System.out.println("CPU�ٶ�"+CPU.getspeed());
		System.out.println("Ӳ������"+HD.getAmount());
	}

}
