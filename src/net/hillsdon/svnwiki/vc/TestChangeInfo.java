package net.hillsdon.svnwiki.vc;

import java.util.Date;

import junit.framework.TestCase;

public class TestChangeInfo extends TestCase {

  public void testGetDescriptionStripsURL() {
    ChangeInfo changeInfo = new ChangeInfo("MyPage", "mth", new Date(), 1, "Twiddled frobs.\nhttp://www.example.com/wiki/MyPage\n");
    assertEquals("Twiddled frobs.", changeInfo.getDescription());
  }
 
  public void testAutoGeneratedMessagesNotReturnedInDescription() {
    ChangeInfo changeInfo = new ChangeInfo("MyPage", "mth", new Date(), 1, "[automated commit]\nhttp://www.example.com/wiki/MyPage\n");
    assertEquals("None", changeInfo.getDescription());
  }
  
}

