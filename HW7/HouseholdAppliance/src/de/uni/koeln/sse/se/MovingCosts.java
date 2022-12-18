package de.uni.koeln.sse.se;

public class MovingCosts implements Visitor{
	
	private double movingCosts;

	@Override
	public void visitElectronic(Electronic e) {
		if(e.fragile == true) {
			movingCosts = ((double)e.weight/10) * 5;
		}else {
			movingCosts = ((double)e.weight/15) * 5;
		}
		
	}

	@Override
	public void visitFurniture(Furniture f) {
		movingCosts = ((double)f.weight/20) * 5;
		
	}

	@Override
	public void visitGlass(Glass g) {
		if(g.thickness == 1) {
			movingCosts = ((double)g.lenght/100) *2;
		}else if(g.thickness == 2) {
			movingCosts = ((double)g.lenght/100) * 1.2;
		}else if(g.thickness == 3) {
			movingCosts = ((double)g.lenght/100) * 0.7;
		}
		
	}
	
	public double getMovingCosts(HouseholdItem h) {
		movingCosts = 0;
		h.accept(this);
		return movingCosts;
	}

}
