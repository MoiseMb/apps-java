public enum enumjour{
	LUNDI("8H"),MARDI("8H"),MERCREDI("4H"),JEUDI("8H"),VENDREDI("8H"),SAMEDI("0"),DIMANCHE("0");
	private String hr;
	private  enumjour(String hr){this.hr=hr;}

	public String getheure(){return hr;}
}