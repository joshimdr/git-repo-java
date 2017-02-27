package com.josh.code.compare;

public class Range {
	
	int startRange;
	int endRange;
	
	public Range() {
		// TODO Auto-generated constructor stub
	}
	
	public Range(int start, int end) {
		// TODO Auto-generated constructor stub
		startRange =start;
		endRange = end;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + endRange;
		result = prime * result + startRange;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Range other = (Range) obj;
		if (endRange != other.endRange)
			return false;
		if (startRange != other.startRange)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Range [startRange=");
		builder.append(startRange);
		builder.append(", endRange=");
		builder.append(endRange);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	

}
