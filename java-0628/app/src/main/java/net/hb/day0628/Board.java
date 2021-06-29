package net.hb.day0628;
public class Board {
  private String  message; //전역변수=field=필드 

  public String getTitle() {
    return this.message;
  }

  public void setTitle(String title) {
    message = title;
  }
}//class END
