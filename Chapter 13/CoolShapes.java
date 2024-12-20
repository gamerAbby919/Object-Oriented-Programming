public abstract class CoolShapes {
		private String color = "*The coolest color you can think of*";
		private boolean filled;
		private java.util.Date dateCreated;
		
		protected CoolShapes() {
			dateCreated = new java.util.Date();
		}
		
		protected CoolShapes(String color, boolean filled) {
			dateCreated = new java.util.Date();
			this.color = color;
			this.filled = filled;
		}
		
		public String getColor() {
			return color;
		}
		
		public boolean isFilled() {
			return filled;
		}
		
		public void setColor(String color) {
			this.color = color;
		}
		
		public void isFilled(Boolean filled) {
			this.filled = filled;
		}
		
		public java.util.Date getDateCreated() {
			return dateCreated;
		}
		
		@Override
		public String toString() {
			return "Made on: " + dateCreated + "\nColor: " + "\nFilled? " + filled;
		}
		
	public interface Triangle {
		public abstract double getArea();
		public abstract double getPrimeter();
	}
}
