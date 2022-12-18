package de.uni.koeln.sse.se;

public class PackingInstruction implements Visitor{
	
	private String packingInstruction;

	@Override
	public void visitElectronic(Electronic e) {
		packingInstruction = "should be covered with Polyethylene foam film and packed"
				+ " in a box with a dimension of "
				+ (e.height+1) +"x"+ (e.lenght+1) + "x" + (e.width+1);
		
	}

	@Override
	public void visitFurniture(Furniture f) {
		packingInstruction = "should be covered with waterproof covers with an area of: "
				+ f.lenght + "x" + f.width;
		
	}

	@Override
	public void visitGlass(Glass g) {
		packingInstruction = "should be packed in a box with a dimension of "
				+ (g.height+1) + "x" + (g.lenght +1)+ "x" + (g.width+1)
				+ " and filled with Bubble wraps.";
		
	}
	
	public String getPackingInstruction(HouseholdItem h) {
		packingInstruction = "";
		h.accept(this);
		return packingInstruction;
	}

}
