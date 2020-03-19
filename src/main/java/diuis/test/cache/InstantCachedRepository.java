package diuis.test.cache;

import java.util.concurrent.TimeUnit;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;

public class InstantCachedRepository {

  LoadingCache<Long, InstantObject> cache = null;

  public InstantCachedRepository() {
    cache = Caffeine.newBuilder()
                    .maximumSize(10_000)
                    .refreshAfterWrite(5, TimeUnit.SECONDS)
                    .build(key -> loadInstant(key));
  }

  public InstantObject getItem(Long id) {
    return cache.get(id);
  }

  private InstantObject loadInstant(Long id) {
    final var instantObject = new InstantObject(id);
    System.out.println(" loading... " + id + ": " + instantObject);
    return instantObject;
  }

}
