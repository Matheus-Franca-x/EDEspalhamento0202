package model;



public class Num 
{
	
	private int num;

	public Num(int num)
	{
		this.num = num;
	}

	@Override
	public String toString() {
		return "Num [num=" + num + ", posit=" + hashCode() + "]";
	}

	public int getNum() {
		return num;
	}

	@Override
	public int hashCode() {
		int posicao = num % 2;
		return posicao;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Num other = (Num) obj;
		return num == other.num;
	}
	
	
	
}
