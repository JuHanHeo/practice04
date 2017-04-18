package prob06;


public class TV {
	private int channel;
	private int volume;
	private boolean power;

	public TV(){

	}

	public TV(int channel, int volume, boolean bool) {
		this.channel = channel;
		this.volume = volume;
		this.power = bool;
	}

	public void power(boolean on){
		this.power = on;
	}

	public void channel(int ch){
		
		if(ch<1){
			this.channel =255;
		}
		else if(ch>255){
			this.channel = 1;
		}
		else{
			this.channel = ch;
		}
		
	}

	public void channel(boolean up){
		if(this.channel == 255&&up==true){
			this.channel = 1;
		}else if(this.channel==1&&up==false){
			this.channel = 255;
		}else{
			if(up==true){
				this.channel++;
			}
			else if(up==false){
				this.channel--;
			}
		}
	}

	public void volume(int vol){
		if(vol>100){
			this.volume=100;
		}else if(vol<0){
			this.volume=0;
		}else{
			this.volume = vol;
			}
	}

	public void volume(boolean up){
		if(this.volume < 100&&up==true){
			this.volume++;
		}else if(this.volume>0&&up==false){
			this.volume--;
		}
	}

	public void status(){

		System.out.println("TV [channel="+getChannel()+", volume="+getVolume()+", power="+isPower()+"]");

	}


	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}



}
