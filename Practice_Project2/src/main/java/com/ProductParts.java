package com;

public class ProductParts {

	private String cat;
	private String desc;
	private String mfg;
	
	public ProductParts() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductParts(String cat, String desc, String mfg) {
		super();
		this.cat = cat;
		this.desc = desc;
		this.mfg = mfg;
	}

	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getMfg() {
		return mfg;
	}
	public void setMfg(String mfg) {
		this.mfg = mfg;
	}

	@Override
	public String toString() {
		return "ProductParts [cat=" + cat + ", desc=" + desc + ", mfg=" + mfg + "]";
	}
	
}
