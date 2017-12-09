package hardware;

import edu.wpi.first.wpilibj.Encoder;

public class EncoderTesting extends Encoder implements HardwareInterface {

	public EncoderTesting(int channelA, int channelB) {
		super(channelA, channelB);
	}

	@Override
	public void selfTest() {
		
	}
	
}