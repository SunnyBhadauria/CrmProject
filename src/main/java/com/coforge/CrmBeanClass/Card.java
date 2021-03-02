package com.coforge.CrmBeanClass;

import java.util.Date;

public class Card {

	
	private int	      cardNo;
	private Date      cardValidity;
	private double    silverCardCumulativeTotal;
	private double    goldCardCumulativeTotal;
    CumulativePoint     cumulativePoint;
	public Card(int cardNo, Date cardValidity, double silverCardCumulativeTotal, double goldCardCumulativeTotal,
			CumulativePoint cumulativePoint) {
		super();
		this.cardNo = cardNo;
		this.cardValidity = cardValidity;
		this.silverCardCumulativeTotal = silverCardCumulativeTotal;
		this.goldCardCumulativeTotal = goldCardCumulativeTotal;
		this.cumulativePoint = cumulativePoint;
	}
	public Card() {
		// TODO Auto-generated constructor stub
	}
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public Date getCardValidity() {
		return cardValidity;
	}
	public void setCardValidity(Date cardValidity) {
		this.cardValidity = cardValidity;
	}
	public double getSilverCardCumulativeTotal() {
		return silverCardCumulativeTotal;
	}
	public void setSilverCardCumulativeTotal(double silverCardCumulativeTotal) {
		this.silverCardCumulativeTotal = silverCardCumulativeTotal;
	}
	public double getGoldCardCumulativeTotal() {
		return goldCardCumulativeTotal;
	}
	public void setGoldCardCumulativeTotal(double goldCardCumulativeTotal) {
		this.goldCardCumulativeTotal = goldCardCumulativeTotal;
	}
	public CumulativePoint getCumulativePoint() {
		return cumulativePoint;
	}
	public void setCumulativePoint(CumulativePoint cumulativePoint) {
		this.cumulativePoint = cumulativePoint;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cardNo;
		result = prime * result + ((cardValidity == null) ? 0 : cardValidity.hashCode());
		long temp;
		temp = Double.doubleToLongBits(goldCardCumulativeTotal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(silverCardCumulativeTotal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (cardNo != other.cardNo)
			return false;
		if (cardValidity == null) {
			if (other.cardValidity != null)
				return false;
		} else if (!cardValidity.equals(other.cardValidity))
			return false;
		if (Double.doubleToLongBits(goldCardCumulativeTotal) != Double.doubleToLongBits(other.goldCardCumulativeTotal))
			return false;
		if (Double.doubleToLongBits(silverCardCumulativeTotal) != Double
				.doubleToLongBits(other.silverCardCumulativeTotal))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Card [cardNo=" + cardNo + ", cardValidity=" + cardValidity + ", silverCardCumulativeTotal="
				+ silverCardCumulativeTotal + ", goldCardCumulativeTotal=" + goldCardCumulativeTotal
				+ ", cumulativePoint=" + cumulativePoint + "]";
	}
	
    
	
}
