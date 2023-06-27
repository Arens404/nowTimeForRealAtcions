public class Color {
  private int Red;
  private int Green;
  private int Blue;

  public Color(int setBlue, int setGreen, int setRed) {
    this.Red = setRed;
    this.Green = setGreen;
    this.Blue = setBlue;
  }

  public int getRed() {
    return Red;
  }

  public void setRed(int red) {
    Red = red;
  }

  public int getGreen() {
    return Green;
  }

  public void setGreen(int green) {
    Green = green;
  }

  public int getBlue() {
    return Blue;
  }

  public void setBlue(int blue) {
    Blue = blue;
  }
}
