package obrazek;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

public class ManazerObrazku {
	
	private Map<String, BufferedImage> mapaObr;
	private ZdrojObrazku zo;
	
	public ManazerObrazku(ZdrojObrazku zo) {
		mapaObr = new HashMap<>();
		this.zo = zo;
		this.zo.naplnMapu();
	}
	
	private void pripravObrazek(Obrazek o){
		zo.setZdroj(o.getKlic());
		mapaObr.put(o.getKlic(), nactiObrazek(o));
	}
	
	
	public void pripravObrazky(){
		pripravObrazek(Obrazek.HRAC);
		pripravObrazek(Obrazek.POZADI);
		pripravObrazek(Obrazek.ZED);
	}

	private BufferedImage nactiObrazek(Obrazek o) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public BufferedImage getObrazek(Obrazek o){
		return mapaObr.get(o.getKlic());
	}
	
	
	
}
