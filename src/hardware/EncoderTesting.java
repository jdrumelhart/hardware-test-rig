package hardware;

import edu.wpi.first.wpilibj.Encoder;

public class EncoderTesting extends Encoder implements HardwareInterface {

	public EncoderTesting(int channelA, int channelB) {
		super(channelA, channelB);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void selfTest() {
		// TODO Auto-generated method stub
		
	}
	
}