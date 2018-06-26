package pl.js.sheep.dto;

public class Shoot {

  private String content;

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override
  public String toString() {
    return content;
  }
}
