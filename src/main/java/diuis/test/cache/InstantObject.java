package diuis.test.cache;

import java.time.Instant;

public class InstantObject {

  private String instant;

  public InstantObject(Long id) {
    this.instant = " id " + id + " : " + Instant.now()
                                                  .getEpochSecond();
  }

  public String getInstant() {
    return instant;
  }

  @Override
  public String toString() {
    return "--- " + instant + " ---";
  }

}
